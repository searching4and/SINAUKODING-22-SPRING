package com.farhankoding.tokofarhan.service.impl;

import com.farhankoding.tokofarhan.entity.Barang;
import com.farhankoding.tokofarhan.entity.Supplier;
import com.farhankoding.tokofarhan.entity.dto.BarangDTO;
import com.farhankoding.tokofarhan.entity.mapping.BarangMapping;
import com.farhankoding.tokofarhan.entity.mapping.SupplierMapping;
import com.farhankoding.tokofarhan.repository.BarangRepository;
import com.farhankoding.tokofarhan.repository.SupplierRepository;
import com.farhankoding.tokofarhan.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BarangServiceImpl implements BarangService {

    @Autowired
    private BarangRepository repository;

    @Autowired
    private SupplierRepository supplierRepository;

    @Transactional
    @Override
    public BarangDTO save(BarangDTO param) {
        Supplier supplier = SupplierMapping.instance.toEntity(param.getSupplier());

        Barang data = BarangMapping.instance.toEntity(param);

        if (param.getSupplier() != null) {
            supplier = supplierRepository.save(supplier);

            data.getSupplier().setId(supplier.getId());
        }

        data = repository.save(data);

        return BarangMapping.instance.toDto(data);
    }
    @Transactional
    @Override
    public List<BarangDTO> findAllData()
    {
        return BarangMapping.instance.toListDto(repository.findAll());

    }
    @Transactional
    @Override
    public BarangDTO update(BarangDTO param, Long id) {
        Barang data = repository.findById(id).orElse(null);

        if (data != null){
            data.setNamaBarang(param.getNamaBarang()== null ? data.getNamaBarang() : param.getNamaBarang());
            data.setHarga(param.getHarga()== null ? data.getHarga() : param.getHarga());
            data.setStok(param.getStok()== null ? data.getStok() : param.getStok());



            return  BarangMapping.instance.toDto(repository.save(data));
        }
        return BarangMapping.instance.toDto(data);

    }
    @Override
    public Boolean delete(Long id) {
        Barang data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public BarangDTO findById(Long id) {
        return BarangMapping.instance.toDto(repository.findById(id).orElse(null));
    }
}
