package com.shamaProject.demoApp.model;

import com.shamaProject.demoApp.repository.supRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args)    {

        SpringApplication.run(DemoAppApplication.class, args);
	}
    @Bean
    CommandLineRunner CommandLineRunner(supRepo supRepo){
        return  args -> {
            suppliers mohammed=new suppliers("12334","mohammed","kemal","jemal");
            supRepo.save(mohammed);
        };
    }
        }
