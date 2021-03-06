package com.example.Controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUser(Integer userId) {
        return userService.getUser(userId);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public int addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @RequestMapping(value = "/batchAddUser", method = RequestMethod.POST)
    public int batchAddUser(@RequestBody List<User> users) {
        return userService.batchAddUser(users);
    }
}
