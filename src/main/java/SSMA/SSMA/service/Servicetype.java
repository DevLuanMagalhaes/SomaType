package SSMA.SSMA.service;

import SSMA.SSMA.models.TwoType;
import SSMA.SSMA.repository.RepositoryType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class Servicetype {

    @Autowired
    private RepositoryType repositoryType;


    public List<TwoType> findAllTypes(Long typeId,
                                      String typeCode,
                                      String domainCode,
                                      String flexValue01,
                                      String flexValue02) {

        List <TwoType> retorno2  = repositoryType.findAllTypes(typeId, typeCode, domainCode, flexValue01, flexValue02);

        for (TwoType type : retorno2){
            type.setIsNew(true);
            type.setUpdated(false);

        }



        return retorno2;
    }

    public List<TwoType> findByFlexValue(String domainCode,
                                         String typeCode,
                                         String flexValue01,
                                         String flexValue02) {

        List <TwoType> retorno  = repositoryType.findByFlexValue(domainCode, typeCode, flexValue01, flexValue02);

        for (TwoType type : retorno){
            type.setIsNew(true);
            type.setUpdated(false);
        }


        return retorno;
    }


    public List<TwoType> findTypesByDomain(String domainCode,
                                           String flexValue01,
                                           String flexValue02) {

        List <TwoType> retorno  =  repositoryType.findByDomain(domainCode, flexValue01, flexValue02);

        for (TwoType type : retorno){
            type.setIsNew(true);
            type.setUpdated(false);
        }


        return retorno;
    }

    public List<TwoType> post(List<TwoType> body) {

        List<TwoType> response = new ArrayList<>();

        try {
            for (TwoType type : body) {
                response.add(type);
            }
        } catch (Exception e) {
            response = null;
        }

        for (TwoType typesave : response) {
            repositoryType.save(typesave);

        }
        return response;
    }

    public String delete(Long id) {
        String resuldatado;

        try {
            repositoryType.deleteById(id);
            resuldatado = "Type id: " + id +  " deletado com sucesso";

        } catch (Exception e) {
            resuldatado = "Erro ao deletar o Type id: " + id;

        }

        return resuldatado;
    }

    public List<TwoType> update(List<TwoType> body){
        String resultado;

        List<TwoType> response = new ArrayList<>();

        for (TwoType type : body) {
            if (!(type.getTypeId() == null)) {
                response.add(type);
                resultado = "Atualizado";
            }

            for (TwoType typesave : response) {
                repositoryType.save(typesave);
            }

        }
         return response;
    }
}




