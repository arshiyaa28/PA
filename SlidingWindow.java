// SLIDING WINDOW
// class Main {
//     public static int maxSum(int[] arr, int k){
//         int windowSum=0;
//         for(int i=0;i<k;i++)
//             windowSum+=arr[i];
            
//             int maxSum=windowSum;
//             for(int i=k;i<arr.length;i++){
//                 windowSum+=arr[i];
//                 windowSum-=arr[i-k];
//                 maxSum=Math.max(maxSum,windowSum);
//             }
//         return maxSum;
//     }
//     public static void main(String[] args) {
//        int[] arr={2,1,5,1,3,2};
//        System.out.print(maxSum(arr,3));
//     }
// }


class Main {
    public static boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    
    public static int maxVowel(String s, int k){
        int vowelCount=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i)))
            vowelCount++;
        }
        int maxVowel=vowelCount;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k)))
            vowelCount--;
            if(isVowel(s.charAt(i)))
            vowelCount++;
            maxVowel=Math.max(maxVowel,vowelCount);
        }
        return maxVowel;
    }
    public static void main(String[] args) {
        String s="abciiidef";
        System.out.print(maxVowel(s,3));
    }
}