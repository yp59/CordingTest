package Unfinished_player;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Map;

class Solution5 {

    public String solution(String[] participant, String[] completion) {
    	TreeMap<String, Integer> unfinished = new TreeMap<String,Integer>();
    	String answer="";
    	for(String in : participant) {
    		int val=0;
    		if(unfinished.get(in)==null) {
    			
    			unfinished.put(in, 1);

    		}
    		else {
				val=unfinished.get(in)+1;
				unfinished.put(in, val);
			}

    	}
    	for(String finished : completion) {
			int val=0;
			if(unfinished.containsKey(finished)) {

				val=unfinished.get(finished)-1;
				unfinished.put(finished, val);
			}
			
		}for(String key : unfinished.keySet()) {
			if(unfinished.get(key)==1)
				answer=key;
			
		}
  
    	    	
        return answer;
    
    }
}

public class player5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []participant = {"mislav", "stanko", "mislav", "ana"};
		String []completion ={"stanko", "ana", "mislav"};
		String []participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String []completion2 ={"josipa", "filipa", "marina", "nikola"};
		Solution5 a = new Solution5();
		 System.out.println(a.solution(participant, completion));
		
	}

}
