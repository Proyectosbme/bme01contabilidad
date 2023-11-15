/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.negocio;

import java.util.List;
import javax.ejb.Local;
import sistema.contable.general.entidades.Genemail;

/**
 *
 * @author UES_BRYAN
 */
@Local
public interface GenemailFacadeLocal {

    void create(Genemail genemail);

    void edit(Genemail genemail);

    void remove(Genemail genemail);

    Genemail find(Object id);

    List<Genemail> findAll();

    List<Genemail> findRange(int[] range);

    int count();
    
}
