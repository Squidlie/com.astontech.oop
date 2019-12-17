package com.astontech.bo;

public class Entity extends BaseBO{

    //region PROPERTIES
    private int EntityId;
    private EntityType EntityTypeId;
    private String EntityName;
    //endregion

    //region CONSTRUCTORS
    public Entity() {}
    public Entity(int entityId) {
        this.setEntityId(entityId);
    }
    //endregion

    //region GETTERS/SETTERS
    public int getEntityId() {
        return EntityId;
    }
    public void setEntityId(int entityId) {
        EntityId = entityId;
    }

    public String getEntityName() {
        return EntityName;
    }
    public void setEntityName(String entityName) {
        EntityName = entityName;
    }

    public EntityType getEntityTypeId() {
        return EntityTypeId;
    }
    public void setEntityTypeId(EntityType entityTypeId) {
        EntityTypeId = entityTypeId;
    }
    //endregion
}
