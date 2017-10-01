import java.util.Random;

public class GameModel{
	public static final int	AVAILABLE = 0;
	public static final int SELECTED = 1;
	public static final int DOT = 2;
	Point blue;

	int numberOfSteps;
	
	int size ;
	
	Random test = new Random();
	int[] dotArray;
	int[][] secondDotArray;
	
	public GameModel(int size){
		this.size=size;
		secondDotArray=new int[size][size];
		int x=0;
		for (int j=0;j<size;j++){
			for(int i=0;i<size;i++){
				if(rand(0,9)==9){
					secondDotArray[i][j]=SELECTED;
					System.out.println(i+" "+j+" "+"SELECTED");
				}
				else{
					secondDotArray[i][j]=AVAILABLE;
					System.out.println(i+" "+j+" "+"AVAILABLE");
				}
			}
		}
		
		
		
	}
	//private Point getCurrentDot{

	//}
	
	private int rand(int min, int max){
		int randomNumber=test.nextInt((max-min)+1)+min;
		return randomNumber;
	}
	
	public int getCurrentStatus(int i, int j){
		return (secondDotArray[i][j]);
		
	}
	public int getNumberOfSteps(){
		return(numberOfSteps);
		
	}
	public int getSize(){
		return(size);
	}
	public void select(int i, int j){
		secondDotArray[i][j]=SELECTED;
		numberOfSteps+=1;

	}
	public void setCurrentDot(int i, int j){
		secondDotArray[i][j]=DOT;


	}

	public static void main(String[]args){

		GameModel model = new GameModel(4);
		//for (int i=0;i<model.dotArray.length;i++){
		//	System.out.println(model.dotArray[i]);
		//}
		//DotButton h = new DotButton(1,2,0);
		//System.out.println(h.icons[0]);
		

		
	}
}