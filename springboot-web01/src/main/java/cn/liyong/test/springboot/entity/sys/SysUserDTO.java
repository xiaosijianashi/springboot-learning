package cn.liyong.test.springboot.entity.sys;

import lombok.Data;

/**
 * 查询用户的实体类
 *
 * @author liyong
 * @date 2021/09/26
 */
@Data
public class SysUserDTO {

	/**
	 * 昵称
	 */
	private String userId;

	/**
	 * 用户名称
	 */
	private String userName;

	/**
	 * 用户手机号
	 */
	private String userPhone;

	/**
	 * 用户邮箱
	 */
	private String userEmail;

	/**
	 * 用户状态 0、正常 1、锁定 2、注销
	 */
	private Integer status;
}
