package com.spring.boot.observablity.fraudetect.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="fraud_record")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FraudRecord{

    @Id
    Long id;
    String fraudRecordId;
    int customerId;
}
