package com.betterjr.modules.receivable;

import java.util.Map;

public interface IScfReceivableService {
    
    /**
     * 应收账款信息编辑
     */
    public String webSaveModifyReceivable(Map<String, Object> anMap, Long anId, String anFileList, String anOtherFileList);

    /**
     * 应收账款信息分页查询
     */
    public String webQueryReceivable(Map<String, Object> anMap, String anIsOnlyNormal, String anFlag, int anPageNum, int anPageSize);

    /**
     * 应收账款信息无分页查询
     */
    public String webFindReceivableList(String anCustNo, String anIsOnlyNormal);

    /**
     * 应收账款详情查询
     */
    public String webFindReceivableDetailsById(Long anId);

    /**
     * 应收账款新增
     */
    public String webAddReceivable(Map<String, Object> anMap, String anFileList, String anOtherFileList);

    public String webSaveAduitReceivable(Long anId);

}
