package com.betterjr.modules.loan;

import java.util.Map;

public interface IScfDeliveryNoticeService {

    /**
     * 保存修改后的发货通知
     * @param anMap
     * @param anId
     * @return
     */
    String webSaveModifyDeliveryNotice(Map<String, Object> anMap, Long anId);

    /**
     * 新增发货通知
     * @param anMap
     * @return
     */
    String webAddDeliveryNotice(Map<String, Object> anMap);

    /**
     * 分页查询发货通知列表
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryDeliveryNoticeList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 查询发货通知列表（无分页）
     * @param anMap
     * @return
     */
    String webFindDeliveryNoticeList(Map<String, Object> anMap , String factorNo);

}

