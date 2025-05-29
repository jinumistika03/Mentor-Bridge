package com.ssmcollege.studentmanagemnet.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDto {
     String id;
     String name;
     int age;
     String dept;


}
