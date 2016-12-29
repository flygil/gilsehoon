package day15.Quiz;

public class LocationVO implements Comparable<LocationVO> {
	private String location;
	public static LocationVO target;
	private double latitude;
	private double longitude;
	
	public LocationVO (String location, double latitude, double longitude) {
		this.location = location;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	public int compareTo(LocationVO o) {
		return compute(o);
	}
	
	public int compute(LocationVO o) {
		double first = Math.sqrt( Math.pow(target.getLatitude() - this.getLatitude() , 2) + Math.pow(target.getLongitude() - this.getLongitude() , 2) );
		double compare = Math.sqrt( Math.pow(target.getLatitude() - o.getLatitude() , 2) + Math.pow(target.getLongitude() - o.getLongitude() , 2) );
		if (first == compare) return 0;
		return first > compare ? 1 : -1;
	}
	
	public String toString() {
		return getLocation();
	}
	
}
