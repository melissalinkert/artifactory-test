package ome.test;

/** Simple class with a main method that calls ome.test.Ping. */
public class Pong {

  /**
   * Construct a new Pong object.
   * An internal Ping object is created and the lifetime is reported.
   */
  public Pong() {
    Ping p = new Ping();
    System.out.println(p.getLifetime());
  }

  /** Main method; constructs a new Pong object */
  public static void main(String[] args) {
    Pong p = new Pong();
  }

}
