/*
* Class Route
*
* 03/04/17
*/
package DirectionModel;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

public class Route {

    private int id;
    private Distance distance;
    private Duration duration;
    private String endAddress;
    private LatLng endLocation;
    private String startAddress;
    private LatLng startLocation;
    private List<LatLng> points;

    public Route () {

    }

    /**
     * Accessor method for id
     * @return int This returns the id
     */
    public int getId() {

        return id;
    }

    /**
     * Mutator method for id
     * @param id
     */
    public void setId(int id) {

        this.id = id;
    }

    /**
     * Accessor method for distance
     * @return Distance This returns a distance object
     */
    public Distance getDistance() {

        return distance;
    }

    /**
     * Mutator method for distance
     * @param distance
     */
    public void setDistance(Distance distance) {

        this.distance = distance;
    }

    /**
     * Accessor method for duration
     * @return Duration This returns a duration object
     */
    public Duration getDuration() {

        return duration;
    }

    /**
     * Mutator method for duration
     * @param duration
     */
    public void setDuration(Duration duration) {

        this.duration = duration;
    }

    /**
     * Accessor method for endAddress
     * @return String This returns the address of the destination
     */
    public String getEndAddress() {

        return endAddress;
    }

    /**
     * Mutator method for endAddress
     * @param endAddress
     */
    public void setEndAddress(String endAddress) {

        this.endAddress = endAddress;
    }

    /**
     * Accessor method for endLocation
     * @return LatLng This returns the latitude and longitude coordinate of the destination
     */
    public LatLng getEndLocation() {

        return endLocation;
    }

    /**
     * Mutator method for endLocation
     * @param endLocation
     */
    public void setEndLocation(LatLng endLocation) {

        this.endLocation = endLocation;
    }

    /**
     * Accessor method for startAddress
     * @return String This returns the address of the source
     */
    public String getStartAddress() {

        return startAddress;
    }

    /**
     * Mutator method for startAddress
     * @param startAddress
     */
    public void setStartAddress(String startAddress) {

        this.startAddress = startAddress;
    }

    /**
     * Accessor method for startLocation
     * @return LatLng This returns the latitude and longitude coordinate of the source
     */
    public LatLng getStartLocation() {

        return startLocation;
    }

    /**
     * Mutator method for startLocation
     * @param startLocation
     */
    public void setStartLocation(LatLng startLocation) {

        this.startLocation = startLocation;
    }

    /**
     * Accessor method for points
     * @return List<LatLng> This returns a list of latitude and longitude coordinates
     * of the route
     */
    public List<LatLng> getPoints() {

        return points;
    }

    /**
     * Mutator method for points
     * @param points
     */
    public void setPoints(List<LatLng> points) {

        this.points = points;
    }

}
