package com.astontech.bo;

public class LoyaltyAccount extends BaseBO{
    //region PROPERTIES
    private int LoyaltyAccountId;
    private LoyaltyCompany LoyaltyCompanyId;
    private String MemberNumber;
    private Employee EmployeeId;
    //endregion

    //region CONSTRUCTORS
    public LoyaltyAccount() {}

    public LoyaltyAccount(int loyaltyAccountId) {
        this.setLoyaltyAccountId(loyaltyAccountId);
    }
    //endregion

    //region GETTERS/SETTERS
    public int getLoyaltyAccountId() {
        return LoyaltyAccountId;
    }
    public void setLoyaltyAccountId(int loyaltyAccountId) {
        LoyaltyAccountId = loyaltyAccountId;
    }

    public LoyaltyCompany getLoyaltyCompanyId() {
        return LoyaltyCompanyId;
    }
    public void setLoyaltyCompanyId(LoyaltyCompany loyaltyCompanyId) {
        LoyaltyCompanyId = loyaltyCompanyId;
    }

    public String getMemberNumber() {
        return MemberNumber;
    }
    public void setMemberNumber(String memberNumber) {
        MemberNumber = memberNumber;
    }

    public Employee getEmployeeId() {
        return EmployeeId;
    }
    public void setEmployeeId(Employee employeeId) {
        EmployeeId = employeeId;
    }
    //endregion
}
