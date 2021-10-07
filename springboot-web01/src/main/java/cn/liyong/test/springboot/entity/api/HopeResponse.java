package cn.liyong.test.springboot.entity.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 接口返回实体类
 *
 * @author liyong
 * @date 2021/09/26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HopeResponse {

	/**
	 * 是否成功
	 */
	private boolean success;

	/**
	 * 返回信息
	 */
	private String message;

	/**
	 * 业务相关的返回信息，私钥相关的
	 */
	private String data;

}
