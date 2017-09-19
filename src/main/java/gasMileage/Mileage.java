package gasMileage;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Mileage {

    public static List<Mileage> allMileageEntries = new LinkedList();

    private long latitude;
    private long longitude;
    private float mileage;
    private Date timestamp;

    public Mileage(){
        latitude = 0;
        longitude = 0;
        mileage = 0f;
        timestamp = Calendar.getInstance().getTime();
    }

    public Mileage(long latitude, long longitude, float mileage){
        this.latitude = latitude;
        this.longitude = longitude;
        this.mileage = mileage;
    }

    public float getMileage() {
        return mileage;
    }

    public long getLatitude() {
        return latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}
