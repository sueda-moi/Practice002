package com.project.cn.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * output
 * @author 
 */
public class Output implements Serializable {
    /**
     * 出库单id
     */
    private Integer outputId;

    /**
     * 订单id
     */
    private Integer indentsId;

    /**
     * 出库时间
     */
    private Date outputTime;



    private static final long serialVersionUID = 1L;

    public Integer getOutputId() {
        return outputId;
    }

    public void setOutputId(Integer outputId) {
        this.outputId = outputId;
    }

    public Integer getIndentsId() {
        return indentsId;
    }

    public void setIndentsId(Integer indentsId) {
        this.indentsId = indentsId;
    }

    public Date getOutputTime() {
        return outputTime;
    }

    public void setOutputTime(Date outputTime) {
        this.outputTime = outputTime;
    }


}