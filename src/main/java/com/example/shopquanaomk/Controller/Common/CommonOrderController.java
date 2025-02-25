package com.example.shopquanaomk.Controller.Common;

import com.example.shopquanaomk.Services.Common.CommonOrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class CommonOrderController {

    public final CommonOrderServices commonOrderServices;

    public CommonOrderController(CommonOrderServices commonOrderServices) {
        this.commonOrderServices = commonOrderServices;
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        return "OrderDetail";
    }
}
