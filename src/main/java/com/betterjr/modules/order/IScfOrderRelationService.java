package com.betterjr.modules.order;

public interface IScfOrderRelationService {
    /**
     * 订单关联关系增加
     */
    public String webAddOrderRelation(String anEnterType, Long anEnterId, String anInfoType, String anInfoIdList);
    
    /**
     * 订单关联关系删除
     */
    public String webSaveDeleteOrderRelation(String anEnterType, Long anEnterId, String anInfoType, Long anInfoId);

}
