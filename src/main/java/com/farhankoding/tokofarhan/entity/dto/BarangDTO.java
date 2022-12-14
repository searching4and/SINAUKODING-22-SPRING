package com.farhankoding.tokofarhan.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BarangDTO {
    private Long id;

    private String namaBarang;

    private Double harga;

    private Integer stok;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private SupplierDTO supplier;
}
