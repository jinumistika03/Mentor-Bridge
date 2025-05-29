package com.ssmcollege.studentmanagemnet.Services;

import com.ssmcollege.studentmanagemnet.dto.StudentDto;
import com.ssmcollege.studentmanagemnet.entity.StudentEntity;
import com.ssmcollege.studentmanagemnet.repository.StudentRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service

public class StudentServices {
    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(StudentDto studentDto) {
        System.out.println("request reached" + studentDto);

        StudentEntity studentEntity = StudentEntity.builder().name(studentDto.getName()).age(studentDto.getAge()).dept(studentDto.getDept()).build();
        studentRepository.save(studentEntity);

    }

    public StudentDto getStudent(String id) {
        Optional<StudentEntity> optionalStudentEntity = studentRepository.findById(id);
        if (optionalStudentEntity.isPresent()) {
            StudentEntity studentEntity = optionalStudentEntity.get();
            return (StudentDto.builder().name(studentEntity.getName()).age(studentEntity.getAge()).dept(studentEntity.getDept()).build());
        }
        return null;
    }

    public void updateStudent(String id, StudentDto studentDto) {
        Optional<StudentEntity> optionalStudentEntity = studentRepository.findById(id);
        StudentEntity studentEntity = optionalStudentEntity.get();
        studentEntity.setName(studentEntity.getName());
        studentEntity.setAge(studentEntity.getAge());
        studentEntity.setDept(studentEntity.getDept());
        studentRepository.save(studentEntity);

    }

    public void deleteStudent(String id) {
        Optional<StudentEntity>optionalStudentEntity = studentRepository.findById(id);
        studentRepository.delete(optionalStudentEntity.get());

    }
}





