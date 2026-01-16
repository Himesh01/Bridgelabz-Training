package collectionsquestion.setinterface.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.Objects;

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

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    @Override
    public String toString() {
        return "Policy{" + "No='" + policyNumber + '\'' + ", Holder='" + policyHolder + '\'' + ", Expiry=" + expiryDate +", Type=" + coverageType +", Premium=" + premium +'}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return Objects.equals(policyNumber, policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }
}