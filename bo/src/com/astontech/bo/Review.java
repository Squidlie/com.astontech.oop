package com.astontech.bo;

import java.util.Date;

public class Review extends BaseBO{
    private int ReviewId;
    private String ReviewName;
    private Date ReviewDate;
    private int EmployeeId;

    public Review() {}

    public Review(int reviewId) {
        this.setReviewId(reviewId);
    }

    public int getReviewId() {
        return ReviewId;
    }
    public void setReviewId(int reviewId) {
        ReviewId = reviewId;
    }

    public String getReviewName() {
        return ReviewName;
    }
    public void setReviewName(String reviewName) {
        ReviewName = reviewName;
    }

    public Date getReviewDate() {
        return ReviewDate;
    }
    public void setReviewDate(Date reviewDate) {
        ReviewDate = reviewDate;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }
    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }
}
