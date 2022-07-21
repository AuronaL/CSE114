public class mid114 {


    //q4
    // int & String -> compiler error
//    public static String oneOfTwo(){
//        int x = (6/4 == 1)?2:3;
//        return x;
//    }
    public static int oneOfTwo(){
        int x = (6/4 == 1)?2:3;
        return x;
    }
//q6
    public static String encrypt(String str){
        String print ="";
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i)=='y') print+='a';
            else if(str.charAt(i)=='z') print+='b';
            else print+=  (char)(str.charAt(i)+2); // important!!!(char)!!!!!
            // Wrong: str.charAt(i)+'b'(b is a large number not 2);
        }
        return print;
    }

    //q7
    public static void reverse(String str){
        String reverse = "";
        for (int i= str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
    }

    //q8
    public static void genNum(int i){
        // i is the total count of all numbers
        //generate numbers 1 1+2 1+2+3 ....
        int[] array = new int[i];
        //generate
        array[0]=1;
        for(int j=1; j<i; j++){
            array[j]=array[j-1]+(j+1);//list out the number
        }

        //print
        // the count of numbers on every line -> num (i+1)i/2
        int count=0,num=0, line=0;
        while (count<i) {
            while (num < array[line]&&count<i) {
                System.out.print(array[count]+", ");
                num++;
                count++;
            }
            System.out.println();
            line++;
            num = 0;
        }
    }

    //q9
    public static void printHourglass(int num){
        //first line
        for(int i=1;i<=num;i++){
            System.out.print("*");
        }
        System.out.println();
        //num-2 lines
        for(int i=1;i<=num-2;i++){
            int start_index = i+1, end_index = num-i;
            //skip this line as even number repeated the middle line
            if(start_index - end_index == 1 && start_index > end_index){
                continue;
            }
            //element in each line
            for(int j=1;j<=num;j++){
                if(j==start_index || j==end_index){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //last line
        for(int i=1;i<=num;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //mid3
        //q1
        System.out.println((2.0 + 3) + 3);
        //8.0

        //q2
        for (int c = 'A'; c<'F'; c++){
            System.out.print(c + " " );
        }
        // output :65 66 67 68 69

        //q3!!!!!
        double x = (int)2.0;
        double f = (x / (int)3.0);
        System.out.println(f);
        //0.6666666666666666

        //q4
        System.out.println(oneOfTwo());
        //Compiler error

        //Q5
            boolean a = false;
            boolean b = !a;
            boolean c = (25 % 3 == 0 || 2 != 3);
                if (a && !a){
                    if(c)
                        System.out.println("32");
                    else System.out.println("31");
                }
                else if(c || b && a){
                    if(c)
                        System.out.println("30");
                    else System.out.println("29");
                }
                else System.out.println("“28”");

        //q6
        System.out.println(encrypt("abcdefxyz"));
        System.out.println(encrypt("sampletext"));

        //q7
        reverse("The quick brown fox jumps over the lazy dog.");

        //q8
        genNum(4);
        genNum(22);

        //q9
        printHourglass(3);
        printHourglass(6);
    }
}
