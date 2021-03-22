package bd.edu.seu.fitnessApp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HealthReportControllar {

    private HealthReport healthReport;

    @GetMapping("/report")
    public String report(){
        return "report";
    }
}
