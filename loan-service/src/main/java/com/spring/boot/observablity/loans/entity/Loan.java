package com.spring.boot.observablity.loans.entity;

import com.spring.boot.observablity.loans.dto.LoanDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@Table(name = "loans")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String loanId;
    private String customerName;
    private int customerId;
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private LoanStatus loanStatus;

    public static Loan from(LoanDto loanDto) {
        if (loanDto.getLoanId() == null && loanDto.getLoanStatus() == null) {
            return Loan.builder()
                    .loanId(String.valueOf(UUID.randomUUID()))
                    .amount(loanDto.getAmount())
                    .customerId(loanDto.getCustomerId())
                    .customerName(loanDto.getCustomerName())
                    .build();
        }
        return Loan.builder()
                .loanId(String.valueOf(UUID.randomUUID()))
                .amount(loanDto.getAmount())
                .customerId(loanDto.getCustomerId())
                .customerName(loanDto.getCustomerName())
                .build();
    }
}
