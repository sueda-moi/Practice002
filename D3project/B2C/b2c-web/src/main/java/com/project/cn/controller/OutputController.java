package com.project.cn.controller;

import com.project.cn.entity.Output;
import com.project.cn.entity.ResponseBean;
import com.project.cn.entity.StatusEnum;
import com.project.cn.entity.StatusResponse;
import com.project.cn.service.OutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("output")
public class OutputController {

    @Autowired
    private OutputService outputService;


    @GetMapping
    public ResponseEntity<ResponseBean> findAll(){
        List<Output> all = outputService.findAll();
        return ResponseEntity.ok(new ResponseBean(StatusEnum.OK,all));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<StatusResponse> deleteById(@PathVariable Integer id){
        if (outputService.deleteById(id)>0){
            return ResponseEntity.ok(new StatusResponse(StatusEnum.OK));
        }
        return ResponseEntity.ok(new StatusResponse(StatusEnum.ERROE));
    }

    @PostMapping
    public ResponseEntity<StatusResponse> addOutput(@RequestBody Output output){
        if (outputService.addOutput(output)>0){
            return ResponseEntity.ok(new StatusResponse(StatusEnum.OK));
        }
        return ResponseEntity.ok(new StatusResponse(StatusEnum.ERROE));
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseBean> findById(@PathVariable Integer id){
        return ResponseEntity.ok(new ResponseBean(StatusEnum.OK,outputService.findById(id)));
    }

    @PutMapping
    public ResponseEntity<StatusResponse> update(@RequestBody Output output){
        if (outputService.update(output)>0){
            return ResponseEntity.ok(new StatusResponse(StatusEnum.OK));
        }
        return ResponseEntity.ok(new StatusResponse(StatusEnum.ERROE));
    }

















}
