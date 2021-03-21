package Unfinished_player;
import java.util.TreeMap;
import java.util.Map;
//완성본
class Solution4 {

	public static Object getKey(TreeMap<String, Integer> m, Object value) { //사실 이런거 필요가 없다...keyset으로 구현가능
		for(Object o: m.keySet()) { 
			
			if(m.get(o).equals(value)) { 
				
				
				return o; 
				
			} 
			
		} return null; 
			
	}
	
	
	
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
			
		}
    	answer = (String) getKey(unfinished, 1);
    	    	
        return answer;
    
    }
}

public class player4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []participant = {"mislav", "stanko", "mislav", "ana"};
		String []completion ={"stanko", "ana", "mislav"};
		String []participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String []completion2 ={"josipa", "filipa", "marina", "nikola"};
		Solution4 a = new Solution4();
		 System.out.println(a.solution(participant, completion));
		
	}

}
