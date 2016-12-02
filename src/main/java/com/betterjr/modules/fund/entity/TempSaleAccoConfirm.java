package com.betterjr.modules.fund.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.betterjr.common.data.BaseRemoteEntity;
import com.betterjr.common.utils.BetterStringUtils;

@Access(AccessType.FIELD)
@Entity
@Table(name = "T_TMP_SALE_ACCOCONFIRM")
public class TempSaleAccoConfirm extends SaleAccoConfirmInfo implements BaseRemoteEntity {

    private static final long serialVersionUID = -8930350076932158190L;



}
