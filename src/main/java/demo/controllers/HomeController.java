package demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by eMko on 3.3.2015.
 */
@Controller
public class HomeController {

    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("message", "this is a message from controller");

        return "index";
    }
}
