package com.betterjr.modules.loan;

import java.util.Map;

public interface IScfWechatRequestService {

    String webAddRequest(Map<String, Object> anMap);

    String webQueryRequestList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 从报价的列表-进入申请界面（带出报价相关数据）
     * @param anId
     * @return
     */
    String webRequestByOffer(String anId);

   /**
    * 修改票据申请的融资状态
    * @param anRequestNo
    * @param anTradeStatus
    * @return
    */
    String updateRequestTradeStauts(String anRequestNo, String anTradeStatus);

    /**
     * 根据申请编号查询融资申请
     * @param anRequestNo
     * @return
     */
    String webFindRequestByNo(String anRequestNo);

    /**
     * 根据票据id查询融资申请
     * @param anBillsNo
     * @return
     */
    String webFindRequestByBill(String anBillsNo);



}
