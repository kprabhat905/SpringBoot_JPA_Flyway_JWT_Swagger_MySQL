package com.example.databasejpamysql;

import com.example.databasejpamysql.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class DatabaseJpaMysqlApplication {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(DatabaseJpaMysqlApplication.class, args);
    }

//    @Override
//    public void run(String... args) {

//        logger.info("All users -> {}", repository.findAll());
//
//        logger.info("User id 10001 -> {}", repository.findById(10001));
//
//        logger.info("Inserting -> {}",
//                repository.save(new Person("Tara2", "Berlin2", new Date())));

//        logger.info("Update 10003 -> {}",
//                repository.save(new Person(2, "Tara2", "Berlin2", new Date())));
//
//        repository.deleteById(10002);

//        logger.info("All users -> {}", repository.findAll());
//    }
}
