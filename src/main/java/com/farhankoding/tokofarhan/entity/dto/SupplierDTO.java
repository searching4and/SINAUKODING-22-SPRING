package com.farhankoding.tokofarhan.entity.dto;

import com.farhankoding.tokofarhan.entity.mapping.PembeliMapping;
import com.farhankoding.tokofarhan.entity.mapping.SupplierMapping;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SupplierDTO {
    public static SupplierMapping instance;
    private Long id;

    private String nama_supplier;

    private String no_telp;

    private String alamat;
}
