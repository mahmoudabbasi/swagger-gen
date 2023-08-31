package com.swaggergen.service;

import com.openapi.gen.springboot.dto.Repeat;
import com.openapi.gen.springboot.dto.UserDTO;
import com.swaggergen.exception.UserNotFoundException;
import com.swaggergen.repo.RepeatRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author mabbasi
 */
@Service
public class RecommenrService{

    private final Map<UUID, UserDTO> db = new ConcurrentHashMap<>();

    private final RepeatRepository repeatRepository ;

    public RecommenrService(RepeatRepository repeatRepository) {
        this.repeatRepository = repeatRepository;
    }

    public UserDTO saveUser(UserDTO userDTO) {
        UUID uuid= UUID.randomUUID();
        userDTO.setId(uuid);
        db.put(uuid,userDTO);
        return userDTO ;
    }


    public List<Repeat> getNationalId(String  nationalId) {
        return Optional.ofNullable(repeatRepository.findByNationalId(nationalId))
                .orElseThrow(()->new UserNotFoundException(" User not Found for Id" + nationalId)) ;
    }

}
