package vn.edu.iuh.fit.w5.lab5;

import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.w5.lab5.enums.Country;
import vn.edu.iuh.fit.w5.lab5.models.Address;
import vn.edu.iuh.fit.w5.lab5.models.Candidate;
import vn.edu.iuh.fit.w5.lab5.repositories.AddressRepository;
import vn.edu.iuh.fit.w5.lab5.repositories.CandidateRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

@SpringBootApplication
public class Lab5Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab5Application.class, args);
    }
    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Bean
    CommandLineRunner initData(){
        return args -> {
            Random rnd =new Random();
            for (int i = 1; i < 1000; i++) {


                Address address = new Address("Quang Trung", "HCM",Country.VIETNAM,rnd.nextInt(1,1000)+"",rnd.nextInt(70000,80000)+"");
                addressRepository.save(address);
                //Date dob, String email, String fullname, String phone,  Address addressid
                Candidate can=new Candidate(
                        LocalDate.of(1998,rnd.nextInt(1,13),rnd.nextInt(1,29)),
                        "email_"+i+"@gmail.com","Name #"+i,
                        rnd.nextLong(1111111111L,9999999999L)+"", address
                       );

                candidateRepository.save(can);
                System.out.println("Added: " +can);
            }
        };
    }
}
