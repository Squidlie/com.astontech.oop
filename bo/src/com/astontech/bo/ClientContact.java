package com.astontech.bo;

import java.util.Date;

public class ClientContact extends BaseBO{
    //region PROPERTIES
    private int ClientContactId;
    private Client ClientId;
    private EntityType ContactType;
    //endregion

    //region CONSTRUCTORS
    public ClientContact() {}

    public ClientContact(int clientContactId) {
        this.setClientContactId(clientContactId);
    }
    //endregion

    //region GETTERS/SETTERS
    public int getClientContactId() {
        return ClientContactId;
    }
    public void setClientContactId(int clientContactId) {
        ClientContactId = clientContactId;
    }

    public Client getClientId() {
        return ClientId;
    }
    public void setClientId(Client clientId) {
        ClientId = clientId;
    }

    public EntityType getEntityTypeId() {
        return ContactType;
    }
    public void setEntityTypeId(EntityType entityTypeId) { ContactType = entityTypeId;
    }
    //endregion
}
