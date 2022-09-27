package com.farhankoding.tokofarhan.entity.mapping;


import com.farhankoding.tokofarhan.entity.Pembeli;
import com.farhankoding.tokofarhan.entity.Supplier;
import com.farhankoding.tokofarhan.entity.dto.PembeliDTO;
import com.farhankoding.tokofarhan.entity.dto.SupplierDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SupplierMapping {
    SupplierMapping instance = Mappers.getMapper(SupplierMapping.class);

    Supplier toEntity(SupplierDTO dto);

    SupplierDTO toDto(Supplier param);

    List<SupplierDTO> toListDto   (List<Supplier> pembeliList);
}
