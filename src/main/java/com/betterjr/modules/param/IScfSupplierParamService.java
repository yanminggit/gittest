package com.betterjr.modules.param;

import java.util.Map;

public interface IScfSupplierParamService {

    /**
     * 供应商基础参数设置
     * @param anMap
     * @return
     */
    public String webSaveSupplierParam(Map<String, Object> anMap);
    
    /**
     * 核心企业基础参数设置
     * @param anMap
     * @return
     */
    public String webSaveCoreParam(Map<String, Object> anMap);
    
    /***
     * 根据供应商所选机构客户号查询供应商参数
     * @param custNo
     * @return
     */
    public String webQuerySupplierParam(String anCustNo);

    /***
     * 根据核心企业客户号查询基础设置信息
     * @param custNo
     * @return
     */
    public String webQueryCoreParam(String anCustNo);
}
