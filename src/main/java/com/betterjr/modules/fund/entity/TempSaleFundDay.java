package com.betterjr.modules.fund.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.betterjr.common.annotation.MetaData;
import com.betterjr.common.mapper.BeanMapper;

@Access(AccessType.FIELD)
@Entity
@Table(name = "T_TMP_SALE_FUNDDAY")
public class TempSaleFundDay extends SaleFundDayInfo {

    private static final long serialVersionUID = 8906199764878593867L;

    /**
     * 销售人代码
     */
    @Column(name = "C_AGENCYNO", columnDefinition = "VARCHAR")
    @MetaData(value = "销售人代码", comments = "销售人代码")
    private String agencyNo;
    /**
     * 当日累计最高额度
     */
    @Column(name = "F_DAY_MAX", columnDefinition = "DOUBLE")
    @MetaData(value = "当日累计最高额度", comments = "当日累计最高额度")
    private Double dayMax;

    public TempSaleFundDay() {

    }

    public TempSaleFundDay(SaleFundDayInfo anFundDayInfo) {
        if (anFundDayInfo != null) {
            BeanMapper.copy(anFundDayInfo, this);
        }
    }

    public String getAgencyNo() {
        return this.agencyNo;
    }

    public void setAgencyNo(String anAgencyNo) {
        this.agencyNo = anAgencyNo;
    }

    public SaleFundDayInfo createFundDayInfo() {
        SaleFundDayInfo fundDay = BeanMapper.map(this, SaleFundDayInfo.class);
        return fundDay;
    }

    public void init(SaleFundDayInfo anFundDay, SaleFundInfo anFundInfo, String anWorkDate) {
        this.setIssueDate(anWorkDate);
        this.setFundName(anFundInfo.getFundName());
        this.setServiceRatio(anFundInfo.getServiceRatio());
        if (anFundDay != null) {
            this.setLastStatus(anFundDay.getStatus());
            this.setLastNetValue(anFundDay.getNetValue());
        }
        this.setNextStatus(this.getStatus());
    }
}
