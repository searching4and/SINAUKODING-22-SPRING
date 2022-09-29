package com.farhankoding.tokofarhan.repository;

import com.farhankoding.tokofarhan.entity.Transaksi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaksiRepository extends JpaRepository<Transaksi, Long> {
}