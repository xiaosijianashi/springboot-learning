package cn.liyong.test.springboot.mapper;

import cn.liyong.test.springboot.bean.Course;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * This is Description
 *
 * @author liyong
 * @date 2022/03/23
 */
@Mapper
public interface CourseMapper extends BaseMapper<Course> {
}
