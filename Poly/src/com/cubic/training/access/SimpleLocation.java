package com.cubic.training.access;

public class SimpleLocation
{
  public double latitude;
  public double longitude;
  
  public SimpleLocation(double lat, double lon)
  {
    this.latitude = lat;
    this.longitude = lon;
  }
  void getDist(){
	  
  }
  public double distance(SimpleLocation otter){
	  return getDist(this.latitude, this.longitude,
			  otter.latitude, otter.longitude);
  }

}
