package util;

import java.util.Scanner;

public class InputUtil {
    public static String requireText(String title){
        System.out.println(title);
        Scanner sc=new Scanner(System.in);
        String answer=sc.nextLine();
        return answer;
    }

    public static int requireNumber(String title){
        System.out.println(title);
        Scanner sc=new Scanner(System.in);
        int answer=sc.nextInt();
        return answer;
    }
}
