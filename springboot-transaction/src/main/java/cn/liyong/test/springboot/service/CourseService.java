package cn.liyong.test.springboot.service;

import cn.liyong.test.springboot.bean.StudentCourse;
import cn.liyong.test.springboot.mapper.CourseMapper;
import cn.liyong.test.springboot.mapper.StudentCourseMapper;
import cn.liyong.test.springboot.mapper.ext.CourseExtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * This is Description
 *
 * @author liyong
 * @date 2022/03/24
 */
@Service
public class CourseService {

    @Autowired
    private CourseExtMapper courseExtMapper;

    @Autowired
    private StudentCourseMapper studentCourseMapper;

    @Transactional(rollbackFor = Exception.class)
    public void regCourse(int studentId) throws Exception {
        StudentCourse studentCourse = new StudentCourse();
        studentCourse.setStudentId(studentId);
        studentCourse.setCourseId(1);
        studentCourseMapper.insert(studentCourse);
        courseExtMapper.addCourseNumber(1);
        throw new Exception("注册失败!");
    }



}
