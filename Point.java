public class Point{
	int x=0;
	int y=0;
	public Point(int x, int y){
		this.x=x;
		this.y=y;

	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void reset(int x, int y){
		this.x=x;
		this.y=y;
	}
	public String toString(){
		return(this.x+","+this.y);
	}
	public boolean equals(Object o) {
    if (o == null) {
        return false;
    }
    if (!(o instanceof Point)) {
        return false;
    }
    return (x == ((Point) o).x && y == ((Point) o).y);
}
		
}