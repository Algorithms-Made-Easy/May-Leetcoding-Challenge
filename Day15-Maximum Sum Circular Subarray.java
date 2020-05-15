class Solution {
    public int maxSubarraySumCircular(int[] array) {
        int acc = 0;
        int max1 = kadane(array);
        for(int i = 0; i < array.length; i++) {
            acc += array[i];
            array[i] = -array[i];
        }
        int min = kadane(array);
        int max2 = acc + min;
        if(max2 == 0) {
            return max1;
        }
        return Math.max(max1, max2);
    }
    public int kadane(int[] array) {
        int macSum = array[0];
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            macSum = Math.max(macSum+array[i], array[i]);
            max = Math.max(max, macSum);
        }
        return max;
    }
}