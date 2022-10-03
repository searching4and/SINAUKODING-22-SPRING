package com.farhankoding.tokofarhan.service.impl;

import com.farhankoding.tokofarhan.entity.Pembeli;
import com.farhankoding.tokofarhan.entity.dto.PembeliDTO;
import com.farhankoding.tokofarhan.entity.mapping.PembeliMapping;
import com.farhankoding.tokofarhan.repository.PembeliRepository;
import com.farhankoding.tokofarhan.service.PembeliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PembeliServiceImpl implements PembeliService {

    @Autowired
    private PembeliRepository repository;

    @Transactional
    @Override
    public PembeliDTO save(PembeliDTO param) {
        Pembeli data = repository.save(PembeliMapping.instance.toEntity(param));
        return PembeliMapping.instance.toDto(data);
    }

    @Transactional
    @Override
    public List<PembeliDTO> findAllData()
    {
        return PembeliMapping.instance.toListDto(repository.findAll());
    }
    @Transactional
    @Override
    public PembeliDTO update(PembeliDTO param, Long id) {
        Pembeli data = repository.findById(id).orElse(null);

        if (data != null){
            data.setNamaPembeli(param.getNamaPembeli()== null ? data.getNamaPembeli() : param.getNamaPembeli());
            data.setJenisKelamin(param.getJenisKelamin() != null ? param.getJenisKelamin() : data.getJenisKelamin());
            data.setNoTelp(param.getNoTelp() != null ? param.getNoTelp() : data.getNoTelp());
            data.setAlamat(param.getAlamat() != null ? param.getAlamat() : data.getAlamat());

            return  PembeliMapping.instance.toDto(repository.save(data));
        }
        return PembeliMapping.instance.toDto(data);

    }
    @Override
    public Boolean delete(Long id) {
        Pembeli data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public PembeliDTO findById(Long id) {
        return PembeliMapping.instance.toDto(repository.findById(id).orElse(null));
    }
}
