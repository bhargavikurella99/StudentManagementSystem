package com.devon4j.application.smsj.studentmanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devon4j.application.smsj.studentmanagement.logic.api.Studentmanagement;
import com.devon4j.application.smsj.studentmanagement.logic.api.to.StudentEto;
import com.devon4j.application.smsj.studentmanagement.logic.api.to.StudentSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Studentmanagement}.
 */
@Path("/studentmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface StudentmanagementRestService {

  /**
   * Delegates to {@link Studentmanagement#findStudent}.
   *
   * @param id the ID of the {@link StudentEto}
   * @return the {@link StudentEto}
   */
  @GET
  @Path("/student/{id}/")
  public StudentEto getStudent(@PathParam("id") long id);

  /**
   * Delegates to {@link Studentmanagement#saveStudent}.
   *
   * @param student the {@link StudentEto} to be saved
   * @return the recently created {@link StudentEto}
   */
  @POST
  @Path("/student/")
  public StudentEto saveStudent(StudentEto student);

  /**
   * Delegates to {@link Studentmanagement#deleteStudent}.
   *
   * @param id ID of the {@link StudentEto} to be deleted
   */
  @DELETE
  @Path("/student/{id}/")
  public void deleteStudent(@PathParam("id") long id);

  /**
   * Delegates to {@link Studentmanagement#findStudentEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding students.
   * @return the {@link Page list} of matching {@link StudentEto}s.
   */
  @Path("/student/search")
  @POST
  public Page<StudentEto> findStudents(StudentSearchCriteriaTo searchCriteriaTo);

}