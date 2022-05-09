package com.devon4j.application.smsj.studentmanagement.logic.api.usecase;

import com.devon4j.application.smsj.studentmanagement.logic.api.to.StudentEto;

/**
 * Interface of UcManageStudent to centralize documentation and signatures of methods.
 */
public interface UcManageStudent {

  /**
   * Deletes a student from the database by its id 'studentId'.
   *
   * @param studentId Id of the student to delete
   * @return boolean <code>true</code> if the student can be deleted, <code>false</code> otherwise
   */
  boolean deleteStudent(long studentId);

  /**
   * Saves a student and store it in the database.
   *
   * @param student the {@link StudentEto} to create.
   * @return the new {@link StudentEto} that has been saved with ID and version.
   */
  StudentEto saveStudent(StudentEto student);

}
