package com.farhankoding.tokofarhan.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TransaksiDTO {
    private Long id;

    private Date tanggal;

    private String keterangan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BarangDTO barang;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PembeliDTO pembeli;
}
