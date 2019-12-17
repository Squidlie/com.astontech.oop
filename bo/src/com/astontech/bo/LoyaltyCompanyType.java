package com.astontech.bo;

public class LoyaltyCompanyType extends BaseBO{
    //region PROPERTIES
    private int LoyaltyCompanyTypeId;
    private String LoyaltyCompanyType;
    //endregion

    //region CONSTRUCTORS
    public LoyaltyCompanyType() {}

    public LoyaltyCompanyType(int loyaltyCompanyTypeId) {
        this.setLoyaltyCompanyTypeId(loyaltyCompanyTypeId);
    }
    //endregion

    //region GETTERS/SETTERS
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
    //endregion
}
