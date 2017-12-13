package ioc1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/beans.xml"})
public class Demo1Test {
    @Resource
    private M1Brush m1Brush;

    @Test
    public void test1() {
        m1Brush.brush();
    }
}
