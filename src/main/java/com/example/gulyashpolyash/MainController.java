package com.example.gulyashpolyash;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/process")
    public static String mainPageViewProcess(Model model){



        return "process";
    }
    @GetMapping("/index")
    public static String mainPageViewIndex(Model model){



        return "index";
    }
}
