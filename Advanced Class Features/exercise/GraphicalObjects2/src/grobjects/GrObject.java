package grobjects;

/**
 * GrObject
 *
 * @author Zdenek Tronicek
 */
public abstract class GrObject {

    protected int x;
    protected int y;

    public GrObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();

    public abstract void hide();

    public void move(int dx, int dy) {
        hide();
        x += dx;
        y += dy;
        draw();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
