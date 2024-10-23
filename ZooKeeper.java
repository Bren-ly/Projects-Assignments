public class ZooKeeper {
  private String name;
  private String title;
  private double payRate;
  private boolean degree;

  public ZooKeeper() {
    // Constructor
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setPayRate(double payRate) {
    this.payRate = payRate;
  }

  public void setDegree(boolean degree) {
    this.degree = degree;
  }

  public String getName() {
    return name;
  }

  public String getTitle() {
    return title;
  }

  public double getPayRate() {
    return payRate;
  }

  public boolean hasDegree() {
    return degree;
  }
}