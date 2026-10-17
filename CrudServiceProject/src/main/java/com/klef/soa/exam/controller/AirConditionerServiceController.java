package com.klef.soa.exam.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.klef.soa.exam.entity.AirConditionerServiceEntity;
import com.klef.soa.exam.service.AirConditionerService;

@RestController
public class AirConditionerServiceController {

    private final AirConditionerService service;

    public AirConditionerServiceController(AirConditionerService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "CRUD Service is running";
    }

    @PostMapping("/add")
    public ResponseEntity<AirConditionerServiceEntity> add(@RequestBody AirConditionerServiceEntity entity) {
        AirConditionerServiceEntity saved = service.add(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/displayAll")
    public List<AirConditionerServiceEntity> displayAll() {
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        boolean status = service.deleteById(id); 
        
        if (status) {
            service.deleteById(id);
      
            return ResponseEntity.ok("AirConditionerService Deleted Successfully");
        } 
        else {
     
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("AirConditionerService Id Not Found");
        }
    }
}
