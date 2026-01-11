/*
349. Intersection of Two Arrays
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.
*/
class IntersectionArr {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> list = new HashSet<>();
        for(int n : nums1) {
            set.add(n);
        }
        for(int n : nums2){
            if(set.contains(n)){
                list.add(n);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}