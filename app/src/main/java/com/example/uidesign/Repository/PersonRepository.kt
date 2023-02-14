package com.example.uidesign.Repository

import com.example.uidesign.model.Person

class PersonRepository {

    fun getAllData(): List<Person>{
        return  listOf(
            Person(0, "Mayank","Singh", 24),
            Person(1, "Ashwani","Shakya", 26),
            Person(2, "Mr","Singh", 24),
            Person(3, "Mayank","Singh", 24),
            Person(4, "Ashwani","Shakya", 26),
            Person(5, "Mr","Singh", 24),
            Person(6, "Mayank","Singh", 24),
            Person(7, "Ashwani","Shakya", 26),
            Person(8, "Mr","Singh", 24),

        )
    }
}