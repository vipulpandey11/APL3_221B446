/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Voice{
    void prepareVoice(){
        Animal[] animal = new Animal[5];
        animal[0]=new Cow();
        animal[1]=new Goat();
        animal[2]=new Dog();
        animal[3]=new Tiger();
        animal[4]=new Lion();
    }
    void hear(Animal[] animal){
        for(int i=0;i<5;i++){
            animal[i].makeVoice();
        }
    }
}