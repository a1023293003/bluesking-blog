package cn.bluesking.blog.persist.mapper;

import cn.bluesking.blog.model.entity.RolePermissions;
import cn.bluesking.blog.model.entity.RolePermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePermissionsMapper {

	/**
	 * 统计符合自定义条件的数据个数
	 *
	 * @param example [RolePermissionsExample]自定义条件
	 * @return [int]符合条件的数据个数
	 */
	int countByExample(RolePermissionsExample example);

	/**
	 * 自定义条件删除数据
	 *
	 * @param example [RolePermissionsExample]自定义条件
	 * @return [int]受影响行数
	 */
	int deleteByExample(RolePermissionsExample example);

	/**
	 * 根据主键删除单条数据
	 *
	 * @param rolePermissionsNo [Integer](主键属性)角色权限关系编号
	 * @return [int]受影响行数
	 */
	int deleteByPrimaryKey(@Param("rolePermissionsNo") Integer rolePermissionsNo);

	/**
	 * 插入单条数据
	 *
	 * @param record [RolePermissions]待插入数据
	 * @return [int]受影响行数
	 */
	int insert(RolePermissions record);

	/**
	 * 有选择的插入单条数据，只插入不为空的属性
	 *
	 * @param record [RolePermissions]待插入数据
	 * @return [int]受影响行数
	 */
	int insertSelective(RolePermissions record);

	/**
	 * 查询符合自定义条件的数据
	 *
	 * @param example [RolePermissionsExample]自定义条件
	 * @return [List<RolePermissions>]符合自定义条件的数据
	 */
	List<RolePermissions> selectByExample(RolePermissionsExample example);

	/**
	 * 根据主键查询单条数据
	 *
	 * @param rolePermissionsNo [Integer](主键属性)角色权限关系编号
	 * @return [RolePermissions]查询结果
	 */
	RolePermissions selectByPrimaryKey(@Param("rolePermissionsNo") Integer rolePermissionsNo);

	/**
	 * 自定义条件的有选择性的修改某些属性，只修改不为空的属性
	 *
	 * @param record [RolePermissions]数据对象，用于指定修改属性
	 * @param example [RolePermissionsExample]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExampleSelective(@Param("record") RolePermissions record, @Param("example") RolePermissionsExample example);

	/**
	 * 自定义条件修改所有属性
	 *
	 * @param record [RolePermissions]数据对象，用于指定修改属性
	 * @param example [RolePermissionsExample]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExample(@Param("record") RolePermissions record, @Param("example") RolePermissionsExample example);

	/**
	 * 通过主键有选择性的修改某该属性
	 *
	 * @param record [RolePermissions]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKeySelective(RolePermissions record);

	/**
	 * 通过主键修改所有属性
	 *
	 * @param record [RolePermissions]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKey(RolePermissions record);

}