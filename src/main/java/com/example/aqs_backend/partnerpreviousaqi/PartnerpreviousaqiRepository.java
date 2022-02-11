package com.example.aqs_backend.partnerpreviousaqi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PartnerpreviousaqiRepository extends JpaRepository<Partnerpreviousaqi,Long> {

    public Iterable<Partnerpreviousaqi> findAllByDeviceid(Long deviceid);
}
