package br.senac.rn.lojaElgs.controller;

import br.senac.rn.lojaElgs.dao.MarcaDAO;
import br.senac.rn.lojaElgs.model.Marca;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "marcaBean")
public class MarcaBean {

    private Marca marca = new Marca();

    public void salvar() {
        MarcaDAO dao = new MarcaDAO();
        if (this.marca.getId() == 0) {
            dao.insert(this.marca);
        } else {
            dao.update(this.marca);
        }
        this.marca = new Marca();
    }
    
    public void editar(Marca marca) {
        this.marca = marca;
    }
    
    public void remover(Marca marca) {
        MarcaDAO dao = new MarcaDAO();
        dao.delete(marca);
    }
    
    public List<Marca> getMarcas() {
        MarcaDAO dao = new MarcaDAO();
        return dao.selectAll();
    }
    
    public Marca getMarca() {
        return marca;
    }

    public void setCategoria(Marca marca) {
        this.marca = marca;
    }
    
}
