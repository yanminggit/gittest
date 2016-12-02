package com.betterjr.modules.fund.data;

import com.betterjr.common.utils.BetterStringUtils;

public enum SaleFundState {
    TRADE_FUND("0"), ISSUE_FUND("1"), SUCCEED_FUND("2"), FAIL_FUND("3"), FORBID_FUND("4"), FORBID_BUY("5"), FORBID_SELL("6"), STOP_FUND(
            "8"), CLOSURE_FUND("9");

    private final String value;

    public String getValue() {
        return value;
    }

    public static SaleFundState checking(String anWorkType) {
        try {
            if (BetterStringUtils.isNotBlank(anWorkType)) {
                for (SaleFundState mm : SaleFundState.values()) {
                    if (mm.value.equals(anWorkType)) {
                        return mm;
                    }
                }
                return SaleFundState.valueOf(anWorkType.trim().toUpperCase());
            }
        }
        catch (Exception ex) {

        }
        return null;
    }

    SaleFundState(String anValue) {
        this.value = anValue;
    }
}
