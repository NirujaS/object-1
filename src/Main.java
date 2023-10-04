public class Main {
    public static void main(String[] args) {
        // Create an instance of the 'Area' class
        Area rectangle = new Area();

        // Set the dimensions of the rectangle
        double length = 5.0;
        double breadth = 10.0;
        rectangle.setDim(length, breadth);

        // Calculate and print the area of the rectangle
        double area = rectangle.getArea();
        System.out.println("Area of the rectangle with length " + length + " and breadth " + breadth + " is: " + area);
    }
}