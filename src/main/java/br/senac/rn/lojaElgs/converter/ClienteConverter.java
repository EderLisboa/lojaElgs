/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.rn.lojaElgs.converter;

import br.senac.rn.lojaElgs.dao.MarcaDAO;
import br.senac.rn.lojaElgs.dao.ClienteDAO;
import br.senac.rn.lojaElgs.model.Marca;
import br.senac.rn.lojaElgs.model.Cliente;
import java.lang.annotation.Annotation;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "clienteConverter", forClass = Cliente.class)
public class ClienteConverter implements Converter {
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringCliente) {
        if (stringCliente != null) {
            int id = Integer.parseInt(stringCliente);
            ClienteDAO dao = new ClienteDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectCliente) {
        if (objectCliente != null) {
            Cliente cliente = (Cliente) objectCliente;
            return String.valueOf(cliente.getId());
        }
        return null;
    }
    
}
