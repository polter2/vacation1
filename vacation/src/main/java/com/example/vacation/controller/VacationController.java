package com.example.vacation.controller;

import com.example.vacation.dto.VacationRequest;
import com.example.vacation.dto.VacationResponse;
import com.example.vacation.service.VacationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vacations")
@RequiredArgsConstructor
public class VacationController {
    private final VacationService service;
    @GetMapping
    public List<VacationResponse> getAll(){
        return service.getAll();
    }
    @PostMapping
    public VacationResponse create (@Valid @RequestBody VacationRequest request){
        return service.create(request);
    }
    @PutMapping("/{id}/approve")
    public VacationResponse approve(@PathVariable Long id){
        return service.approve(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}

