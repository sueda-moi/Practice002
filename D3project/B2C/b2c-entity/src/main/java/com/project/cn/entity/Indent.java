package com.project.cn.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * indent
 * @author 
 */
public class Indent implements Serializable {
    /**
     * 订单编号
     */
    private Integer indentsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品图片
     */
    private String goodsImg;

    /**
     * 订单生成时间
     */
    private Date indentsTime;

    /**
     * 订单收款状况发货状况
     */
    private String indentsStatus;

    /**
     * 订单价格
     */
    private BigDecimal indentsMoney;

    /**
     * 订单来自哪个渠道
     */
    private String indentsSource;

    /**
     * 买家姓名
     */
    private String indentsClientname;

    /**
     * 收货地址
     */
    private String indentsClientadress;

    /**
     * 支付卡号
     */
    private String indentsCardid;

    private static final long serialVersionUID = 1L;

    public Integer getIndentsId() {
        return indentsId;
    }

    public void setIndentsId(Integer indentsId) {
        this.indentsId = indentsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public Date getIndentsTime() {
        return indentsTime;
    }

    public void setIndentsTime(Date indentsTime) {
        this.indentsTime = indentsTime;
    }

    public String getIndentsStatus() {
        return indentsStatus;
    }

    public void setIndentsStatus(String indentsStatus) {
        this.indentsStatus = indentsStatus;
    }

    public BigDecimal getIndentsMoney() {
        return indentsMoney;
    }

    public void setIndentsMoney(BigDecimal indentsMoney) {
        this.indentsMoney = indentsMoney;
    }

    public String getIndentsSource() {
        return indentsSource;
    }

    public void setIndentsSource(String indentsSource) {
        this.indentsSource = indentsSource;
    }

    public String getIndentsClientname() {
        return indentsClientname;
    }

    public void setIndentsClientname(String indentsClientname) {
        this.indentsClientname = indentsClientname;
    }

    public String getIndentsClientadress() {
        return indentsClientadress;
    }

    public void setIndentsClientadress(String indentsClientadress) {
        this.indentsClientadress = indentsClientadress;
    }

    public String getIndentsCardid() {
        return indentsCardid;
    }

    public void setIndentsCardid(String indentsCardid) {
        this.indentsCardid = indentsCardid;
    }
}