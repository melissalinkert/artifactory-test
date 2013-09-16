package ome.test;

/** Simple class that measures the lifetime of instantiated objects. */
public class Ping {

  /** Time in milliseconds when this object was instantiated. */
  private long startTime;

  /**
   * Create a new Ping object.
   */
  public Ping() {
    startTime = System.currentTimeMillis();
  }

  /** Return the number of milliseconds since this object was instantiated. */
  public long getLifetime() {
    return System.currentTimeMillis() - startTime;
  }

}
