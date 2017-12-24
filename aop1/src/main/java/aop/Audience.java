package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by dhy on 2017/12/24.
 */
@Component
@Aspect
public class Audience {
    @Pointcut("execution(* point.Performance.perform*(..))")
    public void performance(){}

    @Before("performance()")
    public void doBefore() {
        System.out.println("--- 前置通知开始 ---");
    }

    @Around("performance()")
    public void doAround(ProceedingJoinPoint jp) {
        System.out.println("--- 环绕通知开始 ---");
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            throw new RuntimeException(throwable);
        }
        System.out.println("--- 环绕通知结束 ---");
    }

    @After("performance()")
    public void doAfter() {
        System.out.println("--- 后置通知开始 ---");
    }

    @AfterReturning("performance()")
    public void doReturn() {
        System.out.println("--- 返回通知开始 ---");
    }

    @AfterThrowing("performance()")
    public void doThrow() {
        System.out.println("--- 异常通知开始 ---");
    }
}
