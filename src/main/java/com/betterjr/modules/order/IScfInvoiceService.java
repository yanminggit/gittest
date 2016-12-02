package com.betterjr.modules.order;

import java.util.Map;

public interface IScfInvoiceService {
    /**
     * 订单发票信息录入功能
     */
    public String webAddInvoice(Map<String, Object> anMap, String anInvoiceIds, String anFileList);

    /**
     *  订单发票分页查询 
     */
    public String webQueryInvoiceList(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);
    
    /**
     * 发票信息编辑
     */
    public String webSaveModifyInvoice(Map<String, Object> anMap, String anInvoiceIds, String anFileList);

    /**
     * 发票详情录入
     */
    public String webAddInvoiceItem(Map<String, Object> anMap);

    /**
     * 发票信息删除
     */
    public String webSaveDeleteInvoice(Long anId);
    
    /**
     * 查询出具保理方案下的发票,用于完善资料
     */
    public String webQueryIncompletedInvoice(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);
}
