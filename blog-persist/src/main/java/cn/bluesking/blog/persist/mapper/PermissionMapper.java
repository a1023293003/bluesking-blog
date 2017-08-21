package cn.bluesking.blog.persist.mapper;

import cn.bluesking.blog.model.entity.Permission;
import cn.bluesking.blog.model.entity.PermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionMapper {

	/**
	 * 统计符合自定义条件的数据个数
	 *
	 * @param example [PermissionExample]自定义条件
	 * @return [int]符合条件的数据个数
	 */
	int countByExample(PermissionExample example);

	/**
	 * 自定义条件删除数据
	 *
	 * @param example [PermissionExample]自定义条件
	 * @return [int]受影响行数
	 */
	int deleteByExample(PermissionExample example);

	/**
	 * 根据主键删除单条数据
	 *
	 * @param permissionNo [Integer](主键属性)权限编号
	 * @return [int]受影响行数
	 */
	int deleteByPrimaryKey(@Param("permissionNo") Integer permissionNo);

	/**
	 * 插入单条数据
	 *
	 * @param record [Permission]待插入数据
	 * @return [int]受影响行数
	 */
	int insert(Permission record);

	/**
	 * 有选择的插入单条数据，只插入不为空的属性
	 *
	 * @param record [Permission]待插入数据
	 * @return [int]受影响行数
	 */
	int insertSelective(Permission record);

	/**
	 * 查询符合自定义条件的数据
	 *
	 * @param example [PermissionExample]自定义条件
	 * @return [List<Permission>]符合自定义条件的数据
	 */
	List<Permission> selectByExample(PermissionExample example);

	/**
	 * 根据主键查询单条数据
	 *
	 * @param permissionNo [Integer](主键属性)权限编号
	 * @return [Permission]查询结果
	 */
	Permission selectByPrimaryKey(@Param("permissionNo") Integer permissionNo);

	/**
	 * 自定义条件的有选择性的修改某些属性，只修改不为空的属性
	 *
	 * @param record [Permission]数据对象，用于指定修改属性
	 * @param example [PermissionExample]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

	/**
	 * 自定义条件修改所有属性
	 *
	 * @param record [Permission]数据对象，用于指定修改属性
	 * @param example [PermissionExample]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);

	/**
	 * 通过主键有选择性的修改某该属性
	 *
	 * @param record [Permission]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKeySelective(Permission record);

	/**
	 * 通过主键修改所有属性
	 *
	 * @param record [Permission]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKey(Permission record);

}