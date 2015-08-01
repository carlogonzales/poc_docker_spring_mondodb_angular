package com.poc.domain.entity.mongodb;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.poc.domain.entity.mongodb.auxiliary.PersonalDetails;
import com.poc.domain.entity.mongodb.support.Identifiable;

@Document( collection = "persons" )
public class Person implements Identifiable< ObjectId > {

    @Id
    private ObjectId        id;
    private PersonalDetails personalDetails;

    public Person() {
        super();
    }

    public ObjectId getId() {
        return id;
    }

    public void setId( ObjectId id ) {
        this.id = id;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails( PersonalDetails personalDetails ) {
        this.personalDetails = personalDetails;
    }

    @Override
    public String toString() {
        return new ToStringBuilder( this ).append( "personalDetails",
                personalDetails ).toString();
    }

}
