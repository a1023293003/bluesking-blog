package cn.bluesking.blog.persist.mapper;

import cn.bluesking.blog.model.entity.PictureCategory;
import cn.bluesking.blog.model.entity.PictureCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PictureCategoryMapper {

	/**
	 * 统计符合自定义条件的数据个数
	 *
	 * @param example [PictureCategoryExample]自定义条件
	 * @return [int]符合条件的数据个数
	 */
	int countByExample(PictureCategoryExample example);

	/**
	 * 自定义条件删除数据
	 *
	 * @param example [PictureCategoryExample]自定义条件
	 * @return [int]受影响行数
	 */
	int deleteByExample(PictureCategoryExample example);

	/**
	 * 根据主键删除单条数据
	 *
	 * @param categoryNo [Integer](主键属性)图片类别编号
	 * @return [int]受影响行数
	 */
	int deleteByPrimaryKey(@Param("categoryNo") Integer categoryNo);

	/**
	 * 插入单条数据
	 *
	 * @param record [PictureCategory]待插入数据
	 * @return [int]受影响行数
	 */
	int insert(PictureCategory record);

	/**
	 * 有选择的插入单条数据，只插入不为空的属性
	 *
	 * @param record [PictureCategory]待插入数据
	 * @return [int]受影响行数
	 */
	int insertSelective(PictureCategory record);

	/**
	 * 查询符合自定义条件的数据
	 *
	 * @param example [PictureCategoryExample]自定义条件
	 * @return [List<PictureCategory>]符合自定义条件的数据
	 */
	List<PictureCategory> selectByExample(PictureCategoryExample example);

	/**
	 * 根据主键查询单条数据
	 *
	 * @param categoryNo [Integer](主键属性)图片类别编号
	 * @return [PictureCategory]查询结果
	 */
	PictureCategory selectByPrimaryKey(@Param("categoryNo") Integer categoryNo);

	/**
	 * 自定义条件的有选择性的修改某些属性，只修改不为空的属性
	 *
	 * @param record [PictureCategory]数据对象，用于指定修改属性
	 * @param example [PictureCategoryExample]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExampleSelective(@Param("record") PictureCategory record, @Param("example") PictureCategoryExample example);

	/**
	 * 自定义条件修改所有属性
	 *
	 * @param record [PictureCategory]数据对象，用于指定修改属性
	 * @param example [PictureCategoryExample]自定义条件
	 * @return [int]受影响行数
	 */
	int updateByExample(@Param("record") PictureCategory record, @Param("example") PictureCategoryExample example);

	/**
	 * 通过主键有选择性的修改某该属性
	 *
	 * @param record [PictureCategory]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKeySelective(PictureCategory record);

	/**
	 * 通过主键修改所有属性
	 *
	 * @param record [PictureCategory]数据对象，用于指定修改属性，数据中应包含主键
	 * @return [int]受影响行数
	 */
	int updateByPrimaryKey(PictureCategory record);

}