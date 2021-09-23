class Point{
    int x; int y;
    void setX( int x){
        this.x = (x> 79 ? 79 : (x < 0 ? 0 : x)); 
    }
    void setY( int y){
        this.y = (y> 79 ? 79 : (y < 0 ? 0 : y));
    }
    int getX(){
        return x;}
    int getY(){
        return y;}
    
}
class PointDemo {
    public static void main(String args[])
    {
        Point p1= new Point();
        p1.setX(-22);
        p1.setY(144);
        System.out.println("the value of x is :"+p1.getX());
        System.out.println("the value of y is :"+p1.getY());
        
    }
}
