package com.farhankoding.tokofarhan.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "barang")
@Getter
@Setter
@NoArgsConstructor
public class Barang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nama_barang;

    @Column
    private Double harga;

    @Column
    private Integer stok;
}
