package Unfinished_player;
import java.util.ArrayList;
class Solution2 {
	//효율성 0점..... 10만명의 마라토너를 모두 비교하기에는 list의 효율이 구리다. 매번 값을 지우고 당기고 해야되서
    public String solution(String[] participant, String[] completion) {
    	ArrayList<String> unfinished = new ArrayList<String>(); 	
    	
    	for(String in : participant) {
    		unfinished.add(in);
    	}
    	
    	for(int i=0;i<completion.length;i++) {
    		
    		int count=0;
    		
    		for(int j=0;j<completion.length;j++) {
    			
    			if(participant[i].equals(completion[j])) {
    				unfinished.remove(0);
    				completion[j]=null;
    				break;	
    			}
    			count++;
    		}
    		if(count==completion.length) break;
    	}
    	
    	String answer = unfinished.get(0);
    	
        return answer;
    
    }
}
public class player2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []participant = {"mislav", "stanko", "mislav", "ana"};
		String []completion ={"stanko", "ana", "mislav"};
		String []participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String []completion2 ={"josipa", "filipa", "marina", "nikola"};
		Solution2 a = new Solution2();
		 System.out.println(a.solution(participant, completion));
		
	}

}
