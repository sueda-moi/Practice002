package com.project.cn.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectionExample() {
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

        public Criteria andCollectionIdIsNull() {
            addCriterion("collection_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIsNotNull() {
            addCriterion("collection_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdEqualTo(Integer value) {
            addCriterion("collection_id =", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotEqualTo(Integer value) {
            addCriterion("collection_id <>", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThan(Integer value) {
            addCriterion("collection_id >", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_id >=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThan(Integer value) {
            addCriterion("collection_id <", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("collection_id <=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIn(List<Integer> values) {
            addCriterion("collection_id in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotIn(List<Integer> values) {
            addCriterion("collection_id not in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdBetween(Integer value1, Integer value2) {
            addCriterion("collection_id between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_id not between", value1, value2, "collectionId");
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

        public Criteria andCollectionWayIsNull() {
            addCriterion("collection_way is null");
            return (Criteria) this;
        }

        public Criteria andCollectionWayIsNotNull() {
            addCriterion("collection_way is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionWayEqualTo(String value) {
            addCriterion("collection_way =", value, "collectionWay");
            return (Criteria) this;
        }

        public Criteria andCollectionWayNotEqualTo(String value) {
            addCriterion("collection_way <>", value, "collectionWay");
            return (Criteria) this;
        }

        public Criteria andCollectionWayGreaterThan(String value) {
            addCriterion("collection_way >", value, "collectionWay");
            return (Criteria) this;
        }

        public Criteria andCollectionWayGreaterThanOrEqualTo(String value) {
            addCriterion("collection_way >=", value, "collectionWay");
            return (Criteria) this;
        }

        public Criteria andCollectionWayLessThan(String value) {
            addCriterion("collection_way <", value, "collectionWay");
            return (Criteria) this;
        }

        public Criteria andCollectionWayLessThanOrEqualTo(String value) {
            addCriterion("collection_way <=", value, "collectionWay");
            return (Criteria) this;
        }

        public Criteria andCollectionWayLike(String value) {
            addCriterion("collection_way like", value, "collectionWay");
            return (Criteria) this;
        }

        public Criteria andCollectionWayNotLike(String value) {
            addCriterion("collection_way not like", value, "collectionWay");
            return (Criteria) this;
        }

        public Criteria andCollectionWayIn(List<String> values) {
            addCriterion("collection_way in", values, "collectionWay");
            return (Criteria) this;
        }

        public Criteria andCollectionWayNotIn(List<String> values) {
            addCriterion("collection_way not in", values, "collectionWay");
            return (Criteria) this;
        }

        public Criteria andCollectionWayBetween(String value1, String value2) {
            addCriterion("collection_way between", value1, value2, "collectionWay");
            return (Criteria) this;
        }

        public Criteria andCollectionWayNotBetween(String value1, String value2) {
            addCriterion("collection_way not between", value1, value2, "collectionWay");
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

        public Criteria andCollectionTimeIsNull() {
            addCriterion("collection_time is null");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeIsNotNull() {
            addCriterion("collection_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeEqualTo(Date value) {
            addCriterion("collection_time =", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeNotEqualTo(Date value) {
            addCriterion("collection_time <>", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeGreaterThan(Date value) {
            addCriterion("collection_time >", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collection_time >=", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeLessThan(Date value) {
            addCriterion("collection_time <", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeLessThanOrEqualTo(Date value) {
            addCriterion("collection_time <=", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeIn(List<Date> values) {
            addCriterion("collection_time in", values, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeNotIn(List<Date> values) {
            addCriterion("collection_time not in", values, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeBetween(Date value1, Date value2) {
            addCriterion("collection_time between", value1, value2, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeNotBetween(Date value1, Date value2) {
            addCriterion("collection_time not between", value1, value2, "collectionTime");
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