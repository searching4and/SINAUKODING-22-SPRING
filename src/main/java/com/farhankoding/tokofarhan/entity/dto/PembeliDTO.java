package com.farhankoding.tokofarhan.entity.dto;

import com.farhankoding.tokofarhan.entity.mapping.PembeliMapping;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PembeliDTO {
    public static PembeliMapping instance;
    private Long id;

    private String namaPembeli;

    private String jenisKelamin;

    private String noTelp;

    private String alamat;
}
