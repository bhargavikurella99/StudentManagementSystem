package com.devon4j.application.smsj.studentmanagement.logic.api.to;

import com.devon4j.application.smsj.studentmanagement.common.api.Student;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Student
 */
public class StudentEto extends AbstractEto implements Student {

  private static final long serialVersionUID = 1L;

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

  @Override
  public long getRollNumber() {

    return rollNumber;
  }

  @Override
  public void setRollNumber(long rollNumber) {

    this.rollNumber = rollNumber;
  }

  @Override
  public String getFirstName() {

    return firstName;
  }

  @Override
  public void setFirstName(String firstName) {

    this.firstName = firstName;
  }

  @Override
  public String getLastName() {

    return lastName;
  }

  @Override
  public void setLastName(String lastName) {

    this.lastName = lastName;
  }

  @Override
  public String getCourse() {

    return course;
  }

  @Override
  public void setCourse(String course) {

    this.course = course;
  }

  @Override
  public String getYear() {

    return year;
  }

  @Override
  public void setYear(String year) {

    this.year = year;
  }

  @Override
  public String getSection() {

    return section;
  }

  @Override
  public void setSection(String section) {

    this.section = section;
  }

  @Override
  public String getEmail() {

    return email;
  }

  @Override
  public void setEmail(String email) {

    this.email = email;
  }

  @Override
  public long getMobileNumber() {

    return mobileNumber;
  }

  @Override
  public void setMobileNumber(long mobileNumber) {

    this.mobileNumber = mobileNumber;
  }

  @Override
  public String getAddress() {

    return address;
  }

  @Override
  public void setAddress(String address) {

    this.address = address;
  }

  @Override
  public long getPinCode() {

    return pinCode;
  }

  @Override
  public void setPinCode(long pinCode) {

    this.pinCode = pinCode;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((Long) rollNumber).hashCode();
    result = prime * result + ((this.firstName == null) ? 0 : this.firstName.hashCode());
    result = prime * result + ((this.lastName == null) ? 0 : this.lastName.hashCode());
    result = prime * result + ((this.course == null) ? 0 : this.course.hashCode());
    result = prime * result + ((this.year == null) ? 0 : this.year.hashCode());
    result = prime * result + ((this.section == null) ? 0 : this.section.hashCode());
    result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
    result = prime * result + ((Long) mobileNumber).hashCode();
    result = prime * result + ((this.address == null) ? 0 : this.address.hashCode());
    result = prime * result + ((Long) pinCode).hashCode();
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    StudentEto other = (StudentEto) obj;
    if (this.rollNumber != other.rollNumber) {
      return false;
    }
    if (this.firstName == null) {
      if (other.firstName != null) {
        return false;
      }
    } else if (!this.firstName.equals(other.firstName)) {
      return false;
    }
    if (this.lastName == null) {
      if (other.lastName != null) {
        return false;
      }
    } else if (!this.lastName.equals(other.lastName)) {
      return false;
    }
    if (this.course == null) {
      if (other.course != null) {
        return false;
      }
    } else if (!this.course.equals(other.course)) {
      return false;
    }
    if (this.year == null) {
      if (other.year != null) {
        return false;
      }
    } else if (!this.year.equals(other.year)) {
      return false;
    }
    if (this.section == null) {
      if (other.section != null) {
        return false;
      }
    } else if (!this.section.equals(other.section)) {
      return false;
    }
    if (this.email == null) {
      if (other.email != null) {
        return false;
      }
    } else if (!this.email.equals(other.email)) {
      return false;
    }
    if (this.mobileNumber != other.mobileNumber) {
      return false;
    }
    if (this.address == null) {
      if (other.address != null) {
        return false;
      }
    } else if (!this.address.equals(other.address)) {
      return false;
    }
    if (this.pinCode != other.pinCode) {
      return false;
    }
    return true;
  }
}
