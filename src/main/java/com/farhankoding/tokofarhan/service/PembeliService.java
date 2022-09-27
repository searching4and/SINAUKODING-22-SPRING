package com.farhankoding.tokofarhan.service;

import com.farhankoding.tokofarhan.entity.Pembeli;
import com.farhankoding.tokofarhan.entity.dto.PembeliDTO;

import java.util.List;

public interface PembeliService {

    PembeliDTO save(PembeliDTO param);

    List<PembeliDTO> findAllData();

    PembeliDTO update(PembeliDTO param, Long id);

    Boolean delete(Long id);

    PembeliDTO findById(Long id);

}
