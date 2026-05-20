package com.example.vacation.dto;

import com.example.vacation.entity.Vacation;
import com.example.vacation.entity.VacationStatus;
import lombok.Builder;
import lombok.Getter;
import java.time.LocalDate;

@Getter
@Builder
public class VacationResponse {
    private Long id;
    private String employeeName;
    private LocalDate startDate;
    private LocalDate endDate;
    private VacationStatus status;
    private String approvedBy;
}
