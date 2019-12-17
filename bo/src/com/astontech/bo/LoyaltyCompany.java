package com.astontech.bo;

public class LoyaltyCompany extends BaseBO{
    private int LoyaltyCompanyId;
    private String CompanyName;
    private int EntityTypeId;

    public LoyaltyCompany() {}

    public LoyaltyCompany(int loyaltyCompanyId) {
        this.setLoyaltyCompanyId(loyaltyCompanyId);
    }

    public int getLoyaltyCompanyId() {
        return LoyaltyCompanyId;
    }
    public void setLoyaltyCompanyId(int loyaltyCompanyId) {
        LoyaltyCompanyId = loyaltyCompanyId;
    }

    public String getCompanyName() {
        return CompanyName;
    }
    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public int getEntityTypeId() {
        return EntityTypeId;
    }
    public void setEntityTypeId(int entityTypeId) {
        EntityTypeId = entityTypeId;
    }
}
