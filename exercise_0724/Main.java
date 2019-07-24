package exercise.exercise_0724;

/*
乒乓球筐
 */
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            char[] A = in.next().toCharArray();
            char[] B = in.next().toCharArray();
            int[] a = new int[26];
            int[] b = new int[26];
            for(int i=0; i<A.length; i++){
                a[A[i]-'A']++;
            }
            for(int i=0; i<B.length; i++){
                b[B[i]-'A']++;
            }
            int j=0;
            for(; j<26; j++){
                if(b[j]>a[j]){
                    break;
                }
            }
            if(j==26){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}*/

/*
查找兄弟单词
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            String[] strs = new String[n];
            String[] tmp = new String[n];
            for(int i=0; i<n; i++){
                strs[i] = in.next();
                char[] t = strs[i].toCharArray();
                Arrays.sort(t);
                tmp[i] = String.valueOf(t);
            }
            String str = in.next();
            char[] t = str.toCharArray();
            Arrays.sort(t);
            String str1 = String.valueOf(t);
            int m = in.nextInt();
            int count = 0;
            List<String> list = new ArrayList<>();
            for(int i=0;i<n; i++){
                if(str1.equals(tmp[i]) && !str.equals(strs[i])){
                    count++;
                    list.add(strs[i]);
                }
            }
            Collections.sort(list);
            System.out.println(count);
            if(m <= list.size()){
                System.out.println(list.get(m-1));
            }
        }
    }
}