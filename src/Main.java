import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class klass = new Class(2,"IPS",new int[]{15,69,95});
        System.out.println(klass.getNumber()+"\n"+klass.getSoz()+"\n"+ Arrays.toString(klass.getArray()));

    }
}