public class Rectangle {
    float length;
    float width;

    public Rectangle() {
        length=0;
        width=0;
    }
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getArea(){
        return this.length * this.width;
    }
    public float getPerimeter(){
        return 2*(this.length + this.width);
    }
    public float getDiagonal(){
        return (float) Math.sqrt((this.length*this.length)+(this.width*this.width));
    }



}
