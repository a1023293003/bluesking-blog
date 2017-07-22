package cn.bluesking.blog.persist.mapper;

import cn.bluesking.blog.model.entity.R2_equit_dist;
import cn.bluesking.blog.model.entity.R2_equit_distExample;
import java.math.BigInteger;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface R2_equit_distMapper {

	/**
	 * 统计符合自定义条件的数据个数
	 *
	 * @param example [R2_equit_distExample]自定义条件
	 * @return [int]符合条件的数据个数
	 */
	int countByExample(R2_equit_distExample example);

	/**
	 * 自定义条件删除数据
	 *
	 * @param example [R2_equit_distExample]自定义条件
	 * @return [int]受影响行数
	 */
	int deleteByExample(R2_equit_distExample example);

	/**
	 * 根据主键删除单条数据
	 *
	 * @param id [BigInteger](主键属性)
	 * @return [int]受影响行数
	 */
	int deleteByPrimaryKey(@Param("id") BigInteger id);

	/**
	 * 插入单条数据
	 *
	 * @param record [R2_equit_dist]待插入数据
	 * @return [int]受影响行数
	 */
	int insert(R2_equit_dist record);

	/**
	 * 有选择的插入单条数据，只插入不为空的属性
	 *
	 * @param record [R2_equit_dist]待插入数据
	 * @return [int]受影响行数
	 */
	int insertSelective(R2_equit_dist record);

	/**
	 * 查询符合自定义条件的数据
	 *
	 * @param example [R2_equit_distExample]自定义条件
	 * @return [List<R2_equit_dist>]符合自定义条件的数据
	 */
	List<R2_equit_dist> selectByExample(R2_equit_distExample example);

	/**
	 * 根据主键查询单条数据
	 *
	 * @param id [BigInteger](主键属性)
	 * @return [R2_equit_dist]查询结果
	 */
	R2_equit_dist selectByPrimaryKey(@Param("id") BigInteger id);

	/**
	 * 自定义条件的有选择性的修改某些属性，只修改不为空的属性
	 *
	 * @param record [R2_equit_dist]数据对象，用于指定修改属性
	 * @param example [R2_equit_distExample]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExampleSelective(@Param("record") R2_equit_dist record, @Param("example") R2_equit_distExample example);

	/**
	 * 自定义条件修改所有属性
	 *
	 * @param record [R2_equit_dist]数据对象，用于指定修改属性
	 * @param example [R2_equit_distExample]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExample(@Param("record") R2_equit_dist record, @Param("example") R2_equit_distExample example);

	/**
	 * 通过主键有选择性的修改某该属性
	 *
	 * @param record [R2_equit_dist]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKeySelective(R2_equit_dist record);

	/**
	 * 通过主键修改所有属性
	 *
	 * @param record [R2_equit_dist]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKey(R2_equit_dist record);

}