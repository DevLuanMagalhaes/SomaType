package SSMA.SSMA.controller;

import SSMA.SSMA.models.TwoType;
import SSMA.SSMA.service.Servicetype;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class controllerType {

    @Autowired
    Servicetype service;

    @GetMapping("/getTypes")
    public List<TwoType> findAllTypes(@RequestParam(value = "typeId",required = false) Long typeId,
                                      @RequestParam(value = "typeCode", required = false) String typeCode,
                                      @RequestParam(value = "domainCode", required = false) String domainCode,
                                      @RequestParam(value = "flexValue01",required = false) String flexValue01,
                                      @RequestParam(value = "flexValue02",required = false) String flexValue02) {
        System.out.println("Passou");
        return service.findAllTypes(typeId, typeCode, domainCode, flexValue01, flexValue02);
    }

    @GetMapping("/getTypesByFlexValue")
    public List<TwoType> findByFlexValue(@RequestParam("domainCode") String domainCode,
                                         @RequestParam("typeCode") String typeCode,
                                         @RequestParam("flexValue01") String flexValue01,
                                         @RequestParam("flexValue02") String flexValue02) {
        
        return service.findByFlexValue(domainCode, typeCode, flexValue01, flexValue02);

    }

    @GetMapping("/findTypesByDomain")
    public List<TwoType> findTypesByDomain(@RequestParam("domainCode") String domainCode,
                                           @RequestParam("flexValue01") String flexValue01,
                                           @RequestParam("flexValue02") String flexValue02) {
        return service.findTypesByDomain(domainCode, flexValue01, flexValue02);
    }

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public List<TwoType> post(@RequestBody List<TwoType> body) {
        return service.post(body);
    }

    @DeleteMapping("/delete/{id}")
    public void excluir(@PathVariable(value = "id") Long id ){
        service.delete(id);
    }

    @PutMapping("/update")
    public List<TwoType> update (@RequestBody List<TwoType> body){
        return update(body);
    }

}
