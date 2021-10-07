package cn.liyong.test.springboot.entity.sys;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * This is Description
 *
 * @author liyong
 * @date 2021/09/29
 */
@Data
@Component("userTest")
public class UserTest {

	/**
	 * 昵称
	 */
	private String Id;

	/**
	 * 用户名称
	 */
	private String userName;

}
