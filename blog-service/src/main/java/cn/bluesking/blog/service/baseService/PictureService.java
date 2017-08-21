package cn.bluesking.blog.service.baseService;

import java.util.List;

import cn.bluesking.blog.model.entity.Picture;
import cn.bluesking.blog.model.entity.PictureCategory;

/**
 * 图片服务接口
 * 
 * @author 随心
 *
 */
public interface PictureService {

	/**
	 * 获取图片的分类信息,包括各个类别的编号及该类图片个数
	 * @return [List<PictureCategory>]图片分类信息列表
	 */
	public List<PictureCategory> getPictureCategories();
	
	/**
	 * 查询指定类型的图片
	 * @param categoryNo [Integer]图片类别编号,如果为null,表示查询所有图片
	 * @return [List<Picture>]指定类型主体对象信息列表
	 */
	public List<Picture> findPicturesByNo(Integer categoryNo);
}
