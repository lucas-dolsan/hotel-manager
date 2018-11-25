/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.manager.View;

import Model.Booking;
import Model.Guest;

/**
 *
 * @author Schork
 */
public class ModalBooking extends javax.swing.JFrame {

    /**
     * Creates new form ModalBooking
     */
    private Booking booking = new Booking();

    public ModalBooking() {
        initComponents();
        this.buttonDelete.setEnabled(false);
    }

    public ModalBooking(Booking booking) {
        initComponents();
        this.booking = booking;
        radioButtonCheckinAuto.setEnabled(false);
        this.costInputText.setText(String.valueOf(booking.getCost()));
        this.roomPicker.addItem(String.valueOf(booking.getRoom().getNumber()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roomPicker = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        guestsTable = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jLabel2 = new javax.swing.JLabel();
        costInputText = new javax.swing.JTextField();
        buttonAddGuest = new javax.swing.JButton();
        radioButtonCheckinAuto = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        guestPicker = new javax.swing.JComboBox<>();
        buttonRegisterGuest = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agendamento");
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));

        roomPicker.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Número do quarto:");

        buttonSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonSave.setText("Salvar");

        buttonDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonDelete.setText("Excluir");

        guestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {123, "Marcelinha"},
                {1, "me chupa"},
                {23, "sua sapeca"},
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        guestsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guestsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(guestsTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Custo inicial:");

        costInputText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        buttonAddGuest.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonAddGuest.setText("Adicionar hóspede");
        buttonAddGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddGuestActionPerformed(evt);
            }
        });

        radioButtonCheckinAuto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radioButtonCheckinAuto.setText("Incluir checkin");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Código do hóspede:");

        guestPicker.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        buttonRegisterGuest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonRegisterGuest.setText("Cadastrar pessoa");
        buttonRegisterGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterGuestActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Hóspedes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(radioButtonCheckinAuto)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(roomPicker, 0, 373, Short.MAX_VALUE)
                                        .addComponent(costInputText))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guestPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonAddGuest))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(buttonRegisterGuest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(costInputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioButtonCheckinAuto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddGuest)
                    .addComponent(guestPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegisterGuest)
                    .addComponent(buttonDelete)
                    .addComponent(buttonSave))
                .addGap(59, 59, 59))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddGuestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAddGuestActionPerformed

    private void buttonRegisterGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterGuestActionPerformed
        ModalGuest modalGuest = new ModalGuest();
        modalGuest.setVisible(true);
    }//GEN-LAST:event_buttonRegisterGuestActionPerformed

    private void guestsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestsTableMouseClicked
        Guest guest = new Guest((int) guestsTable.getValueAt(guestsTable.rowAtPoint(evt.getPoint()), 0), (String) guestsTable.getValueAt(guestsTable.rowAtPoint(evt.getPoint()), 1));
        ModalGuest modalGuest = new ModalGuest(guest);
        modalGuest.setVisible(true);
    }//GEN-LAST:event_guestsTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddGuest;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonRegisterGuest;
    private javax.swing.JButton buttonSave;
    private javax.swing.JTextField costInputText;
    private javax.swing.JComboBox<String> guestPicker;
    private javax.swing.JTable guestsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioButtonCheckinAuto;
    private javax.swing.JComboBox<String> roomPicker;
    // End of variables declaration//GEN-END:variables
}
