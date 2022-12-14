package org.example;

import org.junit.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertThat;


public class DataTest {

    @Test
    public void testFindingStudent() throws IOException {
        Data data = new Data();
        System.out.println(data.findStudentInfo("Allistir"));

    }

}