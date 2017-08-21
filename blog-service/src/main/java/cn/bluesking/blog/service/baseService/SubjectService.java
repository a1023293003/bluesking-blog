package cn.bluesking.blog.service.baseService;

import java.util.List;

import cn.bluesking.blog.model.entity.Subject;
import cn.bluesking.blog.model.entity.SubjectCategory;

/**
 * 页面主体服务接口
 * 
 * @author 随心
 *
 */
public interface SubjectService {

	/**
	 * 获取主体对象的分类信息,包括各个类别的编号及该类主体对象个数
	 * @return [List<SubjectCategory>]主体对象分类信息列表
	 */
	public List<SubjectCategory> getSubjectCategories();
	
	/**
	 * 查询指定类型的主体对象
	 * @param categoryNo [Integer]主体对象类别编号,如果为null,表示查询所有主体对象
	 * @return [List<Subject>]指定类型主体对象信息列表
	 */
	public List<Subject> findSubjectsByCategory(Integer categoryNo);
	
	/**
	 * 查询指定编号主体对象
	 * @param subjectNo [Integer]主体对象编号
	 * @return [Subject]指定编号的主体对象
	 */
	public Subject findSubjectByNo(Integer subjectNo);
	
	/**
	 * 新增主体对象
	 * @param subject [Subject]待新增的主体对象
	 * @return [boolean]新增成功返回true,否则返回false
	 */
	public boolean insertSubject(Subject subject);
	
	/**
	 * 删除指定编号主体对象
	 * @param subjectNo [Integer]主体对象编号
	 * @return [boolean]删除成功返回true,否则返回false
	 */
	public boolean deleteSubjectByNo(Integer subjectNo);
	
	/**
	 * 更新主体对象
	 * @param subject [Subject]更新后主体对象信息,主体编号不可修改
	 * @return [boolean]修改成功返回true,否则返回false
	 */
	public boolean updateSubject(Subject subject);
	
}
