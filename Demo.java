public class Demo{
public static void main(String[] args){

// A a1=new A();
A a2=new A(12);
}}






class A{
A(){
System.out.println("DC");
}

A(int x)
{
System.out.println("1 arg const");
}
void m3(){
System.out.println("instance");
}
static void m2(){
System.out.println("static");
}
}


