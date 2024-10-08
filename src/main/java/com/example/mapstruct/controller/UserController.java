package com.example.mapstruct.controller;
import com.example.mapstruct.dto.request.UserCreationRequest;
import com.example.mapstruct.entity.Car;
import com.example.mapstruct.entity.Garage;
import com.example.mapstruct.mapper.CarMapper;
import com.example.mapstruct.mapper.GarageMapper;
import com.example.mapstruct.mapper.UserMapper;
import com.example.mapstruct.service.UserService;
import org.apache.skywalking.apm.toolkit.trace.ActiveSpan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("api")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private CarMapper carMapper;
    @Autowired
    private GarageMapper garageMapper;
    @Autowired
    private UserMapper userMapper;

    @PostMapping("user/create")
    public ResponseEntity<?> create(@RequestBody UserCreationRequest request) {
        return ResponseEntity.ok(userService.create(request));
    }

    @PostMapping("car")
    public ResponseEntity<?> carToResponse(@RequestBody Car request) {
        return ResponseEntity.ok(carMapper.toCarResonse(request));
    }

    @PostMapping("garage")
    public ResponseEntity<?> garage(@RequestBody Garage request) {
        ActiveSpan.tag("tag_key", "tag_value");
        return ResponseEntity.ok(garageMapper.toGarageResponse(request));
    }

    @PostMapping("users")
    public ResponseEntity<?> toListUser(@RequestBody List<UserCreationRequest> requests) {
        return ResponseEntity.ok(userMapper.toListUser(requests));
    }
}
