/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silab.sd.personapp.view.component.validator;

import silab.sd.personapp.view.component.exception.ValidationException;

/**
 *
 * @author laptop-02
 */
public interface Validator {
    void validate(Object object) throws ValidationException;
}
