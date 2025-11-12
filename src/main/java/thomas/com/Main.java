package thomas.com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }


//        Given an array of ints, return true if 6 appears
//        as either the first or last element in the array. 
//        The array will be length 1 or more.
//
//
//        firstLast6([1, 2, 6]) → true
//        firstLast6([6, 1, 2, 3]) → true
//        firstLast6([13, 6, 1, 2, 3]) → false
        public boolean firstLast6(int[] nums){

            for (int i=0; i< nums.length; i++){
                    if (nums[0] == 6 || nums[nums.length-1] ==6 ){
                        return true;
                    }else {
                        return false;
                    }
            }
        return true;
        }
//
//    Given an array of ints, return true if the array is length 1
//    or more, and the first element and the last element are equal.
//
//
//            sameFirstLast([1, 2, 3]) → false
//    sameFirstLast([1, 2, 3, 1]) → true
//    sameFirstLast([1, 2, 1]) → true

    public boolean sameFirstLast(int[] nums){
            if (nums.length == 0){
                return false;
            }
            return nums[0] == nums[nums.length-1];


    }
}