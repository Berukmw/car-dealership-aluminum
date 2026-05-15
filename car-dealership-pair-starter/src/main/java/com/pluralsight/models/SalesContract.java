package com.pluralsight.models;

public class SalesContract extends Contract
{
 private boolean Finance;

    public SalesContract(String date, String customerName, String customerEmail, Vehicle vehicle, boolean finance)
    {
        super(date, customerName, customerEmail, vehicle);
        this.Finance = finance;
    }

    public boolean isFinance()
    {
    return Finance;
    }

    public void setFinance(boolean finance)
    {
        this.Finance = Finance;
    }

    public double getSalesTax()
    {
        return getVehicle().getPrice() * .05;
    }

    public double getRecordFee()
    {
        return 100.00;
    }

    public double getProcessingFee()
    {
        if (getVehicle().getPrice() <= 10000.00)
        {
            return 295.00;
        }
        else
        {
            return 495.00;
        }
    }

    @Override
    public double getTotalPrice()
    {
        return getVehicle().getPrice() + getSalesTax() + getProcessingFee() + getRecordFee();

    }

    @Override
    public double getMonthlyPayment() {
        if (!Finance) return 0.00;

        double price = getTotalPrice();
        double rate;
        int months;

        // 4 year finance option
        if (price >= 10000) {
            rate = 0.0425 / 12;
            months = 48;
        }
        // 2 year finance option
        else {
            rate = 0.0525 / 12;
            months = 24;


        }
        return (price * rate) / (Math.pow(1 + rate, months));
    }
}
