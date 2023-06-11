public class Test{
  public static void main(String[] args){
    DoubleLinkList<Integer> nums = new DoubleLinkList<Integer>();
    nums.add(100);
    nums.add(2);
    nums.add(4);
    System.out.println("Esta vacio? " + nums.isEmpty());
    System.out.println("Elementos " + nums);
  }
}
