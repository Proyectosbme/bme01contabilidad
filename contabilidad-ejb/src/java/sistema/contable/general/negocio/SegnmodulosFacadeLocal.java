/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.negocio;

import java.util.List;
import javax.ejb.Local;
import sistema.contable.general.entidades.Segnmodulos;

/**
 *
 * @author UES_BRYAN
 */
@Local
public interface SegnmodulosFacadeLocal {

    void create(Segnmodulos segnmodulos);

    void edit(Segnmodulos segnmodulos);

    void remove(Segnmodulos segnmodulos);

    Segnmodulos find(Object id);

    List<Segnmodulos> findAll();

    List<Segnmodulos> findRange(int[] range);

    int count();
    
}
