package q1;

public class q1 {

	/*
	 * public String solution(String s) { char c = s.charAt(0); if
	 * (Character.isUpperCase(c)) { // please fix condition return "upper"; } else
	 * if (Character.isLowerCase(c)) { // please fix condition return "lower"; }
	 * else if (Character.isDigit(c)) { // please fix condition return "digit"; }
	 * else { return "other"; } }
	 */

	public static int solution(int A) {
		StringBuilder sb = new StringBuilder();

		int count = 0;
		String original = Integer.toString(A);
		String answer = "";
		int middleIndex = original.length() / 2;
		String frontDigits = original.substring(0, middleIndex);
		System.out.println(frontDigits);
		String backDigits = original.substring(middleIndex);
		sb.append(backDigits);
		System.out.println(sb);
		sb = sb.reverse();
		backDigits = sb.toString();

		while (answer.length() != original.length()) {
			if (count <= frontDigits.length() - 1) {
				answer += frontDigits.substring(count, count + 1);
			}
			if (count <= backDigits.length() - 1) {
				answer += backDigits.substring(count, count + 1);
			}
			count++;

		}
		;

		// write your code in Java SE 8
		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		System.out.println(solution(123));
	}

}
