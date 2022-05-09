package com.devon4j.application.smsj.studentmanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.devon4j.application.smsj.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devon4j.application.smsj.studentmanagement.common.api.Student;

/**
 * TODO bkurella This type ...
 */
@Entity
@Table(name = "Student")
public class StudentEntity extends ApplicationPersistenceEntity implements Student {

  private long rollNumber;

  private String firstName;

  private String lastName;

  private String course;

  private String year;

  private String section;

  private String email;

  private long mobileNumber;

  private String address;

  private long pinCode;

  private static final long serialVersionUID = 1L;

  /**
   * The constructor.
   *
   * @param rollNumber
   * @param firstName
   * @param lastName
   * @param course
   * @param year
   * @param section
   * @param email
   * @param mobileNumber
   * @param address
   * @param pinCode
   */
  public StudentEntity(long rollNumber, String firstName, String lastName, String course, String year, String section,
      String email, long mobileNumber, String address, long pinCode) {

    super();
    this.rollNumber = rollNumber;
    this.firstName = firstName;
    this.lastName = lastName;
    this.course = course;
    this.year = year;
    this.section = section;
    this.email = email;
    this.mobileNumber = mobileNumber;
    this.address = address;
    this.pinCode = pinCode;
  }

  /**
   * @return rollNumber
   */
  @Override
  public long getRollNumber() {

    return this.rollNumber;
  }

  /**
   * @param rollNumber new value of {@link #getrollNumber}.
   */
  @Override
  public void setRollNumber(long rollNumber) {

    this.rollNumber = rollNumber;
  }

  /**
   * @return firstName
   */
  @Override
  public String getFirstName() {

    return this.firstName;
  }

  /**
   * @param firstName new value of {@link #getfirstName}.
   */
  @Override
  public void setFirstName(String firstName) {

    this.firstName = firstName;
  }

  /**
   * @return lastName
   */
  @Override
  public String getLastName() {

    return this.lastName;
  }

  /**
   * @param lastName new value of {@link #getlastName}.
   */
  @Override
  public void setLastName(String lastName) {

    this.lastName = lastName;
  }

  /**
   * @return course
   */
  @Override
  public String getCourse() {

    return this.course;
  }

  /**
   * @param course new value of {@link #getcourse}.
   */
  @Override
  public void setCourse(String course) {

    this.course = course;
  }

  /**
   * @return year
   */
  @Override
  public String getYear() {

    return this.year;
  }

  /**
   * @param year new value of {@link #getyear}.
   */
  @Override
  public void setYear(String year) {

    this.year = year;
  }

  /**
   * @return section
   */
  @Override
  public String getSection() {

    return this.section;
  }

  /**
   * @param section new value of {@link #getsection}.
   */
  @Override
  public void setSection(String section) {

    this.section = section;
  }

  /**
   * @return email
   */
  @Override
  public String getEmail() {

    return this.email;
  }

  /**
   * @param email new value of {@link #getemail}.
   */
  @Override
  public void setEmail(String email) {

    this.email = email;
  }

  /**
   * @return mobileNumber
   */
  @Override
  public long getMobileNumber() {

    return this.mobileNumber;
  }

  /**
   * @param mobileNumber new value of {@link #getmobileNumber}.
   */
  @Override
  public void setMobileNumber(long mobileNumber) {

    this.mobileNumber = mobileNumber;
  }

  /**
   * @return address
   */
  @Override
  public String getAddress() {

    return this.address;
  }

  /**
   * @param address new value of {@link #getaddress}.
   */
  @Override
  public void setAddress(String address) {

    this.address = address;
  }

  /**
   * @return pinCode
   */
  @Override
  public long getPinCode() {

    return this.pinCode;
  }

  /**
   * @param pinCode new value of {@link #getpinCode}.
   */
  @Override
  public void setPinCode(long pinCode) {

    this.pinCode = pinCode;
  }

  /**
   * The constructor.
   */
  public StudentEntity() {

    super();
  }

}
