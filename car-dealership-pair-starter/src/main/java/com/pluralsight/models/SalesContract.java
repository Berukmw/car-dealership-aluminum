package com.pluralsight.models;

public class SalesContract extends Contract
{
 private boolean Finance;

    public SalesContract(String date, String customerName, String customerEmail, Vehicle vehicle)
    {
        super(date, customerName, customerEmail, vehicle);
        this.Finance = Finance;
    }

    public boolean isFinance()
    {
    return Finance;
    }

    public void setFinance(boolean Finance)
    {
        this.Finance=Finance;
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
    public double getMonthlyPayment()
    {
        return 0;
    }
}
