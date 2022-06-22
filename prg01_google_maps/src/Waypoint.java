/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Prg01 - Waypoint class
 * Your name(s):
 */

public class Waypoint {

    private double latitude;
    private double longitude;
    private String description;
    private static double TOLERANCE = 0.000001;
    private static final double R = 6372.8; // earth radius in kilometers

    // TODO: set latitude, longitude, and description using the given values
    public Waypoint(double latitude, double longitude, String description) {

    }

    // TODO: implement getters
    public double getLatitude() {
        return 0;
    }

    public double getLongitude() {
        return 0;
    }

    public String getDescription() { return ""; }

    // compute the great-circle distance between two points on a sphere using the haversine formula
    public double distance(final Waypoint other) {
        double dLat = Math.toRadians(latitude - other.latitude);
        double dLon = Math.toRadians(longitude - other.longitude);
        double lat1 = Math.toRadians(latitude);
        double lat2 = Math.toRadians(other.latitude);
        double a = Math.pow(Math.sin(dLat / 2),2) + Math.pow(Math.sin(dLon / 2),2) * Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.asin(Math.sqrt(a));
        return R * c;
    }

    // TODO:  two waypoint objects are considered equal if their correspondent latitude and
    // longitude values are close enough given an accepted tolerance value
    @Override
    public boolean equals(Object obj) {
        return false;
    }

    // TODO: return a string representation of a waypoint using (lat, lon) format
    @Override
    public String toString() {
        return "";
    }
}