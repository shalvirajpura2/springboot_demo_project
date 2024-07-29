package com.example.test.service;

import com.example.test.model.Registration;
import com.example.test.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    public List<Registration> getAllRegistrations() {
        return registrationRepository.findAll();
    }

    public Optional<Registration> getRegistrationById(Long id) {
        return registrationRepository.findById(id);
    }

    public Registration createRegistration(Registration registration) {
    	registration.setUsername("admin");
    	registration.setPassword("admin");
        return registrationRepository.save(registration);
    }

    public Registration updateRegistration(Long id, Registration registrationDetails) {
        Registration registration = registrationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Registration not found"));
        registration.setUsername(registrationDetails.getUsername());
        registration.setPassword(registrationDetails.getPassword());
        return registrationRepository.save(registration);
    }

    public String deleteRegistration(Long id) {
        registrationRepository.deleteById(id);
        return "Record Deleted Successfully";
    }
}
