// package com.example.RETO2.Repositories.Interfaces;

// import java.util.Collection;

// import com.example.labo4.Repositories.Entities.MovieEntity;


// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;

// public interface MoviesRepository
// extends JpaRepository<MovieEntity,Long>{
    
//     @Query(value = "SELECT movies FROM Movies movies WHERE year = :year")
//     Collection<MovieEntity> findByYear(@Param("year") int year);
//     @Query(value = "SELECT movies FROM Movies movies WHERE title LIKE %:title% AND year = :year")
//     Collection<MovieEntity> findByTitleOrYear(@Param("title") String title, @Param("year") int year);
//     @Query(value = "SELECT movies FROM Movies movies WHERE title LIKE %:title%")
//     Collection<MovieEntity> findByTitle(@Param("title") String title);

    

   
// }