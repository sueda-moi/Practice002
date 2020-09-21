package com.project.cn.service;

import com.project.cn.entity.Ems;
import com.project.cn.entity.Indent;
import com.project.cn.entity.Output;
import com.project.cn.entity.Settlement;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.util.List;
/*
导出excel
 */
public interface OutputExcelService {


    XSSFWorkbook createIndentListExcel(List<Indent> list);

    XSSFWorkbook createEmsListExcel(List<Ems> list);

    XSSFWorkbook createSettlementListExcel(List<Settlement> list);

    XSSFWorkbook createOutputListExcel(List<Output> list);


}
