package cn.bluesking.blog.persist.mapper;

import cn.bluesking.blog.model.entity.R2;
import cn.bluesking.blog.model.entity.R2Example;
import java.math.BigInteger;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface R2Mapper {

	/**
	 * 统计符合自定义条件的数据个数
	 *
	 * @param example [R2Example]自定义条件
	 * @return [int]符合条件的数据个数
	 */
	int countByExample(R2Example example);

	/**
	 * 自定义条件删除数据
	 *
	 * @param example [R2Example]自定义条件
	 * @return [int]受影响行数
	 */
	int deleteByExample(R2Example example);

	/**
	 * 根据主键删除单条数据
	 *
	 * @param id [BigInteger](主键属性)name [String](主键属性)
	 * @return [int]受影响行数
	 */
	int deleteByPrimaryKey(@Param("id") BigInteger id, @Param("name") String name);

	/**
	 * 插入单条数据
	 *
	 * @param record [R2]待插入数据
	 * @return [int]受影响行数
	 */
	int insert(R2 record);

	/**
	 * 有选择的插入单条数据，只插入不为空的属性
	 *
	 * @param record [R2]待插入数据
	 * @return [int]受影响行数
	 */
	int insertSelective(R2 record);

	/**
	 * 查询符合自定义条件的数据
	 *
	 * @param example [R2Example]自定义条件
	 * @return [List<R2>]符合自定义条件的数据
	 */
	List<R2> selectByExample(R2Example example);

	/**
	 * 根据主键查询单条数据
	 *
	 * @param id [BigInteger](主键属性)name [String](主键属性)
	 * @return [R2]查询结果
	 */
	R2 selectByPrimaryKey(@Param("id") BigInteger id, @Param("name") String name);

	/**
	 * 自定义条件的有选择性的修改某些属性，只修改不为空的属性
	 *
	 * @param record [R2]数据对象，用于指定修改属性
	 * @param example [R2Example]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExampleSelective(@Param("record") R2 record, @Param("example") R2Example example);

	/**
	 * 自定义条件修改所有属性
	 *
	 * @param record [R2]数据对象，用于指定修改属性
	 * @param example [R2Example]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExample(@Param("record") R2 record, @Param("example") R2Example example);

	/**
	 * 通过主键有选择性的修改某该属性
	 *
	 * @param record [R2]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKeySelective(R2 record);

	/**
	 * 通过主键修改所有属性
	 *
	 * @param record [R2]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKey(R2 record);

}