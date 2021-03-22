package bd.edu.seu.fitnessApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository repo ;

    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }

    @GetMapping("/register")
    public String signInPage(Model model){
        model.addAttribute("user", new User());
        return "signinpage";
    }

    @PostMapping ("/reg_pro")
    public String processRegistation(User user){
       User save = repo.save(user);

        return "registerSuccess";
    }

}
