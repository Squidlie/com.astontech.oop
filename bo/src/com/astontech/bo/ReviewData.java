package com.astontech.bo;

import java.util.Date;

public class ReviewData extends BaseBO{
    //region PROPERTIES
    private int ReviewDataId;
    private Review ReviewId;
    private EntityType EntityTypeId;
    private String ReviewDataValue;
    private Date CreateDate;
    //endregion

    //region CONSTRUCTORS
    public ReviewData() {}

    public ReviewData(int reviewDataId) {
        this.setReviewDataId(reviewDataId);
    }
    //endregion

    //region GETTERS/SETTERS
    public int getReviewDataId() {
        return ReviewDataId;
    }
    public void setReviewDataId(int reviewDataId) {
        ReviewDataId = reviewDataId;
    }

    public Review getReviewId() {
        return ReviewId;
    }
    public void setReviewId(Review reviewId) {
        ReviewId = reviewId;
    }

    public EntityType getEntityTypeId() {
        return EntityTypeId;
    }
    public void setEntityTypeId(EntityType entityTypeId) {
        EntityTypeId = entityTypeId;
    }

    public String getReviewDataValue() {
        return ReviewDataValue;
    }
    public void setReviewDataValue(String reviewDataValue) {
        ReviewDataValue = reviewDataValue;
    }

    public Date getCreateDate() {
        return CreateDate;
    }
    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }
    //endregion
}
