public class APLine
{
  private int a, b, c;
  public APLine(int aa, int bb, int cc){
    a = aa;
    b = bb;
    c = cc;
  }

  public double getSlope(){
    return (-1) * a / (double)b;
  }

  public boolean isOnLine(int x, int y){
    if((x * a + y * b + c) == 0){
      return true;
    }
    return false;
  }
}
