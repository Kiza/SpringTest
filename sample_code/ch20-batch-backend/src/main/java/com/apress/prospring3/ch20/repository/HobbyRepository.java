/**
 * Created on Dec 29, 2011
 */
package com.apress.prospring3.ch20.repository;

import org.springframework.data.repository.CrudRepository;

import com.apress.prospring3.ch20.domain.Hobby;

/**
 * @author Clarence
 *
 */
public interface HobbyRepository extends CrudRepository<Hobby, String> {

}
