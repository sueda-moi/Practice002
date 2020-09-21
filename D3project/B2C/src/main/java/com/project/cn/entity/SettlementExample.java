package com.project.cn.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SettlementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SettlementExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSettlementIdIsNull() {
            addCriterion("settlement_id is null");
            return (Criteria) this;
        }

        public Criteria andSettlementIdIsNotNull() {
            addCriterion("settlement_id is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementIdEqualTo(Integer value) {
            addCriterion("settlement_id =", value, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdNotEqualTo(Integer value) {
            addCriterion("settlement_id <>", value, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdGreaterThan(Integer value) {
            addCriterion("settlement_id >", value, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("settlement_id >=", value, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdLessThan(Integer value) {
            addCriterion("settlement_id <", value, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdLessThanOrEqualTo(Integer value) {
            addCriterion("settlement_id <=", value, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdIn(List<Integer> values) {
            addCriterion("settlement_id in", values, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdNotIn(List<Integer> values) {
            addCriterion("settlement_id not in", values, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdBetween(Integer value1, Integer value2) {
            addCriterion("settlement_id between", value1, value2, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("settlement_id not between", value1, value2, "settlementId");
            return (Criteria) this;
        }

        public Criteria andIndentsIdIsNull() {
            addCriterion("indents_id is null");
            return (Criteria) this;
        }

        public Criteria andIndentsIdIsNotNull() {
            addCriterion("indents_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndentsIdEqualTo(Integer value) {
            addCriterion("indents_id =", value, "indentsId");
            return (Criteria) this;
        }

        public Criteria andIndentsIdNotEqualTo(Integer value) {
            addCriterion("indents_id <>", value, "indentsId");
            return (Criteria) this;
        }

        public Criteria andIndentsIdGreaterThan(Integer value) {
            addCriterion("indents_id >", value, "indentsId");
            return (Criteria) this;
        }

        public Criteria andIndentsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("indents_id >=", value, "indentsId");
            return (Criteria) this;
        }

        public Criteria andIndentsIdLessThan(Integer value) {
            addCriterion("indents_id <", value, "indentsId");
            return (Criteria) this;
        }

        public Criteria andIndentsIdLessThanOrEqualTo(Integer value) {
            addCriterion("indents_id <=", value, "indentsId");
            return (Criteria) this;
        }

        public Criteria andIndentsIdIn(List<Integer> values) {
            addCriterion("indents_id in", values, "indentsId");
            return (Criteria) this;
        }

        public Criteria andIndentsIdNotIn(List<Integer> values) {
            addCriterion("indents_id not in", values, "indentsId");
            return (Criteria) this;
        }

        public Criteria andIndentsIdBetween(Integer value1, Integer value2) {
            addCriterion("indents_id between", value1, value2, "indentsId");
            return (Criteria) this;
        }

        public Criteria andIndentsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("indents_id not between", value1, value2, "indentsId");
            return (Criteria) this;
        }

        public Criteria andIndentsMoneyIsNull() {
            addCriterion("indents_money is null");
            return (Criteria) this;
        }

        public Criteria andIndentsMoneyIsNotNull() {
            addCriterion("indents_money is not null");
            return (Criteria) this;
        }

        public Criteria andIndentsMoneyEqualTo(BigDecimal value) {
            addCriterion("indents_money =", value, "indentsMoney");
            return (Criteria) this;
        }

        public Criteria andIndentsMoneyNotEqualTo(BigDecimal value) {
            addCriterion("indents_money <>", value, "indentsMoney");
            return (Criteria) this;
        }

        public Criteria andIndentsMoneyGreaterThan(BigDecimal value) {
            addCriterion("indents_money >", value, "indentsMoney");
            return (Criteria) this;
        }

        public Criteria andIndentsMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("indents_money >=", value, "indentsMoney");
            return (Criteria) this;
        }

        public Criteria andIndentsMoneyLessThan(BigDecimal value) {
            addCriterion("indents_money <", value, "indentsMoney");
            return (Criteria) this;
        }

        public Criteria andIndentsMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("indents_money <=", value, "indentsMoney");
            return (Criteria) this;
        }

        public Criteria andIndentsMoneyIn(List<BigDecimal> values) {
            addCriterion("indents_money in", values, "indentsMoney");
            return (Criteria) this;
        }

        public Criteria andIndentsMoneyNotIn(List<BigDecimal> values) {
            addCriterion("indents_money not in", values, "indentsMoney");
            return (Criteria) this;
        }

        public Criteria andIndentsMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("indents_money between", value1, value2, "indentsMoney");
            return (Criteria) this;
        }

        public Criteria andIndentsMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("indents_money not between", value1, value2, "indentsMoney");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidIsNull() {
            addCriterion("indents_cardId is null");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidIsNotNull() {
            addCriterion("indents_cardId is not null");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidEqualTo(Integer value) {
            addCriterion("indents_cardId =", value, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidNotEqualTo(Integer value) {
            addCriterion("indents_cardId <>", value, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidGreaterThan(Integer value) {
            addCriterion("indents_cardId >", value, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidGreaterThanOrEqualTo(Integer value) {
            addCriterion("indents_cardId >=", value, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidLessThan(Integer value) {
            addCriterion("indents_cardId <", value, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidLessThanOrEqualTo(Integer value) {
            addCriterion("indents_cardId <=", value, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidIn(List<Integer> values) {
            addCriterion("indents_cardId in", values, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidNotIn(List<Integer> values) {
            addCriterion("indents_cardId not in", values, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidBetween(Integer value1, Integer value2) {
            addCriterion("indents_cardId between", value1, value2, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidNotBetween(Integer value1, Integer value2) {
            addCriterion("indents_cardId not between", value1, value2, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIsNull() {
            addCriterion("settlement_time is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIsNotNull() {
            addCriterion("settlement_time is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeEqualTo(Date value) {
            addCriterion("settlement_time =", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotEqualTo(Date value) {
            addCriterion("settlement_time <>", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeGreaterThan(Date value) {
            addCriterion("settlement_time >", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("settlement_time >=", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeLessThan(Date value) {
            addCriterion("settlement_time <", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeLessThanOrEqualTo(Date value) {
            addCriterion("settlement_time <=", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIn(List<Date> values) {
            addCriterion("settlement_time in", values, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotIn(List<Date> values) {
            addCriterion("settlement_time not in", values, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeBetween(Date value1, Date value2) {
            addCriterion("settlement_time between", value1, value2, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotBetween(Date value1, Date value2) {
            addCriterion("settlement_time not between", value1, value2, "settlementTime");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}