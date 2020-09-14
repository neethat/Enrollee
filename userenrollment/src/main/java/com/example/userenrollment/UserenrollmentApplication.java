package com.example.userenrollment;


import java.util.Date;
import com.example.userenrollment.EnrolleeService;
import com.example.userenrollment.Enrollees;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserenrollmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserenrollmentApplication.class, args);
	}
	
    @SuppressWarnings("deprecation")
	@Bean
    CommandLineRunner runner(EnrolleeService enrolleeService) {
        return args -> {
        	enrolleeService.save(new Enrollees(1L, "Sam Billings", true, new Date("01/29/1979")));
        	enrolleeService.save(new Enrollees(2L, "Joe Root", true, new Date("09/22/1994")));
        	enrolleeService.save(new Enrollees(3L, "Mitchell Marsh", true, new Date("06/23/1983")));
        	enrolleeService.save(new Enrollees(4L, "Kim Clijsters", false, new Date("05/05/1990")));
        	enrolleeService.save(new Enrollees(5L, "Shawn Johnson", false, new Date("04/04/1985")));
 
        };
    }

}
