import java.util.ArrayList;
import java.util.List;
public class removeelemen
{
  public static void main(String args[])
  {
List<Integer> a1=new ArrayList<>();
    a1.add(15);
    a1.add(16);
    a1.add(17);
    a1.add(22);
    a1.add(1);
    a1.add(2);
    System.out.println(a1);
    a1.remove(1);
    a1.remove(2);
    System.out.println(a1);
  }
}
