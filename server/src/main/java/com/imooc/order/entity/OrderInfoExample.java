package com.imooc.order.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oId is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oId is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oId =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oId <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oId >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oId >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oId <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oId <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oId in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oId not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oId between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oId not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOnameIsNull() {
            addCriterion("oName is null");
            return (Criteria) this;
        }

        public Criteria andOnameIsNotNull() {
            addCriterion("oName is not null");
            return (Criteria) this;
        }

        public Criteria andOnameEqualTo(String value) {
            addCriterion("oName =", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotEqualTo(String value) {
            addCriterion("oName <>", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThan(String value) {
            addCriterion("oName >", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThanOrEqualTo(String value) {
            addCriterion("oName >=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThan(String value) {
            addCriterion("oName <", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThanOrEqualTo(String value) {
            addCriterion("oName <=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLike(String value) {
            addCriterion("oName like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotLike(String value) {
            addCriterion("oName not like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameIn(List<String> values) {
            addCriterion("oName in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotIn(List<String> values) {
            addCriterion("oName not in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameBetween(String value1, String value2) {
            addCriterion("oName between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotBetween(String value1, String value2) {
            addCriterion("oName not between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOstateIsNull() {
            addCriterion("oState is null");
            return (Criteria) this;
        }

        public Criteria andOstateIsNotNull() {
            addCriterion("oState is not null");
            return (Criteria) this;
        }

        public Criteria andOstateEqualTo(Integer value) {
            addCriterion("oState =", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateNotEqualTo(Integer value) {
            addCriterion("oState <>", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateGreaterThan(Integer value) {
            addCriterion("oState >", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("oState >=", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateLessThan(Integer value) {
            addCriterion("oState <", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateLessThanOrEqualTo(Integer value) {
            addCriterion("oState <=", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateIn(List<Integer> values) {
            addCriterion("oState in", values, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateNotIn(List<Integer> values) {
            addCriterion("oState not in", values, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateBetween(Integer value1, Integer value2) {
            addCriterion("oState between", value1, value2, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateNotBetween(Integer value1, Integer value2) {
            addCriterion("oState not between", value1, value2, "ostate");
            return (Criteria) this;
        }

        public Criteria andOpriceIsNull() {
            addCriterion("oPrice is null");
            return (Criteria) this;
        }

        public Criteria andOpriceIsNotNull() {
            addCriterion("oPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOpriceEqualTo(Double value) {
            addCriterion("oPrice =", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceNotEqualTo(Double value) {
            addCriterion("oPrice <>", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceGreaterThan(Double value) {
            addCriterion("oPrice >", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("oPrice >=", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceLessThan(Double value) {
            addCriterion("oPrice <", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceLessThanOrEqualTo(Double value) {
            addCriterion("oPrice <=", value, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceIn(List<Double> values) {
            addCriterion("oPrice in", values, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceNotIn(List<Double> values) {
            addCriterion("oPrice not in", values, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceBetween(Double value1, Double value2) {
            addCriterion("oPrice between", value1, value2, "oprice");
            return (Criteria) this;
        }

        public Criteria andOpriceNotBetween(Double value1, Double value2) {
            addCriterion("oPrice not between", value1, value2, "oprice");
            return (Criteria) this;
        }

        public Criteria andOcountIsNull() {
            addCriterion("oCount is null");
            return (Criteria) this;
        }

        public Criteria andOcountIsNotNull() {
            addCriterion("oCount is not null");
            return (Criteria) this;
        }

        public Criteria andOcountEqualTo(Integer value) {
            addCriterion("oCount =", value, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountNotEqualTo(Integer value) {
            addCriterion("oCount <>", value, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountGreaterThan(Integer value) {
            addCriterion("oCount >", value, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("oCount >=", value, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountLessThan(Integer value) {
            addCriterion("oCount <", value, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountLessThanOrEqualTo(Integer value) {
            addCriterion("oCount <=", value, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountIn(List<Integer> values) {
            addCriterion("oCount in", values, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountNotIn(List<Integer> values) {
            addCriterion("oCount not in", values, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountBetween(Integer value1, Integer value2) {
            addCriterion("oCount between", value1, value2, "ocount");
            return (Criteria) this;
        }

        public Criteria andOcountNotBetween(Integer value1, Integer value2) {
            addCriterion("oCount not between", value1, value2, "ocount");
            return (Criteria) this;
        }

        public Criteria andOtotalIsNull() {
            addCriterion("oTotal is null");
            return (Criteria) this;
        }

        public Criteria andOtotalIsNotNull() {
            addCriterion("oTotal is not null");
            return (Criteria) this;
        }

        public Criteria andOtotalEqualTo(Double value) {
            addCriterion("oTotal =", value, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalNotEqualTo(Double value) {
            addCriterion("oTotal <>", value, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalGreaterThan(Double value) {
            addCriterion("oTotal >", value, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalGreaterThanOrEqualTo(Double value) {
            addCriterion("oTotal >=", value, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalLessThan(Double value) {
            addCriterion("oTotal <", value, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalLessThanOrEqualTo(Double value) {
            addCriterion("oTotal <=", value, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalIn(List<Double> values) {
            addCriterion("oTotal in", values, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalNotIn(List<Double> values) {
            addCriterion("oTotal not in", values, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalBetween(Double value1, Double value2) {
            addCriterion("oTotal between", value1, value2, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalNotBetween(Double value1, Double value2) {
            addCriterion("oTotal not between", value1, value2, "ototal");
            return (Criteria) this;
        }
    }

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