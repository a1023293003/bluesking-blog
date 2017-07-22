package cn.bluesking.blog.persist.mapper;

import cn.bluesking.blog.model.entity.Students;
import cn.bluesking.blog.model.entity.StudentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentsMapper {

	/**
	 * 统计符合自定义条件的数据个数
	 *
	 * @param example [StudentsExample]自定义条件
	 * @return [int]符合条件的数据个数
	 */
	int countByExample(StudentsExample example);

	/**
	 * 自定义条件删除数据
	 *
	 * @param example [StudentsExample]自定义条件
	 * @return [int]受影响行数
	 */
	int deleteByExample(StudentsExample example);

	/**
	 * 根据主键删除单条数据
	 *
	 * @param SID [String](主键属性)
	 * @return [int]受影响行数
	 */
	int deleteByPrimaryKey(@Param("SID") String SID);

	/**
	 * 插入单条数据
	 *
	 * @param record [Students]待插入数据
	 * @return [int]受影响行数
	 */
	int insert(Students record);

	/**
	 * 有选择的插入单条数据，只插入不为空的属性
	 *
	 * @param record [Students]待插入数据
	 * @return [int]受影响行数
	 */
	int insertSelective(Students record);

	/**
	 * 查询符合自定义条件的数据
	 *
	 * @param example [StudentsExample]自定义条件
	 * @return [List<Students>]符合自定义条件的数据
	 */
	List<Students> selectByExample(StudentsExample example);

	/**
	 * 根据主键查询单条数据
	 *
	 * @param SID [String](主键属性)
	 * @return [Students]查询结果
	 */
	Students selectByPrimaryKey(@Param("SID") String SID);

	/**
	 * 自定义条件的有选择性的修改某些属性，只修改不为空的属性
	 *
	 * @param record [Students]数据对象，用于指定修改属性
	 * @param example [StudentsExample]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExampleSelective(@Param("record") Students record, @Param("example") StudentsExample example);

	/**
	 * 自定义条件修改所有属性
	 *
	 * @param record [Students]数据对象，用于指定修改属性
	 * @param example [StudentsExample]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExample(@Param("record") Students record, @Param("example") StudentsExample example);

	/**
	 * 通过主键有选择性的修改某该属性
	 *
	 * @param record [Students]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKeySelective(Students record);

	/**
	 * 通过主键修改所有属性
	 *
	 * @param record [Students]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKey(Students record);

}