package com.ssmcollege.studentmanagemnet.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "student")
@Builder
@Data
public class StudentEntity {
    @Id
    private String id;
    private String name;
    private int age;
    private String dept;

}
