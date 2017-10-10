package br.senac.rn.lojaElgs.dao;

import br.senac.rn.lojaElgs.model.Sexo;
import br.senac.rn.lojaElgs.util.GenericDAO;

public class SexoDAO extends GenericDAO<Sexo> {

    @Override
    public Class<Sexo> getClassType() {
        return Sexo.class;
    }
    
}
