package br.senac.rn.lojaElgs.converter;

import br.senac.rn.lojaElgs.dao.MarcaDAO;
import br.senac.rn.lojaElgs.model.Marca;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "marcaConverter", forClass = Marca.class)
public class MarcaConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringMarca) {
        if (stringMarca != null) {
            int id = Integer.parseInt(stringMarca);
            MarcaDAO dao = new MarcaDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectMarca) {
        if (objectMarca != null) {
            Marca categoria = (Marca) objectMarca;
            return String.valueOf(categoria.getId());
        }
        return null;
    }
    
}
