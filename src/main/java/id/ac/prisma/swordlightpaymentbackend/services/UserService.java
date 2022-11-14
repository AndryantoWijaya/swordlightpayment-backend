package id.ac.prisma.swordlightpaymentbackend.services;

import id.ac.prisma.swordlightpaymentbackend.data.model.TbUser;
import id.ac.prisma.swordlightpaymentbackend.data.repo.TbUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    TbUserRepository tbUserRepository;

    public Map createUser(
            String fullName,
            String email,
            String password
    ){
        // insert data
        // call tbUserRepository.save
        TbUser tbUser = new TbUser();
        tbUser.setFullName(fullName);
        tbUser.setEmail(email);
        tbUser.setPassword(password);
        tbUser = tbUserRepository.save(tbUser);

        Map response = new HashMap();
        response.put("data", tbUser);
        return response;
    }
    void createUser2(){

    }
}
