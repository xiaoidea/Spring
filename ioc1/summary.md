1. IOC容器分为装配/注入
2. 装配是把bean交给容器管理的过程，方式有
    1. 通过xml配置bean，在xml中用`<bean>`声明一个bean（一般用于外部jar包对象，如DataSource）
    2. 通过java config，注解`@Configuration`和`@Bean`
    3. bean自动发现，配置`<context:component-scan>`和`@Component`
3. 注入是把bean从容器中取出并把bean注入到对象的过程，方式有
    1. 在bean自动发现的配置基础上，使用`@Resource`注解
    2. 装配的同时完成注入:通过xml装配bean，使用`<property>`注入属性，使用`<constructor-arg>`注入构造器参数
    3. 直接使用ApplicationContext获取容器，`getBean()`方法获取需要的对象
4. 如何设置spring config的地址？
    - xml方式: `ClassPathXmlApplicationContext`构造参数
    - java config方式: `AnnotationConfigApplicationContext`构造参数
    - junit: `@ContextConfiguration`
    - web工程: web.xml中 `contextConfigLocation`设置
5. 注入bean的时候，如何给bean设置属性？
    - XML配置，使用`<property>`要清楚如何注入 a. 其他bean b. map/set/list
    - java config配置，在`@Bean`注解修饰的方法上，可以自定义返回的bean的属性
    - 自动发现,通过`@Resource`注入bean，`@Value`注入基础类型(可以注入配置文件中的值)(可以借助spring EL表达式注入list等类型)
6. `context:component-scan` 和 `context:annotation-config`
    - context:component-scan 包含 context:annotation-config 的功能
    - context:annotation-config 只对已经存在于IOC容器中的bean有效，对这些bean开启注解支持，如@Autowired，@Value
    - context:component-scan 还能对不在IOC容器中的类启动注解支持，如@Component,@Service 等