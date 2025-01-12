public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "{" + this.x + ";" + this.y + "}";
    }

    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
}
