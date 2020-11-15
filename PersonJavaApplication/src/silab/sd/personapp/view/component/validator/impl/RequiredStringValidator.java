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
public class RequiredStringValidator  implements Validator{

    @Override
    public void validate(Object object) throws ValidationException {
        if (!(object instanceof String)) throw  new ValidationException("Object is not String!");
        if (object.toString().isEmpty()) throw  new ValidationException("String is empty!");
    }
    
}
