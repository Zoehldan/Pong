import java.util.Scanner;
public class sym {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String input=read.nextLine();
        boolean all=false;
        String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean haveCap=false;
        String sym="~!@#$%^&*()_+{}|:<>?`-=[];',./ "+"\"\\";
        boolean haveSym=false;
        for(int i=0; i<input.length(); i++){
            for(int j=0; j<caps.length(); j++){
                if(input.charAt(i)==caps.charAt(j)){
                    haveCap=true;
                }
                for(int k=0; k<sym.length(); k++){
                    if(input.charAt(i)==sym.charAt(k)){
                        haveSym=true;
                    }
                }
            }
        }
        if(haveCap&&haveSym&&input.length()>=8){
            all=true;
        }
        System.out.println(all);
    }
}