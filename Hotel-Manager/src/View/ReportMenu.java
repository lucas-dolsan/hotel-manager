/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.BookingController;
import Control.GuestController;
import Control.RoomController;
import Model.Booking;
import Model.Guest;
import Model.Room;
import java.util.ArrayList;

/**
 *
 * @author 09046138950
 */
public class ReportMenu extends javax.swing.JFrame {

    /**
     * Creates new form ReportsMenu
     */
    public ReportMenu() {
        initComponents();

        //métdo para set em todos os indicadores da tela
        loadValues();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        allCheckoutsLabel = new javax.swing.JLabel();
        allBookingsLabel = new javax.swing.JLabel();
        pendingChecktousLabel = new javax.swing.JLabel();
        onGoingBookingsLabel = new javax.swing.JLabel();
        finishedBookingsLabel = new javax.swing.JLabel();
        allCheckinsLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        totalRoomLabel = new javax.swing.JLabel();
        totalGuestLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(700, 470));
        setMinimumSize(new java.awt.Dimension(700, 470));
        setPreferredSize(new java.awt.Dimension(700, 470));
        setSize(new java.awt.Dimension(700, 470));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Relatório geral");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Checkouts feitos até o momento");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Checkins feitos até o momento");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Checkouts pendentes");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Agendamentos totais");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Agendamentos em andamento");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Agendamentos finalizados");

        allCheckoutsLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        allCheckoutsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        allBookingsLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        allBookingsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pendingChecktousLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pendingChecktousLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        onGoingBookingsLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        onGoingBookingsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        finishedBookingsLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        finishedBookingsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        allCheckinsLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        allCheckinsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allCheckinsLabel.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Hóspedes cadastrados");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Total de quartos");

        totalRoomLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        totalRoomLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        totalGuestLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        totalGuestLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalRoomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(allBookingsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(onGoingBookingsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(allCheckinsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalGuestLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(allCheckoutsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pendingChecktousLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(finishedBookingsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allCheckoutsLabel)
                    .addComponent(allCheckinsLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allBookingsLabel)
                    .addComponent(pendingChecktousLabel))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onGoingBookingsLabel)
                    .addComponent(finishedBookingsLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalGuestLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalRoomLabel))
                .addGap(46, 46, 46))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void loadValues() {
        BookingController bookingController = new BookingController();
        RoomController roomController = new RoomController();
        GuestController guestController = new GuestController();
        
        ArrayList<Room> rooms = roomController.getAllRooms();
        ArrayList<Booking> bookings = bookingController.getAllBookings();
        ArrayList<Guest> guests = guestController.getAllGuests();
        
        int countCheckoutsPending = 0;
        int countAllCheckins = 0;
        int countAllCheckouts = 0;
        int countArchived = 0;
        int countNoArchived = 0;
        
        for (Booking booking : bookings) {
            if (booking.isArchived()) {
                countArchived++;
            } else {
                countNoArchived++;
            }
            if (!booking.getCheckinDate().equals("null")) {
                countAllCheckins++;
            }
            
            if (!booking.getCheckoutDate().equals("null")) {
                countAllCheckouts++;
            }
            
            if (!(booking.getCheckinDate().equals("null")) && (booking.getCheckoutDate().equals("null"))) {
                countCheckoutsPending++;
            }
        }
        
        this.totalGuestLabel.setText(String.valueOf(guests.size()));
        this.totalRoomLabel.setText(String.valueOf(rooms.size()));
        this.allCheckinsLabel.setText(String.valueOf(countAllCheckins));
        this.allCheckoutsLabel.setText(String.valueOf(countAllCheckouts));
        this.allBookingsLabel.setText(String.valueOf(bookings.size()));
        this.finishedBookingsLabel.setText(String.valueOf(countArchived));
        this.onGoingBookingsLabel.setText(String.valueOf(countNoArchived));
        this.pendingChecktousLabel.setText(String.valueOf(countCheckoutsPending));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allBookingsLabel;
    private javax.swing.JLabel allCheckinsLabel;
    private javax.swing.JLabel allCheckoutsLabel;
    private javax.swing.JLabel finishedBookingsLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel onGoingBookingsLabel;
    private javax.swing.JLabel pendingChecktousLabel;
    private javax.swing.JLabel totalGuestLabel;
    private javax.swing.JLabel totalRoomLabel;
    // End of variables declaration//GEN-END:variables
}
