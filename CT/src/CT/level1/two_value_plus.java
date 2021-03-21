package CT.level1;
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
    	TreeSet<Integer> store = new TreeSet<Integer>();	
    	int index=0;
    	for(int i=0;i<numbers.length;i++) {
    		
    		for(int j=i+1;j<numbers.length;j++)
    			
    			store.add(numbers[i]+numbers[j]);

    	}
    	Iterator result =store.iterator();    	
    	int[] answer= new int[store.size()];
    	
    	while(result.hasNext()) {
    		
    		int x=(int)result.next();
    		answer[index]=x;
    		index++;
    	}
    	
    	
 	return answer; 	
    }

}
public class two_value_plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = {2,1,4,5,1};
		int [] test2 = {5,0,2,7};// test용 더미 배열
		
		Solution a = new Solution();
		
	}

}
