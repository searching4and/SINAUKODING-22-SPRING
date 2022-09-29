package com.farhankoding.tokofarhan.controller;

import com.farhankoding.tokofarhan.common.Response;
import com.farhankoding.tokofarhan.entity.dto.PembayaranDTO;
import com.farhankoding.tokofarhan.service.impl.PembayaranServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pembayaran")
public class PembayaranController {

    @Autowired
    private PembayaranServiceImpl service;

    @GetMapping("/find-all")
    public Response findAllData(){
        List<PembayaranDTO> data = service.findAllData();
        return new Response(data, "Get All Data Pembayaran", data.size(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> saveData(@RequestBody PembayaranDTO param){
        return new ResponseEntity<>(service.save(param), HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?>updateData(@PathVariable Long id,
                                       @RequestBody PembayaranDTO param){
        PembayaranDTO data = service.update(param, id);

        if (data != null){
            return  new ResponseEntity<>(data, HttpStatus.OK);
        }
        else
        {
            return  new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
        }
    }
    @GetMapping("/find-by-id/{id}")
    public Response findById(@PathVariable Long id){
        return new Response(service.findById(id), "Berhasil Mengabil Data dari id " + id, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public Response deleteData(@PathVariable Long id){
        if (service.delete(id)){
            return new Response("Data Berhasil di Hapus",HttpStatus.OK);
        }else{
            return new Response("Data Gagal di Hapus",HttpStatus.BAD_REQUEST);
        }
    }
}
