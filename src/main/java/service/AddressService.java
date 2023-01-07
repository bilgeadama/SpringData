package service;

import entity.Address;
import org.springframework.stereotype.Service;
import repository.AddressRepository;

@Service
public class AddressService {
    private final AddressRepository addressRepository;


    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public void addAddress(){
        Address address=new Address();
        address.setStreet("Bakirkoy");
        address.setZipCode(34303);
        addressRepository.save(address);
    }
    public void deleteAddress() {

    }

    public void findAddress(Long id) {
        addressRepository.findById(id);

    }
}
