package com.example.shopquanaomk.Controller.Admin;

import com.example.shopquanaomk.Services.Admin.AdminOrderServices;
import com.example.shopquanaomk.Services.Common.CommonOrderServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/order")
public class AdminOrderController {
    private final AdminOrderServices adminOrderServices;

    public AdminOrderController(AdminOrderServices adminOrderServices) {
        this.adminOrderServices = adminOrderServices;
    }

    @GetMapping("/load")
    public String loadOrder(Model model){
        model.addAttribute("ListOrderDto", adminOrderServices.findAll());
        return "admin/views/order/Order";
    }
}
