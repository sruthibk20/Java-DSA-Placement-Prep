class Solution {
    public int compress(char[] chars) {
        int write=0;
        int i=0;
        while(i<chars.length){
            char current=chars[i];
            int count=0;
            while(i<chars.length && current==chars[i]){
                count++;
                i++;
            }
            chars[write++]=current;
            if(count>1){
                String num= String.valueOf(count);
                for(int j=0;j<num.length();j++){
                    chars[write++] = num.charAt(j);
                }
            }
            

        }
        return write;
    }
}
