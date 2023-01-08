package app;


//import config.Config;
//import config.DataSourceConfig;

import entity.Address;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import service.AddressService;


import java.util.HashSet;

@SpringBootApplication
@ComponentScan(basePackages = {"repository", "service", "entity"})
@EnableJpaRepositories(basePackages = "repository")
@EnableAutoConfiguration
@EntityScan(basePackages = {"entity"})
public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(App.class, args);
        AddressService addressService= applicationContext.getBean(AddressService.class);

        //addressService.addAddress();
        addressService.findByStreetOrZipCode("YeniBatı", 6030);
        addressService.deleteAddress(1L);



    }


}
