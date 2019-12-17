package com.astontech.bo;

import java.util.Date;

public class Client extends BaseBO{
    //region PROPERTIES
    private int ClientId;
    private String ClientName;
    private Date CreateDate;
    //endregion

    //region CONSTRUCTORS
    public Client() {}

    public Client(int clientId) {
        this.setClientId(clientId);
    }
    //endregion

    //region GETTERS/SETTERS
    public int getClientId() {
        return ClientId;
    }
    public void setClientId(int clientId) {
        ClientId = clientId;
    }

    public String getClientName() {
        return ClientName;
    }
    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    public Date getCreateDate() {
        return CreateDate;
    }
    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }
    //endregion
}
