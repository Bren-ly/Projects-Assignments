public class Cage {
  private int length;
  private int width;
  private int height;
  private boolean clean;
  private boolean covered;

  public Cage() {
    // Constructor
  }

  public void setLength(int length) {
    this.length = length;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getLength() {
    return length;
  }

  public int getWidth(){
      return width;
  }
  
  public int getHeight(){
      return height;
  }
  
  public boolean isClean() {
    return clean;
  }

  public boolean isCovered() {
    return covered;
  }
}