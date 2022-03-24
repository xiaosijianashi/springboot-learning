package cn.liyong.test.springboot.service;

import cn.liyong.test.springboot.bean.Student;
import cn.liyong.test.springboot.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * This is Description
 *
 * @author liyong
 * @date 2022/03/23
 */
@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;


    @Transactional(rollbackFor = Exception.class)
    public void saveStudent(String name) throws Exception{
        Student student = new Student();
        student.setName(name);
        Integer studentId = studentService.doSaveStudent(student);
        try {
            courseService.regCourse(studentId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //@Transactional(rollbackFor = Exception.class)
    public Integer doSaveStudent(Student student) throws Exception {
        Integer id = studentMapper.insert(student);
        if(student.getName().equals("小张")) {
            throw new Exception("该学生已存在");
        }
        return id;

    }


}
