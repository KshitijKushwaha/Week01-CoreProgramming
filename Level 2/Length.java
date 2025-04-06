import java.util.*;

class Length{
	
	public static int findLength(String word){
		int count = 0;
		try{
			while(true){
				word.charAt(count);
				count++;
			}
		}catch(RuntimeException e){
			return count;
		}
	}
	
	public static void main(String args[]){
		Scanner sn = new Scanner(System.in);
		
		String word = sn.next();
		
		int res = findLength(word);
		System.out.println("The length of word " +word+" is: "+res);
            sn.close();
	}
}

