package com.example.userenrollment;

import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

@Validated
public interface EnrolleeService {

    @NonNull Iterable<Enrollees> getAllEnrollee();

    Enrollees getEnrollee( long id);

    Enrollees save(Enrollees newenrollees, Long id);
  
}