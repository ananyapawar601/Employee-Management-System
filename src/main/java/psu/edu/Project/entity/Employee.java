package psu.edu.Project.entity;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String startDate;

    @Column(name = "start_salary")
    private Integer startSalary;

    @Column(name = "contract_signed")
    private String contractSigned;

    @Column(name = "ssn")
    private String ssn;

    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String birthDate;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "emergency_contact")
    private String emergencyContact;

    @Column(name = "emergency_phone")
    private String emergencyPhone;

    // Constructors
    public Employee() {
    }

    public Employee(String firstName, String lastName, String startDate, Integer startSalary, 
                   String contractSigned, String ssn, String birthDate, String phoneNumber, 
                   String emergencyContact, String emergencyPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
        this.startSalary = startSalary;
        this.contractSigned = contractSigned;
        this.ssn = ssn;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.emergencyContact = emergencyContact;
        this.emergencyPhone = emergencyPhone;
    }

    // Getters and Setters
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Integer getStartSalary() {
        return startSalary;
    }

    public void setStartSalary(Integer startSalary) {
        this.startSalary = startSalary;
    }

    public String getContractSigned() {
        return contractSigned;
    }

    public void setContractSigned(String contractSigned) {
        this.contractSigned = contractSigned;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", startDate='" + startDate + '\'' +
                ", startSalary=" + startSalary +
                ", contractSigned='" + contractSigned + '\'' +
                ", ssn='" + ssn + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emergencyContact='" + emergencyContact + '\'' +
                ", emergencyPhone='" + emergencyPhone + '\'' +
                '}';
    }
}