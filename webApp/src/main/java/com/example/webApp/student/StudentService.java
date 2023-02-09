package com.example.webApp.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
@Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        boolean exists=studentRepository.existsById(id);
        if(exists!=true){
            throw new IllegalStateException("Id not exists");
        }
        studentRepository.deleteById(id);
    }
@Transactional
    public void updateStudent(Long id, String name, String email) {
        boolean exists=studentRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("Student not exist");
        }
        Student student=studentRepository.getById(id);
        if(name!=null&&name.length()>0&& !Objects.equals(student.getName(),name)){
            student.setName(name);
        }
    if(email!=null&&email.length()>0&& !Objects.equals(student.getEmail(),email)){
        student.setEmail(email);
    }
    }

    public List<Student> takeStudentByName(String name) {
        return studentRepository.findByName(name);

    }
}
