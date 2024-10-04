package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Files;
@RestController
public class Controller {

    @Autowired
    Service service;
    @Autowired
    private Repository repository;

    @GetMapping("/listAll")
    public List<Student> listAll(){
        return service.listAllStudent();
    }

    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable("id") int id){
        return service.getStudent(id);
    }

//    @GetMapping("/get")
//    public Student getStudentById(@RequestParam("id") int id){
//        return service.getStudent(id);
//    }

    @PostMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return repository.save(student);
    }

    @PostMapping("/migration")
    public void migrateStudent(){
        String fileName = "/Users/ljj/IdeaProjects/demo2/test.csv";
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println(s);

        File f = new File(fileName);
        if(!f.exists()) {
            System.out.println("/vehicles.csv not exist");
            System.out.println("/vehicles.csv not exist");
            System.out.println("/vehicles.csv not exist");
            return ;
        }

        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            String[] l = reader.readNext(); // header
            while ((l = reader.readNext()) != null) {
                System.out.println(Arrays.toString(l));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("vehicles.csv process done");
    }
}
