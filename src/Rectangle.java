public class Rectangle {
    private double width;
    private double height;
    private int id;
    private static int idGen;
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
        this.id = idGen++;
    }
    public Rectangle(double width, double height) {
        this();
        setWidth(width);
        setHeight(height);
    }
    double getWidthl() {
        return width;
    }
    double getHeight() {
        return height;
    }
    void setWidth(double width) {
        if(width <= 0) {
            throw new IllegalArgumentException("width must be greater than zero");
        }
        else {
            this.width = width;
        }
    }
    void setHeight(double height) {
        if(height <= 0) {
            throw new IllegalArgumentException("height must be greater than zero");
        }
        else {
            this.height = height;
        }
    }
    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2*(width + height);
    }
    public String toString() {
       return ("Rectangle id=" + id + ",width= " + width + ", height=" + height);
    }
}

