/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silab.sd.personapp.view.component.validator.impl;

import silab.sd.personapp.view.component.exception.ValidationException;
import silab.sd.personapp.view.component.validator.Validator;

/**
 *
 * @author laptop-02
 */
public class WordStringValidator implements Validator{
    
    //proveri da li je objekat tj. rec
    //rec minimalna duzina jeste 2, svi znakovi moraju biti slova
    @Override
    public void validate(Object object) throws ValidationException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
