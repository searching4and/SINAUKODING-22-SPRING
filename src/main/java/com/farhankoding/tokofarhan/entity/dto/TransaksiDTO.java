package com.farhankoding.tokofarhan.entity.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TransaksiDTO {
    private Long id;

    private Date tanggal;

    private String keterangan;

    private BarangDTO barang;

    private PembeliDTO pembeli;
}
