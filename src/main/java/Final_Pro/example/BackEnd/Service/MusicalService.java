package Final_Pro.example.BackEnd.Service;


import Final_Pro.example.BackEnd.Entity.Musical;
import Final_Pro.example.BackEnd.Repository.MusicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class MusicalService {

    @Autowired
    private MusicalRepository musicalRepository;

    public Musical saveMusical(Musical musical) {
        return musicalRepository.save(musical);
    }

    public List<Musical> getMusical(Musical musical){
        return  musicalRepository.findAll();
    }

    public void  deleteMusicalById(int mu_id){
        musicalRepository.deleteById(mu_id);
    }

    public Optional<Musical> getMusicalDtails(int mu_id){
        return musicalRepository.findById(mu_id);
    }

}
