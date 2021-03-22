package bd.edu.seu.fitnessApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrainerController {

    @Autowired
//    private TrainerRepository trepo;

    @GetMapping("/trainer-register")
    public String trainerSignup(Model model){
        model.addAttribute("trainer", new Trainer());
        return "trainersignup";
    }
    @PostMapping("/reg_pro")
    public String trainerProcessRegistation(Trainer trainer){
//        Trainer save = trepo.save(trainer);

        return "registerSuccess";
    }


}
