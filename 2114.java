/*
2114. Maximum Number of WorInput: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
Explanation: 
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.ds Found in Sentences




*/
//code
import java.util.StringTokenizer;
class Solution {
    public int mostWordsFound(String[] sentences) {
        int m=0;
        for(String i:sentences){
            if(count(i)>m){
            m=count(i);
           }
        }
    return m;
    }

public static int count(String sen){
        StringTokenizer tokens=new StringTokenizer(sen);
        //System.out.println(
           return  tokens.countTokens();
    }
}    
