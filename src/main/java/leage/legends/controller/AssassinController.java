package leage.legends.controller;

import leage.legends.payload.request.AssassinRequest;
import leage.legends.payload.response.AssassinResponse;
import leage.legends.service.AssassinService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/assassins")
public class AssassinController {

    private final AssassinService assassinService ;

    // assas ekleme
    @PostMapping("/save") // http://localhost:8080/assassins/save + POST
    public ResponseEntity<String> assassinnSave(@Valid @RequestBody AssassinRequest assassinRequest){

     assassinService.save(assassinRequest);

     return  new ResponseEntity<>("Hero has been saved...",HttpStatus.CREATED);
    }

    // assasları getırme
    @GetMapping("/getAll")  // http://localhost:8080/assassins/getAll
    public ResponseEntity<List<AssassinResponse>> getAllAssassins(){
        List<AssassinResponse> asassassinList=assassinService.getAllAssassins();
        return ResponseEntity.ok(asassassinList);
    }

    // id li assa 'ı getir
    @GetMapping("/query")
    private ResponseEntity<AssassinResponse> getAssassinById (@RequestParam("id") Long id){
        AssassinResponse assassinResponse=assassinService.getAssassinById(id);
        return new ResponseEntity<>(assassinResponse,HttpStatus.OK);
    }

    // delete assas
    @DeleteMapping("/{id}") //http://localhost:8080/assassins/1 + DELETE
    public ResponseEntity<String> deleteAssassin(@PathVariable Long id){
        assassinService.deleteAssassin(id);
        return ResponseEntity.ok("Id = "+id+" Assassin is deleted");
    }

}
