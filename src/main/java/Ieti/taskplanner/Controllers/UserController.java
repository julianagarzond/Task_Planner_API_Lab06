package Ieti.taskplanner.Controllers;

import Ieti.taskplanner.Model.User;
import Ieti.taskplanner.PersistenceServices.UserServices;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    UserServices us;


    @GetMapping("/users")
    List<User> getAll(){
        return us.getAll();
    }

    @PostMapping("/newuser")
      User createUser(@RequestBody User newUser) {
        return us.create(newUser);
    }

    @GetMapping("/user/{Id}")
    User getUser(@PathVariable String Id){

        return us.getById(Id);
    }

    @DeleteMapping("/userdel/{Id}")
    void deleteUser(@PathVariable String Id){
        us.remove(Id);

    }

    }

