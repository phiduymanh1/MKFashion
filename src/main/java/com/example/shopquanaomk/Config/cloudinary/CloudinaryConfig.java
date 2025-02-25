package com.example.shopquanaomk.Config.cloudinary;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary configKey(){
        Map<String,String> config=new HashMap<>();
        config.put("cloud_name", "dsmnr5drb");
        config.put("api_key", "242619454497932");
        config.put("api_secret", "dywvgfdcKH3YsWeIlAZn-A1uPzU");
        return new Cloudinary(config);
    }

}
