package com.farhankoding.tokofarhan.entity.mapping;

import com.farhankoding.tokofarhan.entity.Pembayaran;
import com.farhankoding.tokofarhan.entity.dto.PembayaranDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PembarayanMapping {
    PembarayanMapping instance = Mappers.getMapper(PembarayanMapping.class);

    Pembayaran toEntity(PembayaranDTO dto);

    PembayaranDTO toDto(Pembayaran param);

    List<PembayaranDTO> toListDto   (List<Pembayaran> pembayaranList);
}
