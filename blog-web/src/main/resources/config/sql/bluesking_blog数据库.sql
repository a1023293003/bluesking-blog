# ======================================================================================================== #
# 数据库
# ======================================================================================================== #

create database bluesking_blog;

# ======================================================================================================== #
# 网站信息表
# ======================================================================================================== #

use bluesking_blog;

create table website_information (											/* 【网站访问信息表】 */
	information_no int(4) not null auto_increment comment '网站信息编号',		/* 网站信息编号 */
    page_view int(4) not null comment '网站至今总访问量',						/* 网站至今总访问量 */
    last_modified_time timestamp not null default current_timestamp			/* 当前记录最后修改时间 */
    on update current_timestamp comment '当前记录最后修改时间',
    primary key(information_no)												/* 主键 */
) comment = '网站访问信息表';

# ======================================================================================================== #
# 用户信息表
# ======================================================================================================== #

create table user (															/* 【用户信息表】 */
	user_no int(4) not null auto_increment comment '用户编号',				/* 用户编号 */
    user_name varchar(10) not null comment '用户名',							/* 用户名 */
    email varchar(30) comment '用户邮箱',										/* 用户邮箱 */
    primary key(user_no)													/* 主键 */
) comment = '用户信息表';

create table role (															/* 【角色表】 */
	role_no int(4) not null auto_increment comment '角色编号',				/* 角色编号 */
    role_name varchar(20) not null comment '角色名',							/* 角色名 */
    primary key(role_no)													/* 主键 */
) comment = '角色表';

create table permission (													/* 【权限表】 */
	permission_no int(4) not null auto_increment comment '权限编号',			/* 权限编号 */
    permission_name varchar(20) not null comment '权限名',					/* 权限名 */
    primary key(permission_no)												/* 主键 */
) comment = '权限表';

create table user_roles (													/* 【用户角色关系表】 */
	user_roles_no int(4) not null auto_increment comment '用户角色关系编号',	/* 用户角色关系编号 */
    user_no int(4) not null comment '用户编号',								/* 用户编号 */
    role_no int(4) not null comment '角色编号',								/* 角色编号 */
    primary key(user_roles_no)												/* 主键 */
) comment = '用户角色关系表';

create table role_permissions (												/* 【角色权限关系表】 */
	role_permissions_no 
    int(4) not null auto_increment comment '角色权限关系编号',					/* 角色权限关系编号 */
    role_no int(4) not null comment '角色编号',								/* 角色编号 */
    permission_no int(4) not null comment '权限编号',							/* 权限编号 */
    primary key(role_permissions_no)										/* 主键 */
) comment = '角色权限关系表';

# ======================================================================================================== #
# 日志表
# ======================================================================================================== #

create table operation_log (												/* 【操作日志表】 */
	log_no int(4) not null auto_increment comment '操作日志编号',				/* 操作日志编号 */
    user_no int(4) comment '操作用户编号',										/* 操作用户编号 */
    operation varchar(20) not null comment '操作描述',						/* 操作描述 */
    exception varchar(100) comment '操作异常信息',								/* 操作异常信息 */
    params varchar(250) comment '传入参数',									/* 传入参数 */
    ip varchar(30) not null comment '客户端ip',								/* 客户端ip */
    begin_time datetime not null comment '操作起始时间',						/* 操作起始时间 */
    operation_time bigint(8) not null comment '操作时间',						/* 操作时间 */
    url varchar(250) not null comment '请求url',								/* 请求url */
    state bit not null default 0 comment '操作成功与否',						/* 操作成功与否 */
    primary key(log_no)														/* 主键 */
) comment = '操作日志表';

# ======================================================================================================== #
# 页面主体信息表
# ======================================================================================================== #

create table comment (														/* 【评论表】 */
	comment_no int(4) not null auto_increment comment '评论编号',				/* 评论编号 */
    subject_no int(4) not null comment '评论所在的页面主体编号',					/* 评论所在的页面主体编号 */
    content varchar(20) not null comment '评论内容',							/* 评论内容 */
    user_no int(4) not null comment '评论用户编号',							/* 评论用户编号 */
    release_time datetime not null default now() comment '当前评论发布时间',	/* 当前评论发布时间 */
    reply_comment_no int(4) not null comment '回复的评论编号',					/* 回复的评论编号 */
    reply_user_no int(4) not null comment '回复的用户编号',						/* 回复的用户编号 */
    primary key(comment_no)													/* 主键 */
) comment = '评论表';

create table subject_category (												/* 【页面主体类别表】 */
	category_no int(4) not null auto_increment comment '主体类别编号',			/* 主体类别编号 */
    category_name varchar(20) not null comment '主体类别名称',					/* 主体类别名称 */
    category_num int(4) not null default 0 comment '该类主体数量',				/* 该类主体数量 */
    previous_category_no int(4) comment '上级页面主体类别编号',					/* 上级页面主体类别编号 */
    primary key(category_no)												/* 主键 */
) comment = '页面主体类别表';

create table subject (														/* 【页面主体表】 */
	subject_no int(4) not null auto_increment comment '页面主体编号',			/* 页面主体编号 */
	title varchar(50) not null comment '页面标题',							/* 页面标题 */
	summary varchar(250) not null comment '页面摘要',							/* 页面摘要 */
    content text not null comment '页面主体内容',								/* 页面主体内容 */
    release_time datetime not null default now() comment '当前主体发布时间',	/* 当前主体发布时间 */
    last_modified_time timestamp comment '当前记录最后修改时间',					/* 当前记录最后修改时间 */
    category_no int(4) not null comment '页面主体类别',						/* 页面主体类别 */
    page_view int(4) not null default 0 comment '当前页面访问量',				/* 当前页面访问量 */
	user_no int(4) not null comment '作者用户编号',							/* 作者用户编号 */
    primary key(subject_no)													/* 主键 */
) comment = '页面主体表';

# ======================================================================================================== #
# 图片信息表
# ======================================================================================================== #

create table picture_category (												/* 【图片类别表】 */
    category_no int(4) not null auto_increment comment '图片类别编号',			/* 图片类别编号 */
    category_name varchar(20) not null comment '图片类别名称',					/* 图片类别名称 */
    category_num int(4) not null default 0 comment '该类图片数量',				/* 该类图片数量 */
    previous_category_no int(4) comment '上级菜单图片类别编号',					/* 上级菜单图片类别编号 */
    primary key(category_no)												/* 主键 */
) comment = '图片类别表';

create table picture (														/* 【图片表】 */
	picture_no int(4) not null auto_increment comment '图片编号',				/* 图片编号 */
    url varchar(250) not null comment '图片链接',								/* 图片链接 */
    introduction varchar(250) comment '图片介绍',								/* 图片介绍 */
    category_no int(4) not null comment '图片类别',							/* 图片类别 */
    primary key(picture_no)													/* 主键 */
) comment = '图片表';

