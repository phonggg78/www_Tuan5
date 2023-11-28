package vn.edu.iuh.fit.w5.lab5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.w5.lab5.models.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
