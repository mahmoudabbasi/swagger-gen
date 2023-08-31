package com.swaggergen.contoller;

import com.openapi.gen.springboot.api.RecommendApi;
import com.openapi.gen.springboot.api.RecommendApiController;
import com.openapi.gen.springboot.api.RecommendApiDelegate;
import com.openapi.gen.springboot.dto.Repeat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mabbasi
 */

@RestController
@Validated
public class RecommendController extends RecommendApiController {
    
    public RecommendController(RecommendApiDelegate delegate) {
        super(delegate);
    }


//    @Override
//    public ResponseEntity<Repeat> getNationalId(String nationalId) {
//        return super.getNationalId(nationalId);
//    }
}
