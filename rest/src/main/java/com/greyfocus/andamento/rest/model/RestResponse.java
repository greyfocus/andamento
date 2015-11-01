package com.greyfocus.andamento.rest.model;

import java.util.Date;

/**
 * Model class for a REST response, that provides some standard attributes for each REST endpoint.
 * 
 * @param <T> the type of the enclosed object
 * @author Cristian Vasilache
 *
 */
public class RestResponse<T> {

  /** The status of the call. */
  private Status status;

  /** The server timestamp when the response was returned. */
  private Date timestamp;;

  /** The content object. */
  private T content;

  /**
   * Creates a new instance with the given properties. The current time will be used as a timestamp.
   * 
   * @param status the operation status.
   * @param content the payload content.
   */
  public RestResponse(Status status, T content) {
    this.timestamp = new Date();
    this.status = status;
    this.content = content;
  }

  public Status getStatus() {
    return status;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public T getContent() {
    return content;
  }

  public static enum Status {
    /** Represents a successful response. */
    SUCCESS,

    /** Represents an error response. */
    ERROR
  }
}
