package com.example.usersystem.App.util.impl;

import com.example.usersystem.App.entities.Towns;
import com.example.usersystem.App.util.TownUtil;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class TownUtilImpl implements TownUtil {

    @Override
    public Towns insertTownsProps() {

        Scanner input = new Scanner(System.in);

        Towns town = new Towns();
        System.out.println("Enter country: ");

        String country = input.next();

        System.out.println("Enter name");
        String name = input.next();

        town.setCountry(country);
        town.setName(name);

        return town;
    }
}
