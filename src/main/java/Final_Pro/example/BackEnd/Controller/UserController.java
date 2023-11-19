package Final_Pro.example.BackEnd.Controller;

import Final_Pro.example.BackEnd.Entity.User;
import Final_Pro.example.BackEnd.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/users")
public class UserController {




    //for Test Scertiy
//    @GetMapping
//    public String home (){
//        return "this is Home page";
//    }
    @Autowired
    private UserService userService;





    @PostMapping("/add")
    public User addUser(@RequestBody User user) {

        return userService.saveUser(user);
    }

    @GetMapping("/ShowAllUser")
    public List<User> getUser(User user){
        return userService.getUser(user);
    }

    @GetMapping("/getUserId/{id_user}")
    public Optional<User> getUserDtails(@PathVariable int id_user){
        return userService.getUserDtails(id_user);
    }

    @DeleteMapping("/delete/{id_user}")
    public void delete(@PathVariable int id_user){
        userService.deleteUserById(id_user);
    }



}
