/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hr.algebra.view;

import hr.algebra.dal.Repository;
import hr.algebra.dal.RepositoryFactory;
import hr.algebra.enumm.Role;
import hr.algebra.model.Person;
import hr.algebra.utilities.MessageUtils;
import hr.algebra.view.model.PersonTableModel;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;

/**
 *
 * @author lorenababic
 */
public class PersonPanel extends javax.swing.JPanel {
    
    public static final String PERSON_PANEL = "Person";
    
    private Repository repository;
    
    private PersonTableModel personTableModel;
    private Person selectedPerson;

    /**
     * Creates new form PersonPanel
     */
    public PersonPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        cbRole = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPeople = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(918, 1002));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Name:");

        jLabel2.setText("Role:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tbPeople.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbPeople.setPreferredSize(new java.awt.Dimension(918, 1002));
        tbPeople.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPeopleMouseClicked(evt);
            }
        });
        tbPeople.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbPeopleKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbPeople);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbRole, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(329, 329, 329)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addGap(0, 343, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(419, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(!formValid()){
            return;
        }
        
        try{
            Person person = new Person(
                    tfName.getText().trim(),
                    Role.fromString(cbRole.getSelectedItem().toString())
            );
            
            repository.createPerson(person);
            
            personTableModel.setPeople(repository.selectPeople());
            clearForm();
        }
        catch (Exception ex) {
            Logger.getLogger(PersonPanel.class.getName()).log(Level.SEVERE, null, ex);
            MessageUtils.showErrorMessage(PERSON_PANEL, "Error while creating person");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(selectedPerson == null) {
            MessageUtils.showErrorMessage(PERSON_PANEL, "Error, choose a person");
            return;
        } 
        if(!formValid()) {
            return;
        }
        
        try {
            selectedPerson.setName(tfName.getText().trim());
            selectedPerson.setRole(Role.fromString(cbRole.getSelectedItem().toString()));

            repository.updatePerson(selectedPerson.getId(), selectedPerson);
            personTableModel.setPeople(repository.selectPeople());

            clearForm();

            MessageUtils.showInformationMessage(PERSON_PANEL, "Person has been successfully updated!");
        } catch (Exception ex) {
            MessageUtils.showErrorMessage(PERSON_PANEL, "An error occurred while updating person!");
            Logger.getLogger(PersonPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if(selectedPerson == null) {
            MessageUtils.showErrorMessage(PERSON_PANEL, "Error, choose a person");
            return;
        } 
        if(!formValid()) {
            return;
        }        
        try {
            if (MessageUtils.showConfirmDialog("Delete person", "Are you sure you want to delete this person?")) {
                repository.deletePerson(selectedPerson.getId());
                personTableModel.setPeople(repository.selectPeople());

                clearForm();
                MessageUtils.showInformationMessage(PERSON_PANEL, "Person has been succesfully deleted!");
            }
        } catch (Exception ex) {
            MessageUtils.showErrorMessage(PERSON_PANEL, "An error occurred while deleting person!");
            Logger.getLogger(PersonPanel.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        init();
        clearForm();
    }//GEN-LAST:event_formComponentShown

    private void tbPeopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPeopleMouseClicked
        // TODO add your handling code here:
        showPerson();
    }//GEN-LAST:event_tbPeopleMouseClicked

    private void tbPeopleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbPeopleKeyReleased
        // TODO add your handling code here:
        showPerson();
    }//GEN-LAST:event_tbPeopleKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPeople;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables

    private boolean formValid() {
        if(tfName.getText().trim().isEmpty()) {
            MessageUtils.showInformationMessage(PERSON_PANEL, "Please fill out field");
            return false;
        }
        if(cbRole.getSelectedIndex() == -1) {
            MessageUtils.showInformationMessage(PERSON_PANEL, "Please fill out field");
            return false;
        }
        return true;
    }

    private void clearForm() {
        tfName.setText("");
        cbRole.setSelectedIndex(-1);
        selectedPerson = null;
    }

    private void init() {
        try {
            initRepository();
            initRoles();
            initTable();
        }
        catch (Exception ex) {
            Logger.getLogger(PersonPanel.class.getName()).log(Level.SEVERE, null, ex);
            MessageUtils.showErrorMessage(PERSON_PANEL, "Error initializing form");
            System.exit(1);
        }
    }

    private void showPerson() {
        try{
            clearForm();
            
            int selectedRow = tbPeople.getSelectedRow();
            int rowIndex = tbPeople.convertRowIndexToModel(selectedRow);
            int id = (int) personTableModel.getValueAt(rowIndex, 0);
            
            Optional<Person> optPerson = repository.selectPerson(id);
            if(optPerson.isPresent()) {
                selectedPerson = optPerson.get();
                fillForm(selectedPerson);
            }
        }
        catch(Exception ex)
        {
            MessageUtils.showErrorMessage(PERSON_PANEL, "Error while showing person");
            Logger.getLogger(PersonPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initRepository() {
        repository = RepositoryFactory.getRepository();
    }

    private void initRoles() {
        cbRole.removeAllItems();
        cbRole.addItem(Role.ACTOR.name());
        cbRole.addItem(Role.DIRECTOR.name());
    }

    private void initTable() throws Exception {
        tbPeople.setRowHeight(25);
        tbPeople.setAutoCreateRowSorter(true);
        tbPeople.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        personTableModel = new PersonTableModel(repository.selectPeople());
        tbPeople.setModel(personTableModel);
    }

    private void fillForm(Person selectedPerson) {
        tfName.setText(selectedPerson.getName());
        cbRole.setSelectedItem(selectedPerson.getRole().name());
    }
}
