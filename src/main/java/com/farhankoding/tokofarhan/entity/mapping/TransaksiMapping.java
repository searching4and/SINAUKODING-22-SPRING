package com.farhankoding.tokofarhan.entity.mapping;

import com.farhankoding.tokofarhan.entity.Transaksi;
import com.farhankoding.tokofarhan.entity.dto.TransaksiDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TransaksiMapping {
    TransaksiMapping instance = Mappers.getMapper(TransaksiMapping.class);

    Transaksi toEntity(TransaksiDTO dto);

    TransaksiDTO toDto(Transaksi param);

    List<TransaksiDTO> toListDto (List<Transaksi> transaksiList);
}
