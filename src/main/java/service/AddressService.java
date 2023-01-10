package service;

import entity.Address;
import entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AddressRepository;
import repository.AuthorRepository;

import java.util.Optional;
import java.util.Set;

@Service
public class AddressService {
    @Autowired
    private final AddressRepository addressRepository;
    private final AuthorRepository authorRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository,
                          AuthorRepository authorRepository) {
        this.addressRepository = addressRepository;
        this.authorRepository = authorRepository;
    }

    public void addAddress(){
        Address address=new Address("Mustek",13000);
        addressRepository.save(address);

        Author author=new Author("David",42);
        author.setAddress(address);

        authorRepository.save(author);
    }
    public void findAddress(Long id) {
        addressRepository.findById(id);
    }

    public void deleteAddress(Long id){
        Optional<Address> deleteItem=addressRepository.findById(id);
        addressRepository.delete(deleteItem.orElse(new Address()));
    }

    public void findByStreetOrZipcode(String street,String zipcode){
        Set<Address> addresses= addressRepository.findByStreetOrZipcode(street,zipcode);
        System.out.println(addresses);
    }


}
