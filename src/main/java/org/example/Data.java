package org.example;

import com.jayway.restassured.path.json.JsonPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Data {

    private List<Student> studentList = new ArrayList<>();

    public List<Student> findStudentInfo(String s) throws IOException {
        String json = "...";

        List<Student> categories = JsonPath.from(json).get("MOCK_DATA.json");
        return categories.stream().filter(n->n.getFirst_name().equals(s)).collect(Collectors.toList());
    }
}
