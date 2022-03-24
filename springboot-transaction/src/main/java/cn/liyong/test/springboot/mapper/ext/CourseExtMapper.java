package cn.liyong.test.springboot.mapper.ext;

import cn.liyong.test.springboot.bean.Course;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * This is Description
 *
 * @author liyong
 * @date 2022/03/24
 */
@Mapper
public interface CourseExtMapper extends BaseMapper<Course> {

    /**
     * 选课数+1
     * @param courseId
     * @return
     */
    Integer addCourseNumber(Integer courseId);


}
