package com.farhankoding.tokofarhan.service;

import com.farhankoding.tokofarhan.entity.dto.BarangDTO;

import java.util.List;

public interface BarangService {
    BarangDTO save(BarangDTO param);

    List<BarangDTO> findAllData();

    BarangDTO update(BarangDTO param, Long id);

    Boolean delete(Long id);

    BarangDTO findById(Long id);
}
