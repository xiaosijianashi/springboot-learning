package cn.liyong.test.springboot.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * This is Description
 *
 * @author liyong
 * @date 2022/03/23
 */
@Data
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String course_name;

    private Integer number;
}
