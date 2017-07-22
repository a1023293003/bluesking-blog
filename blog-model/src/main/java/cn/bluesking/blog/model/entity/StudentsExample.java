package cn.bluesking.blog.model.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentsExample {

	/**
	 * 排序从句
	 */
	protected String orderByClause;

	/**
	 * 是否使用distinct查询（去重查询）
	 */
	protected boolean distinct;

	/**
	 * example中包含多个criteria，
	 * criteria包含多个Criterion条件，条件中的内容是以and的形式加到where上的，
	 * criteria与criteria之间是以or的形式添加到where中的。
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * 构造方法，初始化criteria条件列表。
	 */
	public StudentsExample() {
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

	/**
	 * or形式在条件语句criteria列表中拼接一个新的criteria。
	 * @param criteria [Criteria]自定义的条件
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * or形式在条件语句criteria列表中创建一个新的criteria，并返回。
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * 创建一个条件语句criteria，
	 * 如果criteria列表中没有元素，则返回根节点。
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * 创建一个条件语句criteria（内部方法）。
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * 清空criteria列表中。
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	 /**
	 * 每个crteria中都有一个criterion列表，子条件列表，用and语句相互连接。
	 */
	public static class Criterion {

		 /**
		 * 条件关键字，例如：>=、<=等等
		 */
		private String condition;

		/**
		 * 条件语句会用到的值1
		 */
		private Object value;

		/**
		 * 条件语句会用到的值2
		 */
		private Object secondValue;

		/**
		 * 条件关键字没有值，例如：not null、 null
		 */
		private boolean noValue;

		/**
		 * 条件关键字有且只有一个值，例如：>= 1、<= 1
		 */
		private boolean singleValue;

		/**
		 * 条件关键字有且只有两个值，例如：between 1 and 2
		 */
		private boolean betweenValue;

		/**
		 * 条件关键字有且只有一个列表的值，例如：in(1、2、3、4)
		 */
		private boolean listValue;

		/**
		 * 该条件针对的字段名
		 */
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

		/**
		 * 无参数条件构造方法
		 * @param condition [String]条件关键字
		 */
		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		/**
		 * 单值参数或列表参数构造方法
		 * @param condition [String]条件关键字
		 * @param value [Object]条件语句会用到的值1
		 * @param typeHeader [String]该条件针对的字段名
		 */
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

		/**
		 * 单值参数或列表参数构造方法（不指定所属字段）
		 * @param condition [String]条件关键字
		 * @param value [Object]条件语句会用到的值1
		 */
		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		/**
		 * 双参数构造方法
		 * @param condition [String]条件关键字
		 * @param value [Object]条件语句会用到的值1
		 * @param secondValue [Object]条件语句会用到的值2
		 * @param typeHeader [String]该条件针对的字段名
		 */
		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		/**
		 * 双参数构造方法（不指定所属字段）
		 * @param condition [String]条件关键字
		 * @param value [Object]条件语句会用到的值1
		 * @param secondValue [Object]条件语句会用到的值2
		 */
		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
	 * criteria条件类，父类GeneratedCriteria是动态生成的。
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * 动态生成的Criteria父类
	 */
	protected abstract static class GeneratedCriteria {

		/**
		 * 条件列表集合
		 */
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		/**
		 * 条件列表集合中是否有值
		 * @return [boolean]true : 有、 false : 没有
		 */
		public boolean isValid() {
			return criteria.size() > 0;
		}

		/**
		 * 获取条件列表集合
		 * @return [List<Criterion>]条件列表集合
		 */
		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		/**
		 * 获取条件列表集合
		 * @return [List<Criterion>]条件列表集合
		 */
		public List<Criterion> getCriteria() {
			return criteria;
		}

		/**
		 * 无参数添加条件
 		 * @param condition [String]条件语句
		 * @exception [RuntimeException]输入条件语句不能为null
		 */
		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		/**
		 * 单参数添加条件
 		 * @param condition [String]条件语句
 		 * @param value [Object]条件语句会用到的值1
 		 * @param property [String]该条件针对的属性名
		 * @exception [RuntimeException]输入条件语句不能为null
		 */
		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		/**
		 * 双参数添加条件
 		 * @param condition [String]条件语句
 		 * @param value [Object]条件语句会用到的值1
 		 * @param value2 [Object]条件语句会用到的值2
 		 * @param property [String]该条件针对的属性名
		 * @exception [RuntimeException]输入条件语句不能为null
		 */
		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}
		
		/**
		 * SID字段为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSIDIsNull() {
			addCriterion("SID is null");
			return (Criteria) this;
		}

		/**
		 * SID字段为不为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSIDIsNotNull() {
			addCriterion("SID is not null");
			return (Criteria) this;
		}

		/**
		 * SID等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSIDEqualTo(String value) {
			addCriterion("SID =", value, "SID");
			return (Criteria) this;
		}

		/**
		 * SID不等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSIDNotEqualTo(String value) {
			addCriterion("SID <>", value, "SID");
			return (Criteria) this;
		}

		/**
		 * SID大于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSIDGreaterThan(String value) {
			addCriterion("SID >", value, "SID");
			return (Criteria) this;
		}

		/**
		 * SID大于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSIDGreaterThanOrEqualTo(String value) {
			addCriterion("SID >=", value, "SID");
			return (Criteria) this;
		}

		/**
		 * SID小于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSIDLessThan(String value) {
			addCriterion("SID <", value, "SID");
			return (Criteria) this;
		}

		/**
		 * SID小于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSIDLessThanOrEqualTo(String value) {
			addCriterion("SID <=", value, "SID");
			return (Criteria) this;
		}

		/**
		 * SID在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSIDIn(List<String> values) {
			addCriterion("SID in", values, "SID");
			return (Criteria) this;
		}

		/**
		 * SID不在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSIDNotIn(List<String> values) {
			addCriterion("SID not in", values, "SID");
			return (Criteria) this;
		}

		/**
		 * SID在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSIDBetween(String value1, String value2) {
			addCriterion("SID between", value1, value2, "SID");
			return (Criteria) this;
		}

		/**
		 * SID不在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSIDNotBetween(String value1, String value2) {
			addCriterion("SID not between", value1, value2, "SID");
			return (Criteria) this;
		}
		/**
		 * SNAME字段为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSNAMEIsNull() {
			addCriterion("SNAME is null");
			return (Criteria) this;
		}

		/**
		 * SNAME字段为不为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSNAMEIsNotNull() {
			addCriterion("SNAME is not null");
			return (Criteria) this;
		}

		/**
		 * SNAME等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSNAMEEqualTo(String value) {
			addCriterion("SNAME =", value, "SNAME");
			return (Criteria) this;
		}

		/**
		 * SNAME不等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSNAMENotEqualTo(String value) {
			addCriterion("SNAME <>", value, "SNAME");
			return (Criteria) this;
		}

		/**
		 * SNAME大于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSNAMEGreaterThan(String value) {
			addCriterion("SNAME >", value, "SNAME");
			return (Criteria) this;
		}

		/**
		 * SNAME大于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSNAMEGreaterThanOrEqualTo(String value) {
			addCriterion("SNAME >=", value, "SNAME");
			return (Criteria) this;
		}

		/**
		 * SNAME小于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSNAMELessThan(String value) {
			addCriterion("SNAME <", value, "SNAME");
			return (Criteria) this;
		}

		/**
		 * SNAME小于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSNAMELessThanOrEqualTo(String value) {
			addCriterion("SNAME <=", value, "SNAME");
			return (Criteria) this;
		}

		/**
		 * SNAME在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSNAMEIn(List<String> values) {
			addCriterion("SNAME in", values, "SNAME");
			return (Criteria) this;
		}

		/**
		 * SNAME不在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSNAMENotIn(List<String> values) {
			addCriterion("SNAME not in", values, "SNAME");
			return (Criteria) this;
		}

		/**
		 * SNAME在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSNAMEBetween(String value1, String value2) {
			addCriterion("SNAME between", value1, value2, "SNAME");
			return (Criteria) this;
		}

		/**
		 * SNAME不在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSNAMENotBetween(String value1, String value2) {
			addCriterion("SNAME not between", value1, value2, "SNAME");
			return (Criteria) this;
		}
		/**
		 * SEX字段为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSEXIsNull() {
			addCriterion("SEX is null");
			return (Criteria) this;
		}

		/**
		 * SEX字段为不为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSEXIsNotNull() {
			addCriterion("SEX is not null");
			return (Criteria) this;
		}

		/**
		 * SEX等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSEXEqualTo(String value) {
			addCriterion("SEX =", value, "SEX");
			return (Criteria) this;
		}

		/**
		 * SEX不等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSEXNotEqualTo(String value) {
			addCriterion("SEX <>", value, "SEX");
			return (Criteria) this;
		}

		/**
		 * SEX大于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSEXGreaterThan(String value) {
			addCriterion("SEX >", value, "SEX");
			return (Criteria) this;
		}

		/**
		 * SEX大于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSEXGreaterThanOrEqualTo(String value) {
			addCriterion("SEX >=", value, "SEX");
			return (Criteria) this;
		}

		/**
		 * SEX小于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSEXLessThan(String value) {
			addCriterion("SEX <", value, "SEX");
			return (Criteria) this;
		}

		/**
		 * SEX小于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSEXLessThanOrEqualTo(String value) {
			addCriterion("SEX <=", value, "SEX");
			return (Criteria) this;
		}

		/**
		 * SEX在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSEXIn(List<String> values) {
			addCriterion("SEX in", values, "SEX");
			return (Criteria) this;
		}

		/**
		 * SEX不在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSEXNotIn(List<String> values) {
			addCriterion("SEX not in", values, "SEX");
			return (Criteria) this;
		}

		/**
		 * SEX在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSEXBetween(String value1, String value2) {
			addCriterion("SEX between", value1, value2, "SEX");
			return (Criteria) this;
		}

		/**
		 * SEX不在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSEXNotBetween(String value1, String value2) {
			addCriterion("SEX not between", value1, value2, "SEX");
			return (Criteria) this;
		}
		/**
		 * CARDNUMBER字段为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCARDNUMBERIsNull() {
			addCriterion("CARDNUMBER is null");
			return (Criteria) this;
		}

		/**
		 * CARDNUMBER字段为不为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCARDNUMBERIsNotNull() {
			addCriterion("CARDNUMBER is not null");
			return (Criteria) this;
		}

		/**
		 * CARDNUMBER等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCARDNUMBEREqualTo(String value) {
			addCriterion("CARDNUMBER =", value, "CARDNUMBER");
			return (Criteria) this;
		}

		/**
		 * CARDNUMBER不等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCARDNUMBERNotEqualTo(String value) {
			addCriterion("CARDNUMBER <>", value, "CARDNUMBER");
			return (Criteria) this;
		}

		/**
		 * CARDNUMBER大于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCARDNUMBERGreaterThan(String value) {
			addCriterion("CARDNUMBER >", value, "CARDNUMBER");
			return (Criteria) this;
		}

		/**
		 * CARDNUMBER大于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCARDNUMBERGreaterThanOrEqualTo(String value) {
			addCriterion("CARDNUMBER >=", value, "CARDNUMBER");
			return (Criteria) this;
		}

		/**
		 * CARDNUMBER小于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCARDNUMBERLessThan(String value) {
			addCriterion("CARDNUMBER <", value, "CARDNUMBER");
			return (Criteria) this;
		}

		/**
		 * CARDNUMBER小于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCARDNUMBERLessThanOrEqualTo(String value) {
			addCriterion("CARDNUMBER <=", value, "CARDNUMBER");
			return (Criteria) this;
		}

		/**
		 * CARDNUMBER在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCARDNUMBERIn(List<String> values) {
			addCriterion("CARDNUMBER in", values, "CARDNUMBER");
			return (Criteria) this;
		}

		/**
		 * CARDNUMBER不在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCARDNUMBERNotIn(List<String> values) {
			addCriterion("CARDNUMBER not in", values, "CARDNUMBER");
			return (Criteria) this;
		}

		/**
		 * CARDNUMBER在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCARDNUMBERBetween(String value1, String value2) {
			addCriterion("CARDNUMBER between", value1, value2, "CARDNUMBER");
			return (Criteria) this;
		}

		/**
		 * CARDNUMBER不在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCARDNUMBERNotBetween(String value1, String value2) {
			addCriterion("CARDNUMBER not between", value1, value2, "CARDNUMBER");
			return (Criteria) this;
		}
		/**
		 * PWD字段为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPWDIsNull() {
			addCriterion("PWD is null");
			return (Criteria) this;
		}

		/**
		 * PWD字段为不为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPWDIsNotNull() {
			addCriterion("PWD is not null");
			return (Criteria) this;
		}

		/**
		 * PWD等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPWDEqualTo(String value) {
			addCriterion("PWD =", value, "PWD");
			return (Criteria) this;
		}

		/**
		 * PWD不等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPWDNotEqualTo(String value) {
			addCriterion("PWD <>", value, "PWD");
			return (Criteria) this;
		}

		/**
		 * PWD大于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPWDGreaterThan(String value) {
			addCriterion("PWD >", value, "PWD");
			return (Criteria) this;
		}

		/**
		 * PWD大于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPWDGreaterThanOrEqualTo(String value) {
			addCriterion("PWD >=", value, "PWD");
			return (Criteria) this;
		}

		/**
		 * PWD小于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPWDLessThan(String value) {
			addCriterion("PWD <", value, "PWD");
			return (Criteria) this;
		}

		/**
		 * PWD小于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPWDLessThanOrEqualTo(String value) {
			addCriterion("PWD <=", value, "PWD");
			return (Criteria) this;
		}

		/**
		 * PWD在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPWDIn(List<String> values) {
			addCriterion("PWD in", values, "PWD");
			return (Criteria) this;
		}

		/**
		 * PWD不在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPWDNotIn(List<String> values) {
			addCriterion("PWD not in", values, "PWD");
			return (Criteria) this;
		}

		/**
		 * PWD在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPWDBetween(String value1, String value2) {
			addCriterion("PWD between", value1, value2, "PWD");
			return (Criteria) this;
		}

		/**
		 * PWD不在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPWDNotBetween(String value1, String value2) {
			addCriterion("PWD not between", value1, value2, "PWD");
			return (Criteria) this;
		}
		/**
		 * DEPARTMENT字段为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andDEPARTMENTIsNull() {
			addCriterion("DEPARTMENT is null");
			return (Criteria) this;
		}

		/**
		 * DEPARTMENT字段为不为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andDEPARTMENTIsNotNull() {
			addCriterion("DEPARTMENT is not null");
			return (Criteria) this;
		}

		/**
		 * DEPARTMENT等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andDEPARTMENTEqualTo(String value) {
			addCriterion("DEPARTMENT =", value, "DEPARTMENT");
			return (Criteria) this;
		}

		/**
		 * DEPARTMENT不等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andDEPARTMENTNotEqualTo(String value) {
			addCriterion("DEPARTMENT <>", value, "DEPARTMENT");
			return (Criteria) this;
		}

		/**
		 * DEPARTMENT大于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andDEPARTMENTGreaterThan(String value) {
			addCriterion("DEPARTMENT >", value, "DEPARTMENT");
			return (Criteria) this;
		}

		/**
		 * DEPARTMENT大于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andDEPARTMENTGreaterThanOrEqualTo(String value) {
			addCriterion("DEPARTMENT >=", value, "DEPARTMENT");
			return (Criteria) this;
		}

		/**
		 * DEPARTMENT小于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andDEPARTMENTLessThan(String value) {
			addCriterion("DEPARTMENT <", value, "DEPARTMENT");
			return (Criteria) this;
		}

		/**
		 * DEPARTMENT小于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andDEPARTMENTLessThanOrEqualTo(String value) {
			addCriterion("DEPARTMENT <=", value, "DEPARTMENT");
			return (Criteria) this;
		}

		/**
		 * DEPARTMENT在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andDEPARTMENTIn(List<String> values) {
			addCriterion("DEPARTMENT in", values, "DEPARTMENT");
			return (Criteria) this;
		}

		/**
		 * DEPARTMENT不在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andDEPARTMENTNotIn(List<String> values) {
			addCriterion("DEPARTMENT not in", values, "DEPARTMENT");
			return (Criteria) this;
		}

		/**
		 * DEPARTMENT在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andDEPARTMENTBetween(String value1, String value2) {
			addCriterion("DEPARTMENT between", value1, value2, "DEPARTMENT");
			return (Criteria) this;
		}

		/**
		 * DEPARTMENT不在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andDEPARTMENTNotBetween(String value1, String value2) {
			addCriterion("DEPARTMENT not between", value1, value2, "DEPARTMENT");
			return (Criteria) this;
		}
		/**
		 * PHONE字段为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPHONEIsNull() {
			addCriterion("PHONE is null");
			return (Criteria) this;
		}

		/**
		 * PHONE字段为不为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPHONEIsNotNull() {
			addCriterion("PHONE is not null");
			return (Criteria) this;
		}

		/**
		 * PHONE等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPHONEEqualTo(String value) {
			addCriterion("PHONE =", value, "PHONE");
			return (Criteria) this;
		}

		/**
		 * PHONE不等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPHONENotEqualTo(String value) {
			addCriterion("PHONE <>", value, "PHONE");
			return (Criteria) this;
		}

		/**
		 * PHONE大于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPHONEGreaterThan(String value) {
			addCriterion("PHONE >", value, "PHONE");
			return (Criteria) this;
		}

		/**
		 * PHONE大于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPHONEGreaterThanOrEqualTo(String value) {
			addCriterion("PHONE >=", value, "PHONE");
			return (Criteria) this;
		}

		/**
		 * PHONE小于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPHONELessThan(String value) {
			addCriterion("PHONE <", value, "PHONE");
			return (Criteria) this;
		}

		/**
		 * PHONE小于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPHONELessThanOrEqualTo(String value) {
			addCriterion("PHONE <=", value, "PHONE");
			return (Criteria) this;
		}

		/**
		 * PHONE在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPHONEIn(List<String> values) {
			addCriterion("PHONE in", values, "PHONE");
			return (Criteria) this;
		}

		/**
		 * PHONE不在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPHONENotIn(List<String> values) {
			addCriterion("PHONE not in", values, "PHONE");
			return (Criteria) this;
		}

		/**
		 * PHONE在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPHONEBetween(String value1, String value2) {
			addCriterion("PHONE between", value1, value2, "PHONE");
			return (Criteria) this;
		}

		/**
		 * PHONE不在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPHONENotBetween(String value1, String value2) {
			addCriterion("PHONE not between", value1, value2, "PHONE");
			return (Criteria) this;
		}

	}
}