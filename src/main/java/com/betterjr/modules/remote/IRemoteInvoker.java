package com.betterjr.modules.remote;

import java.lang.reflect.Method;
import java.util.Map;

import com.betterjr.modules.remote.entity.RemoteResultInfo;

public interface IRemoteInvoker {

    public RemoteResultInfo invoke(String faceNo,Method anMethod, Object[] anArgs);
    
    public String process(Map<String, String> map);
    
    public String signFile(String partnerCode,String fileToken);
    
}
