
package line;

import java.util.Scanner;

public class point {
  float x;
  float y;
  
  public float getX(){
        return x;
    }
    public void setx(float x1){
        x=x1;
    }
     public float getY(){
        return y;
    }
    public void setY(float y1){
        y=y1;
    }
    public void EmpPoint() {
        x=0;
        y=0;

    }
    
    public void print(point po){
     System.out.println("Th point is ("+po.getX()+","+po.getY()+")");
      }
    public void setPoint()
    {
        Scanner input=new Scanner(System.in);
        float x1;
        float y1;
      System.out.println("Pleas Enter X   ");
      x1=input.nextFloat();
      setx(x1);
      System.out.println("Pleas Enter Y   ");
      y1=input.nextFloat();
      setY(y1);
    }

    
}
