package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/welcome")
	public List<Greet> greet(){
		return List.of(
				new Greet("madhan kumar",18),
				new Greet("kumar",19)
				);

	}
	class Greet{
		private String name;
		private int age;

		public Greet() {
		}

		public Greet(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Greet{" +
					"name='" + name + '\'' +
					", age=" + age +
					'}';
		}
	}

}
