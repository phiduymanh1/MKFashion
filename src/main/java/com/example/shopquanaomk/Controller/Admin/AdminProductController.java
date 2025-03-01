package com.example.shopquanaomk.Controller.Admin;

import com.example.shopquanaomk.Dto.ResponDto.ProductDtoResponse;
import com.example.shopquanaomk.Entity.Product;
import com.example.shopquanaomk.Services.Admin.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/admin/product")
public class AdminProductController {
//    @Autowired
//    private AdminProductServices adminProductServices;
//    @Autowired
//    private AdminSizeService adminSizeService;
//    @Autowired
//    private AdminColorServices adminColorServices;
//    @Autowired
//    private AdminBrandServices adminBrandServices;
//    @Autowired
//    private AdminCategoryServices adminCategoryServices;
//@GetMapping("/views")
//    public String GetAll(@RequestParam(defaultValue = "0")int page,
//                         @RequestParam(defaultValue = "4")int size,
//                         Model model){
//    Page<ProductDtoResponse> page1=adminProductServices.getAll(page,size);
//    model.addAttribute("products",page1.getContent());
//    model.addAttribute("currentPage",page);
//    model.addAttribute("totalPages",page1.getTotalPages());
//
//    return "admin/views/product/Product";
//
//}
//
//@GetMapping("/new/save")
//    public String newFormAdd(Model model){
//model.addAttribute("size",adminSizeService.getAll());
//model.addAttribute("color",adminColorServices.getAll());
//model.addAttribute("brand",adminBrandServices.getAll());
//model.addAttribute("category",adminCategoryServices.getALl());
//    return "admin/views/product/newProduct";
//
//}
//@PostMapping("/save")
//    public String save(@ModelAttribute Product product, @RequestParam("file") MultipartFile file){
//    System.out.println("url: "+file);
//    System.out.println("map du liei: "+product.toString());
//    adminProductServices.save(product,file);
//
//    return "redirect:/admin/product/views";
//}
}
