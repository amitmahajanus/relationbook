package com.example.demo;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "DebitAccount")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DebitAccount extends Account{
    private BigDecimal overdraftFee;
}
