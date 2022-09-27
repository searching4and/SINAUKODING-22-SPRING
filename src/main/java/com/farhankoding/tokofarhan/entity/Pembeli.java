package com.farhankoding.tokofarhan.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pembeli")
@Getter
@Setter
@NoArgsConstructor
public class Pembeli {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nama_pembeli;

    @Column
    private String jenis_kelamin;

    @Column
    private String no_telp;

    @Column
    private String alamat;
}
