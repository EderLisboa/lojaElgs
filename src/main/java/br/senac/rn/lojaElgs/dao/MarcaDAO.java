package br.senac.rn.lojaElgs.dao;

import br.senac.rn.lojaElgs.model.Marca;
import br.senac.rn.lojaElgs.util.GenericDAO;

public class MarcaDAO extends GenericDAO<Marca> {

    @Override
    public Class<Marca> getClassType() {
        return Marca.class;
    }

}
