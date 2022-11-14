package id.ac.prisma.swordlightpaymentbackend.data.repo;

import id.ac.prisma.swordlightpaymentbackend.data.model.TbUser;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TbUserRepository extends CrudRepository<TbUser, Integer> {
    Optional<TbUser> findByEmail(String email);
    Optional<TbUser> findByFullName(String fullName);
}
