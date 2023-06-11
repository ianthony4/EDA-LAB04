public class Test{
  public static void main(String[] args){
    DoubleLinkList<Integer> nums = generarPeorCaso(10);
    System.out.println("Elementos " + nums);
    System.out.println("Elementos " + nums);
  }
  public static DoubleLinkList<Integer> generarPeorCaso(int t) {
    DoubleLinkList<Integer> nums = new DoubleLinkList<Integer>();
    for (int i = 0; i < t; i++) {
      nums.add(t-i);
    }
    return nums;
  }
}
