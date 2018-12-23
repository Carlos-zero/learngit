package work4;

public class test {
    public static void main(String args[]){
        String s=new String("{\"test\":[{\"test\":\"sdf\"},{\"test\":\"sdf\"},{\"test\":\"sdf\"}]}\n");
        char[] chars=s.toCharArray();
        char[] ch=new char[chars.length];
        int b=0;
        for (int i=0;i<chars.length;i++){
            if (chars[i]=='{'||chars[i]=='}'||chars[i]=='['||chars[i]==']') {
                ch[b]=chars[i];
                b++;
            }
        }
        for (int a=0;a<ch.length;a++) {
            System.out.print(ch[a]);
        }
        System.out.println();
        boolean flag=false;

        for (int a=0;a<b;a++){
            flag=false;
            if (ch[a]=='{'){
                if (ch[b-1]=='}'){
                    b--;
                    flag=true;
                }else {
                    System.out.println("非法");
                    break;
                }
            }
            if (ch[a]=='}'){
                if (ch[b-1]=='{'){
                    b--;
                    flag=true;
                }else {
                    System.out.println("非法");
                    break;
                }
            }
            if(ch[a]=='['){
                if (ch[b-1]==']'){
                    b--;
                    flag=true;
                }else {
                    System.out.println("非法");
                    break;
                }
            }
            if(ch[a]==']'){
                if (ch[b-1]=='['){
                    b--;
                    flag=true;
                }else {
                    System.out.println("非法");
                    break;
                }
            }
        }
            if (flag){
            System.out.println("合法");
        }

    }

}
