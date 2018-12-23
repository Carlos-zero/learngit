package work1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String args[]) throws IOException {
        FileUtil fileUtil=new FileUtil();
        Student[] students=fileUtil.parseStudents("C:"+ File.separator+"work"+File.separator+"students.txt");
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入学号：");
        String num=scanner.next();
        boolean flag=false;
        int[] usenum=new int[18826];
        for (int i=0;i<students.length;i++){
            if (students[i].getStuid().equals(num)){
                System.out.println(students[i].getName());
                students[i].setUsenum();
                usenum[i]=students[i].getUsenum();
                flag=true;
                System.out.println(usenum[i]);
                break;
            }

        }

        if (flag==false){
            System.out.println("该学生不存在");
        }

    }
}
