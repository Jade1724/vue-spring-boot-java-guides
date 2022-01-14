package com.example.springbootbackend;

import com.example.springbootbackend.entity.Employee;
import com.example.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootbackendApplication implements CommandLineRunner {

  @Autowired
  private EmployeeRepository employeeRepository;

  public static void main(String[] args) {
    SpringApplication.run(SpringBootbackendApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    Employee employee1 = Employee.builder()
        .firstName("Haruka")
        .lastName("Ichinose")
        .email("haruka@gmail.com")
        .build();

    Employee employee2 = Employee.builder()
        .firstName("Jeff")
        .lastName("Bezos")
        .email("jeff@gmail.com")
        .build();

    Employee employee3 = Employee.builder()
        .firstName("Tim")
        .lastName("Cook")
        .email("tim@gmail.com")
        .build();

    employeeRepository.save(employee1);
    employeeRepository.save(employee2);
    employeeRepository.save(employee3);

  }
}
