package com.betterjr.modules.remote.dubboclient;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.betterjr.modules.remote.IRemoteInvoker;

@Service
public class RemoteInvokeDubboClient implements InvocationHandler {

    @Reference(interfaceClass=IRemoteInvoker.class)
    private IRemoteInvoker invoker;
    
    private String faceNo;
    
    @Override
    public Object invoke(Object anProxy, Method anMethod, Object[] anArgs) throws Throwable {
        String methodName = anMethod.getName();
        Class<?>[] parameterTypes = anMethod.getParameterTypes();
        if (anMethod.getDeclaringClass() == Object.class) {
            return anMethod.invoke(invoker, anArgs);
        }
        if ("toString".equals(methodName) && parameterTypes.length == 0) {
            return invoker.toString();
        }
        if ("hashCode".equals(methodName) && parameterTypes.length == 0) {
            return invoker.hashCode();
        }
        if ("equals".equals(methodName) && parameterTypes.length == 1) {
            return invoker.equals(anArgs[0]);
        }
        return invoker.invoke(this.faceNo,anMethod, anArgs);
    }

    public void setFaceNo(String anFaceNo) {
        faceNo = anFaceNo;
    }

}
