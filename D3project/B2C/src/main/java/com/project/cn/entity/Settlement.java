package com.project.cn.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * settlement
 * @author 
 */
public class Settlement implements Serializable {
    /**
     * 结算单id
     */
    private Integer settlementId;

    private Integer indentsId;

    private BigDecimal indentsMoney;

    private Integer indentsCardid;

    private Date settlementTime;

    private static final long serialVersionUID = 1L;

    public Integer getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(Integer settlementId) {
        this.settlementId = settlementId;
    }

    public Integer getIndentsId() {
        return indentsId;
    }

    public void setIndentsId(Integer indentsId) {
        this.indentsId = indentsId;
    }

    public BigDecimal getIndentsMoney() {
        return indentsMoney;
    }

    public void setIndentsMoney(BigDecimal indentsMoney) {
        this.indentsMoney = indentsMoney;
    }

    public Integer getIndentsCardid() {
        return indentsCardid;
    }

    public void setIndentsCardid(Integer indentsCardid) {
        this.indentsCardid = indentsCardid;
    }

    public Date getSettlementTime() {
        return settlementTime;
    }

    public void setSettlementTime(Date settlementTime) {
        this.settlementTime = settlementTime;
    }
}