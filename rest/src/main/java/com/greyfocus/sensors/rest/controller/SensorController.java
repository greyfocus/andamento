package com.greyfocus.sensors.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.greyfocus.sensors.model.Sensor;
import com.greyfocus.sensors.rest.model.RestResponse;
import com.greyfocus.sensors.rest.model.RestResponse.Status;

@RestController
@RequestMapping("/sensor")
public class SensorController {

  private static final Logger LOG = LoggerFactory.getLogger(SensorController.class);

  @RequestMapping(value = "{sensorId}/reading", method = RequestMethod.POST)
  public RestResponse<String> saveReading(@PathVariable String sensorId) {
    LOG.info("got value for sensor " + sensorId);

    return new RestResponse<String>(Status.SUCCESS, "Success!");
  }

  @RequestMapping(value = "{sensorId}", method = RequestMethod.GET)
  public RestResponse<Sensor> retrieveLastSensorValue() {
    Sensor sensor = new Sensor("sensor-123", "Hello world");
    return new RestResponse<Sensor>(Status.SUCCESS, sensor);
  }
}
