//package com.example.webApp.student;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//
//@Configuration
//public class StudentConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository){
//            return args -> {
//              Student Achint=  new Student(
//                        "Achint Singh",
//                        "singhachint981@gmail.com",
//                        LocalDate.of(2001, Month.AUGUST,9)
//                            );
//                Student Karman=new Student(
//                                "karman Singh",
//                                "singhKarman678@gmail.com",
//                                LocalDate.of(2008, Month.JULY,6)
//                                );
//
//                repository.saveAll(List.of(Achint,Karman));
//            };
//    }
//}
