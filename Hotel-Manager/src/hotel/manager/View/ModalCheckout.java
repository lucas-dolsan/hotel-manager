/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.manager.View;

import Control.BookingController;
import Control.TransferController;
import Model.Booking;
import Model.Transfer;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Schork
 */
public class ModalCheckout extends javax.swing.JFrame {

    /**
     * Creates new form ModalCheckout
     */
    public ModalCheckout() {
        initComponents();
    }

    public ModalCheckout(Booking booking) {
        initComponents();
        this.bookingCodeTextInput.setText(String.valueOf(booking.getCode()));
        this.additionalCostTextInput.setText(String.valueOf(booking.getAdditionalCost()));
        this.costTextInput.setText(String.valueOf(booking.getCost()));
        this.checkinDateTextInput.setText(String.valueOf(booking.getCheckinDate()));

        float totalCost = booking.getAdditionalCost() + booking.getCost();
        this.totalCostTextInput.setText(String.valueOf(totalCost));
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
        buttonCheckout = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        costTextInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        additionalCostTextInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        totalCostTextInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        guestTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        bookingCodeTextInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        checkinDateTextInput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Checkout");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Checkout");

        buttonCheckout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCheckout.setText("Efetuar checkout");
        buttonCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCheckoutActionPerformed(evt);
            }
        });

        buttonCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCancel.setText("Cancelar");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Custo inicial:");

        costTextInput.setEditable(false);
        costTextInput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Custos adicionais:");

        additionalCostTextInput.setEditable(false);
        additionalCostTextInput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Subtotal:");

        totalCostTextInput.setEditable(false);
        totalCostTextInput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        guestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jScrollPane1.setViewportView(guestTable);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Hóspedes envolvidos");

        bookingCodeTextInput.setEditable(false);
        bookingCodeTextInput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Código agendamento:");

        checkinDateTextInput.setEditable(false);
        checkinDateTextInput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Data de checkin:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(358, Short.MAX_VALUE)
                        .addComponent(buttonCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonCheckout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalCostTextInput))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(additionalCostTextInput)
                            .addComponent(checkinDateTextInput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(costTextInput)
                            .addComponent(bookingCodeTextInput)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bookingCodeTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(costTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(additionalCostTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkinDateTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(totalCostTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCheckoutActionPerformed
        BookingController bookingController = new BookingController();
        TransferController transferController = new TransferController();

        if (Integer.parseInt(this.bookingCodeTextInput.getText()) >= 0) {
            Booking booking = bookingController.findBookingByCode(Integer.parseInt(this.bookingCodeTextInput.getText()));
            if (!booking.isArchived()) {
                booking.setCheckoutDate(new Date().toString());
                booking.setArchived(true);
                bookingController.editBooking(booking);

                ArrayList<Transfer> transfers = transferController.getAllTransfers();
                if (transfers.size() > 0) {
                    Transfer lastTransfer = transfers.get(transfers.size() - 1);
                    int newTransferCode = lastTransfer.getCode() + 1;
                    Transfer transfer = new Transfer(newTransferCode, Float.parseFloat(this.totalCostTextInput.getText()), ("Entrada partindo do agendamento número: " + this.bookingCodeTextInput.getText()), new Date().toString(), true);
                    transferController.createNewTransfer(transfer);
                } else {
                    Transfer transfer = new Transfer(1, Float.parseFloat(this.totalCostTextInput.getText()), ("Entrada partindo do agendamento número: " + this.bookingCodeTextInput.getText()), new Date().toString(), true);
                    transferController.createNewTransfer(transfer);
                }
            }
        }
        this.dispose();
    }//GEN-LAST:event_buttonCheckoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField additionalCostTextInput;
    private javax.swing.JTextField bookingCodeTextInput;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonCheckout;
    private javax.swing.JTextField checkinDateTextInput;
    private javax.swing.JTextField costTextInput;
    private javax.swing.JTable guestTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField totalCostTextInput;
    // End of variables declaration//GEN-END:variables
}
