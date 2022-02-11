package com.example.aqs_backend.error;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ErrorRepository extends JpaRepository<Error, Long> {
  public Error  findErrorById(Long errorid);

}
