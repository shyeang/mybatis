package shyeang.mybatis.proxy.test;

import org.apache.ibatis.plugin.Plugin;
import shyeang.mybatis.proxy.ProxyHandle;

import java.lang.reflect.Proxy;

public class Executor implements ExecutorInterface {
    public  String  execute(String param){
        System.out.println("execute:" +param);
        return  "result for:" +param;
    }

    public static  void  main(String args[]){
        Executor e = new Executor();
        ExecutorInterface d = (ExecutorInterface)Proxy.newProxyInstance(
                e.getClass().getClassLoader(),
                e.getClass().getInterfaces(),
                new ProxyHandle(e));
        System.out.println(d.execute("executorForTest"));
    }
}
