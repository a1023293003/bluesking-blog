package cn.bluesking.blog.model.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SubjectExample {

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
	public SubjectExample() {
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
		 * subject_no字段为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSubjectNoIsNull() {
			addCriterion("subject_no is null");
			return (Criteria) this;
		}

		/**
		 * subject_no字段为不为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSubjectNoIsNotNull() {
			addCriterion("subject_no is not null");
			return (Criteria) this;
		}

		/**
		 * subject_no等于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSubjectNoEqualTo(Integer value) {
			addCriterion("subject_no =", value, "subjectNo");
			return (Criteria) this;
		}

		/**
		 * subject_no不等于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSubjectNoNotEqualTo(Integer value) {
			addCriterion("subject_no <>", value, "subjectNo");
			return (Criteria) this;
		}

		/**
		 * subject_no大于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSubjectNoGreaterThan(Integer value) {
			addCriterion("subject_no >", value, "subjectNo");
			return (Criteria) this;
		}

		/**
		 * subject_no大于等于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSubjectNoGreaterThanOrEqualTo(Integer value) {
			addCriterion("subject_no >=", value, "subjectNo");
			return (Criteria) this;
		}

		/**
		 * subject_no小于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSubjectNoLessThan(Integer value) {
			addCriterion("subject_no <", value, "subjectNo");
			return (Criteria) this;
		}

		/**
		 * subject_no小于等于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSubjectNoLessThanOrEqualTo(Integer value) {
			addCriterion("subject_no <=", value, "subjectNo");
			return (Criteria) this;
		}

		/**
		 * subject_no在传入值之中
		 * @param value [List<Integer>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSubjectNoIn(List<Integer> values) {
			addCriterion("subject_no in", values, "subjectNo");
			return (Criteria) this;
		}

		/**
		 * subject_no不在传入值之中
		 * @param value [List<Integer>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSubjectNoNotIn(List<Integer> values) {
			addCriterion("subject_no not in", values, "subjectNo");
			return (Criteria) this;
		}

		/**
		 * subject_no在传入值之间
		 * @param value1 [Integer]传入值1
		 * @param value2 [Integer]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSubjectNoBetween(Integer value1, Integer value2) {
			addCriterion("subject_no between", value1, value2, "subjectNo");
			return (Criteria) this;
		}

		/**
		 * subject_no不在传入值之间
		 * @param value1 [Integer]传入值1
		 * @param value2 [Integer]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSubjectNoNotBetween(Integer value1, Integer value2) {
			addCriterion("subject_no not between", value1, value2, "subjectNo");
			return (Criteria) this;
		}
		/**
		 * title字段为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (Criteria) this;
		}

		/**
		 * title字段为不为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (Criteria) this;
		}

		/**
		 * title等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (Criteria) this;
		}

		/**
		 * title不等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (Criteria) this;
		}

		/**
		 * title大于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return (Criteria) this;
		}

		/**
		 * title大于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return (Criteria) this;
		}

		/**
		 * title小于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return (Criteria) this;
		}

		/**
		 * title小于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return (Criteria) this;
		}

		/**
		 * title在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return (Criteria) this;
		}

		/**
		 * title不在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return (Criteria) this;
		}

		/**
		 * title在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return (Criteria) this;
		}

		/**
		 * title不在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
			return (Criteria) this;
		}
		/**
		 * summary字段为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSummaryIsNull() {
			addCriterion("summary is null");
			return (Criteria) this;
		}

		/**
		 * summary字段为不为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSummaryIsNotNull() {
			addCriterion("summary is not null");
			return (Criteria) this;
		}

		/**
		 * summary等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSummaryEqualTo(String value) {
			addCriterion("summary =", value, "summary");
			return (Criteria) this;
		}

		/**
		 * summary不等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSummaryNotEqualTo(String value) {
			addCriterion("summary <>", value, "summary");
			return (Criteria) this;
		}

		/**
		 * summary大于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSummaryGreaterThan(String value) {
			addCriterion("summary >", value, "summary");
			return (Criteria) this;
		}

		/**
		 * summary大于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSummaryGreaterThanOrEqualTo(String value) {
			addCriterion("summary >=", value, "summary");
			return (Criteria) this;
		}

		/**
		 * summary小于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSummaryLessThan(String value) {
			addCriterion("summary <", value, "summary");
			return (Criteria) this;
		}

		/**
		 * summary小于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSummaryLessThanOrEqualTo(String value) {
			addCriterion("summary <=", value, "summary");
			return (Criteria) this;
		}

		/**
		 * summary在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSummaryIn(List<String> values) {
			addCriterion("summary in", values, "summary");
			return (Criteria) this;
		}

		/**
		 * summary不在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSummaryNotIn(List<String> values) {
			addCriterion("summary not in", values, "summary");
			return (Criteria) this;
		}

		/**
		 * summary在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSummaryBetween(String value1, String value2) {
			addCriterion("summary between", value1, value2, "summary");
			return (Criteria) this;
		}

		/**
		 * summary不在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andSummaryNotBetween(String value1, String value2) {
			addCriterion("summary not between", value1, value2, "summary");
			return (Criteria) this;
		}
		/**
		 * content字段为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andContentIsNull() {
			addCriterion("content is null");
			return (Criteria) this;
		}

		/**
		 * content字段为不为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andContentIsNotNull() {
			addCriterion("content is not null");
			return (Criteria) this;
		}

		/**
		 * content等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andContentEqualTo(String value) {
			addCriterion("content =", value, "content");
			return (Criteria) this;
		}

		/**
		 * content不等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andContentNotEqualTo(String value) {
			addCriterion("content <>", value, "content");
			return (Criteria) this;
		}

		/**
		 * content大于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andContentGreaterThan(String value) {
			addCriterion("content >", value, "content");
			return (Criteria) this;
		}

		/**
		 * content大于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andContentGreaterThanOrEqualTo(String value) {
			addCriterion("content >=", value, "content");
			return (Criteria) this;
		}

		/**
		 * content小于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andContentLessThan(String value) {
			addCriterion("content <", value, "content");
			return (Criteria) this;
		}

		/**
		 * content小于等于传入值
		 * @param value [String]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andContentLessThanOrEqualTo(String value) {
			addCriterion("content <=", value, "content");
			return (Criteria) this;
		}

		/**
		 * content在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andContentIn(List<String> values) {
			addCriterion("content in", values, "content");
			return (Criteria) this;
		}

		/**
		 * content不在传入值之中
		 * @param value [List<String>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andContentNotIn(List<String> values) {
			addCriterion("content not in", values, "content");
			return (Criteria) this;
		}

		/**
		 * content在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andContentBetween(String value1, String value2) {
			addCriterion("content between", value1, value2, "content");
			return (Criteria) this;
		}

		/**
		 * content不在传入值之间
		 * @param value1 [String]传入值1
		 * @param value2 [String]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andContentNotBetween(String value1, String value2) {
			addCriterion("content not between", value1, value2, "content");
			return (Criteria) this;
		}
		/**
		 * release_time字段为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andReleaseTimeIsNull() {
			addCriterion("release_time is null");
			return (Criteria) this;
		}

		/**
		 * release_time字段为不为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andReleaseTimeIsNotNull() {
			addCriterion("release_time is not null");
			return (Criteria) this;
		}

		/**
		 * release_time等于传入值
		 * @param value [Timestamp]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andReleaseTimeEqualTo(Timestamp value) {
			addCriterion("release_time =", value, "releaseTime");
			return (Criteria) this;
		}

		/**
		 * release_time不等于传入值
		 * @param value [Timestamp]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andReleaseTimeNotEqualTo(Timestamp value) {
			addCriterion("release_time <>", value, "releaseTime");
			return (Criteria) this;
		}

		/**
		 * release_time大于传入值
		 * @param value [Timestamp]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andReleaseTimeGreaterThan(Timestamp value) {
			addCriterion("release_time >", value, "releaseTime");
			return (Criteria) this;
		}

		/**
		 * release_time大于等于传入值
		 * @param value [Timestamp]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andReleaseTimeGreaterThanOrEqualTo(Timestamp value) {
			addCriterion("release_time >=", value, "releaseTime");
			return (Criteria) this;
		}

		/**
		 * release_time小于传入值
		 * @param value [Timestamp]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andReleaseTimeLessThan(Timestamp value) {
			addCriterion("release_time <", value, "releaseTime");
			return (Criteria) this;
		}

		/**
		 * release_time小于等于传入值
		 * @param value [Timestamp]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andReleaseTimeLessThanOrEqualTo(Timestamp value) {
			addCriterion("release_time <=", value, "releaseTime");
			return (Criteria) this;
		}

		/**
		 * release_time在传入值之中
		 * @param value [List<Timestamp>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andReleaseTimeIn(List<Timestamp> values) {
			addCriterion("release_time in", values, "releaseTime");
			return (Criteria) this;
		}

		/**
		 * release_time不在传入值之中
		 * @param value [List<Timestamp>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andReleaseTimeNotIn(List<Timestamp> values) {
			addCriterion("release_time not in", values, "releaseTime");
			return (Criteria) this;
		}

		/**
		 * release_time在传入值之间
		 * @param value1 [Timestamp]传入值1
		 * @param value2 [Timestamp]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andReleaseTimeBetween(Timestamp value1, Timestamp value2) {
			addCriterion("release_time between", value1, value2, "releaseTime");
			return (Criteria) this;
		}

		/**
		 * release_time不在传入值之间
		 * @param value1 [Timestamp]传入值1
		 * @param value2 [Timestamp]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andReleaseTimeNotBetween(Timestamp value1, Timestamp value2) {
			addCriterion("release_time not between", value1, value2, "releaseTime");
			return (Criteria) this;
		}
		/**
		 * last_modified_time字段为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andLastModifiedTimeIsNull() {
			addCriterion("last_modified_time is null");
			return (Criteria) this;
		}

		/**
		 * last_modified_time字段为不为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andLastModifiedTimeIsNotNull() {
			addCriterion("last_modified_time is not null");
			return (Criteria) this;
		}

		/**
		 * last_modified_time等于传入值
		 * @param value [Timestamp]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andLastModifiedTimeEqualTo(Timestamp value) {
			addCriterion("last_modified_time =", value, "lastModifiedTime");
			return (Criteria) this;
		}

		/**
		 * last_modified_time不等于传入值
		 * @param value [Timestamp]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andLastModifiedTimeNotEqualTo(Timestamp value) {
			addCriterion("last_modified_time <>", value, "lastModifiedTime");
			return (Criteria) this;
		}

		/**
		 * last_modified_time大于传入值
		 * @param value [Timestamp]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andLastModifiedTimeGreaterThan(Timestamp value) {
			addCriterion("last_modified_time >", value, "lastModifiedTime");
			return (Criteria) this;
		}

		/**
		 * last_modified_time大于等于传入值
		 * @param value [Timestamp]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andLastModifiedTimeGreaterThanOrEqualTo(Timestamp value) {
			addCriterion("last_modified_time >=", value, "lastModifiedTime");
			return (Criteria) this;
		}

		/**
		 * last_modified_time小于传入值
		 * @param value [Timestamp]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andLastModifiedTimeLessThan(Timestamp value) {
			addCriterion("last_modified_time <", value, "lastModifiedTime");
			return (Criteria) this;
		}

		/**
		 * last_modified_time小于等于传入值
		 * @param value [Timestamp]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andLastModifiedTimeLessThanOrEqualTo(Timestamp value) {
			addCriterion("last_modified_time <=", value, "lastModifiedTime");
			return (Criteria) this;
		}

		/**
		 * last_modified_time在传入值之中
		 * @param value [List<Timestamp>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andLastModifiedTimeIn(List<Timestamp> values) {
			addCriterion("last_modified_time in", values, "lastModifiedTime");
			return (Criteria) this;
		}

		/**
		 * last_modified_time不在传入值之中
		 * @param value [List<Timestamp>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andLastModifiedTimeNotIn(List<Timestamp> values) {
			addCriterion("last_modified_time not in", values, "lastModifiedTime");
			return (Criteria) this;
		}

		/**
		 * last_modified_time在传入值之间
		 * @param value1 [Timestamp]传入值1
		 * @param value2 [Timestamp]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andLastModifiedTimeBetween(Timestamp value1, Timestamp value2) {
			addCriterion("last_modified_time between", value1, value2, "lastModifiedTime");
			return (Criteria) this;
		}

		/**
		 * last_modified_time不在传入值之间
		 * @param value1 [Timestamp]传入值1
		 * @param value2 [Timestamp]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andLastModifiedTimeNotBetween(Timestamp value1, Timestamp value2) {
			addCriterion("last_modified_time not between", value1, value2, "lastModifiedTime");
			return (Criteria) this;
		}
		/**
		 * category_no字段为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCategoryNoIsNull() {
			addCriterion("category_no is null");
			return (Criteria) this;
		}

		/**
		 * category_no字段为不为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCategoryNoIsNotNull() {
			addCriterion("category_no is not null");
			return (Criteria) this;
		}

		/**
		 * category_no等于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCategoryNoEqualTo(Integer value) {
			addCriterion("category_no =", value, "categoryNo");
			return (Criteria) this;
		}

		/**
		 * category_no不等于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCategoryNoNotEqualTo(Integer value) {
			addCriterion("category_no <>", value, "categoryNo");
			return (Criteria) this;
		}

		/**
		 * category_no大于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCategoryNoGreaterThan(Integer value) {
			addCriterion("category_no >", value, "categoryNo");
			return (Criteria) this;
		}

		/**
		 * category_no大于等于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCategoryNoGreaterThanOrEqualTo(Integer value) {
			addCriterion("category_no >=", value, "categoryNo");
			return (Criteria) this;
		}

		/**
		 * category_no小于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCategoryNoLessThan(Integer value) {
			addCriterion("category_no <", value, "categoryNo");
			return (Criteria) this;
		}

		/**
		 * category_no小于等于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCategoryNoLessThanOrEqualTo(Integer value) {
			addCriterion("category_no <=", value, "categoryNo");
			return (Criteria) this;
		}

		/**
		 * category_no在传入值之中
		 * @param value [List<Integer>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCategoryNoIn(List<Integer> values) {
			addCriterion("category_no in", values, "categoryNo");
			return (Criteria) this;
		}

		/**
		 * category_no不在传入值之中
		 * @param value [List<Integer>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCategoryNoNotIn(List<Integer> values) {
			addCriterion("category_no not in", values, "categoryNo");
			return (Criteria) this;
		}

		/**
		 * category_no在传入值之间
		 * @param value1 [Integer]传入值1
		 * @param value2 [Integer]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCategoryNoBetween(Integer value1, Integer value2) {
			addCriterion("category_no between", value1, value2, "categoryNo");
			return (Criteria) this;
		}

		/**
		 * category_no不在传入值之间
		 * @param value1 [Integer]传入值1
		 * @param value2 [Integer]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andCategoryNoNotBetween(Integer value1, Integer value2) {
			addCriterion("category_no not between", value1, value2, "categoryNo");
			return (Criteria) this;
		}
		/**
		 * page_view字段为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPageViewIsNull() {
			addCriterion("page_view is null");
			return (Criteria) this;
		}

		/**
		 * page_view字段为不为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPageViewIsNotNull() {
			addCriterion("page_view is not null");
			return (Criteria) this;
		}

		/**
		 * page_view等于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPageViewEqualTo(Integer value) {
			addCriterion("page_view =", value, "pageView");
			return (Criteria) this;
		}

		/**
		 * page_view不等于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPageViewNotEqualTo(Integer value) {
			addCriterion("page_view <>", value, "pageView");
			return (Criteria) this;
		}

		/**
		 * page_view大于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPageViewGreaterThan(Integer value) {
			addCriterion("page_view >", value, "pageView");
			return (Criteria) this;
		}

		/**
		 * page_view大于等于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPageViewGreaterThanOrEqualTo(Integer value) {
			addCriterion("page_view >=", value, "pageView");
			return (Criteria) this;
		}

		/**
		 * page_view小于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPageViewLessThan(Integer value) {
			addCriterion("page_view <", value, "pageView");
			return (Criteria) this;
		}

		/**
		 * page_view小于等于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPageViewLessThanOrEqualTo(Integer value) {
			addCriterion("page_view <=", value, "pageView");
			return (Criteria) this;
		}

		/**
		 * page_view在传入值之中
		 * @param value [List<Integer>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPageViewIn(List<Integer> values) {
			addCriterion("page_view in", values, "pageView");
			return (Criteria) this;
		}

		/**
		 * page_view不在传入值之中
		 * @param value [List<Integer>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPageViewNotIn(List<Integer> values) {
			addCriterion("page_view not in", values, "pageView");
			return (Criteria) this;
		}

		/**
		 * page_view在传入值之间
		 * @param value1 [Integer]传入值1
		 * @param value2 [Integer]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPageViewBetween(Integer value1, Integer value2) {
			addCriterion("page_view between", value1, value2, "pageView");
			return (Criteria) this;
		}

		/**
		 * page_view不在传入值之间
		 * @param value1 [Integer]传入值1
		 * @param value2 [Integer]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andPageViewNotBetween(Integer value1, Integer value2) {
			addCriterion("page_view not between", value1, value2, "pageView");
			return (Criteria) this;
		}
		/**
		 * user_no字段为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andUserNoIsNull() {
			addCriterion("user_no is null");
			return (Criteria) this;
		}

		/**
		 * user_no字段为不为null
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andUserNoIsNotNull() {
			addCriterion("user_no is not null");
			return (Criteria) this;
		}

		/**
		 * user_no等于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andUserNoEqualTo(Integer value) {
			addCriterion("user_no =", value, "userNo");
			return (Criteria) this;
		}

		/**
		 * user_no不等于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andUserNoNotEqualTo(Integer value) {
			addCriterion("user_no <>", value, "userNo");
			return (Criteria) this;
		}

		/**
		 * user_no大于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andUserNoGreaterThan(Integer value) {
			addCriterion("user_no >", value, "userNo");
			return (Criteria) this;
		}

		/**
		 * user_no大于等于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andUserNoGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_no >=", value, "userNo");
			return (Criteria) this;
		}

		/**
		 * user_no小于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andUserNoLessThan(Integer value) {
			addCriterion("user_no <", value, "userNo");
			return (Criteria) this;
		}

		/**
		 * user_no小于等于传入值
		 * @param value [Integer]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andUserNoLessThanOrEqualTo(Integer value) {
			addCriterion("user_no <=", value, "userNo");
			return (Criteria) this;
		}

		/**
		 * user_no在传入值之中
		 * @param value [List<Integer>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andUserNoIn(List<Integer> values) {
			addCriterion("user_no in", values, "userNo");
			return (Criteria) this;
		}

		/**
		 * user_no不在传入值之中
		 * @param value [List<Integer>]传入值
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andUserNoNotIn(List<Integer> values) {
			addCriterion("user_no not in", values, "userNo");
			return (Criteria) this;
		}

		/**
		 * user_no在传入值之间
		 * @param value1 [Integer]传入值1
		 * @param value2 [Integer]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andUserNoBetween(Integer value1, Integer value2) {
			addCriterion("user_no between", value1, value2, "userNo");
			return (Criteria) this;
		}

		/**
		 * user_no不在传入值之间
		 * @param value1 [Integer]传入值1
		 * @param value2 [Integer]传入值2
		 * @return [Criteria]更新后的criteria
		 */
		public Criteria andUserNoNotBetween(Integer value1, Integer value2) {
			addCriterion("user_no not between", value1, value2, "userNo");
			return (Criteria) this;
		}

	}
}