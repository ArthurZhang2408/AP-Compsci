import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Question 1
        ArrayList<String> words = new ArrayList<String>();
        words.add("Why");
        words.add("do");
        words.add("we");
        words.add("fall");
        words.add("Bruce?");
        words.add("So");
        words.add("we");
        words.add("can");
        words.add("learn");
        words.add("to");
        words.add("pick");
        words.add("ourselves");
        words.add("up");
        System.out.println("List forwards reads: " + words);
        System.out.println("List backward reads: " + reverse(words));

        //Question 2
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add( (int) (Math.random()*100) );
        }

        System.out.println("Our list before: " + nums);
        removeSmallest(nums);
        System.out.println("Our list after:  " + nums);

        //Question 3
        ArrayList<Integer> numsB = new ArrayList<Integer>();
        numsB.add(1);
        numsB.add(1);
        numsB.add(2);
        numsB.add(2);
        numsB.add(2);
        numsB.add(2);
        numsB.add(3);
        numsB.add(3);
        numsB.add(1);
        System.out.println("Our list before: " + numsB);
        removeConsecutives(numsB);
        System.out.println("Our list after:  " + numsB);
        //should output [1,2,3,1]

        //Question 4
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(2);
        list2.add(4);
        System.out.println("The list before: " + list1);
        filter(list1,list2);
        System.out.println("The list after:  " + list1);
        //the list after should be [1,3]
    }

    public static ArrayList<String> reverse( ArrayList<String> myList ) {
        //This method takes an ArrayList<String> as a parameter and returns
        //a new ArrayList<String> in which the elements are stored in reverse
        //order.  The original list should remain unchanged.
        ArrayList<String> ret = new ArrayList<>();
        for (String s : myList){
            ret.add(0, s);
        }
        return ret;
    }

    public static void removeSmallest(ArrayList<Integer> nums) {
        //This method removes the smallest number in the list nums
        if (nums.size()>0){
            int smallest = nums.get(0);
            int sI = 0;
            for (int i = 0; i < nums.size(); i ++){
                if (nums.get(i)<smallest){
                    smallest=nums.get(i);sI=i;
                }
            }nums.remove(sI);
        }
    }

    public static void removeConsecutives(ArrayList<Integer> nums) {
        //This method removes consecutive duplicate values from the
        //list nums.  Hint: loop backwards through the list
        for (int i = nums.size()-1; i>0; i--){
            if (nums.get(i - 1).equals(nums.get(i))){
                nums.remove(i);
            }
        }
    }

    public static void filter(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        //This method removes all the elements in list1 that also appear in list2
        list1.removeIf(list2::contains);
    }
}