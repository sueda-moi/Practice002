package com.project.cn.controller;

import com.project.cn.entity.Indent;

import com.project.cn.entity.ResponseBean;
import com.project.cn.entity.StatusEnum;
import com.project.cn.entity.StatusResponse;
import com.project.cn.service.indentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("indent")
public class indentController {

    @Autowired
    private indentService indentService;


    @GetMapping
    public ResponseEntity<ResponseBean> findAll(){
        List<Indent> all = indentService.findAll();
        return ResponseEntity.ok(new ResponseBean(StatusEnum.OK,all));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<StatusResponse> deleteById(@PathVariable Integer id){
        if (indentService.deleteById(id)>0){
            return ResponseEntity.ok(new StatusResponse(StatusEnum.OK));
        }
        return ResponseEntity.ok(new StatusResponse(StatusEnum.ERROE));
    }

    @PostMapping
    public ResponseEntity<StatusResponse> addindent(@RequestBody Indent indent){
        if (indentService.addIndent(indent)>0){
            return ResponseEntity.ok(new StatusResponse(StatusEnum.OK));
        }
        return ResponseEntity.ok(new StatusResponse(StatusEnum.ERROE));
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseBean> findById(@PathVariable Integer id){
        return ResponseEntity.ok(new ResponseBean(StatusEnum.OK,indentService.findById(id)));
    }

    @PutMapping
    public ResponseEntity<StatusResponse> update(@RequestBody Indent indent){
        if (indentService.update(indent)>0){
            return ResponseEntity.ok(new StatusResponse(StatusEnum.OK));
        }
        return ResponseEntity.ok(new StatusResponse(StatusEnum.ERROE));
    }

    @GetMapping("selectByDD")
    public ResponseEntity<ResponseBean> selectBySource(){
        List<Indent> indents = indentService.selectBySouce();
        return ResponseEntity.ok(new ResponseBean(StatusEnum.OK,indents));
    }















}
