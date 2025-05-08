/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Application{
    public static void main(String args[]){
        Crow crow = new IndianCrow();
        CrowAdapter crowadapter = new CrowAdapter(crow);
        client(crowadapter);
    }
    public static void client(Swan swan){
        swan.eat();
        swan.swim();
        swan.sing();
    }
}