package Kuis2.FormulaOne;

public class Driver02 {
    private String driverNumber;
    private String driverName;
    private String teamName;
    private String country;
    private int points;

    public Driver02(String driverNumber, String driverName, String teamName, int points) {
        this.driverNumber = driverNumber;
        this.driverName = driverName;
        this.teamName = teamName;
        this.country = country;
        this.points = points;
    }

    public String getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(String driverNumber) {
        this.driverNumber = driverNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    public void addPoints(int points) {
        this.points += points;
    }
}
