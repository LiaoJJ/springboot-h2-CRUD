package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.Arrays;

@SpringBootTest
@TestPropertySource(locations="classpath:test.properties")
class ServiceTest {

    @Autowired
    Service service;

//    @Mock Repository repository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void listAllStudent() {
//        when(repository.findAll()).thenReturn(Arrays.asList(new Student(1, "bob")));
        assertThat(service.listAllStudent().size()).isEqualTo(3);
    }

    @Test
    void updateStudent() {
    }

    @Test
    void deleteStudent() {
    }

    @Test
    void createStudent() {
    }

    @Test
    void getStudent() {
    }
}