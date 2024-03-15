package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model ui,
            @RequestParam(name="nome", required = false) String n){
        ui.addAttribute("msg", "Olá " + n + "!!!");
        return "/WEB-INF/home.jsp";
    }

}