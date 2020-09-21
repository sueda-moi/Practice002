package com.project.cn.controller;


import com.project.cn.entity.Ems;
import com.project.cn.entity.ResponseBean;
import com.project.cn.entity.StatusEnum;
import com.project.cn.entity.StatusResponse;

import com.project.cn.service.EmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("ems")
public class EmsController {

    @Autowired
    private EmsService emsService;


    @GetMapping
    public ResponseEntity<ResponseBean> findAll(){
        List<Ems> all = emsService.findAll();
        return ResponseEntity.ok(new ResponseBean(StatusEnum.OK,all));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<StatusResponse> deleteById(@PathVariable Integer id){
        if (emsService.deleteById(id)>0){
            return ResponseEntity.ok(new StatusResponse(StatusEnum.OK));
        }
        return ResponseEntity.ok(new StatusResponse(StatusEnum.ERROE));
    }

    @PostMapping
    public ResponseEntity<StatusResponse> addindent(@RequestBody Ems ems){
        if (emsService.addEms(ems)>0){
            return ResponseEntity.ok(new StatusResponse(StatusEnum.OK));
        }
        return ResponseEntity.ok(new StatusResponse(StatusEnum.ERROE));
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseBean> findById(@PathVariable Integer id){
        return ResponseEntity.ok(new ResponseBean(StatusEnum.OK,emsService.findById(id)));
    }

    @PutMapping
    public ResponseEntity<StatusResponse> update(@RequestBody Ems ems){
        if (emsService.update(ems)>0){
            return ResponseEntity.ok(new StatusResponse(StatusEnum.OK));
        }
        return ResponseEntity.ok(new StatusResponse(StatusEnum.ERROE));
    }

   















}
