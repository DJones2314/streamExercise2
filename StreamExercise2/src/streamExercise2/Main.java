package streamExercise2;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> myNumbers = Arrays.asList(10, 7, 3, 9, 11);
		
		/*myNumbers.stream().filter(Stream1::onlyPrime).collect(toList()));*/
		
		List<Integer> oddNumbers = myNumbers.stream().filter(primeNumbers -> onlyPrime(primeNumbers)).collect(Collectors.toList());
		
		System.out.println(oddNumbers);
		
	}
	
	public static boolean onlyPrime(int number){
		
		if(number%2==0){
			return false;
		} else {
			return true;
		}
		
	}
	
}
