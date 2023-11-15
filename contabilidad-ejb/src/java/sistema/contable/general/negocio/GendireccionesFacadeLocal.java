/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.contable.general.negocio;

import java.util.List;
import javax.ejb.Local;
import sistema.contable.general.entidades.Gendirecciones;

/**
 *
 * @author UES_BRYAN
 */
@Local
public interface GendireccionesFacadeLocal {

    void create(Gendirecciones gendirecciones);

    void edit(Gendirecciones gendirecciones);

    void remove(Gendirecciones gendirecciones);

    Gendirecciones find(Object id);

    List<Gendirecciones> findAll();

    List<Gendirecciones> findRange(int[] range);

    int count();
    
}
