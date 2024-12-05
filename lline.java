
package line;


public class lline {
    point a1;
    point a2;

    public double lline() {
    
        double dis;
        this.a2 = new point();
        this.a1 = new point();
        a1.EmpPoint();
        a2.EmpPoint();
        a1.setPoint();
        a2.setPoint();
        double b1=a1.getX()-a2.getX();
        double b2=a1.getY()-a2.getY();
         
        dis=Math.sqrt(Math.pow(b1,2.0)+Math.pow(b2,2.0));
        System.out.println("The distance from the two point is   "+dis);
    
    return dis;
}
}
