package com.ssmcollege.studentmanagemnet.repository;

import com.ssmcollege.studentmanagemnet.entity.StudentEntity;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface StudentRepository extends MongoRepository<StudentEntity,String> {
    @Override
    Optional<StudentEntity> findById(String s);
}
