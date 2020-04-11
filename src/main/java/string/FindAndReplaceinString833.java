package string;

public class FindAndReplaceinString833 {

    public static String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        String finalString = S;
        for(int i = 0; i < indexes.length; i++) {
            if(S.indexOf(sources[i], indexes[i]) == indexes[i]) {
                finalString =  finalString.replace(sources[i], targets[i]);
                continue;
            }

        }
        return finalString;
    }

    public static void main(String[] args) {
        String S = "fvokzonyhukpwbnkomdianhirsvdulhsfseaqzktupyeverfsd";
        int[] indexes = {26,30,38,2,41,10,8,44,19,4,13,28,21,35,23,16};
        String[] sources = {"vd","hsfs","ktu","ok","pye","kp","hu","verfs","ia","zon","bnk","ul","nh","aqz","irs","om"};
        String[] targets = {"frs","c","ql","qpir","gwbeve","n"};
        findReplaceString(S, indexes, sources, targets);
    }
}
