package shyeang.mybatis.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandle implements InvocationHandler {
    private  Object target;

    public  ProxyHandle (Object o){
        target = o;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeExecute(proxy, method, args);
        Object o = method.invoke(target, args);
        afterExecute(proxy, method, args);
        return o;
    }

    private void beforeExecute(Object proxy, Method method, Object[] args){
        System.out.println("--------beforeExecute---------");
    }
    private void afterExecute(Object proxy, Method method, Object[] args){
        System.out.println("--------afterExecute---------");

    }


}
