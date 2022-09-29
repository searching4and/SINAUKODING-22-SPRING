package com.farhankoding.tokofarhan.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "supplier")
@Getter
@Setter
@NoArgsConstructor
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "BIGINT(11)")
    private Long id;

    @Column(columnDefinition = "VARCHAR(30)")
    private String namaSupplier;

    @Column(columnDefinition = "VARCHAR(13)")
    private String noTelp;

    @Column(columnDefinition = "VARCHAR(100)")
    private String alamat;

    @OneToMany(mappedBy = "supplier")
    private List<Barang> barangList;
}
