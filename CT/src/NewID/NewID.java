package NewID;

import java.util.ArrayList;
class Solution {
    public String solution(String new_id) {
    	String answer="";
    	//1 sol : tolowercase를 사용해서 저장하면 된다.ㅇ
    	String word = new_id.toLowerCase();

    	//2.알파벳소문자,숫자,.,-,_를 제외한 나머지를 지운다 ㅇ
    	word=word.replaceAll("[^a-z0-9-_.]","");//[^]안에 ^있으면 제외한 나머지를 뜻한다
    	
    	//3	 .이 두번 이상 연속된 부분을 .으로 
    	word=word.replaceAll("[.]+", ".");//+하나 이상 있는 경우를 찾는다
    
    	//4. .이 맨앞 or 맨뒤에 있을경우 제거 ㅇ
    	
    	word=word.replaceAll("^[.]|[.]$","");
//    	if(word.charAt(0)=='.')word=word.substring(1);
//    	if(word.charAt(word.length()-1)=='.')word=word.substring(0, word.length()-1);	
    	
    	//5.빈 문자열이면 a삽입 ㅇ
    	if(word.equals("")) word="a";
    	
    	//6.16자 이상이면 15까지 남기고 날린다 날리고 마지막 문자열이.이면 그것도 날린다.
    	if(word.length()>15) {
    		word=word.substring(0, 15);
    		word=word.replaceAll("[.]$","");
    	}
    	//7.2자이하라면 마지막 문자를 반복해서 3자로 만든다.
    	while(word.length()<=2) {
    		
    		word+=word.substring(word.length()-1);    		
    	}
    	
        return answer=word;
    }
}


public class NewID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		String test ="=.=";
		
		Solution a = new Solution();
		System.out.println(a.solution(test));
	/*	word.charAt(i)!='-'||
    			word.charAt(i)!='_'||
    			word.charAt(i)!='.'||
    			!(word.charAt(i)>='0'&&
    			word.charAt(i)<='9')
		*/
	}

}
