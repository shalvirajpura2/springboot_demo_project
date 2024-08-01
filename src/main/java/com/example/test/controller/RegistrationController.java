package com.example.test.controller;

import com.example.test.model.Registration;
import com.example.test.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/registrations")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping
    public List<Registration> getAllRegistrations() {
        return registrationService.getAllRegistrations();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Registration> getRegistrationById(@PathVariable Long id) {
        return registrationService.getRegistrationById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping()
    public Registration createRegistration(@RequestBody Registration registration) {
        return registrationService.createRegistration(registration);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Registration> updateRegistration(@PathVariable Long id, @RequestBody Registration registrationDetails) {
        return ResponseEntity.ok(registrationService.updateRegistration(id, registrationDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRegistration(@PathVariable Long id) {
        registrationService.deleteRegistration(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("fn") MultipartFile file) {
        System.out.println("hello im hereeeeeeee---------------------");
        String uploadsDir = System.getProperty("user.dir") + "/Uploads";
        File uploadsDirFile = new File(uploadsDir);

        if (!uploadsDirFile.exists()) {
            uploadsDirFile.mkdirs();
        }
        
        String fileUploadStatus;
        
        if(!file.getContentType().equals("image/jpeg")) {
        	fileUploadStatus="only jpg files are allowed";
        	return fileUploadStatus;
        }

        String filePath = uploadsDir + File.separator + file.getOriginalFilename();
//        String fileUploadStatus;
        System.out.println("--->>> " + filePath);

        try (FileOutputStream fout = new FileOutputStream(filePath)) {
            fout.write(file.getBytes());
            fileUploadStatus = "File Uploaded Successfully";
            System.out.println(fileUploadStatus);
        } catch (IOException e) {
            e.printStackTrace();
            fileUploadStatus = "Error in uploading file: " + e;
        }
        return fileUploadStatus;
    }
}
