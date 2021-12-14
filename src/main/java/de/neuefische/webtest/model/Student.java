package de.neuefische.webtest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Student {

    @NonNull int id;
    @NonNull String name;
    @NonNull int age;

}
