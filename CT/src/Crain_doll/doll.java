package Crain_doll;

import java.util.Stack;

	class Solution {
	    public int solution(int[][] board, int[] moves) {// 보드판 최소5x5 30x30까지 용량 제한 moves는 보드판 열과 같음.
	        
	        Stack<Integer> box = new Stack<Integer>(); //뽑은 인형을 저장하는 박스
	        int answer = 0; //같은 인형끼리 맞닿아 사라진 인형의 갯수
	   

	        for(int position=0;position<moves.length;position++){ 
	        
	            int y = moves[position]-1;//moves의 value 값 만큼 y좌표 이동 
	            
	         for(int x=0;x<board.length;x++){ // 보드의 행 갯수만큼 반복한다. 이유는 어떤 행에서 값이 0일경우 아래 행의 인형을 뽑기위함
	             
	        	 if(board[x][y]==0) continue; //인형이 없을 경우 아래행의 인형을 뽑기위한 점프
	             
	             else{
	                  box.push(board[x][y]);//인형이 있을경우(value가 있는경우) 그 값을 box에 push하고 빈칸(0)으로 채운다.
	                  board[x][y]=0;
	                  break;

	             }
	             
	         
	         }
	         if(box.size()>1) { //box 사이즈가 2이상인 경우만 위아래로 같은 인형을 비교할 수 있음

			int constrast = box.pop(); // 제일 윗칸의 인형을 꺼내서
			if(box.peek()==constrast) {// 그다음 인형과 같은지 확인한다.
	     	box.pop(); //맞으면 아래 인형도 뽑아서 없어짐
	     	answer+=2; 
	         }
			else box.push(constrast);// 같은 인형이 아니라면 꺼냈던 인형을 다시 넣어둔다.
	        
	         
	        }
	         
	         
	        }
	        return answer;
	      
	    }
	
	}
	public class doll {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Solution a = new Solution();
			int [][] testboard = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};// 테스트 보드
			int [] testmoves = {1,5,3,5,1,2,1,4}; //테스트 무브
			System.out.println(a.solution(testboard, testmoves));
			
		}
	}