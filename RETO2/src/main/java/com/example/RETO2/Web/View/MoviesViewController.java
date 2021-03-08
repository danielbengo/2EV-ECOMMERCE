// package com.example.RETO2.Web.View;

// import java.util.Locale;
// import java.util.Optional;
// import java.util.ResourceBundle;

// import com.example.labo4.Repositories.Entities.MovieEntity;
// import com.example.labo4.Services.MoviesService;
// import com.example.labo4.Services.Models.MovieDTO;
// import com.example.labo4.Web.API.MoviesController;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.servlet.ModelAndView;

// @RestController
// @RequestMapping("movies")
// public class MoviesViewController {
//     private final MoviesService moviesService;

//     MoviesViewController(MoviesService moviesService) {
//         this.moviesService = moviesService;
//     }

//     @GetMapping
//     public ModelAndView movies() {
//         ModelAndView mv = new ModelAndView("index");
//         mv.addObject("movies", moviesService.getAll());
//         return mv;
//     }

// //details
//     @GetMapping("/{movieId}")
//     public ModelAndView GetMovie(@PathVariable(name = "movieId") Long movieId) {
        
//         Optional<MovieDTO> result = moviesService.findById(movieId);
//         ModelAndView mv = new ModelAndView("details");
//         mv.addObject("movie", result.get());
//         return mv;

//     }

//     //filtrico bueno
//     @GetMapping("/filtrar")
//     public ModelAndView filtrar(@RequestParam(name = "title", required = false, defaultValue = "") String title,
//             @RequestParam(name = "year", required = false, defaultValue = "0") Integer year) {
//         ModelAndView mv = new ModelAndView("index");
//         mv.addObject("movies", moviesService.findByTitleOrYear(title, year));
//         return mv;
//     }

//     // messages ESP O EN
//     @GetMapping("/test")
//     public String Test(@RequestParam(name = "lang", required = false, defaultValue = "es") String lang) {

//         var locale = new Locale(lang);

//         var messages = ResourceBundle.getBundle("classpath:i18n/messages", locale);

//         return messages.getString("messages");
//     }
// }
