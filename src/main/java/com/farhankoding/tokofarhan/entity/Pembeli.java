package com.farhankoding.tokofarhan.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pembeli")
@Getter
@Setter
@NoArgsConstructor
public class Pembeli {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT(11)")
    private Long id;

//    @Column(columnDefinition = "VARCHAR(30)")
    private String namaPembeli;

//    @Column(columnDefinition = "VARCHAR(1)")
    private String jenisKelamin;

//    @Column(columnDefinition = "VARCHAR(14)")
    private String noTelp;

//    @Column(columnDefinition = "VARCHAR(50)")
    private String alamat;

    @OneToMany(mappedBy = "pembeli")
    private List<Transaksi> transaksiList;
}
