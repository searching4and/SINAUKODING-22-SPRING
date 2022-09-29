package com.farhankoding.tokofarhan.service.impl;

import com.farhankoding.tokofarhan.entity.Barang;
import com.farhankoding.tokofarhan.entity.Pembayaran;
import com.farhankoding.tokofarhan.entity.Supplier;
import com.farhankoding.tokofarhan.entity.Transaksi;
import com.farhankoding.tokofarhan.entity.dto.BarangDTO;
import com.farhankoding.tokofarhan.entity.dto.PembayaranDTO;
import com.farhankoding.tokofarhan.entity.mapping.BarangMapping;
import com.farhankoding.tokofarhan.entity.mapping.PembarayanMapping;
import com.farhankoding.tokofarhan.entity.mapping.SupplierMapping;
import com.farhankoding.tokofarhan.entity.mapping.TransaksiMapping;
import com.farhankoding.tokofarhan.repository.BarangRepository;
import com.farhankoding.tokofarhan.repository.PembayaranRepository;
import com.farhankoding.tokofarhan.repository.SupplierRepository;
import com.farhankoding.tokofarhan.repository.TransaksiRepository;
import com.farhankoding.tokofarhan.service.BarangService;
import com.farhankoding.tokofarhan.service.PembayaranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PembayaranServiceImpl implements PembayaranService {

    @Autowired
    private PembayaranRepository repository;

    @Autowired
    private TransaksiRepository transaksiRepository;

    @Override
    public PembayaranDTO save(PembayaranDTO param) {
        Transaksi transaksi = TransaksiMapping.instance.toEntity(param.getTransaksi());

        Pembayaran data = PembarayanMapping.instance.toEntity(param);

        if (param.getTransaksi() != null) {
            transaksi = transaksiRepository.save(transaksi);

            data.getTransaksi().setId(transaksi.getId());
        }

        data = repository.save(data);

        return PembarayanMapping.instance.toDto(data);
    }

    @Override
    public List<PembayaranDTO> findAllData()
    {
        return PembarayanMapping.instance.toListDto(repository.findAll());

    }
    @Override
    public PembayaranDTO update(PembayaranDTO param, Long id) {
        Pembayaran data = repository.findById(id).orElse(null);

        if (data != null){
            data.setTglBayar(param.getTglBayar()== null ? data.getTglBayar() : param.getTglBayar());
            data.setTotalBayar(param.getTotalBayar()== null ? data.getTotalBayar() : param.getTotalBayar());

            return  PembarayanMapping.instance.toDto(repository.save(data));
        }
        return PembarayanMapping.instance.toDto(data);

    }
    @Override
    public Boolean delete(Long id) {
        Pembayaran data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public PembayaranDTO findById(Long id) {
        return PembarayanMapping.instance.toDto(repository.findById(id).orElse(null));
    }
}
