package ioc1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/param1.xml")
public class Demo4Test {
    @Resource
    private M4Student student;

    @Test
    public void test() {
        student.walk();
        student.where();
        student.when();
        student.doSth();
    }
}
