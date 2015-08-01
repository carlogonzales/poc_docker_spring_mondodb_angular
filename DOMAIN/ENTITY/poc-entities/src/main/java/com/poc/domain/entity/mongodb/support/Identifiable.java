package com.poc.domain.entity.mongodb.support;

/**
 * Defines a contract for entity classes that can be identified through an Id
 * 
 * @author Carlo Gonzales
 *
 * @param <T>
 *            ID Class type
 * 
 */
public interface Identifiable< T > {

    T getId();

    void setId( T id );

}
