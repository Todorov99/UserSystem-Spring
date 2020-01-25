package com.example.usersystem.App.controllers;

import com.example.usersystem.App.services.TownsService;
import com.example.usersystem.App.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class AppController implements CommandLineRunner {

    private final UsersService usersService;
    private final TownsService townsService;


    @Autowired
    public AppController(UsersService usersService, TownsService townsService) {
        this.usersService = usersService;
        this.townsService = townsService;
    }


    @Override
    public void run(String... args) throws Exception {

        this.usersService.addUsers();
        //this.townsService.addTown();
    }

}
