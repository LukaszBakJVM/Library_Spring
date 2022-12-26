package com.example.library_spring_h2;


import org.springframework.data.repository.CrudRepository;



interface LibraryRepo extends CrudRepository<Library,Long> {
    int countLibraryByIdIsNull();
     void findAllByIdNotNull();
     void findAllByIdNull();


}
