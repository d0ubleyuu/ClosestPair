/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asd.klp.pkg3.closest.pair;

import java.util.*;
import java.text.DecimalFormat;

/**
 *
 * @author wahyu
 */
public class ClosestPair extends javax.swing.JFrame {

    /**
     * Creates new form ClosestPair
     */
    ClosestPairOfPoints cpp = new ClosestPairOfPoints();
    static StringBuilder logs;
    
    public ClosestPair() {
        initComponents();
        reset();
    }
    
    public void reset(){
        // set button
        points.setText("");
        loops.setText("");
        minx.setText("");
        miny.setText("");
        maxx.setText("");
        maxy.setText("");
        indikator.setText("");
        log.setText("");
        sukses.setText("");
        bft.setText("");
        dnct.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        points = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        loops = new javax.swing.JTextField();
        miny = new javax.swing.JTextField();
        minx = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        maxy = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        maxx = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        log = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sukses = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bft = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        dnct = new javax.swing.JTextField();
        indikator = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Closest Pair ~ DnC Vs BruteForce");

        jPanel1.setBackground(new java.awt.Color(0, 128, 255));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(251, 250, 250));
        jLabel1.setText("Closest Pair");

        jSeparator1.setForeground(new java.awt.Color(251, 250, 250));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 250, 250));
        jLabel2.setText("DnC Vs BruteFroce");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(251, 250, 250));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(26, 24, 24));
        jLabel3.setText("Looping");

        points.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(26, 24, 24));
        jLabel4.setText("Points each Looping");

        loops.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        miny.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        minx.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(26, 24, 24));
        jLabel5.setText("Min X");

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(26, 24, 24));
        jLabel6.setText("Min Y");

        maxy.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(26, 24, 24));
        jLabel7.setText("Max Y");

        maxx.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(26, 24, 24));
        jLabel8.setText("Max X");

        jSeparator2.setForeground(new java.awt.Color(26, 24, 24));

        jSeparator3.setForeground(new java.awt.Color(26, 24, 24));

        jButton1.setBackground(new java.awt.Color(247, 184, 28));
        jButton1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Process");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 128, 255));
        jButton2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("Clear");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        log.setEditable(false);
        log.setColumns(20);
        log.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        log.setRows(5);
        log.setTabSize(4);
        jScrollPane1.setViewportView(log);

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(26, 24, 24));
        jLabel9.setText("Logs");

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(26, 24, 24));
        jLabel10.setText("Success Of");

        sukses.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(26, 24, 24));
        jLabel11.setText("Time Of BruteForce");

        bft.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(26, 24, 24));
        jLabel12.setText("Time Of DnC");

        dnct.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        indikator.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        indikator.setForeground(new java.awt.Color(79, 175, 97));
        indikator.setText("jLabel13");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11)
                                .addComponent(bft, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(sukses, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(indikator)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(maxx, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(75, 75, 75)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(maxy, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(minx, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(75, 75, 75)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(miny, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(points, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(75, 75, 75)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(loops, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator2)
                        .addComponent(jSeparator3))
                    .addComponent(jLabel12)
                    .addComponent(dnct, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(points, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(miny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(loops, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sukses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(indikator)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dnct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // kebutuhan log, input, dan waktu 
        logs = new StringBuilder();
        int totalLoop = Integer.parseInt(points.getText());
        int totalPointsPerLoop = Integer.parseInt(loops.getText());
        
        double minX = Double.parseDouble(minx.getText());
        double maxX = Double.parseDouble(maxx.getText());
        double minY = Double.parseDouble(miny.getText());
        double maxY = Double.parseDouble(maxy.getText());
        
        int passed = 0;
        long nlognTime = 0;
        long nsqTime = 0;
        long startTime;
        
        String msg = "\nMenjalankan " + totalLoop + " cases, setiap case memiliki " + totalPointsPerLoop + " points atau koordinat\n\n";
        logs.append(msg);
        
        for(int k=0;k<totalLoop;k++){
            Point[] ps = cpp.generateRandomPoints(totalPointsPerLoop, maxX, minX, maxY, minY);
            startTime = new Date().getTime();

            Point[] pair = cpp.getClosestPair(ps);
            nlognTime += (new Date().getTime() - startTime);

            double distance = cpp.getDistance(pair);
            logs.append("[ok] = " + pair[0].toString() + "," + pair[1].toString() + " = " + distance + "\n");

            startTime = new Date().getTime();
            pair = cpp.bruteForce(ps);

            nsqTime += (new Date().getTime() - startTime);
            double distance2 = cpp.getDistance(pair);
            if(distance==distance2){
                    passed++;
            }
        }
        
        indikator.setText("Done");
        log.setText(logs.toString());
        sukses.setText(passed + "/" + totalLoop);
        bft.setText(String.valueOf(nsqTime) + " ms");
        dnct.setText(String.valueOf(nlognTime)+ " ms");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // set button
        reset();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClosestPair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClosestPair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClosestPair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClosestPair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClosestPair().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bft;
    private javax.swing.JTextField dnct;
    private javax.swing.JLabel indikator;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea log;
    private javax.swing.JTextField loops;
    private javax.swing.JTextField maxx;
    private javax.swing.JTextField maxy;
    private javax.swing.JTextField minx;
    private javax.swing.JTextField miny;
    private javax.swing.JTextField points;
    private javax.swing.JTextField sukses;
    // End of variables declaration//GEN-END:variables
}


class ClosestPairOfPoints {
    // generate titik acak 
    public Point[] generateRandomPoints(int size,double maxX, double minX,double maxY,double minY){
        Point[] points = new Point[size];
        for(int i=0;i<size;i++){
            points[i] = new Point(
                Math.random()*(maxX-minX) + minX,
                Math.random()*(maxY-minY) + minY);
        }
        return points;
    }
	
    // = ???(x2???x1)^2+(y2???y1)^2  
    public double getDistance(Point[] ps) {
        if(ps==null||ps.length!=2){
            return -1;
        }
        return Math.pow(
            (ps[0].x-ps[1].x) * (ps[0].x-ps[1].x) + 
            (ps[0].y-ps[1].y) * (ps[0].y-ps[1].y), 0.5);
    }

    public Point[] bruteForce(Point[] ps){
        if(ps.length==2){
            return ps;
        }
        Point[] pair = new Point[2];
        Point[] temp = new Point[2];
        double min = Double.MAX_VALUE;
        for(int i=0;i<ps.length;i++)
            for(int j=i+1;j<ps.length;j++){
                temp[0] = ps[i];
                temp[1] = ps[j];
                double dis = this.getDistance(temp);
                if(dis<min){
                        min = dis;
                        pair[0] = temp[0];
                        pair[1] = temp[1];
                }
            }
        return pair;
    }

    public Point[] getClosestPair(Point[] ps){
        // urutkan berdasarkan absis x
        sortPointsByX(ps);

        // kemudian hitung
        return getClosestPair(ps,0,ps.length-1);
    }

    /**
     * menggunakan quick sort
     * kompleksitas: O(n log n)
     */
    public void sortPointsByX(Point[] ps) {
        int size = ps.length;
        quickSort(ps,0,size-1);
    }

    public void quickSort(Point[] ps, int left, int right) {
        if (left >= right)
            return;
        int i = left, j = right;
        Point tmp;
        double pivot = (ps[left].x + ps[right].x) / 2;        while (i <= j) {
            while (ps[i].x < pivot)
                i++;
            while (ps[j].x > pivot)
                j--;
            if (i <= j) {
                tmp = ps[i];
                ps[i] = ps[j];
                ps[j] = tmp;
                i++;
                j--;
            }
        }

        if (left < i - 1)
            quickSort(ps, left, i - 1);
        if (i < right)
            quickSort(ps, i, right);
    }
	
    /**
     * @param ps: sebelumnya udah di sort berdasarkan absis
     */
    public Point[] getClosestPair(Point[] ps, int start, int end){
        if(start==end)
            return null;
        if(start+1==end)
            return new Point[]{ps[start],ps[end]};

        // menentukan medium X
        int mediumX = (start+end)/2;
        
        // kemudian solve secara rekursif
        Point[] leftClosestPair = this.getClosestPair(ps, start, mediumX);
        Point[] rightCloestPair = this.getClosestPair(ps, mediumX, end);
        Point[] returnPair;
        double returnDelta;


        // cari minimal distance untuk masing-masing (sebelah kiri dan kanan)
        double leftDelta = this.getDistance(leftClosestPair);
        double rightDelta = this.getDistance(rightCloestPair);
        double delta;
        if(leftDelta < rightDelta){
            delta = leftDelta;
            returnPair = leftClosestPair;
        }else{
            delta = rightDelta;
            returnPair = rightCloestPair;
        }
        returnDelta = delta;
        
        // mentukan jarak minimal antara pasangan titik yg terletak di satu sisi dan yg terletak di sisi lain
        int leftEdge = this.getLeftEdgeOfDelta(ps, mediumX, leftDelta);
        if(leftEdge < start)
            leftEdge = start;
        int rightEdge = this.getRightEdgeOfDelta(ps, mediumX, rightDelta);
        if(rightEdge > end)
            rightEdge = end;

        // urutkan points yang edge sebelah kiri dan kanan berdasarkan ordinat atau Y
        // Time: O(n log n)
        int yOrderInfo[][] = this.sortPointsByY(ps,leftEdge,rightEdge);
        int idxToOrderY[] = yOrderInfo[0];
        int orderYToIdx[] = yOrderInfo[1];

        // periksa apakah ada titik di [mediumX, rightEdge] yang memiliki jarak kurang dari delta ke titik ini
        for(int i=leftEdge;i<=mediumX;i++){
            int orderY = idxToOrderY[i-leftEdge];
            for(int j=orderY-1;j>=0;j--){
                Point[] pair = new Point[]{ps[i],ps[orderYToIdx[j]]};
                if(this.getYDistance(pair) > delta)
                    break;
                double distance = this.getDistance(pair);
                if(distance < returnDelta){
                    returnDelta = distance;
                    returnPair = pair;
                }
            }

            for(int j=orderY+1;j<idxToOrderY.length;j++){
                Point[] pair = new Point[]{ps[i],ps[orderYToIdx[j]]};
                if(this.getYDistance(pair) > delta)
                    break;
                double distance = this.getDistance(pair);
                if(distance < returnDelta){
                    returnDelta = distance;
                    returnPair = pair;
                }				
            }
        }
        return returnPair;
    }
	
    // mengurutkan ordinat menggunakan quick sort, cost n log n
    public int[][] sortPointsByY(Point[] ps, int leftEdge, int rightEdge) {
        int size = rightEdge - leftEdge + 1;
        int orderToIdx[] = new int[size];
        for(int i=0;i<size;i++)
                orderToIdx[i] = leftEdge+i;
        quickSortForDeltaArea(ps, orderToIdx, 0, size-1);
        int idxToOrder[] = new int[size];
        for(int i=0;i<size;i++){
                idxToOrder[orderToIdx[i]-leftEdge] = i;
        }
        return new int[][]{idxToOrder,orderToIdx};
    }
	
    // quick sort untuk delta area, kiri medium & kanan medium
    public void quickSortForDeltaArea(Point[] ps,int[] indexs, int left, int right) {
        if (left >= right)
            return;
        int i = left, j = right;
        int tmp;
        double pivot = ( ps[indexs[left]].y + ps[indexs[right]].y) / 2;

        while (i <= j) {
            while (ps[indexs[i]].y < pivot)
                i++;
            while (ps[indexs[j]].y > pivot)
                j--;
            if (i <= j) {
                tmp = indexs[i];
                indexs[i] = indexs[j];
                indexs[j] = tmp;
                i++;
                j--;
            }
        }


        if (left < i - 1)
            quickSortForDeltaArea(ps, indexs, left, i - 1);
        if (i < right)
            quickSortForDeltaArea(ps, indexs, i, right);
    }

    // hitung tepi kanan area delta 
    public int getRightEdgeOfDelta(Point[] ps, int mediumX, double rightDelta) {
        for(int i=mediumX;i<ps.length;i++){
            if(ps[i].x - ps[mediumX].x>rightDelta)
                return i-1;
        }
        return ps.length-1;
    }

    // hitung tepi kiri area delta 
    public int getLeftEdgeOfDelta(Point[] ps, int mediumX, double leftDelta) {
        for(int i=mediumX;i>=0;i--){
            if(ps[mediumX].x - ps[i].x>leftDelta)
                return i+1;
        }
        return 0;
    }
	
    // y distance
    public double getYDistance(Point[] ps) {
        return Math.abs(ps[0].y - ps[1].y);
    }
}

class Point{
    public double x;
    public double y;
    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}