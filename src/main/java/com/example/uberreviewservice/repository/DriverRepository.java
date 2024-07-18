package com.example.uberreviewservice.repository;

import com.example.uberreviewservice.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver, Long> {

   // Optional<Driver> findByIdAAndLicenseNumber(Long id, String licenseNumber);


   // @Query(nativeQuery = true,value="SELECT * FROM Driver WHERE id=:id AND license_number= :licenseNumber") //Raw sql query error is thrown at run time
   // Optional<Driver> rawfindByIdAAndLicenseNumber(Long id, String licenseNumber);

   // @Query("SELECT d.name,d.id FROM Driver as d where d.id=:id AND d.licenseNumber =:licenseNumber") // hibernate query error are thrown at compiler time
   // Optional<Driver> hqlfindByIdAAndLicenseNumber(Long id, String licenseNumber);

}
