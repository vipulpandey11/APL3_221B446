abstract class Beverage{
    void pour(int qty){
        System.out.println("Pour"+qty+"ml of beverage");
    }
    protected abstract void addCondement();
    protected void stir(){}
    protected void serve(){
        System.out.println("Serve through waiter");
    }
    public void templateMethod(int qty){
        pour(qty);
        addCondement();
        stir();
        serve();
    }
}
