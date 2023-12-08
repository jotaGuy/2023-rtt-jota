package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RestController
public class SlashController {

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView response = new ModelAndView("index");
        System.out.println("Made it here");
        return response;
    }


    @PostMapping("/sendMessage")
    public ModelAndView sendMessage(@RequestParam("message") String message) {// Specify the appropriate view name
        System.out.println("anything running");
        System.out.println("Received message: " + message);

        // Add logic to process the message as needed

        return new ModelAndView("redirect:/");
    }


    @GetMapping("/profile")
    public ModelAndView about() {
        ModelAndView response = new ModelAndView("profile");
        System.out.print("Made it here");
        return response;
    }

}
