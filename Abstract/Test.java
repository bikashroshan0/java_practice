package Abstract;

public class Test implements Car, CarRule {

    public static void main(String[] args) {
  

        // Hdfc hdfcBank = new Hdfc();
        // hdfcBank.credit();
        // hdfcBank.debit();
        // hdfcBank.loan();
        // hdfcBank.hdfcMethod(); // This method is only allowed for object which is
        // created with refrence
        // variable of the hdfc bank

        // Bank bank = new Hdfc();
        // bank.credit();
        // bank.debit();
        // bank.loan();

        BMW bmw = new BMW();
        bmw.start();
        bmw.stop();
        bmw.refuel();
        bmw.bmwOwnMethod();
        bmw.carRule();

        // Car bmwCar = new BMW();
        // bmwCar.start();
        // bmwCar.stop();
        // bmwCar.refuel();
        // bmwCar.bmwOwnMethod(); // This method we cann't use when we bmw object is
        // created with car refrence
        // variable
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }

    @Override
    public void refuel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refuel'");
    }

    public void carRule() {
        Car.super.carRule();
    }
}
