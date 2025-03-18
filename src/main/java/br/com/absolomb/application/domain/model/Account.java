package br.com.absolomb.application.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    // 13 digits before colon and 2 after
    @Column(precision = 13, scale = 2)
    private BigDecimal balance;

    // 13 digits before colon and 2 after
    @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal limit;


}
