package patient;

public class Cardiologist extends Patient{
    @Override
    public void medicalReport() {
        System.out.printf("Every thing normal, %s!", getFullName());
    }

    @Override
    public void appointmentPrice() {
        System.out.printf("%s, your total is $150.00", getFullName());
    }

    @Override
    public void healthCondition() {
        System.out.printf("Nothing abnormal with your heart, %s", getFullName());
    }
}
