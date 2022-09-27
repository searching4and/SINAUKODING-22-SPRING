package com.farhankoding.tokofarhan.service.impl;

import com.farhankoding.tokofarhan.entity.Barang;
import com.farhankoding.tokofarhan.entity.Supplier;
import com.farhankoding.tokofarhan.entity.dto.BarangDTO;
import com.farhankoding.tokofarhan.entity.dto.SupplierDTO;
import com.farhankoding.tokofarhan.entity.mapping.BarangMapping;
import com.farhankoding.tokofarhan.entity.mapping.SupplierMapping;
import com.farhankoding.tokofarhan.repository.SupplierRepository;
import com.farhankoding.tokofarhan.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierRepository repository;

    @Override
    public SupplierDTO save(SupplierDTO param) {
        Supplier data = repository.save(SupplierMapping.instance.toEntity(param));
        return SupplierMapping.instance.toDto(data);
    }

    @Override
    public List<SupplierDTO> findAllData() {
        return SupplierMapping.instance.toListDto(repository.findAll());
    }

    @Override
    public SupplierDTO update(SupplierDTO param, Long id) {
        Supplier data = repository.findById(id).orElse(null);

        if (data != null) {
            data.setNama_supplier(param.getNama_supplier() == null ? data.getNama_supplier() : param.getNama_supplier());
            data.setNo_telp(param.getNo_telp() != null ? param.getNo_telp() : data.getNo_telp());
            data.setAlamat(param.getAlamat() != null ? param.getAlamat() : data.getAlamat());

            SupplierDTO.instance.toDto(repository.save(data));
        }
        return SupplierDTO.instance.toDto(data);
    }

    @Override
    public Boolean delete(Long id) {
        Supplier data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public SupplierDTO findById(Long id) {
        return SupplierMapping.instance.toDto(repository.findById(id).orElse(null));
    }
}
