package Unfinished_player;
import java.util.TreeMap;
import java.util.Map;
class Solution3 {

	public static Object getKey(TreeMap<Integer, String> m, Object value) { 
		for(Object o: m.keySet()) { 
			
			if(m.get(o).equals(value)) { 
				
				
				return o; 
				
			} 
			
		} return null; 
			
	}

    public String solution(String[] participant, String[] completion) {
    	TreeMap finished = new TreeMap();
    	
    	String answer = "" ;
    	for(int i=0;i<participant.length;i++) { 		
    			finished.put(i, completion[i]);
    	}
    	    	for(int i=0;i<participant.length;i++) {
    	    		
    		if(finished.containsValue(participant[i])) {
    			
    			Object index=getKey(finished, participant[i]);
    			finished.remove(index);
    		}
    		else {
    			answer = participant[i];
    			 break;
    		}
    		
    	}
        return answer;
    
    }
}

public class player3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []participant = {"mislav", "stanko", "mislav", "ana"};
		String []completion ={"stanko", "ana", "mislav"};
		String []participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String []completion2 ={"josipa", "filipa", "marina", "nikola"};
		Solution3 a = new Solution3();
		 System.out.println(a.solution(participant, completion));
		
	}

}
