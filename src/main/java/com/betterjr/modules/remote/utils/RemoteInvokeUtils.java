package com.betterjr.modules.remote.utils;

import java.lang.reflect.Proxy;

import com.betterjr.common.exception.BetterjrClientProtocolException;
import com.betterjr.common.service.SpringContextHolder;
import com.betterjr.modules.remote.dubboclient.RemoteInvokeDubboClient;
import com.betterjr.modules.remote.dubboclient.WebServiceInvokeDubboClient;

public class RemoteInvokeUtils {

    static RemoteInvokeDubboClient handler=SpringContextHolder.getBean(RemoteInvokeDubboClient.class);
    static WebServiceInvokeDubboClient webServiceHandler=SpringContextHolder.getBean(WebServiceInvokeDubboClient.class);
    /**
     * 获取接口服务dubbo代理
     * 
     */
    @SuppressWarnings("unchecked")
    public static <T> T createService(String anFaceNo, Class<T> anClass) {

        try {
            handler.setFaceNo(anFaceNo);
            return (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[] { anClass }, handler);
        }
        catch (Exception e) {
            String className = anClass.getSimpleName();
            throw new BetterjrClientProtocolException(25201, "Create " + className + " Class InstantiationException ", e);
        }
    }
    
    
    /**
     * 获取web service dubbo client
     * 
     */
    public static WebServiceInvokeDubboClient getWebServiceClient() {
        return webServiceHandler;
    }



}
