package com.devon4j.application.smsj.studentmanagement.common.api;

import com.devon4j.application.smsj.general.common.api.ApplicationEntity;

public interface Student extends ApplicationEntity {

  /**
   * @return rollNumberId
   */

  public long getRollNumber();

  /**
   * @param rollNumber setter for rollNumber attribute
   */

  public void setRollNumber(long rollNumber);

  /**
   * @return firstNameId
   */

  public String getFirstName();

  /**
   * @param firstName setter for firstName attribute
   */

  public void setFirstName(String firstName);

  /**
   * @return lastNameId
   */

  public String getLastName();

  /**
   * @param lastName setter for lastName attribute
   */

  public void setLastName(String lastName);

  /**
   * @return courseId
   */

  public String getCourse();

  /**
   * @param course setter for course attribute
   */

  public void setCourse(String course);

  /**
   * @return yearId
   */

  public String getYear();

  /**
   * @param year setter for year attribute
   */

  public void setYear(String year);

  /**
   * @return sectionId
   */

  public String getSection();

  /**
   * @param section setter for section attribute
   */

  public void setSection(String section);

  /**
   * @return emailId
   */

  public String getEmail();

  /**
   * @param email setter for email attribute
   */

  public void setEmail(String email);

  /**
   * @return mobileNumberId
   */

  public long getMobileNumber();

  /**
   * @param mobileNumber setter for mobileNumber attribute
   */

  public void setMobileNumber(long mobileNumber);

  /**
   * @return addressId
   */

  public String getAddress();

  /**
   * @param address setter for address attribute
   */

  public void setAddress(String address);

  /**
   * @return pinCodeId
   */

  public long getPinCode();

  /**
   * @param pinCode setter for pinCode attribute
   */

  public void setPinCode(long pinCode);

}
