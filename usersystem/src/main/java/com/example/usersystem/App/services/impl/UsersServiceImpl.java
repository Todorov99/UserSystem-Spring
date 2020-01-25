package com.example.usersystem.App.services.impl;

import  java.util.Scanner;

import com.example.usersystem.App.entities.Towns;
import com.example.usersystem.App.entities.Users;
import com.example.usersystem.App.repositories.TownsRepository;
import com.example.usersystem.App.repositories.UsersRepository;
import com.example.usersystem.App.services.UsersService;
import com.example.usersystem.App.util.TownUtil;
import com.example.usersystem.App.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;
    private final TownsRepository townsRepository;
    private final UserUtil userUtil;
    private final TownUtil townUtil;

    @Autowired
    public UsersServiceImpl(UsersRepository usersRepository,
                            TownsRepository townsRepository, UserUtil userUtil, TownUtil townUtil) {
        this.usersRepository = usersRepository;
        this.townsRepository = townsRepository;
        this.userUtil = userUtil;

        this.townUtil = townUtil;
    }

    @Override
    public void addUsers() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of users you want to add: ");

        int num = input.nextInt();

        while (num-- > 0){

            Users users = this.userUtil.setUserProperties();
            setUserTowns(users);

            this.usersRepository.saveAndFlush(users);
        }
    }

    private void setUserTowns(Users users) {
        System.out.println("Enter living town");
        Towns livingTown = getTownForUser();

        System.out.println("Enter born town");
        Towns bornTowns = getTownForUser();

        users.setLivingTown(livingTown);
        users.setBornTown(bornTowns);
    }

    private Towns getTownForUser(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter country: ");
        String country = input.next();

        System.out.println("Enter name: ");
        String name = input.next();

        Towns towns = this.townsRepository.findByCountryAndName(country, name);

        if(towns == null){
            towns = new Towns(country, name);
            this.townsRepository.saveAndFlush(towns);
        }

        return towns;

    }



}
