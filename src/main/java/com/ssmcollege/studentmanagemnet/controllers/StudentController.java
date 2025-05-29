package com.ssmcollege.studentmanagemnet.controllers;

import com.ssmcollege.studentmanagemnet.Services.StudentServices;
import com.ssmcollege.studentmanagemnet.dto.StudentDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController


public class StudentController {

    @Autowired
    StudentServices studentServices;

    @PostMapping("/app")
    public void addStudent(@RequestBody StudentDto studentDto) {
        studentServices.addStudent(studentDto);
    }


   @GetMapping("/get/{id}")
    public StudentDto getStudent(@PathVariable String id){
        return studentServices.getStudent(id);
   }

   @PutMapping("/update/{id}")
    public void updateStudent(@PathVariable String id,@RequestBody StudentDto studentDto){
        studentServices.updateStudent(id,studentDto);

   }

  @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable String id){
        studentServices.deleteStudent(id);
  }


}
