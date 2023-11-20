package Final_Pro.example.BackEnd.Controller;

import Final_Pro.example.BackEnd.Entity.User;
import Final_Pro.example.BackEnd.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/auth/register")
public class RegisterController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
