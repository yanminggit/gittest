package com.betterjr.modules.product;

import java.util.Map;

public interface IScfProductService {

    /**
     * 融资产品信息分页查询
     * 
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryProduct(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);
    
    /**
     * 融资产品信息分页查询
     * 
     * @param anCoreCustNo
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryProduct(Long anCoreCustNo, String anFlag, int anPageNum, int anPageSize);

    /**
     * 融资产品下拉列表查询
     * 
     * @param anCoreCustNo
     * @param anFactorNo
     * @return
     */
    public String webQueryProductKeyAndValue(Long anCoreCustNo, Long anFactorNo);

    /**
     * 微信端客户(供应商或经销商)查询保理产品
     * 
     * @return
     */
    public String webQueryProductKeyAndValue();

    /**
     * 查询融资产品信息
     * 
     * @param anCoreCustNo
     * @param anFactorNo
     * @param anProductCode
     * @return
     */
    public String webFindProductByCode(Long anCoreCustNo, Long anFactorNo, String anProductCode);

    /**
     * 查询融资产品信息
     * 
     * @param anProductId:产品Id
     * @return
     */
    public String webFindProductById(Long anProductId);

    /**
     * 融资产品录入
     * 
     * @param anMap
     * @return
     */
    public String webAddProduct(Map<String, Object> anMap);

    /**
     * 融资产品修改
     * 
     * @param anMap
     * @param anId
     * @return
     */
    public String webSaveModifyProduct(Map<String, Object> anMap, Long anId);

    /**
     * 融资产品删除
     * 
     * @param anId
     */
    public String webSaveDeleteProduct(Long anId);

    /**
     * 融资产品上架
     * 
     * @param anId
     * @return
     */
    public String webSaveShelvesProduct(Long anId);

    /**
     * 融资产品下架
     * 
     * @param anId
     * @return
     */
    public String webSaveOfflineProduct(Long anId);

}
