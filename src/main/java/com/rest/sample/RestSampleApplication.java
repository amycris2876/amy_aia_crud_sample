package com.rest.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages="com.rest.sample.model")
@EnableJpaRepositories("com.rest.sample.repository")
public class RestSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestSampleApplication.class, args);
		
		System.out.println("Hello");
	}

	/*
	 * @Bean public CommandLineRunner commandLineRunner(RestSampleRepository
	 * productRepository){ return args -> { List<Product> products = List.of( new
	 * Product("Samsung galaxy", "4GB RAM", "PHONE"), new Product("Techno Spark",
	 * "2GB RAM", "PHONE"), new Product("HP parvillion", "250GB SSD", "COMPUTER"),
	 * new Product("Dell", "DDR4 hard disk", "COMPUTER"), new Product("Acer",
	 * "4GB RAM", "COMPUTER"), new Product("Huawei", "high resolution camera",
	 * "PHONE") ); productRepository.saveAll(products); };
	 * 
	 * }
	 */
}
