package com.devon4j.application.smsj.studentmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devon4j.application.smsj.studentmanagement.dataaccess.api.StudentEntity;
import com.devon4j.application.smsj.studentmanagement.logic.api.to.StudentSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link StudentEntity}
 */
public interface StudentRepository extends DefaultRepository<StudentEntity> {

  /**
   * @param criteria the {@link StudentSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link StudentEntity} objects that matched the search. If no pageable is set, it
   *         will return a unique page with all the objects that matched the search.
   */
  default Page<StudentEntity> findByCriteria(StudentSearchCriteriaTo criteria) {

    StudentEntity alias = newDslAlias();
    JPAQuery<StudentEntity> query = newDslQuery(alias);

    Long rollNumber = criteria.getRollNumber();
    if (rollNumber != null) {
      query.where($(alias.getRollNumber()).eq(rollNumber));
    }
    String firstName = criteria.getFirstName();
    if (firstName != null && !firstName.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getFirstName()), firstName, criteria.getFirstNameOption());
    }
    String lastName = criteria.getLastName();
    if (lastName != null && !lastName.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getLastName()), lastName, criteria.getLastNameOption());
    }
    String course = criteria.getCourse();
    if (course != null && !course.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getCourse()), course, criteria.getCourseOption());
    }
    String year = criteria.getYear();
    if (year != null && !year.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getYear()), year, criteria.getYearOption());
    }
    String section = criteria.getSection();
    if (section != null && !section.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getSection()), section, criteria.getSectionOption());
    }
    String email = criteria.getEmail();
    if (email != null && !email.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getEmail()), email, criteria.getEmailOption());
    }
    Long mobileNumber = criteria.getMobileNumber();
    if (mobileNumber != null) {
      query.where($(alias.getMobileNumber()).eq(mobileNumber));
    }
    String address = criteria.getAddress();
    if (address != null && !address.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getAddress()), address, criteria.getAddressOption());
    }
    Long pinCode = criteria.getPinCode();
    if (pinCode != null) {
      query.where($(alias.getPinCode()).eq(pinCode));
    }
    if (criteria.getPageable() == null) {
      criteria.setPageable(PageRequest.of(0, Integer.MAX_VALUE));
    } else {
      addOrderBy(query, alias, criteria.getPageable().getSort());
    }

    return QueryUtil.get().findPaginated(criteria.getPageable(), query, true);
  }

  /**
   * Add sorting to the given query on the given alias
   * 
   * @param query to add sorting to
   * @param alias to retrieve columns from for sorting
   * @param sort specification of sorting
   */
  public default void addOrderBy(JPAQuery<StudentEntity> query, StudentEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "rollNumber":
            if (next.isAscending()) {
              query.orderBy($(alias.getRollNumber()).asc());
            } else {
              query.orderBy($(alias.getRollNumber()).desc());
            }
            break;
          case "firstName":
            if (next.isAscending()) {
              query.orderBy($(alias.getFirstName()).asc());
            } else {
              query.orderBy($(alias.getFirstName()).desc());
            }
            break;
          case "lastName":
            if (next.isAscending()) {
              query.orderBy($(alias.getLastName()).asc());
            } else {
              query.orderBy($(alias.getLastName()).desc());
            }
            break;
          case "course":
            if (next.isAscending()) {
              query.orderBy($(alias.getCourse()).asc());
            } else {
              query.orderBy($(alias.getCourse()).desc());
            }
            break;
          case "year":
            if (next.isAscending()) {
              query.orderBy($(alias.getYear()).asc());
            } else {
              query.orderBy($(alias.getYear()).desc());
            }
            break;
          case "section":
            if (next.isAscending()) {
              query.orderBy($(alias.getSection()).asc());
            } else {
              query.orderBy($(alias.getSection()).desc());
            }
            break;
          case "email":
            if (next.isAscending()) {
              query.orderBy($(alias.getEmail()).asc());
            } else {
              query.orderBy($(alias.getEmail()).desc());
            }
            break;
          case "mobileNumber":
            if (next.isAscending()) {
              query.orderBy($(alias.getMobileNumber()).asc());
            } else {
              query.orderBy($(alias.getMobileNumber()).desc());
            }
            break;
          case "address":
            if (next.isAscending()) {
              query.orderBy($(alias.getAddress()).asc());
            } else {
              query.orderBy($(alias.getAddress()).desc());
            }
            break;
          case "pinCode":
            if (next.isAscending()) {
              query.orderBy($(alias.getPinCode()).asc());
            } else {
              query.orderBy($(alias.getPinCode()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

}