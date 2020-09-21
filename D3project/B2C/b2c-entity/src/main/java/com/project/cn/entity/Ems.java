package com.project.cn.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * ems
 * @author 
 */
public class Ems implements Serializable {
    /**
     * 订单编号
     */
    private Integer indentsId;

    /**
     * 快递公司
     */
    private String emsCompany;

    /**
     * 快递单号
     */
    private Integer emsId;

    /**
     * 备注
     */
    private String emsEx;

    /**
     * 发货时间
     */
    private Date emsTime;

    private static final long serialVersionUID = 1L;

    public Integer getIndentsId() {
        return indentsId;
    }

    public void setIndentsId(Integer indentsId) {
        this.indentsId = indentsId;
    }

    public String getEmsCompany() {
        return emsCompany;
    }

    public void setEmsCompany(String emsCompany) {
        this.emsCompany = emsCompany;
    }

    public Integer getEmsId() {
        return emsId;
    }

    public void setEmsId(Integer emsId) {
        this.emsId = emsId;
    }

    public String getEmsEx() {
        return emsEx;
    }

    public void setEmsEx(String emsEx) {
        this.emsEx = emsEx;
    }

    public Date getEmsTime() {
        return emsTime;
    }

    public void setEmsTime(Date emsTime) {
        this.emsTime = emsTime;
    }
}