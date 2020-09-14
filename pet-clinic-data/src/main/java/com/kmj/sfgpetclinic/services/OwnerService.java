package com.kmj.sfgpetclinic.services;

import com.kmj.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
