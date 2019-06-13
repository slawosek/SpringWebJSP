package springboot.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel){
        Student theStudent = new Student();

        theModel.addAttribute("student",theStudent);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theSudent){
        System.out.println("theStudent: " + theSudent.getFirstName() + " " +
                theSudent.getLastName());
        return "student-confirmation";
    }
}
