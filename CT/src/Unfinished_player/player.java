package Unfinished_player;
//중복이름을 구분 못함
class Solution {
	
    public String solution(String[] participant, String[] completion) {
//        ArrayList<String> unfinished = new ArrayList<String>(); 	
        String unfinished ="";
    	for(int i=0;i<participant.length;i++) {
    		int count=0;
    		unfinished=participant[i];
    		
    		for(int j=0;j<completion.length;j++) {
    			if(unfinished.equals(completion[j])) {
    				unfinished="";
    				break;	
    			}
    			count++;
    		}
    		if(count==completion.length) break;
    	}
    	
    	String answer = unfinished;
    	
        return answer;
    
    }
}
public class player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []participant = {"mislav", "stanko", "mislav", "ana"};
		String []completion ={"stanko", "ana", "mislav"};
		String []participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String []completion2 ={"josipa", "filipa", "marina", "nikola"};
		Solution a = new Solution();
		 System.out.println(a.solution(participant, completion));
		
	}

}
