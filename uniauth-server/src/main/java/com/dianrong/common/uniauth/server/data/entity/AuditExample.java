package com.dianrong.common.uniauth.server.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuditExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table audit
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table audit
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table audit
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    public AuditExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table audit
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andObjIdIsNull() {
            addCriterion("obj_id is null");
            return (Criteria) this;
        }

        public Criteria andObjIdIsNotNull() {
            addCriterion("obj_id is not null");
            return (Criteria) this;
        }

        public Criteria andObjIdEqualTo(Long value) {
            addCriterion("obj_id =", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotEqualTo(Long value) {
            addCriterion("obj_id <>", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdGreaterThan(Long value) {
            addCriterion("obj_id >", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdGreaterThanOrEqualTo(Long value) {
            addCriterion("obj_id >=", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdLessThan(Long value) {
            addCriterion("obj_id <", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdLessThanOrEqualTo(Long value) {
            addCriterion("obj_id <=", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdIn(List<Long> values) {
            addCriterion("obj_id in", values, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotIn(List<Long> values) {
            addCriterion("obj_id not in", values, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdBetween(Long value1, Long value2) {
            addCriterion("obj_id between", value1, value2, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotBetween(Long value1, Long value2) {
            addCriterion("obj_id not between", value1, value2, "objId");
            return (Criteria) this;
        }

        public Criteria andObjNameIsNull() {
            addCriterion("obj_name is null");
            return (Criteria) this;
        }

        public Criteria andObjNameIsNotNull() {
            addCriterion("obj_name is not null");
            return (Criteria) this;
        }

        public Criteria andObjNameEqualTo(String value) {
            addCriterion("obj_name =", value, "objName");
            return (Criteria) this;
        }

        public Criteria andObjNameNotEqualTo(String value) {
            addCriterion("obj_name <>", value, "objName");
            return (Criteria) this;
        }

        public Criteria andObjNameGreaterThan(String value) {
            addCriterion("obj_name >", value, "objName");
            return (Criteria) this;
        }

        public Criteria andObjNameGreaterThanOrEqualTo(String value) {
            addCriterion("obj_name >=", value, "objName");
            return (Criteria) this;
        }

        public Criteria andObjNameLessThan(String value) {
            addCriterion("obj_name <", value, "objName");
            return (Criteria) this;
        }

        public Criteria andObjNameLessThanOrEqualTo(String value) {
            addCriterion("obj_name <=", value, "objName");
            return (Criteria) this;
        }

        public Criteria andObjNameLike(String value) {
            addCriterion("obj_name like", value, "objName");
            return (Criteria) this;
        }

        public Criteria andObjNameNotLike(String value) {
            addCriterion("obj_name not like", value, "objName");
            return (Criteria) this;
        }

        public Criteria andObjNameIn(List<String> values) {
            addCriterion("obj_name in", values, "objName");
            return (Criteria) this;
        }

        public Criteria andObjNameNotIn(List<String> values) {
            addCriterion("obj_name not in", values, "objName");
            return (Criteria) this;
        }

        public Criteria andObjNameBetween(String value1, String value2) {
            addCriterion("obj_name between", value1, value2, "objName");
            return (Criteria) this;
        }

        public Criteria andObjNameNotBetween(String value1, String value2) {
            addCriterion("obj_name not between", value1, value2, "objName");
            return (Criteria) this;
        }

        public Criteria andActionDateIsNull() {
            addCriterion("action_date is null");
            return (Criteria) this;
        }

        public Criteria andActionDateIsNotNull() {
            addCriterion("action_date is not null");
            return (Criteria) this;
        }

        public Criteria andActionDateEqualTo(Date value) {
            addCriterion("action_date =", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateNotEqualTo(Date value) {
            addCriterion("action_date <>", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateGreaterThan(Date value) {
            addCriterion("action_date >", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("action_date >=", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateLessThan(Date value) {
            addCriterion("action_date <", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateLessThanOrEqualTo(Date value) {
            addCriterion("action_date <=", value, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateIn(List<Date> values) {
            addCriterion("action_date in", values, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateNotIn(List<Date> values) {
            addCriterion("action_date not in", values, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateBetween(Date value1, Date value2) {
            addCriterion("action_date between", value1, value2, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionDateNotBetween(Date value1, Date value2) {
            addCriterion("action_date not between", value1, value2, "actionDate");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("action is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("action is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(Byte value) {
            addCriterion("action =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(Byte value) {
            addCriterion("action <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(Byte value) {
            addCriterion("action >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(Byte value) {
            addCriterion("action >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(Byte value) {
            addCriterion("action <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(Byte value) {
            addCriterion("action <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<Byte> values) {
            addCriterion("action in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<Byte> values) {
            addCriterion("action not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(Byte value1, Byte value2) {
            addCriterion("action between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(Byte value1, Byte value2) {
            addCriterion("action not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andBeforeActionIsNull() {
            addCriterion("before_action is null");
            return (Criteria) this;
        }

        public Criteria andBeforeActionIsNotNull() {
            addCriterion("before_action is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeActionEqualTo(String value) {
            addCriterion("before_action =", value, "beforeAction");
            return (Criteria) this;
        }

        public Criteria andBeforeActionNotEqualTo(String value) {
            addCriterion("before_action <>", value, "beforeAction");
            return (Criteria) this;
        }

        public Criteria andBeforeActionGreaterThan(String value) {
            addCriterion("before_action >", value, "beforeAction");
            return (Criteria) this;
        }

        public Criteria andBeforeActionGreaterThanOrEqualTo(String value) {
            addCriterion("before_action >=", value, "beforeAction");
            return (Criteria) this;
        }

        public Criteria andBeforeActionLessThan(String value) {
            addCriterion("before_action <", value, "beforeAction");
            return (Criteria) this;
        }

        public Criteria andBeforeActionLessThanOrEqualTo(String value) {
            addCriterion("before_action <=", value, "beforeAction");
            return (Criteria) this;
        }

        public Criteria andBeforeActionLike(String value) {
            addCriterion("before_action like", value, "beforeAction");
            return (Criteria) this;
        }

        public Criteria andBeforeActionNotLike(String value) {
            addCriterion("before_action not like", value, "beforeAction");
            return (Criteria) this;
        }

        public Criteria andBeforeActionIn(List<String> values) {
            addCriterion("before_action in", values, "beforeAction");
            return (Criteria) this;
        }

        public Criteria andBeforeActionNotIn(List<String> values) {
            addCriterion("before_action not in", values, "beforeAction");
            return (Criteria) this;
        }

        public Criteria andBeforeActionBetween(String value1, String value2) {
            addCriterion("before_action between", value1, value2, "beforeAction");
            return (Criteria) this;
        }

        public Criteria andBeforeActionNotBetween(String value1, String value2) {
            addCriterion("before_action not between", value1, value2, "beforeAction");
            return (Criteria) this;
        }

        public Criteria andAfterActionIsNull() {
            addCriterion("after_action is null");
            return (Criteria) this;
        }

        public Criteria andAfterActionIsNotNull() {
            addCriterion("after_action is not null");
            return (Criteria) this;
        }

        public Criteria andAfterActionEqualTo(String value) {
            addCriterion("after_action =", value, "afterAction");
            return (Criteria) this;
        }

        public Criteria andAfterActionNotEqualTo(String value) {
            addCriterion("after_action <>", value, "afterAction");
            return (Criteria) this;
        }

        public Criteria andAfterActionGreaterThan(String value) {
            addCriterion("after_action >", value, "afterAction");
            return (Criteria) this;
        }

        public Criteria andAfterActionGreaterThanOrEqualTo(String value) {
            addCriterion("after_action >=", value, "afterAction");
            return (Criteria) this;
        }

        public Criteria andAfterActionLessThan(String value) {
            addCriterion("after_action <", value, "afterAction");
            return (Criteria) this;
        }

        public Criteria andAfterActionLessThanOrEqualTo(String value) {
            addCriterion("after_action <=", value, "afterAction");
            return (Criteria) this;
        }

        public Criteria andAfterActionLike(String value) {
            addCriterion("after_action like", value, "afterAction");
            return (Criteria) this;
        }

        public Criteria andAfterActionNotLike(String value) {
            addCriterion("after_action not like", value, "afterAction");
            return (Criteria) this;
        }

        public Criteria andAfterActionIn(List<String> values) {
            addCriterion("after_action in", values, "afterAction");
            return (Criteria) this;
        }

        public Criteria andAfterActionNotIn(List<String> values) {
            addCriterion("after_action not in", values, "afterAction");
            return (Criteria) this;
        }

        public Criteria andAfterActionBetween(String value1, String value2) {
            addCriterion("after_action between", value1, value2, "afterAction");
            return (Criteria) this;
        }

        public Criteria andAfterActionNotBetween(String value1, String value2) {
            addCriterion("after_action not between", value1, value2, "afterAction");
            return (Criteria) this;
        }

        public Criteria andClientIpIsNull() {
            addCriterion("client_ip is null");
            return (Criteria) this;
        }

        public Criteria andClientIpIsNotNull() {
            addCriterion("client_ip is not null");
            return (Criteria) this;
        }

        public Criteria andClientIpEqualTo(String value) {
            addCriterion("client_ip =", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotEqualTo(String value) {
            addCriterion("client_ip <>", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpGreaterThan(String value) {
            addCriterion("client_ip >", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpGreaterThanOrEqualTo(String value) {
            addCriterion("client_ip >=", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLessThan(String value) {
            addCriterion("client_ip <", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLessThanOrEqualTo(String value) {
            addCriterion("client_ip <=", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLike(String value) {
            addCriterion("client_ip like", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotLike(String value) {
            addCriterion("client_ip not like", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpIn(List<String> values) {
            addCriterion("client_ip in", values, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotIn(List<String> values) {
            addCriterion("client_ip not in", values, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpBetween(String value1, String value2) {
            addCriterion("client_ip between", value1, value2, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotBetween(String value1, String value2) {
            addCriterion("client_ip not between", value1, value2, "clientIp");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table audit
     *
     * @mbggenerated do_not_delete_during_merge Tue Jan 26 11:13:56 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table audit
     *
     * @mbggenerated Tue Jan 26 11:13:56 CST 2016
     */
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