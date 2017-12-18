package factory;

import ioc1.M2Pen;

/**
 * Created by dhy on 2017/12/14.
 */
public class BeanFactory2 {
    public M2Pen getPen() {
        return new M2Pen();
    }
}
