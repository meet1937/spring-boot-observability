package com.spring.boot.observablity.fraudetect.service;

import com.spring.boot.observablity.fraudetect.entity.FraudRecord;
import com.spring.boot.observablity.fraudetect.entity.LoanStatus;
import com.spring.boot.observablity.fraudetect.repository.FraudRecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FraudDetectionService {

    private final FraudRecordRepository fraudRecordRepository;

    public LoanStatus checkForFraud(int customerId) {
        return !(fraudRecordRepository.findBycustomerId(customerId)).isEmpty() ? LoanStatus.REJECTED : LoanStatus.APPROVED;
    }

    public List<FraudRecord> getAllFetch(){
        return  fraudRecordRepository.findAll();
    }

    public void addFraud(FraudRecord fraudRecord){
        fraudRecordRepository.save(fraudRecord);
    }
}
