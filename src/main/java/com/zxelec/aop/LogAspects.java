package com.zxelec.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * LogAspects
 *
 * @author vimicro
 * @date 2020/10/13
 */
@Aspect
public class LogAspects {

    @Pointcut(value = "execution(public int com.zxelec.aop.MathCalculator.*(..))")
    public void pointCut() {
    }

    ;

    @Before(value = "pointCut()")
    public void logStart(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "运行....参数列表是:" + Arrays.asList(joinPoint.getArgs()));
    }

    @After(value = "pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "运行结束...");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result) {
        System.out.println(joinPoint.getSignature().getName() + "正常返回.....运行结果为:" + result);
    }

    @AfterThrowing(value = "pointCut()", throwing = "ex")
    public void logException(JoinPoint joinPoint, Exception ex) {
        System.out.println(joinPoint.getSignature().getName() + "异常....异常信息为:" + ex);
    }

}
