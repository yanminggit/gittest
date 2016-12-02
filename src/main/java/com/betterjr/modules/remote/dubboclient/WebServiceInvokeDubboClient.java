package com.betterjr.modules.remote.dubboclient;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.betterjr.modules.remote.IRemoteInvoker;

@Service
public class WebServiceInvokeDubboClient {

    @Reference(interfaceClass=IRemoteInvoker.class)
    private IRemoteInvoker invoker;
    
    public String process(Map<String, String> map){
        
        return invoker.process(map);
    }
    
    /**
     * 签名文件
     */
    public String signFile(String partnerCode,String fileToken){
        return invoker.signFile(partnerCode,fileToken);
    }

}
