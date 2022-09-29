package com.farhankoding.tokofarhan.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "transaksi")
@Getter
@Setter
@NoArgsConstructor
public class Transaksi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT(11)")
    private Long id;

    private Date tanggal;

    @Column
    private String keterangan;

    @ManyToOne
    @JoinColumn(name = "id_pembeli")
    private Pembeli pembeli;
    @ManyToOne
    @JoinColumn(name = "id_barang")
    private Barang barang;

    @OneToMany(mappedBy = "transaksi")
    private List<Pembayaran> pembayaranList;
}
