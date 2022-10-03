package com.farhankoding.tokofarhan.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PembayaranDTO {
    private Long id;

//    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date tglBayar;

    private Integer totalBayar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private TransaksiDTO transaksi;
}