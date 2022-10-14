public class CarCreditManager implements ICreditManager{
    @Override
    public void calculate(){
        System.out.println("araba kredisi hesaplandi");
    }
    @Override
    public void save(){
        System.out.println("kaydedildi");
    }


}
