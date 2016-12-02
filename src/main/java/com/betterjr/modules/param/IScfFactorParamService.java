package com.betterjr.modules.param;

import java.util.Map;

public interface IScfFactorParamService {
    
    /**
     * 保存保理公司参数
     * @param anMap
     * @return
     */
    public String webSaveFactorParam(Map<String, Object> anMap);
    
    /**
     * 获取保理公司参数
     * @param anCustNo
     * @return
     */
    public String webLoadFactorParam(String anCustNo);
}
