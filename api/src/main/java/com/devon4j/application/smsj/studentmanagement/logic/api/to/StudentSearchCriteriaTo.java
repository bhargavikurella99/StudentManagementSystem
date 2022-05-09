package com.devon4j.application.smsj.studentmanagement.logic.api.to;

import com.devon4j.application.smsj.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devon4j.application.smsj.studentmanagement.common.api.Student}s.
 */
public class StudentSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private Long rollNumber;

  private String firstName;

  private String lastName;

  private String course;

  private String year;

  private String section;

  private String email;

  private Long mobileNumber;

  private String address;

  private Long pinCode;

  private StringSearchConfigTo firstNameOption;

  private StringSearchConfigTo lastNameOption;

  private StringSearchConfigTo courseOption;

  private StringSearchConfigTo yearOption;

  private StringSearchConfigTo sectionOption;

  private StringSearchConfigTo emailOption;

  private StringSearchConfigTo addressOption;

  /**
   * @return rollNumberId
   */

  public Long getRollNumber() {

    return rollNumber;
  }

  /**
   * @param rollNumber setter for rollNumber attribute
   */

  public void setRollNumber(Long rollNumber) {

    this.rollNumber = rollNumber;
  }

  /**
   * @return firstNameId
   */

  public String getFirstName() {

    return firstName;
  }

  /**
   * @param firstName setter for firstName attribute
   */

  public void setFirstName(String firstName) {

    this.firstName = firstName;
  }

  /**
   * @return lastNameId
   */

  public String getLastName() {

    return lastName;
  }

  /**
   * @param lastName setter for lastName attribute
   */

  public void setLastName(String lastName) {

    this.lastName = lastName;
  }

  /**
   * @return courseId
   */

  public String getCourse() {

    return course;
  }

  /**
   * @param course setter for course attribute
   */

  public void setCourse(String course) {

    this.course = course;
  }

  /**
   * @return yearId
   */

  public String getYear() {

    return year;
  }

  /**
   * @param year setter for year attribute
   */

  public void setYear(String year) {

    this.year = year;
  }

  /**
   * @return sectionId
   */

  public String getSection() {

    return section;
  }

  /**
   * @param section setter for section attribute
   */

  public void setSection(String section) {

    this.section = section;
  }

  /**
   * @return emailId
   */

  public String getEmail() {

    return email;
  }

  /**
   * @param email setter for email attribute
   */

  public void setEmail(String email) {

    this.email = email;
  }

  /**
   * @return mobileNumberId
   */

  public Long getMobileNumber() {

    return mobileNumber;
  }

  /**
   * @param mobileNumber setter for mobileNumber attribute
   */

  public void setMobileNumber(Long mobileNumber) {

    this.mobileNumber = mobileNumber;
  }

  /**
   * @return addressId
   */

  public String getAddress() {

    return address;
  }

  /**
   * @param address setter for address attribute
   */

  public void setAddress(String address) {

    this.address = address;
  }

  /**
   * @return pinCodeId
   */

  public Long getPinCode() {

    return pinCode;
  }

  /**
   * @param pinCode setter for pinCode attribute
   */

  public void setPinCode(Long pinCode) {

    this.pinCode = pinCode;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getFirstName() firstName}.
   */
  public StringSearchConfigTo getFirstNameOption() {

    return this.firstNameOption;
  }

  /**
   * @param firstNameOption new value of {@link #getFirstNameOption()}.
   */
  public void setFirstNameOption(StringSearchConfigTo firstNameOption) {

    this.firstNameOption = firstNameOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getLastName() lastName}.
   */
  public StringSearchConfigTo getLastNameOption() {

    return this.lastNameOption;
  }

  /**
   * @param lastNameOption new value of {@link #getLastNameOption()}.
   */
  public void setLastNameOption(StringSearchConfigTo lastNameOption) {

    this.lastNameOption = lastNameOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getCourse() course}.
   */
  public StringSearchConfigTo getCourseOption() {

    return this.courseOption;
  }

  /**
   * @param courseOption new value of {@link #getCourseOption()}.
   */
  public void setCourseOption(StringSearchConfigTo courseOption) {

    this.courseOption = courseOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getYear() year}.
   */
  public StringSearchConfigTo getYearOption() {

    return this.yearOption;
  }

  /**
   * @param yearOption new value of {@link #getYearOption()}.
   */
  public void setYearOption(StringSearchConfigTo yearOption) {

    this.yearOption = yearOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getSection() section}.
   */
  public StringSearchConfigTo getSectionOption() {

    return this.sectionOption;
  }

  /**
   * @param sectionOption new value of {@link #getSectionOption()}.
   */
  public void setSectionOption(StringSearchConfigTo sectionOption) {

    this.sectionOption = sectionOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getEmail() email}.
   */
  public StringSearchConfigTo getEmailOption() {

    return this.emailOption;
  }

  /**
   * @param emailOption new value of {@link #getEmailOption()}.
   */
  public void setEmailOption(StringSearchConfigTo emailOption) {

    this.emailOption = emailOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getAddress() address}.
   */
  public StringSearchConfigTo getAddressOption() {

    return this.addressOption;
  }

  /**
   * @param addressOption new value of {@link #getAddressOption()}.
   */
  public void setAddressOption(StringSearchConfigTo addressOption) {

    this.addressOption = addressOption;
  }

}
