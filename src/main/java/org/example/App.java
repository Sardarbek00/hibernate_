package org.example;

import org.example.model.User;
import org.example.service.UserService;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.save(new User(
                "Oleg",
                "Martini",
                "Moscow",
                "oleg@gmail.com",
                (byte) 34));
        List<User> users = UserService.findAll();
        System.out.println(users);
    }
}
