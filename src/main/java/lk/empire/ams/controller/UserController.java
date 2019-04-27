package lk.empire.ams.controller;

import lk.empire.ams.dao.User;
import lk.empire.ams.dto.UserDTO;
import lk.empire.ams.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    @GetMapping("/user")
    public List<User> getMappingClient(){
        return userService.getAllUser();
    }
}
