package com.di.dependency.bootsrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

   // private final OwnerService ownerService;
    //private final VetService vetService;

    public DataLoader()
    {
      //  ownerService=new OwnerService();
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
