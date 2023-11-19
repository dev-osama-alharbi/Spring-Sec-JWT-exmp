package Final_Pro.example.BackEnd.Service;



import Final_Pro.example.BackEnd.Entity.User;
import Final_Pro.example.BackEnd.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }


    public List<User> getUser(User user){
        return  userRepository.findAll();
    }

    public void deleteUserById (int id_user){
            userRepository.deleteById(id_user);
    }

    public Optional<User> getUserDtails( int id_user ){
        return userRepository.findById(id_user);
    }
}
