package com.swaggergen.delegate;

import com.openapi.gen.springboot.api.RecommendApiDelegate;
import com.openapi.gen.springboot.dto.Repeat;
import com.swaggergen.service.RecommenrService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mabbasi
 */
@Service
public class RecommendDelegateImpl implements RecommendApiDelegate {

    private final RecommenrService recommenrService ;


    public RecommendDelegateImpl(RecommenrService recommenrService) {
        this.recommenrService = recommenrService;
    }


    @Override
    public ResponseEntity<List<Repeat>> getNationalId(String nationalId) {


         List<Repeat> repeatList= recommenrService.getNationalId(nationalId) ;

//        Repeat repeat = new Repeat() ;
//        repeat.setNationalId("1550460706");
        return ResponseEntity.ok(repeatList) ;
        //return RecommendApiDelegate.super.getNationalId(nationalId);
    }
    
}
