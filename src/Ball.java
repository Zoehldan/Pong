import java.awt.*;

public class Ball {
    private int x, y;
    private final int DIAMETER=20;
    private final int SPEED=7;
    double dx=SPEED, dy=SPEED;
    Board board;
    public Ball(Board board){
        x=0;
        y=0;
        //"this" keyword references the object that is executing or calling the this reference
        this.board=board;
    }
    public void setPosition(int x, int y){
        this.x=x-DIAMETER/2;
        this.y=y-DIAMETER/2;
    }
    public Rectangle getBounds(){
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }
    double MAXANGLE=5*Math.PI/12;
    public void checkCollisions(Paddle other){
        if(getBounds().intersects(other.getBounds())){
            if(x<board.getWIDTH()/2){
                dx*=-1;
            }
            if(x>board.getWIDTH()/2){
                dx=-1;
            }
        }
    }
    public void move(){
        //LEFT AND RIGHT
        if(x<=0){
            board.setcScore(board.getcScore()+1);
            dx*=-1;
        }
        if(x+DIAMETER>=board.getWIDTH()){
            board.setpScore(board.getpScore()+1);
            dx*=-1;
        }
        if(y<=0||y+DIAMETER>=board.getHEIGHT()){
            dy*=-1;
        }
        x+=dx;
        y+=dy;
    }
    public void paint(Graphics g){
        g.fillOval(x, y, DIAMETER, DIAMETER);
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getDiam() {
        return DIAMETER;
    }
}
