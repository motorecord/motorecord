package io.zbc.motorecord.controller;

import io.zbc.motorecord.entity.Motorcycle;
import io.zbc.motorecord.service.MotorcycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/motorcycle")
public class MotorcycleController {

    @Autowired
    private MotorcycleService motorcycleService;

    @RequestMapping(value = "/findMyMotorcycle", method = RequestMethod.POST)
    public List<Motorcycle> findMyMotorcycle(@RequestParam Integer userId) {
        return motorcycleService.findMyMotorcycle(userId);
    }

    @RequestMapping(value = "/createMyMotorcycle")
    public String createMyMotorcycle(@RequestBody Motorcycle motorcycle) {
        return null;
    }
}
