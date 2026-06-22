class Solution {
    public boolean isAnagram(String s, String t) {

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        int n = s1.length;
        int m = t1.length;

        if(n!=m) return false;

        HashMap<Character,Integer> sArray = new HashMap<>();
        HashMap<Character,Integer> tArray = new HashMap<>();


        for(char c : s1){
            if(!sArray.containsKey(c)){
                sArray.put(c,0);
            }
             sArray.put(c,sArray.get(c)+1);
        }

        for(char c : t1){
            if(!tArray.containsKey(c)){
                tArray.put(c,0);
            }
             tArray.put(c,tArray.get(c)+1);
        }

        return tArray.equals(sArray);

    }
}

