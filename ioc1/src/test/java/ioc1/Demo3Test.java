package ioc1;

import autowire.M3Grass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/autowire.xml"})
public class Demo3Test {
    @Resource
    private M3Grass grass;

    @Test
    public void test() {
        grass.growUp();
    }
}
