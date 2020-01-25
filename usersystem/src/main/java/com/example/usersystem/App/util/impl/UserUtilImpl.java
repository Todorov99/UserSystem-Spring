package com.example.usersystem.App.util.impl;

import com.example.usersystem.App.entities.Towns;
import com.example.usersystem.App.entities.UserNames;
import com.example.usersystem.App.entities.Users;
import com.example.usersystem.App.util.TownUtil;
import com.example.usersystem.App.util.UserUtil;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class UserUtilImpl implements UserUtil {


    @Override
    public Users setUserProperties() {

        Scanner input = new Scanner(System.in);

            System.out.println("Enter username: ");
            String userName = input.next();

            System.out.println("Enter password: ");
            String passWord = input.next();

            System.out.println("Enter email: ");
            String email = input.next();

            System.out.println("Enter age: ");
            Integer age = input.nextInt();

            System.out.println("Enter first name: ");
            String firstName = input.next();

            System.out.println("Enter last name: ");
            String lastName = input.next();

            UserNames userNames = new UserNames(firstName, lastName);


            Users users = new Users(userName, passWord, email,
                    age, userNames);

        return users;
    }
}
