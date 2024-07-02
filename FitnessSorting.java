import java.util.Arrays;
import java.util.Comparator;

public class FitnessSorting {

    
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    
    public static String sortWeights(String weights) {
        String[] weightsArray = weights.split(" ");
        
        Arrays.sort(weightsArray, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                int sumA = sumOfDigits(Integer.parseInt(a));
                int sumB = sumOfDigits(Integer.parseInt(b));
                
                if (sumA == sumB) {
                    return a.compareTo(b); 
                } else {
                    return Integer.compare(sumA, sumB); 
                }
            }
        });

        return String.join(" ", weightsArray);
    }

    public static void main(String[] args) {
        String weights = "56 65 74 100 99 68 86 180 90";
        String sortedWeights = sortWeights(weights);
        System.out.println("Отсортированные веса:");
        System.out.println(sortedWeights);
    }
}