package com.project.cn.controller;


import com.project.cn.entity.ResponseBean;
import com.project.cn.entity.StatusEnum;
import com.project.cn.entity.StatusResponse;
import com.project.cn.service.SettlementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("settlement")
public class SettlementController {

    @Autowired
    private SettlementService settlementService;


    @GetMapping
    public ResponseEntity<ResponseBean> findAll(){
        List<Settlement> all = settlementService.findAll();
        return ResponseEntity.ok(new ResponseBean(StatusEnum.OK,all));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<StatusResponse> deleteById(@PathVariable Integer id){
        if (settlementService.deleteById(id)>0){
            return ResponseEntity.ok(new StatusResponse(StatusEnum.OK));
        }
        return ResponseEntity.ok(new StatusResponse(StatusEnum.ERROE));
    }

    @PostMapping
    public ResponseEntity<StatusResponse> addindent(@RequestBody Settlement settlement){
        if (settlementService.addSettlement(settlement)>0){
            return ResponseEntity.ok(new StatusResponse(StatusEnum.OK));
        }
        return ResponseEntity.ok(new StatusResponse(StatusEnum.ERROE));
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseBean> findById(@PathVariable Integer id){
        return ResponseEntity.ok(new ResponseBean(StatusEnum.OK,settlementService.findById(id)));
    }

    @PutMapping
    public ResponseEntity<StatusResponse> update(@RequestBody Settlement settlement){
        if (settlementService.update(settlement)>0){
            return ResponseEntity.ok(new StatusResponse(StatusEnum.OK));
        }
        return ResponseEntity.ok(new StatusResponse(StatusEnum.ERROE));
    }

















}
