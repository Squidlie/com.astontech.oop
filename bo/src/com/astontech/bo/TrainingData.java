package com.astontech.bo;

import java.util.Date;

public class TrainingData extends BaseBO {
    //region PROPERTIES
    private int TrainingDataId;
    private Training TrainingId;
    private EntityType EntityTypeId;
    private String TrainingDataValue;
    private Date CreatDate;
    //endregion

    //region CONSTRUCTORS
    public TrainingData() {}

    public TrainingData(int trainingDataId) {
        this.setTrainingDataId(trainingDataId);
    }
    //endregion

    //region GETTERS/SETTERS
    public int getTrainingDataId() {
        return TrainingDataId;
    }
    public void setTrainingDataId(int trainingDataId) {
        TrainingDataId = trainingDataId;
    }

    public Training getTrainingId() {
        return TrainingId;
    }
    public void setTrainingId(Training trainingId) {
        TrainingId = trainingId;
    }

    public EntityType getEntityTypeId() {
        return EntityTypeId;
    }
    public void setEntityTypeId(EntityType entityTypeId) {
        EntityTypeId = entityTypeId;
    }

    public String getTrainingDataValue() {
        return TrainingDataValue;
    }
    public void setTrainingDataValue(String trainingDataValue) {
        TrainingDataValue = trainingDataValue;
    }

    public Date getCreatDate() {
        return CreatDate;
    }
    public void setCreatDate(Date creatDate) {
        CreatDate = creatDate;
    }
    //endregion
}
