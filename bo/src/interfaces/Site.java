package interfaces;

public class Site implements ILocation{

    private int conferenceRooms;
    private int offices;
    private int cubicles;
    private int trainingDesks;
    private int coffeeMachines;
    private String siteName;

    //region GETTERS/SETTERS
    public int getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(int conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public int getOffices() {
        return offices;
    }

    public void setOffices(int offices) {
        this.offices = offices;
    }

    public int getCubicles() {
        return cubicles;
    }

    public void setCubicles(int cubicles) {
        this.cubicles = cubicles;
    }

    public int getTrainingDesks() {
        return trainingDesks;
    }

    public void setTrainingDesks(int trainingDesks) {
        this.trainingDesks = trainingDesks;
    }

    public int getCoffeeMachines() {
        return coffeeMachines;
    }

    public void setCoffeeMachines(int coffeeMachines) {
        this.coffeeMachines = coffeeMachines;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }
    //endregion

    public int numberOfWorkspaces(){
        return (this.cubicles + this.offices + this.trainingDesks);
    }

    public boolean canHaveMeetings(){
        if(this.conferenceRooms > 0)
            return true;
        else
            return false;
    }

    public String getLocationName(){
        return this.siteName;
    }

    public boolean hasCoffee(){
        if(this.coffeeMachines > 0)
            return true;
        else
            return false;
    }
}
