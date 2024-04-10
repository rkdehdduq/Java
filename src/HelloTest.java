class Hello {
    String toWhom = "world";
    Hello() { }
    Hello(String whom) { setWhom(whom); }
    void setWhom(String whom) { toWhom = whom; }    
    void sayHello() {
        System.out.println("hello " + toWhom);
    }
} 
public class HelloTest  {
    public static void main (String[] args) { 
        Hello h1 = new Hello();
        Hello h2 = new Hello("홍길동");
        Hello h3 = new Hello("허균");
    
        Hello[] h_arr= new Hello[3];
        h_arr[0] = h1;
        h_arr[1] = h2;
        h_arr[2] = h3;

        for ( int i =0 ; i <3 ; i++ ) {
            h_arr[i].sayHello();
        }
    }
} 
