package com.spring.boot.observablity.fraudetect.controller;

import com.spring.boot.observablity.fraudetect.entity.FraudRecord;
import com.spring.boot.observablity.fraudetect.entity.LoanStatus;
import com.spring.boot.observablity.fraudetect.service.FraudDetectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fraud")
@RequiredArgsConstructor
public class FraudDetectionController {

    private final FraudDetectionService fraudDetectionService;
    @GetMapping("/check")
    public LoanStatus checkForFraud(@RequestParam int customerId) {
        return fraudDetectionService.checkForFraud(customerId);
    }

    @GetMapping("/fetch")
    public List<FraudRecord> getFraudList(){
        return fraudDetectionService.getAllFetch();
    }

    @PostMapping("/add")
    public List<FraudRecord> addFraud(@RequestBody FraudRecord fraudRecord){
        fraudDetectionService.addFraud(fraudRecord);
        return fraudDetectionService.getAllFetch();
    }
}

