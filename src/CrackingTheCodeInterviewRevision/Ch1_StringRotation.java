package CrackingTheCodeInterviewRevision;

public class Ch1_StringRotation {

    // ahmed edahm      edahmedahm
    public static  boolean isSubstring(String w1 ,String w2){

        if(w1.length() !=w2.length())
            return false;

        String newSTr = w2+w2;

        int maxLength =0, commonAreaLength =0;

        for (int i = 0, k=0; i < newSTr.length() && k<w1.length(); i++) {
            if(newSTr.charAt(i) == w1.charAt(k)){
                commonAreaLength++;
                k++;
            } else{
                commonAreaLength=0;
                k=0;
            }
            maxLength = Math.max(commonAreaLength,maxLength);
        }
        return w1.length()== maxLength;
    }


    public static void main(String[] args) {
        System.out.println(isSubstring("imiina","inaimi"));

    }
}

