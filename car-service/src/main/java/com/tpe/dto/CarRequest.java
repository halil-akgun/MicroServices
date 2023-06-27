package com.tpe.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarRequest {

    @Column(length = 30, nullable = false)
    private String brand;

    @Column(length = 30, nullable = false)
    private String model;

    @Column(nullable = false)
    private Integer doors;

    @Column(nullable = false)
    private Double pricePerHour;

    @Column(nullable = false)
    private Integer age;
}
