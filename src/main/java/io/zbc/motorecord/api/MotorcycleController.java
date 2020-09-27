package io.zbc.motorecord.api;

import io.zbc.motorecord.model.Motorcycle;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/motorcycle")
public class MotorcycleController {

    @RequestMapping(value = "/findMyMotorcycle")
    public String findMyMotorcycle(@RequestBody String userId) {

        return null;
    }

    @RequestMapping(value = "/createMyMotorcycle")
    public String createMyMotorcycle(@RequestBody Motorcycle motorcycle) {

        return null;
    }
}
