package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository repository;

    @Override
    public void run(String... string) throws Exception{
        Car car;
        car = new Car("Audi", 2007, "R8");
        repository.save(car);

        car = new Car("Mercedes-Benz", 1998, "M-Class");
        repository.save(car);

        car = new Car("Cadillac", 1958, "Eldorado");
        repository.save(car);

    }

}
