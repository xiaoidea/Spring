package ioc1;

import java.util.List;

/**
 * param1 : 通过XML配置设置bean参数
 */
public class M4Student {
    private String name;

    // 通过property注入字面量
    private String location;
    // 通过property注入对象
    private M1Brush brush;
    // 通过property注入list
    private List<String> years;

    // 通过构造函数注入
    public M4Student(String name) {
        this.name = name;
    }

    public void walk() {
        String msg = "student [" + name + "] is walking";
        System.out.println(msg);
    }

    public void where() {
        System.out.println(location);
    }

    public void when() {
        System.out.println(years);
    }

    public void doSth() {
        brush.brush();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public M1Brush getBrush() {
        return brush;
    }

    public void setBrush(M1Brush brush) {
        this.brush = brush;
    }

    public List<String> getYears() {
        return years;
    }

    public void setYears(List<String> years) {
        this.years = years;
    }
}
