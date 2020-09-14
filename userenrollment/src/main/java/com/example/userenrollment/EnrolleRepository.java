package com.example.userenrollment;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrolleRepository extends CrudRepository<Enrollees, Long>{}