/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.negocio;

import java.util.List;
import javax.ejb.Local;
import sistema.contable.general.entidades.Gencorr;

/**
 *
 * @author UES_BRYAN
 */
@Local
public interface GencorrFacadeLocal {

    void create(Gencorr gencorr);

    void edit(Gencorr gencorr);

    void remove(Gencorr gencorr);

    Gencorr find(Object id);

    List<Gencorr> findAll();

    List<Gencorr> findRange(int[] range);

    int count();
    
}
