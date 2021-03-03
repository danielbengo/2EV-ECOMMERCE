// package com.example.RETO2.Web.API;

// import java.util.List;

// import com.example.labo4.Services.MoviesService;
// import com.example.labo4.Services.Models.MovieDTO;

// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;

// import org.springframework.web.bind.annotation.RestController;


// @RestController
// public class MoviesController {

//   private final MoviesService moviesService;


//   MoviesController(MoviesService moviesService){
//       this.moviesService = moviesService;
//   }


  
//   //get all
//   @GetMapping()
//   public List<MovieDTO> GetMovies(){
//       return moviesService.getAll();
//   }
//   //add
//   @PostMapping
//   MovieDTO movieAdd(@RequestBody MovieDTO movie) {
//       return moviesService.movieAdd(movie);
//   }
  
// //update
//   @PutMapping("/{id}")
//   public MovieDTO movieUpdate(@RequestBody MovieDTO movie, @PathVariable("id") Long id){
//       return moviesService.movieUpdate(id,movie);

//   }
//   //delete
//   @DeleteMapping("/{id}")
//   public void movieDelete(@PathVariable("id") Long id){
//       moviesService.movieDelete(id);
//   }




// }