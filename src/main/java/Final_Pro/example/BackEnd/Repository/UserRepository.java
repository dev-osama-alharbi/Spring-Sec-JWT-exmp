package Final_Pro.example.BackEnd.Repository;

import Final_Pro.example.BackEnd.DTO.UserDTO;
import Final_Pro.example.BackEnd.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {


}
