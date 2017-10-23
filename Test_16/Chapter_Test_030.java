/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_16;

/**
 * @author up
 *
 */
import java.util.*;

public class Chapter_Test_030 {
	public static void main(String[] args){
		for(int i = 10; i <= 80; i++){
			int result = 0;
			int x = (int)(i / 2);
			int y = (int)(i / 2);
			for(int j = 0; j < 10000; j++){
				result += avoidRandomWalks(x, y, i);
			}
			System.out.println("For a lattice of size " + i + ", the probability of dead-end paths is " + (result / 100.0) + "%");
		}
	}
	
	public static int avoidRandomWalks(int X, int Y, int end){
		Point_030 root = new Point_030(X, Y);
		while(!(root.getX(root.getSize() - 1) == 0 || root.getX(root.getSize() - 1) ==  end||
				root.getY(root.getSize() - 1) == 0 || root.getY(root.getSize() - 1) == end ||
				(root.contains(root.getX(root.getSize() - 1) + 1, root.getY(root.getSize() - 1)) &&
				root.contains(root.getX(root.getSize() - 1) - 1, root.getY(root.getSize() - 1)) &&
				root.contains(root.getX(root.getSize() - 1), root.getY(root.getSize() - 1) + 1) &&
				root.contains(root.getX(root.getSize() - 1), root.getY(root.getSize() - 1) - 1)))){
			int xFlag = Math.random() > 0.5 ? 1 : 0;
			int yFlag = Math.random() > 0.5 ? 1 : 0;
			
			int t = root.getSize();
			
			if(xFlag == 1){
				if(yFlag == 1){
					if(root.contains(root.getX(t - 1), root.getY(t - 1) + 1)){
						
					}else{
						root.addX(root.getX(t - 1));
						root.addY(root.getY(t - 1) + 1);
					}
				}else{
					if(root.contains(root.getX(t - 1), root.getY(t - 1) - 1)){
						
					}else{
						root.addX(root.getX(t - 1));
						root.addY(root.getY(t - 1) - 1);
					}
				}
			}else{
				if(yFlag == 1){
					if(root.contains(root.getX(t - 1) + 1, root.getY(t - 1))){
						
					}else{
						root.addX(root.getX(t - 1) + 1);
						root.addY(root.getY(t - 1));
					}
				}else{
					if(root.contains(root.getX(t - 1) - 1, root.getY(t - 1))){
						
					}else{
						root.addX(root.getX(t - 1) - 1);
						root.addY(root.getY(t - 1));
					}
				}
			}
		}
		
		if((root.getX(root.getSize() - 1) == 0 || root.getX(root.getSize() - 1) ==  end||
				root.getY(root.getSize() - 1) == 0 || root.getY(root.getSize() - 1) == end)){
			return 0;
		}else{
			return 1;
		}
	}

}

class Point_030{
	ArrayList listX = new ArrayList();
	ArrayList listY = new ArrayList();
	int size;
	
	public Point_030(int X, int Y){
		listX.add(X);
		listY.add(Y);
	}
	
	public void addX(int X){
		listX.add(X);
	}
	
	public void addY(int Y){
		listY.add(Y);
	}
	
	public int getX(int index){
		int X = (int)listX.get(index);
		return X;
	}
	
	public int getY(int index){
		int Y = (int)listY.get(index);
		return Y;
	}
	
	public int getSize(){
		if(listX.size() != listY.size()){
			System.out.println("The procedure has an error");
			System.exit(0);
		}else{
			size = listX.size();
		}
		
		return size;
	}
	
	public boolean contains(int X, int Y){
		int size = this.getSize();
		for(int i = 0; i < size; i++){
			if(X == this.getX(i) && Y == this.getY(i)){
				return true;
			}
		}
		
		return false;
	}
}
