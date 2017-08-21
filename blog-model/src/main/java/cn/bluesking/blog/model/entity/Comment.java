package cn.bluesking.blog.model.entity;

import java.sql.Timestamp;

public class Comment {

	/**
	 * 评论编号
	 */
	private Integer commentNo = null;

	/**
	 * 评论所在的页面主体编号
	 */
	private Integer subjectNo = null;

	/**
	 * 评论内容
	 */
	private String content = null;

	/**
	 * 评论用户编号
	 */
	private Integer userNo = null;

	/**
	 * 当前评论发布时间
	 */
	private Timestamp releaseTime = null;

	/**
	 * 回复的评论编号
	 */
	private Integer replyCommentNo = null;

	/**
	 * 回复的用户编号
	 */
	private Integer replyUserNo = null;

	public void setCommentNo(Integer commentNo) {
		this.commentNo = commentNo;
	}

	public Integer getCommentNo() {
		return this.commentNo;
	}

	public void setSubjectNo(Integer subjectNo) {
		this.subjectNo = subjectNo;
	}

	public Integer getSubjectNo() {
		return this.subjectNo;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
	}

	public Integer getUserNo() {
		return this.userNo;
	}

	public void setReleaseTime(Timestamp releaseTime) {
		this.releaseTime = releaseTime;
	}

	public Timestamp getReleaseTime() {
		return this.releaseTime;
	}

	public void setReplyCommentNo(Integer replyCommentNo) {
		this.replyCommentNo = replyCommentNo;
	}

	public Integer getReplyCommentNo() {
		return this.replyCommentNo;
	}

	public void setReplyUserNo(Integer replyUserNo) {
		this.replyUserNo = replyUserNo;
	}

	public Integer getReplyUserNo() {
		return this.replyUserNo;
	}

}