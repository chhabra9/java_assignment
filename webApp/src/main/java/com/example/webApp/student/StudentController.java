package com.example.webApp.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/student")
public class StudentController {
    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("")
    public List<Student> getStudent() {
        return studentService.getStudent();
    }
    @PostMapping("")
    public  void registerStudent(@RequestBody Student student){
        System.out.println("calling");
         studentService.addStudent(student);
    }
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long id){
        studentService.deleteStudent(id);
    }
    @PutMapping("{studentId}")
    public void updateStudent(@PathVariable("studentId") Long id,@RequestParam(required = false) String name,@RequestParam(required = false) String email){
        studentService.updateStudent(id,name,email);
    }
    @GetMapping("/getByName")
    public List<Student> getName(@RequestParam String name){

        return studentService.takeStudentByName(name);
    }
}
