package patient;

public abstract class Patient {
    private String fullName;
    private String age;
    private String symptoms;
    private boolean medicalPlan;
    private String paymentMothod;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public boolean isMedicalPlan() {
        return medicalPlan;
    }

    public void setMedicalPlan(boolean medicalPlan) {
        this.medicalPlan = medicalPlan;
    }

    public abstract void medicalReport();
    public abstract void appointmentPrice();
    public abstract void healthCondition();
}
