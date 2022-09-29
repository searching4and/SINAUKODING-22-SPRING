package com.farhankoding.tokofarhan.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "barang")
@Getter
@Setter
@NoArgsConstructor
public class Barang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT(11)")
    private Long id;

    @Column(columnDefinition = "VARCHAR(20)")
    private String namaBarang;

    @Column(columnDefinition = "INT(11)")
    private Double harga;

    @Column(columnDefinition = "INT(11)")
    private Integer stok;

    @OneToMany(mappedBy = "barang")
    private List<Transaksi> transaksiList;
    @ManyToOne
    @JoinColumn(name = "id_supplier")
    private Supplier supplier;


}
