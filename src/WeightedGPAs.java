import java.io.File;
import java.util.Scanner;

public class WeightedGPAs {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("gpa.txt"));
        double weighted = 0, unweighted = 0, count = 0;

        while(input.hasNext()){
            String code = input.next();
            double p = input.nextDouble();

            unweighted += p;

            if(code.substring(code.length()-1).equals("A")){
                p += 0.6;
            }
            else if(code.substring(code.length()-1).equals("H")){
                p += 1.2;
            }

            weighted += p;

            count++;
        }

        unweighted = Math.round(unweighted/count * 100) / 100.0;
        weighted = Math.round(weighted/count * 100) / 100.0;
        System.out.println("Unweighted GPA: " + unweighted);
        System.out.println("Weighted GPA: " + weighted);


        
    }
}
