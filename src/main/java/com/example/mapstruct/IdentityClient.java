package com.example.mapstruct;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "identity-client", url = "https://openfeign.onrender.com")
public interface IdentityClient
{
    @GetMapping("/api/test")
    String call1();
}
