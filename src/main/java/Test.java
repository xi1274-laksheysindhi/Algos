import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        int[][] arr = {{2,8}, {4,5}, {5,1}};
        mainfuntion(3, 16, arr);
    }

    public static int  mainfuntion(int n, int t, int[][] tasks) {
        int res = 0;
        Set doneIndexes = new HashSet();
        List<int[]> collect = Arrays.stream(tasks).sorted(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        }).collect(Collectors.toList());

        isvalid(collect, t, doneIndexes, 0    , res);
        return res;

    }
        public static int isvalid(List<int[]> tasks, int pendingtime, Set doneIndexes, int prevLocation, int res){

            if(pendingtime<prevLocation){
                return res;
            }
            if(pendingtime>=prevLocation){
                res=Math.max(res,doneIndexes.size());
            }
            if(doneIndexes.size()>=tasks.size()){
                return res;
            }
            if(prevLocation>=tasks.size()-1){
                return res;
            }
            //we can start from any task

            for(int i =0; i < tasks.size(); i++) {
                if(i>=prevLocation && !doneIndexes.contains(i)){
                    int timeElapsed=tasks.get(i)[0]-prevLocation;
                    int timeTofinishTask=timeElapsed+tasks.get(i)[1];
                    doneIndexes.add(i);
                    isvalid(tasks,pendingtime-timeTofinishTask,doneIndexes,i, res);
                    doneIndexes.remove(i);
                }

            }
            return res;
        }

    }






