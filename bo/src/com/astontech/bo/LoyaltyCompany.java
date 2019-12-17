package com.astontech.bo;

public class LoyaltyCompany extends BaseBO{
    //region PROPERTIES
    private int LoyaltyCompanyId;
    private LoyaltyCompanyType LoyaltyCompanyTypeId;
    private String CompanyName;
    private EntityType EntityTypeId;
    //endregion

    //region CONSTRUCTORS
    public LoyaltyCompany() {}

    public LoyaltyCompany(int loyaltyCompanyId) {
        this.setLoyaltyCompanyId(loyaltyCompanyId);
    }
    //endregion

    //region GETTERS/SETTERS
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

    public LoyaltyCompanyType getLoyaltyCompanyTypeId() {
        return LoyaltyCompanyTypeId;
    }
    public void setLoyaltyCompanyTypeId(LoyaltyCompanyType loyaltyCompanyTypeId) {
        LoyaltyCompanyTypeId = loyaltyCompanyTypeId;
    }

    public EntityType getEntityTypeId() {
        return EntityTypeId;
    }
    public void setEntityTypeId(EntityType entityTypeId) {
        EntityTypeId = entityTypeId;
    }
    //endregion
}
