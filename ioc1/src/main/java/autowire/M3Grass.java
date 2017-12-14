package autowire;

import ioc1.M1Brush;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * method3: 自动化装配
 */
@Component
public class M3Grass {
    @Autowired
    private M1Brush brush;

    @Value("xiaocao")
    private String name;

    public void growUp() {
        System.out.println("grass is growing up!");
    }

    public void doSth() {
        brush.brush();
    }

    public String getName() {
        return name;
    }
}
