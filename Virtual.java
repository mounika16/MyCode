class Shape{
    public void area(){
       System.out.println("This is Area");
    }
}

class Triangle extends Shape{
     public void area(){
          System.out.println("This is Triangle Area");
     }
}

class Rectangle extends Shape{
     public void area(){
          System.out.println("This is Rectangle Area");
     }
}

class Square extends Shape{
     public void area(){
          System.out.println("This is Square Area");
     }
}

public class Virtual{
     public void showArea(Shape obj){
            obj.area();
     }
     public static void main(String ma[]){
           String ip=ma[0].toLowerCase();
           Shape shape;
           Virtual v=new Virtual();
           switch(ip){
                 case "square":shape=new Square();
	                     break;
                 case "triangle":shape=new Triangle();
                                       break;
                 case "rectangle":shape=new Rectangle();
                                        break;
                 default:shape=new Shape();
           }
           v.showArea(shape);     
     }
}