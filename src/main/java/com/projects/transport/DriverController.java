package com.projects.transport;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController

@RequestMapping("/drivers")



public class DriverController {

    private final DriverService driverService;

    public DriverController(DriverService driverService) {

        this.driverService = driverService;

    }
    @PostMapping
    public Driver createDriver(@RequestBody Driver driver) {
        return driverService.registerDriver(driver);



    }


}

