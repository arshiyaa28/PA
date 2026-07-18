// class Solution {
//     public List<Integer> addToArrayForm(int[] num, int k) {
//         List<Integer> ans=new ArrayList<>();
//         int i=num.length-1;

//         while(i>=0 || k>0){
//             if(i>=0){
//                 k+=num[i];
//                 i--;
//             }
//             ans.add(0, k%10);
//             k/=10;
//         }
//         return ans;
//     }
// }


// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> ans=new ArrayList<>();
//         for(int i=0;i<numRows;i++){
//             List<Integer> row=new ArrayList<>();
//             row.add(1);
//             for(int j=1;j<i;j++){
//                 List<Integer> prev=ans.get(i-1);
//                 row.add(prev.get(j-1)+prev.get(j));
//             }
//             if(i>0) row.add(1);
//             ans.add(row);
//         }
//         return ans;
//     }
// }