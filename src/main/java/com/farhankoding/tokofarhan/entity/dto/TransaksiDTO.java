package com.farhankoding.tokofarhan.entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TransaksiDTO {
    private Long id;

//    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date tanggal;

    private String keterangan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PembeliDTO pembeli;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BarangDTO barang;


}
