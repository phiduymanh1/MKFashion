package com.example.shopquanaomk.Services.Admin;

import com.example.shopquanaomk.Repository.ColorRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminColorServices {
    private final ColorRepository colorRepository;

    public AdminColorServices(ColorRepository colorRepository) {
        this.colorRepository = colorRepository;
    }
}
