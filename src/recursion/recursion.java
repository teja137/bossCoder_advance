package recursion;

public class recursion {
public static void main(String[] args) {

// message();
    
recursionCall(1);
}

static void recursionCall(int n){
    if(n == 5){
        System.out.println(n);
        return;
    }
    System.out.println(n);
    recursionCall(n+1);

    // 1. base condition
    // 2. body
    // 3. recursive call
}

static void message(){
    System.out.println("Hello universe!");
    message1();
    System.out.println("Hello universee!");
}
static void message1(){
    System.out.println("Hello universe! 1");
    message2();
    System.out.println("Hello universee! 1");
}
static void message2(){
    System.out.println("Hello universe! 2");
    message3();
    System.out.println("Hello universee! 2");
}
static void message3(){
    System.out.println("Hello universe! 3");
    message4();
    System.out.println("Hello universee! 3");
}
static void message4(){
    System.out.println("Hello universe! 4");
    System.out.println("Hello universee! 4");
}
}
