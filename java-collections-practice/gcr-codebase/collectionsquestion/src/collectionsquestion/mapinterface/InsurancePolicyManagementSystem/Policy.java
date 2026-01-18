package collectionsquestion.mapinterface.InsurancePolicyManagementSystem;

import java.time.LocalDate;

public class Policy {

    private String policyNumber;
    private String policyHolder;
    private LocalDate expiryDate;
    private String coverageType;
    private double premium;

    public Policy(String policyNumber, String policyHolder,
                  LocalDate expiryDate, String coverageType, double premium) {

        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Policy{" +"No='" + policyNumber + '\'' + ", Holder='" + policyHolder + '\'' +", Expiry=" + expiryDate + ", Type=" + coverageType + ", Premium=" + premium +'}';
    }
}