package autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * method3: 自动化装配
 */
@Component
public class M3Grass {
    public String getName() {
        return name;
    }

    @Value("xiaocao")
    private String name;

    public void growUp() {
        System.out.println("grass is growing up!");
    }
}
