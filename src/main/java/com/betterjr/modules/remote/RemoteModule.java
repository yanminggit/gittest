package com.betterjr.modules.remote;

import java.util.ArrayList;
import java.util.List;

import com.betterjr.common.utils.BetterClassUtils;
import com.betterjr.common.utils.XmlUtils;

public enum RemoteModule {
    dubboClient,entity,utils,connection,dao,data,dubbo,helper,serializer,service;
    
    @SuppressWarnings("rawtypes")
    public static Class findClassInModule(String className) throws ClassNotFoundException{
        if (XmlUtils.split(className, ".").size() > 1) {
            return Class.forName(className);
        }
        
        String packagePath=RemoteModule.class.getPackage().getName();
        RemoteModule[] values=RemoteModule.values();
        List<String> packageList=new ArrayList<String>();
        for(RemoteModule value:values){
            packageList.add(packagePath+"."+value.name());
        }
        return BetterClassUtils.findClassByName(className, packageList);
    }
}
