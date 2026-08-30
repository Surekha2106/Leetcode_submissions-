class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)>1){
                 list.add(key);
            }
        }
        return list;
    }
}