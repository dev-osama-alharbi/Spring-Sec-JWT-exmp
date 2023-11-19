package Final_Pro.example.BackEnd.Service;


import Final_Pro.example.BackEnd.Entity.Musical;
import Final_Pro.example.BackEnd.Entity.User;
import Final_Pro.example.BackEnd.Repository.MusicalRepository;
import Final_Pro.example.BackEnd.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequstService {

    @Autowired
    private MusicalRepository musicalRepository;

    @Autowired
    UserRepository userRepository;



    public void addRequest(int userId, int musicalId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Musical musical = musicalRepository.findById(musicalId)
                .orElseThrow(() -> new RuntimeException("Musical not found"));

        userRepository.save(user);
    }
}
