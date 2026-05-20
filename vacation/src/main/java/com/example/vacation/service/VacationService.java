package com.example.vacation.service;

import com.example.vacation.dto.VacationRequest;
import com.example.vacation.dto.VacationResponse;
import com.example.vacation.entity.Vacation;
import com.example.vacation.entity.VacationStatus;
import com.example.vacation.exception.NotFoundException;
import com.example.vacation.repository.VacationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VacationService {
    private final VacationRepository repository;

    public List<VacationResponse> getAll(){
        return repository.findAll().stream().map(this::mapToResponse).toList();
    }
    public VacationResponse create (VacationRequest request){
        Vacation vacation = Vacation.builder().employeeName(request.getEmployeeName()).startDate(request.getStartDate()).endDate(request.getEndDate())
                .status(VacationStatus.PENDING).build();
        return mapToResponse(repository.save(vacation));
    }
    public VacationResponse approve(Long id){
        Vacation vacation = repository.findById(id).orElseThrow(() ->
                new NotFoundException("Vacation not found"));
        vacation.setStatus(VacationStatus.APPROVED);
        vacation.setApprovedBy("Manager");
        return mapToResponse(repository.save(vacation));
    }
    public void delete(Long id){
       Vacation vacation = repository.findById(id).orElseThrow(() -> new NotFoundException("Vacation not found"));
       repository.delete(vacation);
    }
    private VacationResponse mapToResponse(Vacation vacation){
        return VacationResponse.builder().id(vacation.getId()).employeeName(vacation.getEmployeeName())
                .startDate(vacation.getStartDate()).endDate(vacation.getEndDate()).status(vacation.getStatus())
                .approvedBy(vacation.getApprovedBy()).build();}
}
