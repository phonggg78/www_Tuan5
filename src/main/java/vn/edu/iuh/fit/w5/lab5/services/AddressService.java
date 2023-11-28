package vn.edu.iuh.fit.w5.lab5.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.w5.lab5.models.Address;
import vn.edu.iuh.fit.w5.lab5.repositories.AddressRepository;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public Address updateAddress(Address address){
        return addressRepository.save(address);
    }
    public void deleteAddress(long id){
        addressRepository.deleteById(id);
    }
    public Address findAddressById(long id){
            return addressRepository.findById(id).get();
    }
    public List<Address> findAll(){
        return addressRepository.findAll();
    }
}
