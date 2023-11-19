package Final_Pro.example.BackEnd.Controller;


import Final_Pro.example.BackEnd.Service.RequstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/requests")
public class RequstController {

    @Autowired
    private RequstService requstService;


    @PostMapping("/add")
    public void  addRequest(@PathVariable int userId, int musicalId){
        requstService.addRequest(userId,musicalId);
    }


    }


