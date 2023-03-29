package entities;

public final class OutsourcedEmployee extends Employee {
    private Double additionalCharge;

    // Constructors
    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    // Getters and setters
    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    // Original payment plus 110% of additional charge
    @Override
    public Double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}
