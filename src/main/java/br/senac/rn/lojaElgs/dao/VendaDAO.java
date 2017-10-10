package br.senac.rn.lojaElgs.dao;

import br.senac.rn.lojaElgs.model.Venda;
import br.senac.rn.lojaElgs.util.GenericDAO;

public class VendaDAO extends GenericDAO<Venda> {

    @Override
    public Class<Venda> getClassType() {
        return Venda.class;
    }
    
}
