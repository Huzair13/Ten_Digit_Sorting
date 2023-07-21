import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size=scanner.nextInt();

        List<Integer> list=new ArrayList<>();
        System.out.println("Enter the array Elements");
        for(int i=0;i<size;i++) {
            list.add(scanner.nextInt());
        }

        //created instances for tenscomparator class
        Collections.sort(list,new tensComparator());

        System.out.println(list);

    }
}

//tensComparator implements Comparator and overrides compare method
class tensComparator implements Comparator<Integer>{
    public int compare(Integer num1,Integer num2){
        int tens1=(num1/10)%10;
        int tens2=(num2/10)%10;
        if(tens1==tens2){
            return Integer.compare(num2,num1);
        }

        return Integer.compare(tens1,tens2);
    }
}