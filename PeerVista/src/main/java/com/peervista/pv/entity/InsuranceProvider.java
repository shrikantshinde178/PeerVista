package com.peervista.pv.entity;

import java.math.BigInteger;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="InsuranceProvider")
public class InsuranceProvider {
    
    @Id
    private int providerId;
    
    // It will create a new column in the database named as ProviderName
    @Column(name="InsuranceProviderName", length=100, nullable = false, unique = true)
    private String insuranceProviderName;
    
    @Column(name="InsuranceType", length=100, nullable = false)
    private String insuranceType;
    
    @Column(name="Address", length=100, nullable = false, unique = true)
    private String address;
    
    @Column(name="ContactNumber", length = 12, nullable = false, unique = true)
    private BigInteger contactNumber;
    
    @Column(name="CoverageTypes", length=100, nullable = false)
    private String coverageTypes;
    
    @Column(name="CountryOfOrigin", length=50, nullable = false)
    private String countryOfOrigin;
}

