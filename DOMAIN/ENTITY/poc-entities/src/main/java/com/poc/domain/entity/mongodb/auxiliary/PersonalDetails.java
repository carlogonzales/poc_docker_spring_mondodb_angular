package com.poc.domain.entity.mongodb.auxiliary;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class PersonalDetails {

    private String firstname;
    private String middlename;
    private String lastname;

    private Date   birthdate;

    @Override
    public String toString() {
        return new ToStringBuilder( this ).append( "firstname", firstname )
                .append( "middlename", middlename )
                .append( "lastname", lastname ).append( "birthdate", birthdate )
                .toString();
    }

}
