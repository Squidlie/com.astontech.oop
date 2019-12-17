package com.astontech.bo;

public class LoyaltyCompanyType extends BaseBO{
    private int LoyaltyCompanyTypeId;
    private String LoyaltyCompanyType;

    public LoyaltyCompanyType() {}

    public LoyaltyCompanyType(int loyaltyCompanyTypeId) {
        this.setLoyaltyCompanyTypeId(loyaltyCompanyTypeId);
    }

    public int getLoyaltyCompanyTypeId() {
        return LoyaltyCompanyTypeId;
    }
    public void setLoyaltyCompanyTypeId(int loyaltyCompanyTypeId) {
        LoyaltyCompanyTypeId = loyaltyCompanyTypeId;
    }

    public String getLoyaltyCompanyType() {
        return LoyaltyCompanyType;
    }
    public void setLoyaltyCompanyType(String loyaltyCompanyType) {
        LoyaltyCompanyType = loyaltyCompanyType;
    }
}
