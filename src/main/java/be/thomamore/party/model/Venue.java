package be.thomamore.party.model;

public class Venue {
    private String venueName;
private String linkMoreInfo;
private int capacity;
private boolean isFoodProvided;
    private boolean isIndoor;
    private boolean isOutdoor;
    private boolean isFreeParkingavailable;
    private String city;
    private int distanceFromPublicTransportInKm;


    public Venue(String venueName, String linkMoreInfo, int capacity, boolean isFoodProvided, boolean isIndoor, boolean isOutdoor, boolean isFreeParkingavailable, String city, int distanceFromPublicTransportInKm) {
        this.venueName = venueName;
        this.linkMoreInfo = linkMoreInfo;
        this.capacity = capacity;
        this.isFoodProvided = isFoodProvided;
        this.isIndoor = isIndoor;
        this.isOutdoor = isOutdoor;
        this.isFreeParkingavailable = isFreeParkingavailable;
        this.city = city;
        this.distanceFromPublicTransportInKm = distanceFromPublicTransportInKm;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getLinkMoreInfo() {
        return linkMoreInfo;
    }

    public void setLinkMoreInfo(String linkMoreInfo) {
        this.linkMoreInfo = linkMoreInfo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFoodProvided() {
        return isFoodProvided;
    }

    public void setFoodProvided(boolean foodProvided) {
        isFoodProvided = foodProvided;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    public boolean isOutdoor() {
        return isOutdoor;
    }

    public void setOutdoor(boolean outdoor) {
        isOutdoor = outdoor;
    }

    public boolean isFreeParkingavailable() {
        return isFreeParkingavailable;
    }

    public void setFreeParkingavailable(boolean freeParkingavailable) {
        isFreeParkingavailable = freeParkingavailable;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistanceFromPublicTransportInKm() {
        return distanceFromPublicTransportInKm;
    }

    public void setDistanceFromPublicTransportInKm(int distanceFromPublicTransportInKm) {
        this.distanceFromPublicTransportInKm = distanceFromPublicTransportInKm;
    }
}
