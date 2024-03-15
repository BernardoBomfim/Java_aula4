package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model ui
            @RequestParam("nome") String n){
        ui.addAttribute("msg", "Olá" + n + "!!!");
        return "/WEB-INF/home.jsp";
    }

}