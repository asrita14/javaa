interface Shape
{
    float areaMethod(float a);
    float periMethod(float b);
    float PI = 3.14f;
        
}
class Square implements Shape
{
    public float areaMethod(float a){
        return(a*a);
    }
    public float periMethod(float b){
        return(4*b);
    }
   
}
class Circle implements Shape
{
    public float areaMethod(float r){
        return(PI*r*r);
    }
    public float periMethod(float s){
        return(2*PI*s);
    }
  
}
class MainClass{
     public static void main(String args[])
     {
         Square obj1 = new Square();
         System.out.println(obj1.areaMethod(5));
         System.out.println(obj1.periMethod(5));
       
         Circle obj2 = new Circle();
         System.out.println(obj2.areaMethod(1));
         System.out.println(obj2.periMethod(1));
       
         
     }

}