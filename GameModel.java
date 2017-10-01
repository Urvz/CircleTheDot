import java.util.*;

public class GameModel{
  public static final int AVAILABLE = 0;
  public static final int SELECTED = 1;
  public static final int DOT = 2;
  Point blue;
  //Point blue;

  int numberOfSteps;
  
  int size ;
  
  Random test = new Random();
  int[][] dotArray;
  
  public GameModel(int size){
    this.size=size;
    dotArray=new int[size][size];
    int x=0;
    for (int i=0;i<size;i++){
      for(int j=0;j<size;j++){
        if(rand(0,9)==9){
          dotArray[j][i]=SELECTED;
          System.out.println(j+" "+i+" "+"SELECTED");
        }
        else{
          dotArray[j][i]=AVAILABLE;
          System.out.println(j+" "+i+" "+"AVAILABLE");
        }
      }
    }

    if ((size%2)==0){
      dotArray[rand((size/2)-1,(size/2))][rand((size/2)-1,(size/2))]=DOT;
    }
    else if ((size%2)==1){
      dotArray[rand((size/2)-1,(size/2)+1)][rand((size/2)-1,(size/2)+1)]=DOT;

    }
  }
  private int rand(int min, int max){
    int randomNumber=test.nextInt((max-min)+1)+min;
    return randomNumber;
  }
  
  public int getCurrentStatus(int i, int j){
    return (dotArray[i][j]);
    
  }
  public int getNumberOfSteps(){
    return(numberOfSteps);
    
  }
  public int getSize(){
    return(size);
  }
  public void select(int i, int j){
    dotArray[i][j]=SELECTED;
    System.out.println (i+","+j+" is now selected.");
    numberOfSteps+=1;
  }
  public void setCurrentDot(int i, int j){
    dotArray[i][j]=DOT;
    blue.reset(i,j);
  }
  public void setAvailable(int i, int j){
    dotArray[i][j]=AVAILABLE;
  }
  public LinkedList<Point>listSelect(){
    LinkedList s = new LinkedList();
    for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
        if(dotArray[i][j]==SELECTED){
          s.add(new Point(i,j));
          
        }
      }
    }
 return(s);

  }
  public Point getCurrentDot(){
    for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
        if(dotArray[i][j]==DOT){
          blue= new Point(i,j);
          
        }
      }
    }
    return blue;

  }
 
}
