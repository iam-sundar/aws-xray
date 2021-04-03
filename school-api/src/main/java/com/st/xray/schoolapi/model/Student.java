package com.st.xray.schoolapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private Integer studentId;
    private String name;
    private Integer age;
    private Integer standard;
    private String medium;
}
