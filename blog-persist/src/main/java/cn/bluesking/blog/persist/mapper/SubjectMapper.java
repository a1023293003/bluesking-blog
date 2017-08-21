package cn.bluesking.blog.persist.mapper;

import cn.bluesking.blog.model.entity.Subject;
import cn.bluesking.blog.model.entity.SubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectMapper {

	/**
	 * 统计符合自定义条件的数据个数
	 *
	 * @param example [SubjectExample]自定义条件
	 * @return [int]符合条件的数据个数
	 */
	int countByExample(SubjectExample example);

	/**
	 * 自定义条件删除数据
	 *
	 * @param example [SubjectExample]自定义条件
	 * @return [int]受影响行数
	 */
	int deleteByExample(SubjectExample example);

	/**
	 * 根据主键删除单条数据
	 *
	 * @param subjectNo [Integer](主键属性)页面主体编号
	 * @return [int]受影响行数
	 */
	int deleteByPrimaryKey(@Param("subjectNo") Integer subjectNo);

	/**
	 * 插入单条数据
	 *
	 * @param record [Subject]待插入数据
	 * @return [int]受影响行数
	 */
	int insert(Subject record);

	/**
	 * 有选择的插入单条数据，只插入不为空的属性
	 *
	 * @param record [Subject]待插入数据
	 * @return [int]受影响行数
	 */
	int insertSelective(Subject record);

	/**
	 * 查询符合自定义条件的数据
	 *
	 * @param example [SubjectExample]自定义条件
	 * @return [List<Subject>]符合自定义条件的数据
	 */
	List<Subject> selectByExample(SubjectExample example);

	/**
	 * 根据主键查询单条数据
	 *
	 * @param subjectNo [Integer](主键属性)页面主体编号
	 * @return [Subject]查询结果
	 */
	Subject selectByPrimaryKey(@Param("subjectNo") Integer subjectNo);

	/**
	 * 自定义条件的有选择性的修改某些属性，只修改不为空的属性
	 *
	 * @param record [Subject]数据对象，用于指定修改属性
	 * @param example [SubjectExample]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExampleSelective(@Param("record") Subject record, @Param("example") SubjectExample example);

	/**
	 * 自定义条件修改所有属性
	 *
	 * @param record [Subject]数据对象，用于指定修改属性
	 * @param example [SubjectExample]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExample(@Param("record") Subject record, @Param("example") SubjectExample example);

	/**
	 * 通过主键有选择性的修改某该属性
	 *
	 * @param record [Subject]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKeySelective(Subject record);

	/**
	 * 通过主键修改所有属性
	 *
	 * @param record [Subject]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKey(Subject record);

}