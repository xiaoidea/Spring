package point.impl;

import org.springframework.stereotype.Component;
import point.Performance;

/**
 * Created by dhy on 2017/12/24.
 */
@Component
public class PerformanceImpl implements Performance {
    public void perform() {
        System.out.println("--- start performance ---");
    }

    public void performThrow() {
        System.out.println("--- start throw exception ---");
        throw new RuntimeException();
    }
}
