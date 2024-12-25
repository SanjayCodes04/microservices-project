package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;


@Entity
@Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity{

    private Long customerId;

    @Id
    private Long accountNumber;

    private String accountType;

    private String branchAddress;
    
}
