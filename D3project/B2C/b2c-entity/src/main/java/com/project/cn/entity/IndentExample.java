package com.project.cn.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndentExample() {
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNull() {
            addCriterion("goods_img is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNotNull() {
            addCriterion("goods_img is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgEqualTo(String value) {
            addCriterion("goods_img =", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotEqualTo(String value) {
            addCriterion("goods_img <>", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThan(String value) {
            addCriterion("goods_img >", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThanOrEqualTo(String value) {
            addCriterion("goods_img >=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThan(String value) {
            addCriterion("goods_img <", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThanOrEqualTo(String value) {
            addCriterion("goods_img <=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLike(String value) {
            addCriterion("goods_img like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotLike(String value) {
            addCriterion("goods_img not like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIn(List<String> values) {
            addCriterion("goods_img in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotIn(List<String> values) {
            addCriterion("goods_img not in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgBetween(String value1, String value2) {
            addCriterion("goods_img between", value1, value2, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotBetween(String value1, String value2) {
            addCriterion("goods_img not between", value1, value2, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andIndentsTimeIsNull() {
            addCriterion("indents_time is null");
            return (Criteria) this;
        }

        public Criteria andIndentsTimeIsNotNull() {
            addCriterion("indents_time is not null");
            return (Criteria) this;
        }

        public Criteria andIndentsTimeEqualTo(Date value) {
            addCriterion("indents_time =", value, "indentsTime");
            return (Criteria) this;
        }

        public Criteria andIndentsTimeNotEqualTo(Date value) {
            addCriterion("indents_time <>", value, "indentsTime");
            return (Criteria) this;
        }

        public Criteria andIndentsTimeGreaterThan(Date value) {
            addCriterion("indents_time >", value, "indentsTime");
            return (Criteria) this;
        }

        public Criteria andIndentsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("indents_time >=", value, "indentsTime");
            return (Criteria) this;
        }

        public Criteria andIndentsTimeLessThan(Date value) {
            addCriterion("indents_time <", value, "indentsTime");
            return (Criteria) this;
        }

        public Criteria andIndentsTimeLessThanOrEqualTo(Date value) {
            addCriterion("indents_time <=", value, "indentsTime");
            return (Criteria) this;
        }

        public Criteria andIndentsTimeIn(List<Date> values) {
            addCriterion("indents_time in", values, "indentsTime");
            return (Criteria) this;
        }

        public Criteria andIndentsTimeNotIn(List<Date> values) {
            addCriterion("indents_time not in", values, "indentsTime");
            return (Criteria) this;
        }

        public Criteria andIndentsTimeBetween(Date value1, Date value2) {
            addCriterion("indents_time between", value1, value2, "indentsTime");
            return (Criteria) this;
        }

        public Criteria andIndentsTimeNotBetween(Date value1, Date value2) {
            addCriterion("indents_time not between", value1, value2, "indentsTime");
            return (Criteria) this;
        }

        public Criteria andIndentsStatusIsNull() {
            addCriterion("indents_status is null");
            return (Criteria) this;
        }

        public Criteria andIndentsStatusIsNotNull() {
            addCriterion("indents_status is not null");
            return (Criteria) this;
        }

        public Criteria andIndentsStatusEqualTo(String value) {
            addCriterion("indents_status =", value, "indentsStatus");
            return (Criteria) this;
        }

        public Criteria andIndentsStatusNotEqualTo(String value) {
            addCriterion("indents_status <>", value, "indentsStatus");
            return (Criteria) this;
        }

        public Criteria andIndentsStatusGreaterThan(String value) {
            addCriterion("indents_status >", value, "indentsStatus");
            return (Criteria) this;
        }

        public Criteria andIndentsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("indents_status >=", value, "indentsStatus");
            return (Criteria) this;
        }

        public Criteria andIndentsStatusLessThan(String value) {
            addCriterion("indents_status <", value, "indentsStatus");
            return (Criteria) this;
        }

        public Criteria andIndentsStatusLessThanOrEqualTo(String value) {
            addCriterion("indents_status <=", value, "indentsStatus");
            return (Criteria) this;
        }

        public Criteria andIndentsStatusLike(String value) {
            addCriterion("indents_status like", value, "indentsStatus");
            return (Criteria) this;
        }

        public Criteria andIndentsStatusNotLike(String value) {
            addCriterion("indents_status not like", value, "indentsStatus");
            return (Criteria) this;
        }

        public Criteria andIndentsStatusIn(List<String> values) {
            addCriterion("indents_status in", values, "indentsStatus");
            return (Criteria) this;
        }

        public Criteria andIndentsStatusNotIn(List<String> values) {
            addCriterion("indents_status not in", values, "indentsStatus");
            return (Criteria) this;
        }

        public Criteria andIndentsStatusBetween(String value1, String value2) {
            addCriterion("indents_status between", value1, value2, "indentsStatus");
            return (Criteria) this;
        }

        public Criteria andIndentsStatusNotBetween(String value1, String value2) {
            addCriterion("indents_status not between", value1, value2, "indentsStatus");
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

        public Criteria andIndentsSourceIsNull() {
            addCriterion("indents_source is null");
            return (Criteria) this;
        }

        public Criteria andIndentsSourceIsNotNull() {
            addCriterion("indents_source is not null");
            return (Criteria) this;
        }

        public Criteria andIndentsSourceEqualTo(String value) {
            addCriterion("indents_source =", value, "indentsSource");
            return (Criteria) this;
        }

        public Criteria andIndentsSourceNotEqualTo(String value) {
            addCriterion("indents_source <>", value, "indentsSource");
            return (Criteria) this;
        }

        public Criteria andIndentsSourceGreaterThan(String value) {
            addCriterion("indents_source >", value, "indentsSource");
            return (Criteria) this;
        }

        public Criteria andIndentsSourceGreaterThanOrEqualTo(String value) {
            addCriterion("indents_source >=", value, "indentsSource");
            return (Criteria) this;
        }

        public Criteria andIndentsSourceLessThan(String value) {
            addCriterion("indents_source <", value, "indentsSource");
            return (Criteria) this;
        }

        public Criteria andIndentsSourceLessThanOrEqualTo(String value) {
            addCriterion("indents_source <=", value, "indentsSource");
            return (Criteria) this;
        }

        public Criteria andIndentsSourceLike(String value) {
            addCriterion("indents_source like", value, "indentsSource");
            return (Criteria) this;
        }

        public Criteria andIndentsSourceNotLike(String value) {
            addCriterion("indents_source not like", value, "indentsSource");
            return (Criteria) this;
        }

        public Criteria andIndentsSourceIn(List<String> values) {
            addCriterion("indents_source in", values, "indentsSource");
            return (Criteria) this;
        }

        public Criteria andIndentsSourceNotIn(List<String> values) {
            addCriterion("indents_source not in", values, "indentsSource");
            return (Criteria) this;
        }

        public Criteria andIndentsSourceBetween(String value1, String value2) {
            addCriterion("indents_source between", value1, value2, "indentsSource");
            return (Criteria) this;
        }

        public Criteria andIndentsSourceNotBetween(String value1, String value2) {
            addCriterion("indents_source not between", value1, value2, "indentsSource");
            return (Criteria) this;
        }

        public Criteria andIndentsClientnameIsNull() {
            addCriterion("indents_clientname is null");
            return (Criteria) this;
        }

        public Criteria andIndentsClientnameIsNotNull() {
            addCriterion("indents_clientname is not null");
            return (Criteria) this;
        }

        public Criteria andIndentsClientnameEqualTo(String value) {
            addCriterion("indents_clientname =", value, "indentsClientname");
            return (Criteria) this;
        }

        public Criteria andIndentsClientnameNotEqualTo(String value) {
            addCriterion("indents_clientname <>", value, "indentsClientname");
            return (Criteria) this;
        }

        public Criteria andIndentsClientnameGreaterThan(String value) {
            addCriterion("indents_clientname >", value, "indentsClientname");
            return (Criteria) this;
        }

        public Criteria andIndentsClientnameGreaterThanOrEqualTo(String value) {
            addCriterion("indents_clientname >=", value, "indentsClientname");
            return (Criteria) this;
        }

        public Criteria andIndentsClientnameLessThan(String value) {
            addCriterion("indents_clientname <", value, "indentsClientname");
            return (Criteria) this;
        }

        public Criteria andIndentsClientnameLessThanOrEqualTo(String value) {
            addCriterion("indents_clientname <=", value, "indentsClientname");
            return (Criteria) this;
        }

        public Criteria andIndentsClientnameLike(String value) {
            addCriterion("indents_clientname like", value, "indentsClientname");
            return (Criteria) this;
        }

        public Criteria andIndentsClientnameNotLike(String value) {
            addCriterion("indents_clientname not like", value, "indentsClientname");
            return (Criteria) this;
        }

        public Criteria andIndentsClientnameIn(List<String> values) {
            addCriterion("indents_clientname in", values, "indentsClientname");
            return (Criteria) this;
        }

        public Criteria andIndentsClientnameNotIn(List<String> values) {
            addCriterion("indents_clientname not in", values, "indentsClientname");
            return (Criteria) this;
        }

        public Criteria andIndentsClientnameBetween(String value1, String value2) {
            addCriterion("indents_clientname between", value1, value2, "indentsClientname");
            return (Criteria) this;
        }

        public Criteria andIndentsClientnameNotBetween(String value1, String value2) {
            addCriterion("indents_clientname not between", value1, value2, "indentsClientname");
            return (Criteria) this;
        }

        public Criteria andIndentsClientadressIsNull() {
            addCriterion("indents_clientadress is null");
            return (Criteria) this;
        }

        public Criteria andIndentsClientadressIsNotNull() {
            addCriterion("indents_clientadress is not null");
            return (Criteria) this;
        }

        public Criteria andIndentsClientadressEqualTo(String value) {
            addCriterion("indents_clientadress =", value, "indentsClientadress");
            return (Criteria) this;
        }

        public Criteria andIndentsClientadressNotEqualTo(String value) {
            addCriterion("indents_clientadress <>", value, "indentsClientadress");
            return (Criteria) this;
        }

        public Criteria andIndentsClientadressGreaterThan(String value) {
            addCriterion("indents_clientadress >", value, "indentsClientadress");
            return (Criteria) this;
        }

        public Criteria andIndentsClientadressGreaterThanOrEqualTo(String value) {
            addCriterion("indents_clientadress >=", value, "indentsClientadress");
            return (Criteria) this;
        }

        public Criteria andIndentsClientadressLessThan(String value) {
            addCriterion("indents_clientadress <", value, "indentsClientadress");
            return (Criteria) this;
        }

        public Criteria andIndentsClientadressLessThanOrEqualTo(String value) {
            addCriterion("indents_clientadress <=", value, "indentsClientadress");
            return (Criteria) this;
        }

        public Criteria andIndentsClientadressLike(String value) {
            addCriterion("indents_clientadress like", value, "indentsClientadress");
            return (Criteria) this;
        }

        public Criteria andIndentsClientadressNotLike(String value) {
            addCriterion("indents_clientadress not like", value, "indentsClientadress");
            return (Criteria) this;
        }

        public Criteria andIndentsClientadressIn(List<String> values) {
            addCriterion("indents_clientadress in", values, "indentsClientadress");
            return (Criteria) this;
        }

        public Criteria andIndentsClientadressNotIn(List<String> values) {
            addCriterion("indents_clientadress not in", values, "indentsClientadress");
            return (Criteria) this;
        }

        public Criteria andIndentsClientadressBetween(String value1, String value2) {
            addCriterion("indents_clientadress between", value1, value2, "indentsClientadress");
            return (Criteria) this;
        }

        public Criteria andIndentsClientadressNotBetween(String value1, String value2) {
            addCriterion("indents_clientadress not between", value1, value2, "indentsClientadress");
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

        public Criteria andIndentsCardidEqualTo(String value) {
            addCriterion("indents_cardId =", value, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidNotEqualTo(String value) {
            addCriterion("indents_cardId <>", value, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidGreaterThan(String value) {
            addCriterion("indents_cardId >", value, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidGreaterThanOrEqualTo(String value) {
            addCriterion("indents_cardId >=", value, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidLessThan(String value) {
            addCriterion("indents_cardId <", value, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidLessThanOrEqualTo(String value) {
            addCriterion("indents_cardId <=", value, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidLike(String value) {
            addCriterion("indents_cardId like", value, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidNotLike(String value) {
            addCriterion("indents_cardId not like", value, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidIn(List<String> values) {
            addCriterion("indents_cardId in", values, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidNotIn(List<String> values) {
            addCriterion("indents_cardId not in", values, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidBetween(String value1, String value2) {
            addCriterion("indents_cardId between", value1, value2, "indentsCardid");
            return (Criteria) this;
        }

        public Criteria andIndentsCardidNotBetween(String value1, String value2) {
            addCriterion("indents_cardId not between", value1, value2, "indentsCardid");
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