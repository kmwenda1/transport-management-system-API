package com.projects.transport;

import jakarta.persistence.Entity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Service

public class DriverService {
    private final DriverRepository driverRepository;
    public DriverService(DriverRepository driverRepository, DriverRepository driverRepository1) {

       this.driverRepository = driverRepository;
    }
    public Driver registerDriver(Driver driver) {
        if (driverRepository.existsbyLicenceNumber(driver.getLicenseNumber())) {
            throw new RuntimeException("Driver with license" +  driver.getLicenseNumber() + " already exists");
        }

        return driverRepository.save(driver);
    }

}
