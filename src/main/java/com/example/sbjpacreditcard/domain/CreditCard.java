package com.example.sbjpacreditcard.domain;


import com.example.sbjpacreditcard.interseptors.EncryptedString;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @EncryptedString
    @Size(max = 20)
    private String creditCardNumber;
    @Size(max = 4)
    private String cvv;
    @Size(max = 7)
    private String expirationDate;
}
