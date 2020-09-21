package io.zbc.motorecord.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/motorcycle")
public class MotorcycleController {

    @RequestMapping(value = "/createMyMotorcycle")
    public String createMyMotorcycle(@RequestBody Motorcycle motorcycle) {

        return null;
    }

}
