package com.betterjr.modules.discount;

import java.util.Map;

public interface IScfDiscountService {

    /***
     * 添加贴现
     * @param anMap
     * @return
     */
    public String webAddDiscount(Map<String, Object> anMap);
    
    /***
     * 根据条件分页查询贴现信息
     * @param anParam
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryDiscount(Map<String, Object> anParam, int anPageNum, int anPageSize);
    
    /***
     * 根据贴现编号查询
     * @param discountId
     * @return
     */
    public String webQueryDiscountById(Integer discountId);
    
}
