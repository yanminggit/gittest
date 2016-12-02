package com.betterjr.modules.agreement;

import java.util.Map;
/***
 * 合同接口
 * @author hubl
 *
 */
public interface IScfCustAgreementService {

    /***
     * 分页查询客户合同
     * @param anParam
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryCustAgreementsByPage(Map<String, Object> anParam, int anPageNum, int anPageSize);
    /***
     * 添加合同
     * @param anMap
     * @param anFileList
     * @return
     */
    public String webAddCustAgreement(Map<String, Object> anMap, String anFileList);
    /***
     * 查找客户合同明细
     * @param anAgreeId
     * @return
     */
    public String webFindCustAgreementDetail(Long anAgreeId);
    /***
     * 修改客户合同
     * @param anParam
     * @param anId
     * @param anFileList
     * @return
     */
    public String webModifyCustAgreement(Map<String, String> anParam, Long anId, String anFileList);
    /***
     * 查询合同附件
     * @param id
     * @return
     */
    public String webFindCustFileItems(Long id);
    /***
     * 删除合同附件信息
     * @param anId
     * @param anAgreeId
     * @return
     */
    public String webDeleteFileItem(Long anId, Long anAgreeId);
    /***
     * 更新状态
     * @param anAgreeId
     * @param anType
     */
    public void webSaveCustAgreementStatus(Long anAgreeId, int anType);
}
