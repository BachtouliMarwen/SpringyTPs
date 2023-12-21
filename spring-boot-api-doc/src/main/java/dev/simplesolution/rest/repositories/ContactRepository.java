package dev.simplesolution.rest.repositories;

import dev.simplesolution.rest.entities.Contact;
import java.util.List;

public interface ContactRepository {
    List<Contact> getAll();
    Contact getById(Long id);
    Contact save(Contact newContact);
    Contact update(Contact newContact);
    void delete(Long id);

}
