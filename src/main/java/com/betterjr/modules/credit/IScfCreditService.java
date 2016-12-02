package com.betterjr.modules.credit;

import java.util.Map;

import com.betterjr.modules.credit.entity.ScfCreditInfo;

public interface IScfCreditService {

    /**
     * 保理-授信额度分页查询
     * 
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryFactorCredit(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);

    /**
     * 授信余额分页查询(适用于:核心企业、供应商、经销商)
     * 
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryCustCredit(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);

    /**
     * 授信额度变动信息查询
     * 
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryCreditDetail(Map<String, Object> anMap, Long anCreditId, String anFlag, int anPageNum, int anPageSize);

    /**
     * 查询授信额度
     * 
     * @param anCustNo
     * @param anCoreCustNo
     * @param anFactorNo
     * @param anCreditMode
     * @return
     */
    public String webFindCredit(Long anCustNo, Long anCoreCustNo, Long anFactorNo, String anCreditMode);

    /**
     * 按客户编号查询授信额度
     * 
     * @param anCustNo
     * @return
     */
    public String webFindCreditSumByCustNo(Long anCustNo);

    /**
     * 保理-授信额度录入
     * 
     * @param anMap
     * @return
     */
    public String webAddCredit(Map<String, Object> anMap);

    /**
     * 保理-授信记录修改
     * 
     * @param anMap
     * @param anId
     * @return
     */
    public String webModifyCredit(Map<String, Object> anMap, Long anId);

    /**
     * 保理-授信额度激活
     * 
     * @param anId
     * @return
     */
    public String webActivateCredit(Long anId);

    /**
     * 保理-授信终止
     * 
     * @param anId
     * @return
     */
    public String webTerminatCredit(Long anId);

    /**
     * 授信额度占用,供融资放款业务调用
     * 
     * @param anOccupyCredit
     */
    public void saveOccupyCredit(ScfCreditInfo anOccupyCredit);

    /**
     * 授信额度释放,供融资还款业务调用,一次性授信不释放额度
     * 
     * @param anOccupyCredit
     */
    public void saveReleaseCredit(ScfCreditInfo anOccupyCredit);

}
