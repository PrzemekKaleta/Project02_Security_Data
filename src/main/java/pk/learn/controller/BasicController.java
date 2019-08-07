package pk.learn.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {

    @GetMapping("/")
    public String getHome(){
        return "home";
    }

    @GetMapping("/login")
    public String loginGet(){
        return "login";
    }

    @PreAuthorize("hasAnyRole('USER')")
    @GetMapping("/secured")
    public String securedGet(){
        return "secured";
    }


}
