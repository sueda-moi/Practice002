package com.project.cn.controller;

import com.project.cn.entity.Indent;
import com.project.cn.entity.ResponseBean;
import com.project.cn.entity.StatusEnum;
import com.project.cn.service.indentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("indentSearch")
public class searchController {

    @Autowired
    private indentService indentService;

    @PostMapping
    @ResponseBody
    public ResponseEntity<ResponseBean> indentSearch(HttpServletRequest request){
        String text = request.getParameter("text");
        List<Indent> search = indentService.search(text);
        return ResponseEntity.ok(new ResponseBean(StatusEnum.OK,search));
    }
}
