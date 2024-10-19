public class Lomanaya {
    private Point[] points;

    public Lomanaya (Point[] points) {
        this.points = points;
    }

    public Lomanaya () {
        this(null);
    }

    public String toString() {
        StringBuilder outputBuild = new StringBuilder();
        outputBuild.append("Линия [");
        for (Point p : points) {
            outputBuild.append(p);
            outputBuild.append(", ");
        }
        if (outputBuild.length() == 7) outputBuild.append("]");
        else outputBuild.replace(outputBuild.length()-2, outputBuild.length(), "]"); // Убираем последнюю запятую и закрываем скобки []
        String output = outputBuild.toString();
        return output;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public void addPoints(Point[] newPoints) {
        Point[] resultPoints = new Point[points.length + newPoints.length];
        for (int i = 0; i < points.length; i++) resultPoints[i] = points[i];
        for (int i = 0; i < newPoints.length; i++) resultPoints[i+points.length] = newPoints[i];
        this.points = resultPoints;
    }

    public void movePoint(int index, int newX, int newY) {
        points[index-1].move(newX, newY);
    }

    public int getLength() {
        return points.length;
    }
}
