package de.neuefische.webtest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Student {

    @NonNull int age;
    @NonNull int id;
    @NonNull String name;
    boolean status;

}
