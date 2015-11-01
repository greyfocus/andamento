package com.greyfocus.sensors.model;

/**
 * Represents a real life sensor.
 * 
 * @author Cristian Vasilache
 *
 */
public class Sensor {

  private String id;

  private String name;

  /**
   * Default constructor.
   */
  public Sensor() {
    // No implementation needed.
  }

  /**
   * Creates a sensor object with the given attributes.
   * 
   * @param id the sensor ID.
   * @param name the name of the sensor.
   */
  public Sensor(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
