package com.farhankoding.tokofarhan.service;

import com.farhankoding.tokofarhan.entity.dto.PembayaranDTO;

import java.util.List;

public interface PembayaranService {
    PembayaranDTO save(PembayaranDTO param);

    List<PembayaranDTO> findAllData();

    PembayaranDTO update(PembayaranDTO param, Long id);

    Boolean delete(Long id);

    PembayaranDTO findById(Long id);
}
