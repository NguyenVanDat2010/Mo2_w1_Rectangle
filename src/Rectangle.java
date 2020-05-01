
public class Rectangle {
    double width,height;

    Rectangle(){
    }

    Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    double getArea(){
        return this.width*this.height;
    }

    double getPerimeter(){
        return 2*(this.width+this.height);
    }

    public String display(){
        return "Rectangle{Width = "+width+", Height = "+height+"}";
    }
}
