package day13;

public class q1 {

	public int solution(int A) {
		int count = 0;
		String original = Integer.toString(A);
		String answer = "";
		int middleIndex = original.length()/2;
		String frontDigits = original.substring(0,middleIndex);
		String backDigits = original.substring(middleIndex+1);
		
		while (answer.length() < original.length()) {
			if (count < frontDigits.length()) {
				answer += frontDigits.substring(count, count);
				if (count < backDigits.length()) {
					answer += backDigits.substring(backDigits.length() - count, backDigits.length() - count);
				}
			}
			count ++;
			
		};
		
        // write your code in Java SE 8
		return Integer.parseInt(answer);
    }
	
	public void main(String[] args) {
		System.out.println("hello");
	}
}
