package com.astontech.bo;

import java.util.Date;

public class ClientContact extends BaseBO{

    private int ClientContactId;
    private int ClientId;
    private int EntityTypeId;

    public ClientContact() {}

    public ClientContact(int clientContactId) {
        this.setClientContactId(clientContactId);
    }

    public int getClientContactId() {
        return ClientContactId;
    }
    public void setClientContactId(int clientContactId) {
        ClientContactId = clientContactId;
    }

    public int getClientId() {
        return ClientId;
    }
    public void setClientId(int clientId) {
        ClientId = clientId;
    }

    public int getEntityTypeId() {
        return EntityTypeId;
    }
    public void setEntityTypeId(int entityTypeId) {
        EntityTypeId = entityTypeId;
    }
}
