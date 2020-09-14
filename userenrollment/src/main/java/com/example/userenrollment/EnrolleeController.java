package com.example.userenrollment;

import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Enrollee")
@CrossOrigin(origins = "http://localhost:4200")
public class EnrolleeController {

	    private EnrolleeService enrolleeService;

	    public EnrolleeController(EnrolleeService enrolleeService) {
	        this.enrolleeService = enrolleeService;
	    }

	    @GetMapping("/enrollee")
	    public @NonNull Iterable<Enrollees> getAllEnrollee() {
	        return enrolleeService.getAllEnrollee();
	    }
	    
	    @GetMapping("/enrollee/{id}")
	    Enrollees one(@PathVariable Long id) {
	    	 return enrolleeService.getEnrollee(id);
	    }
	    
	    @PutMapping("/enrollee/{id}")
	    Enrollees updateEnrollee(@RequestBody Enrollees newEnrollee, @PathVariable Long id) {

	    	 return enrolleeService.save(newEnrollee, id);
	    }
	    
}
