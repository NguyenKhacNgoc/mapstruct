package com.example.mapstruct;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "identity-client", url = "http://localhost:8888")
public interface IdentityClient
{
    @GetMapping("/api/test")
    String call1();
}
