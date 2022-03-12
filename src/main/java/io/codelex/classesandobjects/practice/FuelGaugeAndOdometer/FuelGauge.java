package io.codelex.classesandobjects.practice.FuelGaugeAndOdometer;

public class FuelGauge {
    int currentFuel;

    public int getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(int currentFuel) {
        this.currentFuel = currentFuel;
    }

    int fuelBurn(int burn) {
        return currentFuel = currentFuel - burn;
    }

    public void fillUp(int fuelMaxAmount){
        for(int i=0;i<=70;i++){
            setCurrentFuel(i);
            System.out.println("Current Fuel : "+getCurrentFuel());
            if(getCurrentFuel()==fuelMaxAmount){
                break;
            }
        }
    }
}
