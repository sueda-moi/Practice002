package com.project.cn.service.Impl;

import com.project.cn.entity.Ems;
import com.project.cn.entity.Indent;
import com.project.cn.entity.Output;
import com.project.cn.entity.Settlement;
import com.project.cn.service.OutputExcelService;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
@Transactional
public class OutputExcelServiceImpl implements OutputExcelService {

     //创建XSSFworkbook 一个workbook对应一个excel文件
    private XSSFWorkbook workbook = new XSSFWorkbook();
    //转换时间格式
    private DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Override
    public XSSFWorkbook createIndentListExcel(List<Indent> list) {
        //添加一个sheet对应excel文件中的sheet
        XSSFSheet sheet = workbook.createSheet("订单表");
        //设置表头，即每一列的列名
        String[] titel={"订单id",
                  "商品名",
                  "商品时间",
                  "订单状态",
                  "订单金额",
                  "订单来源",
                  "订单收货人",
                  "订单收货地址",
                  "订单卡号"};
        //创建第一行
        XSSFRow row = sheet.createRow(0);
        //此处创建一个序号列
        row.createCell(0).setCellValue("序号");
        //将列名写入
        for (int i = 0; i <titel.length ; i++) {
            //给列写入数据 创建单元格 写入数据
            row.createCell(i+1).setCellValue(titel[i]);
        }
        //写入正式数据
        for (int i = 0; i <list.size() ; i++) {
            //创建行
            sheet.createRow(i+1);
            //序号
            row.createCell(0).setCellValue(i+1);
            row.createCell(1).setCellValue(list.get(i).getIndentsId().toString());
            row.createCell(2).setCellValue(list.get(i).getGoodsName().toString());
            row.createCell(3).setCellValue(list.get(i).getGoodsImg().toString());
            if (null != list.get(i).getIndentsTime()) {
                row.createCell(4).setCellValue(df.format(list.get(i).getIndentsTime()));
            }
            row.createCell(5).setCellValue(list.get(i).getIndentsStatus().toString());
            row.createCell(6).setCellValue(list.get(i).getIndentsMoney().toString());
            row.createCell(7).setCellValue(list.get(i).getIndentsSource().toString());
            row.createCell(8).setCellValue(list.get(i).getIndentsClientname().toString());
            row.createCell(9).setCellValue(list.get(i).getIndentsClientadress().toString());
            row.createCell(10).setCellValue(list.get(i).getIndentsCardid().toString());
        }
        return workbook;
    }

    @Override
    public XSSFWorkbook createEmsListExcel(List<Ems> list) {
        //添加一个sheet对应excel文件中的sheet
        XSSFSheet sheet = workbook.createSheet("快递表");
        //设置表头，即每一列的列名
        String[] titel={"订单id",
                "快递公司",
                "快递单号",
                "备注",
                "快递时间"};
        //创建第一行
        XSSFRow row = sheet.createRow(0);
        //此处创建一个序号列
        row.createCell(0).setCellValue("序号");
        //将列名写入
        for (int i = 0; i <titel.length ; i++) {
            //给列写入数据 创建单元格 写入数据
            row.createCell(i+1).setCellValue(titel[i]);
        }
        //写入正式数据
        for (int i = 0; i <list.size() ; i++) {
            //创建行
            sheet.createRow(i+1);
            //序号
            row.createCell(0).setCellValue(i+1);
            row.createCell(1).setCellValue(list.get(i).getIndentsId().toString());
            row.createCell(2).setCellValue(list.get(i).getEmsCompany().toString());
            row.createCell(3).setCellValue(list.get(i).getEmsId().toString());
            row.createCell(4).setCellValue(list.get(i).getEmsEx().toString());
            if (null != list.get(i).getEmsTime()) {
                row.createCell(5).setCellValue(df.format(list.get(i).getEmsTime()));
            }
        }
        return workbook;
    }

    @Override
    public XSSFWorkbook createSettlementListExcel(List<Settlement> list) {
        //添加一个sheet对应excel文件中的sheet
        XSSFSheet sheet = workbook.createSheet("结算表");
        //设置表头，即每一列的列名
        String[] titel={"结算id",
                "订单id",
                "订单金额",
                "订单卡号",
                "结算时间"};
        //创建第一行
        XSSFRow row = sheet.createRow(0);
        //此处创建一个序号列
        row.createCell(0).setCellValue("序号");
        //将列名写入
        for (int i = 0; i <titel.length ; i++) {
            //给列写入数据 创建单元格 写入数据
            row.createCell(i+1).setCellValue(titel[i]);
        }
        //写入正式数据
        for (int i = 0; i <list.size() ; i++) {
            //创建行
            sheet.createRow(i+1);
            //序号
            row.createCell(0).setCellValue(i+1);
            row.createCell(1).setCellValue(list.get(i).getSettlementId().toString());
            row.createCell(2).setCellValue(list.get(i).getIndentsId().toString());
            row.createCell(3).setCellValue(list.get(i).getIndentsMoney().toString());
            row.createCell(4).setCellValue(list.get(i).getIndentsCardid().toString());
            if (null != list.get(i).getSettlementTime()) {
                row.createCell(5).setCellValue(df.format(list.get(i).getSettlementTime()));
            }
        }
        return workbook;
    }

    @Override
    public XSSFWorkbook createOutputListExcel(List<Output> list) {
        //添加一个sheet对应excel文件中的sheet
        XSSFSheet sheet = workbook.createSheet("出库表");
        //设置表头，即每一列的列名
        String[] titel={"出库id",
                "订单id",
                "出库时间"};
        //创建第一行
        XSSFRow row = sheet.createRow(0);
        //此处创建一个序号列
        row.createCell(0).setCellValue("序号");
        //将列名写入
        for (int i = 0; i <titel.length ; i++) {
            //给列写入数据 创建单元格 写入数据
            row.createCell(i+1).setCellValue(titel[i]);
        }
        //写入正式数据
        for (int i = 0; i <list.size() ; i++) {
            //创建行
            sheet.createRow(i+1);
            //序号
            row.createCell(0).setCellValue(i+1);
            row.createCell(1).setCellValue(list.get(i).getOutputId().toString());
            row.createCell(2).setCellValue(list.get(i).getIndentsId().toString());
            if (null != list.get(i).getOutputTime()) {
                row.createCell(3).setCellValue(df.format(list.get(i).getOutputTime()));
            }
        }
        return workbook;
    }
}
