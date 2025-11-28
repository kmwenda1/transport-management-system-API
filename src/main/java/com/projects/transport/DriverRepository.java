package com.projects.transport;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository  extends JpaRepository<Driver, Long> {

    boolean existsbyLicenceNumber(String licenseNumber);
}
