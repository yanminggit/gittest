package com.betterjr.modules.agreement;

import java.util.List;
import java.util.Map;

import com.betterjr.modules.agreement.entity.ScfElecAgreement;
import com.betterjr.modules.document.entity.CustFileItem;
/****
 * 电子合同管理
 * @author hubl
 *
 */
public interface IScfElecAgreementService {

    /***
     * 查询用户电子合同分页信息
     * @param anParam 入参
     * @param anPageNum 页码
     * @param anPageSize 一页显示的数量
     * @return
     */
    public String webQueryElecAgreementByPage(Map<String, Object> anParam, int anPageNum, int anPageSize);
    
    /***
     * 取消电子合同的流水号
     * @param appNo 流水号
     * @return
     */
    public String webCancelElecAgreement(String anAppNo,String anDescribe);
    
    /****
     * 生成电子合同的静态页面
     * @param anAppNo  流水号
     */
    public String webFindElecAgreePage(String anAppNo);
    
    /****
     * 根据请求单号生成电子合同的静态页面
     * @param 
     */
    public String webFindElecAgreePageByRequestNo(String anRequestNo,String anAgreeType);
    
    /***
     * 获取签署合同的验证码
     * @param anAppNo
     * @param anCustType
     * @return
     */
    public String webFindValidCode(String anAppNo, String anCustType);
    
    /***
     * 发送并验证签署合同的验证码
     * @param anAppNo
     * @param anCustType
     * @param anVcode
     * @return
     */
    public String webSendValidCode(String anAppNo, String anCustType, String anVcode);
    
    /***
     * 添加电子合同
     * @param anMap  
     *            电子合同信息
     * @param anCustNoList  
     *            电子合同的签约方信息
     */
    public void webAddElecAgreementInfo(Map<String, Object> anMap, List<Long> anCustNoList);
    
    /****
     * 根据申请单号，类型查询合同
     * @param anRequestNo
     * @param anSignType
     * @return
     */
    public String webFindElecAgreeByOrderNo(String anRequestNo, String anSignType);
    
    /***
     * 查询参数
     * @param anParam
     * @return
     */
    public String webFindParamPath(String anParam);
    
    /***
     * 查找pdf文件
     * @param appNo
     * @return
     */
    public CustFileItem webFindPdfFileInfo(String appNo);
    
    /****
     * 添加其它资料
     * @param anMap
     * @return
     */
    public String webAddOtherFile(Map<String, Object> anMap);
    
    /***
     * 根据申请单号查询其它资料信息
     * @param anRequestNo
     * @return
     */
    public String webQueryOtherFile(String anRequestNo);
    
    /***
     * 删除其它资料
     * @param anOtherFileId
     * @return
     */
    public String webDelOtherFile(Long anOtherFileId);
    


    /***
     * 根据请求单号和合同类型获取验证码
     * @param anRequestNo
     * @param anAgreeType
     * @return
     */
    public String webFindValidCodeByRequestNo(String anRequestNo, String anAgreeType);
    
    /***
     * 发送并验证签署合同的验证码
     * @param anAppNo
     * @param anCustType
     * @param anVcode
     * @return
     */
    public String webSendValidCodeByRequestNo(String anAppNo, String anAgreeType, String anVcode);

    /**
     * 根据订单号，查询需要签署的文件
     * 
     * @param anAppNo
     * @return
     */
    public List<Long> findBatchNo(String anAppNo);
    
    /**
     * 获得签名的文件信息
     * 
     * @param anAppNo
     * @return
     */
    public List<Long> findSignedBatchNo(String anRequestNo);
    
    /**
     * 更新电子合同的状态
     * 
     * @param anAppNo
     * @param anStatus
     */
    public void saveElecAgreementStatus(String anAppNo, String anStatus);
    
    /**
     * 根据主键找到电子合同协议信息
     * 
     * @param anAppNo
     * @return
     */
    public ScfElecAgreement findOneElecAgreement(String anAppNo);
    
    /**
     * 更新已经签署的电子文件信息
     * 
     * @param anAppNo
     *            签署的电子文件订单号信息
     * @param anFileItem
     *            文件信息
     * @return
     */
    public boolean saveSignedFile(String anAppNo, CustFileItem anFileItem);
    
    /***
     * 查找详情
     * @param anAppNo
     * @return
     */
    public String webFindElecAgreementInfo(String anAppNo);
    
    /***
     * 添加保理合同
     * @param anElecAgreement
     * @param anFileList
     * @return
     */
    public String webAddFactorAgreement(Map anMap,String anFileList);
    
    /***
     * 修改保理合同
     * @param anMap
     * @param anAppNo 应用号
     * @param anFileList 文件列表
     * @return
     */
    public String webUpdateFactorAgreement(Map anMap,String anAppNo,String anFileList);

    /***
     * 分页查询保理合同
     * @param anParam
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryFactorAgreement(Map<String, Object> anParam, int anPageNum, int anPageSize);
    
    /***
     * 查询保理合同关联下拉列表
     * @param anCustNo 客户号 
     * @param anFactorNo 保理公司编号
     * @param anCoreCustNo 核心企业编号
     * @param anAgreeType 合同类型
     * @return
     */
    public String webFindFactorAgreement(Long anCustNo,Long anFactorNo,String anAgreeType);
    
    /***
     * 作废合同
     * @param anAppNo
     * @return
     */
    public String updateFactorAgree(String anAppNo,String anStatus);
}
