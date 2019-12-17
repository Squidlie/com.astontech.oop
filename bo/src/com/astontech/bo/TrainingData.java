package com.astontech.bo;

import java.util.Date;

public class TrainingData extends BaseBO {
    private int TrainingDataId;
    private int TrainingId;
    private int EntityTypeId;
    private String TrainingDataValue;
    private Date CreatDate;

    public TrainingData() {}

    public TrainingData(int trainingDataId) {
        this.setTrainingDataId(trainingDataId);
    }

    public int getTrainingDataId() {
        return TrainingDataId;
    }

    public void setTrainingDataId(int trainingDataId) {
        TrainingDataId = trainingDataId;
    }

    public int getTrainingId() {
        return TrainingId;
    }

    public void setTrainingId(int trainingId) {
        TrainingId = trainingId;
    }

    public int getEntityTypeId() {
        return EntityTypeId;
    }

    public void setEntityTypeId(int entityTypeId) {
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
}
