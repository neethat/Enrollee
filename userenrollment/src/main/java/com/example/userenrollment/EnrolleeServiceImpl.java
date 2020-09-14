package com.example.userenrollment;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class EnrolleeServiceImpl implements EnrolleeService {
	
	private EnrolleRepository enrollRepository;
	
	
	public EnrolleeServiceImpl(EnrolleRepository enrollRepository) {
        this.enrollRepository = enrollRepository;
    }

    @Override
    public Iterable<Enrollees> getAllEnrollee() {
        return enrollRepository.findAll();
    }

    @Override
    public Enrollees getEnrollee(long id) {
    	  return enrollRepository
    	          .findById(id)
    	          .orElseThrow(() -> new ResourceNotFoundException("Enrollee not found"));
    }

    @Override
    public Enrollees save(Enrollees newenrollees, Long id) {

    	 return enrollRepository.findById(id)
    		        .map(enrollee -> {
    		        	enrollee.setName(newenrollees.getName());
    		        	enrollee.setActivationStatus(newenrollees.isActivationStatus());
    		          return enrollRepository.save(enrollee);
    		        })
    		        .orElseGet(() -> {
    		        	newenrollees.setId(id);
    		          return enrollRepository.save(newenrollees);
    		        });
    }

}
