package com.spring.boot.observablity.fraudetect.repository;

import com.spring.boot.observablity.fraudetect.entity.FraudRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FraudRecordRepository extends JpaRepository<FraudRecord, Long> {

    List<FraudRecord> findBycustomerId(int customerId);
}
