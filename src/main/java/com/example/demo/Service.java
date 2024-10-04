package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repository repository;

    public List<Student> listAllStudent(){
        List<Student> res= new ArrayList<>();
        repository.findAll().forEach(a->res.add(a));
        return res;
    }

    public boolean updateStudent(Student student){
        repository.save(student);
        return true;
    }

    public boolean deleteStudent(Student student){
        repository.delete(student);
        return true;
    }

    public boolean createStudent(Student student){
        repository.save(student);
        return true;
    }

    public Student getStudent(int id){
        return repository.findById(id).get();
    }
}
