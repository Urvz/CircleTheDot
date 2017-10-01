import java.util.*;

public class BreadthSearch{
	LinkedList <Point> list= new LinkedList<Point>();
	Point blueDot;
	public BreadthSearch(LinkedList list, Point blueDot){
			this.list=list;
			this.blueDot=blueDot;
		

	}
	public LinkedList<Point>firstTest(LinkedList <Point>point){
		LinkedList <Point> f= new <Point>LinkedList();
		f.addAll(point);
		int x=f.getLast().getX();
		int y=f.getLast().getY();		
		if((point.getLast().getX()+1)%2==0){						
			
			f.addLast(new Point(x-1,y));
		}
		else if((point.getLast().getX()+1)%2!=0){						
			f.addLast(new Point(x-1,y-1));
		}
		return f;
	}
	public LinkedList<Point>secondTest(LinkedList <Point>point){
		LinkedList <Point> f= new <Point>LinkedList();
		f.addAll(point);

		int x=f.getLast().getX();
		int y=f.getLast().getY();
		
		if((point.getLast().getX()+1)%2==0){						
			
			f.add(new Point(x-1,y+1));
			
		}
		else if((point.getLast().getX()+1)%2!=0){						
			
			f.add(new Point(x-1,y));
			
		}
		return f;
	}
	public LinkedList<Point>thirdTest(LinkedList <Point>point){
		LinkedList <Point> f= new <Point>LinkedList();
		f.addAll(point);

		int x=f.getLast().getX();
		int y=f.getLast().getY();
		
		if((point.getLast().getX()+1)%2==0){						
			
			f.add(new Point(x+1,y));
		}
		else if((point.getLast().getX()+1)%2!=0){						
			
			f.add(new Point(x+1,y-1));
		}
		return f;
	}
	public LinkedList<Point>fourthTest(LinkedList <Point>point){
		LinkedList <Point> f= new <Point>LinkedList();
		f.addAll(point);

		int x=f.getLast().getX();
		int y=f.getLast().getY();
		
		if((point.getLast().getX()+1)%2==0){						
			
			f.add(new Point(x+1,y+1));
		}
		else if((point.getLast().getX()+1)%2!=0){						
			
			f.add(new Point(x+1,y));
		}
		return f;
	}
	public LinkedList<Point>fifthTest(LinkedList <Point>point){
		LinkedList <Point> f= new <Point>LinkedList();
		f.addAll(point);

		int x=f.getLast().getX();
		int y=f.getLast().getY();
		
			
			f.add(new Point(x,y-1));
									
		return f;

	}
	public LinkedList<Point>sixthTest(LinkedList <Point>point){
		LinkedList <Point> f= new <Point>LinkedList();
		f.addAll(point);

		int x=f.getLast().getX();
		int y=f.getLast().getY();
		
							
			
			f.add(new Point(x,y+1));
									
		return f;
	}
	
	public Point search(){
		LinkedList <Point> blue= new <Point>LinkedList();
		LinkedList <LinkedList> queue= new <LinkedList>LinkedList();
		
		blue.addLast(blueDot);
		boolean flag = false;
		queue.add(blue);
		Point chosen;
		chosen=null;

		while (!(queue.isEmpty())&&flag==false){
			LinkedList <Point> tmp= new <Point>LinkedList();
			tmp=queue.poll();//temporary linked list of points	
			Point tm;//temporary point	
			
						
										
			if(!(list.contains(firstTest(tmp).getLast()))){
				LinkedList subList=new LinkedList(firstTest(tmp));
				queue.add(subList);
				tm=firstTest(tmp).getLast();
				list.add(tm);
				if (tm.getX()==10||tm.getY()==10||tm.getY()==0||tm.getX()==0){
								flag=true;
								chosen=(Point)subList.get(1);


								return(chosen);
								
				}
				
				
				
			}
			if(!(list.contains(secondTest(tmp).getLast()))){
				
				LinkedList subList=new LinkedList(secondTest(tmp));
				queue.add(subList);
				tm=secondTest(tmp).getLast();
				list.add(tm);
				if (tm.getX()==10||tm.getY()==10||tm.getY()==0||tm.getX()==0){
								flag=true;
								chosen=(Point)subList.get(1);

								return(chosen);
								
				}
				
				
			}
			if(!(list.contains(thirdTest(tmp).getLast()))){
				
				LinkedList subList=new LinkedList(thirdTest(tmp));
				queue.add(subList);
				tm=thirdTest(tmp).getLast();
				list.add(tm);
				if (tm.getX()==10||tm.getY()==10||tm.getY()==0||tm.getX()==0){
								flag=true;
								chosen=(Point)subList.get(1);

								return(chosen);
								
				}
				
				
			}
			if(!(list.contains(fourthTest(tmp).getLast()))){
				
				LinkedList subList=new LinkedList(fourthTest(tmp));
				queue.add(subList);
				tm=fourthTest(tmp).getLast();
				list.add(tm);
				if (tm.getX()==10||tm.getY()==10||tm.getY()==0||tm.getX()==0){
								flag=true;
								chosen=(Point)subList.get(1);

								return(chosen);
								
				}
				
				
			}
			if(!(list.contains(fifthTest(tmp).getLast()))){
				
				LinkedList subList=new LinkedList(fifthTest(tmp));
				queue.add(subList);
				tm=fifthTest(tmp).getLast();
				list.add(tm);
				if (tm.getX()==10||tm.getY()==10||tm.getY()==0||tm.getX()==0){
								flag=true;
								chosen=(Point)subList.get(1);

								return(chosen);
								
				}
				

			}
			if(!(list.contains(sixthTest(tmp).getLast()))){
				
				LinkedList subList=new LinkedList(sixthTest(tmp));
				queue.add(subList);
				tm=sixthTest(tmp).getLast();
				list.add(tm);
				if (tm.getX()==10||tm.getY()==10||tm.getY()==0||tm.getX()==0){
								flag=true;
								chosen=(Point)subList.get(1);

								return(chosen);
								
				}
				
				
			}

			
			

		
	}
	System.out.println(queue);
	
System.out.println(chosen);
return(chosen);

	
	
}
				
		
	
	
}