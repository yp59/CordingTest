package CT.level1;
import java.util.*;

class Solution2 {
    public int[] solution(int[] numbers) {
    	ArrayList<Integer> store =new ArrayList<Integer>();//numbers의 value 합을 중복포함해서 저장하는 list
    	ArrayList<Integer> result =new ArrayList<Integer>();//중복 제거 후 오름차순으로 정렬한 value를 answer에 넘겨줌

    	int[] answer;
    	int temp =100;// 중복제거시 사용하는 변수 100이하까지만 중복 제거
    	//result.sort(Comparator.naturalOrder())  오름차순 result.sort(Comparator.reverseOrder()) 내림차순
    	for(int i=0;i<numbers.length;i++) { 
    		for(int j=i+1;j<numbers.length;j++)
    			 			store.add(numbers[i]+numbers[j]);//값 더하기 저장
    	}
    	store.sort(Comparator.naturalOrder());//sort를 사용해서 list를 오름차순으로 정렬
    		
    	int[] overlap_remove = new int[store.size()];//배열에서 중복 제거를 하기 위해 객체 생성

    		for(int i=0;i<store.size();i++) {
    			overlap_remove[i]=store.get(i);
    		}
    		
    	for(int i : overlap_remove) { //temp로 최대값을 지정하고 배열의 값이 temp와 다르면 저장한다.
    		
    		if(temp!=i)
    			result.add(i);//미리 오름차순으로 정렬했기 때문에 중복 값만 제거하면서 저장할 수 있다.(treeset을 사용했다면...?)
    			temp=i;
    	}
    	
    	answer=new int[result.size()];
    	
    	for(int i=0;i<result.size();i++)//중복제거+오름차순으로 정렬된 list값들을 answer로 옮겨 return한다.
    	{
    		answer[i]=result.get(i);
    	}
    	
 	return answer; 	
    }

}
public class two_value_plus2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = {2,1,4,5,1};
		int [] test2 = {5,0,2,7};// test용 더미 배열
		
		Solution2 a = new Solution2();
		
		System.out.println(a.solution(test2));
	}

}
