package Final_Pro.example.BackEnd.Controller;
import Final_Pro.example.BackEnd.Entity.Musical;
import Final_Pro.example.BackEnd.Service.MusicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/musicals")
public class MusicalController {

    @Autowired
    private MusicalService musicalService;

    @PostMapping("/add")
    public Musical addMusical(@RequestBody Musical musical) {
        return musicalService.saveMusical(musical);
    }

    @GetMapping("/showAllMusical")
    public List<Musical> getMusical(Musical musical){
        return  musicalService.getMusical(musical);
    }

    @DeleteMapping("/delete/{mu_id}")
    public void deleteMusicalById(@PathVariable int mu_id){
        musicalService.deleteMusicalById(mu_id);
    }

    @GetMapping("/getMusicalID/{mu_id}")
    public Optional<Musical> getMusicalDtails(@PathVariable int mu_id){
        return musicalService.getMusicalDtails(mu_id);
    }

}
