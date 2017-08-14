package com.oriental.major;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WYL on 2017/8/14.
 */
@SpringBootApplication
@Controller
public class Application {

    @RequestMapping("/")
    public String greeting() {
        return "Index page";
    }

    @RequestMapping("/helloWorld/{name}")
    public String helloWorld(@PathVariable("name") String name,Model model){
        model.addAttribute("name",name);
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
