/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silab.sd.personapp.view.component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import silab.sd.personapp.view.component.validator.impl.RequiredStringValidator;
import silab.sd.personapp.view.form.FrmPersonComponent;

/**
 *
 * @author HP
 */
public class PersonAdd extends javax.swing.JPanel {

    /**
     * Creates new form PersonAdd
     */
    public PersonAdd() {
        initComponents();
        prepareComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputFirstname = new silab.sd.personapp.view.component.InputTextfieldPanel();
        inputLastname = new silab.sd.personapp.view.component.InputTextfieldPanel();
        inputGender = new silab.sd.personapp.view.component.InputComboPanel();
        inputMarried = new silab.sd.personapp.view.component.InputComboPanel();
        inputBirthday = new silab.sd.personapp.view.component.InputDateSepareteElements();
        brnSave = new javax.swing.JButton();

        brnSave.setText("Save");
        brnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(inputBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(brnSave)
                        .addComponent(inputMarried, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(inputFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputMarried, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brnSave)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void brnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnSaveActionPerformed
        
        try{
            String firstname = inputFirstname.getValue().toString();
            
            JOptionPane.showMessageDialog(this, "Ime: " + firstname);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Validacija nije prosla.");
        }
        
         try{
            String lastname = inputLastname.getValue().toString();
            
            JOptionPane.showMessageDialog(this, "Prezime: " + lastname);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Validacija nije prosla.");
        }
        
        try {
            String gender = inputGender.getValue().toString();
            JOptionPane.showMessageDialog(this, "Pol: " + gender);
        } catch (Exception ex) {
            Logger.getLogger(FrmPersonComponent.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        try {
            Date birthDay = (Date) inputBirthday.getValue();
            JOptionPane.showMessageDialog(this, "Datum rodjenja: " + new SimpleDateFormat("dd.mm.yyyy.").format(birthDay));
        } catch (Exception ex) {
            Logger.getLogger(FrmPersonComponent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
 
    }//GEN-LAST:event_brnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnSave;
    private silab.sd.personapp.view.component.InputDateSepareteElements inputBirthday;
    private silab.sd.personapp.view.component.InputTextfieldPanel inputFirstname;
    private silab.sd.personapp.view.component.InputComboPanel inputGender;
    private silab.sd.personapp.view.component.InputTextfieldPanel inputLastname;
    private silab.sd.personapp.view.component.InputComboPanel inputMarried;
    // End of variables declaration//GEN-END:variables

private void prepareComponents() {
        inputFirstname.setValidator(new RequiredStringValidator());
        inputFirstname.getLblText().setText("Firstname:");
        inputFirstname.getLblErrorValue().setText("");
        
        inputLastname.setValidator(new RequiredStringValidator());
        inputLastname.getLblText().setText("Lastname:");
        inputLastname.getLblErrorValue().setText("");
        
        inputGender.getLblText().setText("Gender:");
        inputGender.getLblErrorValue().setText("");
        
        inputGender.getCbValue().removeAllItems();
        /*
        inputGender.getCbValue().addItem("Male");
        inputGender.getCbValue().addItem("Female");
        */
        List<String> genders = new ArrayList<String>(){
            {
                add("Male");
                add("Female");
            }
        };
        inputGender.getCbValue().setModel(new DefaultComboBoxModel<>(genders.toArray()));
        
        inputBirthday.getLblText().setText("Birthday:");
        inputBirthday.getLblErrorValue().setText("");
        
        inputMarried.getLblText().setText("Married");
        inputMarried.getCbValue().removeAllItems();
        List<String> married = new ArrayList<String>(){
            {
                add("Single");
                add("Married");
            }
        };
        inputMarried.getCbValue().setModel(new DefaultComboBoxModel<>(married.toArray()));
        inputMarried.getLblErrorValue().setText("");
    }

}