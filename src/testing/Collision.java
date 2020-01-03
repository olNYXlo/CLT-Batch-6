package testing;

public class Collision {

	public static void main(String[] args) {
		
		float distTravelledByA = 0;
		float distTravelledByB = 0;
		int count = 0;
		float totalTime = 0;
		while (distTravelledByA <20){
			float time = (20 - distTravelledByA) / 140;
			distTravelledByA += (40*time);
			distTravelledByB += (100*time);
			totalTime += time*2;
			count ++;
			System.out.println("Collided " + count + " times");
			System.out.println("Collided when A travels " + distTravelledByA + " km");
			System.out.println("Time taken :" + time);
			System.out.println("Total Time taken : " + totalTime + " hrs");
			distTravelledByA += (40*time);
			distTravelledByB -= (100*time);
			
		}

	}
}
