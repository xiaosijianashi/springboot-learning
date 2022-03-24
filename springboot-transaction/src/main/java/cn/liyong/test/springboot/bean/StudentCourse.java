package cn.liyong.test.springboot.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * This is Description
 *
 * @author liyong
 * @date 2022/03/24
 */
@Data
public class StudentCourse {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer studentId;

    private Integer courseId;

}
