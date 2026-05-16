class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        boolean[] isValid=new boolean[words.length];
        String result="";

        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(word.length() == 1){
                isValid[i]=true;
            }else{
                String prefix=word.substring(0,word.length()-1);
                for(int j=i-1;j>=0;j--){
                    if(words[j].equals(prefix) && isValid[j]){
                        isValid[i]=true;
                        break;
                    }
                }
            }
            if(isValid[i] && word.length()>result.length()){
                result=word;
            }
        }
        return result;
        
    }
}