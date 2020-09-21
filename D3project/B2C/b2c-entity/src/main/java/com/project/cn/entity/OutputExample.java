package com.project.cn.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutputExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutputExample() {
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

        public Criteria andOutputIdIsNull() {
            addCriterion("output_id is null");
            return (Criteria) this;
        }

        public Criteria andOutputIdIsNotNull() {
            addCriterion("output_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutputIdEqualTo(Integer value) {
            addCriterion("output_id =", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdNotEqualTo(Integer value) {
            addCriterion("output_id <>", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdGreaterThan(Integer value) {
            addCriterion("output_id >", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("output_id >=", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdLessThan(Integer value) {
            addCriterion("output_id <", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdLessThanOrEqualTo(Integer value) {
            addCriterion("output_id <=", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdIn(List<Integer> values) {
            addCriterion("output_id in", values, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdNotIn(List<Integer> values) {
            addCriterion("output_id not in", values, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdBetween(Integer value1, Integer value2) {
            addCriterion("output_id between", value1, value2, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdNotBetween(Integer value1, Integer value2) {
            addCriterion("output_id not between", value1, value2, "outputId");
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

        public Criteria andOutputTimeIsNull() {
            addCriterion("output_time is null");
            return (Criteria) this;
        }

        public Criteria andOutputTimeIsNotNull() {
            addCriterion("output_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutputTimeEqualTo(Date value) {
            addCriterion("output_time =", value, "outputTime");
            return (Criteria) this;
        }

        public Criteria andOutputTimeNotEqualTo(Date value) {
            addCriterion("output_time <>", value, "outputTime");
            return (Criteria) this;
        }

        public Criteria andOutputTimeGreaterThan(Date value) {
            addCriterion("output_time >", value, "outputTime");
            return (Criteria) this;
        }

        public Criteria andOutputTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("output_time >=", value, "outputTime");
            return (Criteria) this;
        }

        public Criteria andOutputTimeLessThan(Date value) {
            addCriterion("output_time <", value, "outputTime");
            return (Criteria) this;
        }

        public Criteria andOutputTimeLessThanOrEqualTo(Date value) {
            addCriterion("output_time <=", value, "outputTime");
            return (Criteria) this;
        }

        public Criteria andOutputTimeIn(List<Date> values) {
            addCriterion("output_time in", values, "outputTime");
            return (Criteria) this;
        }

        public Criteria andOutputTimeNotIn(List<Date> values) {
            addCriterion("output_time not in", values, "outputTime");
            return (Criteria) this;
        }

        public Criteria andOutputTimeBetween(Date value1, Date value2) {
            addCriterion("output_time between", value1, value2, "outputTime");
            return (Criteria) this;
        }

        public Criteria andOutputTimeNotBetween(Date value1, Date value2) {
            addCriterion("output_time not between", value1, value2, "outputTime");
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