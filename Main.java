import java.util.ArrayList;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  /**
   * @param args
   */
  public static void main(String[] args) {

    // Data structures

    ArrayList<Integer> sumArr = new ArrayList<>();

    sumArr.add(1);
    if (sumArr.contains(1)) {

      System.out.println("Succes!");
    }
  }

  @Override
  public String toString() {
    return "Main []";
  }
}
