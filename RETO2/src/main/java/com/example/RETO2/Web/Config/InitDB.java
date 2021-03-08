package com.example.RETO2.Web.Config;

import com.example.RETO2.Repositories.Entities.OrderEntity;
import com.example.RETO2.Repositories.Entities.OrderProductEntity;
import com.example.RETO2.Repositories.Entities.ProductsEntity;
import com.example.RETO2.Repositories.Interfaces.OrderProductRepository;
import com.example.RETO2.Repositories.Interfaces.OrderRepository;
import com.example.RETO2.Repositories.Interfaces.ProductsRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDB {
 @Bean
 CommandLineRunner initDatabase(  OrderRepository repository1, ProductsRepository repository2, OrderProductRepository OPrepository) {

    return args -> {
        repository1.save(new OrderEntity("12:05", "Donald Trump","En curso"));
        repository1.save(new OrderEntity("05:25", "Carrero Blanco","Entregado"));
        repository1.save(new OrderEntity("17:55", "Antonio Tejero","Cancelado"));

        repository2.save(new ProductsEntity("Play Station 5", 499.99,"https://images-na.ssl-images-amazon.com/images/I/71PMC4DWWFL._AC_SL1500_.jpg"));
        repository2.save(new ProductsEntity("PC last generation", 2050,"https://m.media-amazon.com/images/I/41ovDf0K24L.jpg"));
        repository2.save(new ProductsEntity("Mouse", 34.95,"https://www.grosbill.com/images.grosbill.com/imagesproduitnew/images800jpg/610624.jpg"));
        repository2.save(new ProductsEntity("Teclado", 49.99,"https://www.marsgaming.eu/uploads/_thumnails/mkxtklbpt_960x960.png"));
        
        OPrepository.save(new OrderProductEntity(3,2L,1L));
        OPrepository.save(new OrderProductEntity(2,3L,1L));
    };

    
 }
    


}
