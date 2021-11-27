package com.example.springbootlearning.dao;

import com.example.springbootlearning.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("FakeDao")
public class FakePersonDataAccessService implements PersonDao{

    private static List<Person> db = new ArrayList<>();



    @Override
    public int insertPerson(UUID id, Person person) {
        db.add(new Person(id, person.getName()));
        return 1;
    }
}
