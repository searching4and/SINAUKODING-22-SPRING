package com.farhankoding.tokofarhan.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pembayaran")
@Getter
@Setter
@NoArgsConstructor
public class Pembayaran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT(11)")
    private Long id;

    private Date tglBayar;

//    @Column(columnDefinition = "INT(11)")
    private Integer totalBayar;

    @ManyToOne
    @JoinColumn(name = "id_transaksi")
    private Transaksi transaksi;


}
