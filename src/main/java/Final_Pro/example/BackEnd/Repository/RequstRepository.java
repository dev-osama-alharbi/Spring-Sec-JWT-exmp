package Final_Pro.example.BackEnd.Repository;

import Final_Pro.example.BackEnd.Entity.Requst;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequstRepository extends JpaRepository<Requst,Integer> {
}
