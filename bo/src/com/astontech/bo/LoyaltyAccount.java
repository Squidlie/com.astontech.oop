package com.astontech.bo;

public class LoyaltyAccount extends BaseBO{
    private int LoyaltyAccountId;
    private int LoyaltyCompanyId;
    private String MemberNumber;
    private int EmployeeId;

    public LoyaltyAccount() {}

    public LoyaltyAccount(int loyaltyAccountId) {
        this.setLoyaltyAccountId(loyaltyAccountId);
    }

    public int getLoyaltyAccountId() {
        return LoyaltyAccountId;
    }
    public void setLoyaltyAccountId(int loyaltyAccountId) {
        LoyaltyAccountId = loyaltyAccountId;
    }

    public int getLoyaltyCompanyId() {
        return LoyaltyCompanyId;
    }
    public void setLoyaltyCompanyId(int loyaltyCompanyId) {
        LoyaltyCompanyId = loyaltyCompanyId;
    }

    public String getMemberNumber() {
        return MemberNumber;
    }
    public void setMemberNumber(String memberNumber) {
        MemberNumber = memberNumber;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }
    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }
}
