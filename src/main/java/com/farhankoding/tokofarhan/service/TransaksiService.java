package com.farhankoding.tokofarhan.service;

import com.farhankoding.tokofarhan.entity.dto.TransaksiDTO;

import java.util.List;

public interface TransaksiService {
    TransaksiDTO save(TransaksiDTO param);

    List<TransaksiDTO> findAllData();

    TransaksiDTO update(TransaksiDTO param, Long id);

    Boolean delete(Long id);

    TransaksiDTO findById(Long id);
}
