package com.astontech.bo;

public class EntityType extends BaseBO{
    private int EntityTypeId;
    private String EntityTypeName;
    private int EntityId;

    public EntityType() {}

    public EntityType(int entityTypeId) {
        this.setEntityTypeId(entityTypeId);
    }


    public int getEntityTypeId() {
        return EntityTypeId;
    }
    public void setEntityTypeId(int entityTypeId) {
        EntityTypeId = entityTypeId;
    }

    public String getEntityTypeName() {
        return EntityTypeName;
    }
    public void setEntityTypeName(String entityTypeName) {
        EntityTypeName = entityTypeName;
    }

    public int getEntityId() {
        return EntityId;
    }
    public void setEntityId(int entityId) {
        EntityId = entityId;
    }
}
