package com.example.shopquanaomk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class tet {
    @GetMapping("/anc")
    public String tet(){
        return "views/category";
    }
    @GetMapping("/load")
    public String tet2(){
        return "layout/main";
    }
}
