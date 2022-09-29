package com.farhankoding.tokofarhan.service.impl;

import com.farhankoding.tokofarhan.entity.Barang;
import com.farhankoding.tokofarhan.entity.Pembeli;
import com.farhankoding.tokofarhan.entity.Supplier;
import com.farhankoding.tokofarhan.entity.Transaksi;
import com.farhankoding.tokofarhan.entity.dto.BarangDTO;
import com.farhankoding.tokofarhan.entity.dto.TransaksiDTO;
import com.farhankoding.tokofarhan.entity.mapping.BarangMapping;
import com.farhankoding.tokofarhan.entity.mapping.PembeliMapping;
import com.farhankoding.tokofarhan.entity.mapping.SupplierMapping;
import com.farhankoding.tokofarhan.entity.mapping.TransaksiMapping;
import com.farhankoding.tokofarhan.repository.BarangRepository;
import com.farhankoding.tokofarhan.repository.PembeliRepository;
import com.farhankoding.tokofarhan.repository.SupplierRepository;
import com.farhankoding.tokofarhan.repository.TransaksiRepository;
import com.farhankoding.tokofarhan.service.BarangService;
import com.farhankoding.tokofarhan.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TransaksiServiceImpl implements TransaksiService {

    @Autowired
    private TransaksiRepository repository;

    @Autowired
    private BarangRepository barangRepository;

    @Autowired
    private PembeliRepository pembeliRepository;

    @Transactional
    @Override
    public TransaksiDTO save(TransaksiDTO param) {
        Pembeli pembeli = PembeliMapping.instance.toEntity(param.getPembeli());

        Transaksi data = TransaksiMapping.instance.toEntity(param);

        if (param.getPembeli() != null) {
            pembeli = pembeliRepository.save(pembeli);

            data.getPembeli().setId(pembeli.getId());
        }

        data = repository.save(data);

        return TransaksiMapping.instance.toDto(data);
    }

    @Override
    public List<TransaksiDTO> findAllData()
    {
        return TransaksiMapping.instance.toListDto(repository.findAll());

    }
    @Override
    public TransaksiDTO update(TransaksiDTO param, Long id) {
        Transaksi data = repository.findById(id).orElse(null);

        if (data != null){
            data.setTanggal(param.getTanggal()== null ? data.getTanggal() : param.getTanggal());
            data.setKeterangan(param.getKeterangan()== null ? data.getKeterangan() : param.getKeterangan());



            return  TransaksiMapping.instance.toDto(repository.save(data));
        }
        return TransaksiMapping.instance.toDto(data);

    }
    @Override
    public Boolean delete(Long id) {
        Transaksi data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public TransaksiDTO findById(Long id) {
        return TransaksiMapping.instance.toDto(repository.findById(id).orElse(null));
    }
}
