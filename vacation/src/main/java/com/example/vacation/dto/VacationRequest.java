package com.example.vacation.dto;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
@Data
@NoArgsConstructor
public class VacationRequest {

    @NotBlank
    private String employeeName;
    private LocalDate startDate;
    private LocalDate endDate;

}