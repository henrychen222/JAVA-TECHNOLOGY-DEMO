/**
 * 3.4 morning
 * 
 * https://www.tutorialspoint.com/guice/guice_aop.htm
 */
package com.example.GuiceDemo.Miscellaneous.AOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

class CallTrackerService implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Before " + invocation.getMethod().getName());
        Object result = invocation.proceed();
        System.out.println("After " + invocation.getMethod().getName());
        return result;
    }
}