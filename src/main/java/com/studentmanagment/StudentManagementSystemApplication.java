package com.studentmanagment;

import com.studentmanagment.entity.Student;
import com.studentmanagment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("John", "Cena", "johncena@email.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("Petar", "Pan", "petarpan@email.com");
//		studentRepository.save(student2);
//		Student student3 = new Student("Silvester", "Stalone", "silvesterstalone@email.com");
//		studentRepository.save(student3);
	}
}
