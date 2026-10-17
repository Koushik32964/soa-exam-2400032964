package com.klef.soa.exam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "AirConditionerService")
@Data
@Builder
public class AirConditionerServiceEntity 
{

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String brand;
	    private String serviceDate;
	    private Double serviceCost;
	    private Boolean completed;


}
