package interfaces;

import com.astontech.bo.Employee;

public class Home implements ILocation {

    private String address;
    private Employee owner;

    //region GETTERS/SETTTERS
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee getOwner() {
        return owner;
    }

    public void setOwner(Employee owner) {
        this.owner = owner;
    }
    //endregion

    @Override
    public int numberOfWorkspaces() {
        return 1;
    }

    @Override
    public boolean canHaveMeetings() {
        return false;
    }

    @Override
    public String getLocationName() {
        return this.owner.getFirstName() + "'s Home";
    }

    @Override
    public boolean hasCoffee() {
        return true;
    }



}
