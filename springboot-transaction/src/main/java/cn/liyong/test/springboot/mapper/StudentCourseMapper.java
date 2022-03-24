package cn.liyong.test.springboot.mapper;

import cn.liyong.test.springboot.bean.StudentCourse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * This is Description
 *
 * @author liyong
 * @date 2022/03/24
 */
@Mapper
public interface StudentCourseMapper extends BaseMapper<StudentCourse> {
}
