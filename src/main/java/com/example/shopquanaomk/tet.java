package com.example.shopquanaomk;

import com.example.shopquanaomk.Services.uploadfile.impl.UploadImageFile;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api")

public class tet {
    @Autowired
    private  UploadImageFile uploadImageFile;
   @PostMapping("/uploadanh")
    public String u(@RequestParam ("file") MultipartFile file) throws IOException {

        return uploadImageFile.uploadImage(file);
   }
}
