package plug.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import plug.Model.RequestDTO;
import plug.Model.ResponseDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

    private Logger log = LoggerFactory.getLogger(MainController.class);

    ObjectMapper mapper = new ObjectMapper();

    @PostMapping(
            value = "/temporaryStub/group5"
            ,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Object postBalances(
            @RequestBody RequestDTO requestDTO
    ){
        try{


            String rqUID = requestDTO.getRqUID();


            ResponseDTO responseDTO = new ResponseDTO();
                responseDTO.setAnswer("The plug worked successfully!");

            return responseDTO;


        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping(
            value = "/temporaryStub/group5"
    )
    public String getBalance(

    ){
     return "All good";
    }

}
