package cn.liyong.test.springboot.entity.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 接口入参实体类
 *
 * @author liyong
 * @date 2021/09/26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HopeRequest {

	/**
	 * 客户端唯一编号
	 */
	private String appId;

	/**
	 * 加密后业务相关的入参
	 */
	private String data;

}
