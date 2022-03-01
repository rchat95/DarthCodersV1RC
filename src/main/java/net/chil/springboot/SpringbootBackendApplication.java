package net.chil.springboot;

import net.chil.springboot.model.Employee;
import net.chil.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = Employee.builder()
				.firstName("chil")
				.lastName("kwon")
				.email("chilhoank@yahoo.ca")
				.build();

		Employee employee2 = Employee.builder()
				.firstName("yun")
				.lastName("kim")
				.email("yunkim@yahoo.ca")
				.build();

		Employee employee3 = Employee.builder()
				.firstName("michael")
				.lastName("kwon")
				.email("michalekwon@yahoo.ca")
				.build();
		Employee employee4 = Employee.builder()
				.firstName("kevin")
				.lastName("kwon")
				.email("kevinkwon@yahoo.ca")
				.build();
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);


	}
}
