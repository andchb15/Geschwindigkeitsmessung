package ex0004;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Christopher Andrä
 */
public class VelocityDLG extends javax.swing.JDialog
{

    private boolean ok;

    public VelocityDLG(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    public boolean isOk()
    {
        return ok;
    }

    public Measurement getMeasurment()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate ld = LocalDate.parse(tfDatum.getText(), formatter);
        LocalTime tm = LocalTime.parse(tfUhrzeit.getText());
        String kennzeichen = tfKennzeichen.getText();
        int gemessen = Integer.parseInt(tfGemessen.getText());
        int erlaubt = Integer.parseInt(tfErlaubt.getText());
        int uebertreten = gemessen - erlaubt;
        Measurement me = new Measurement(ld, tm, kennzeichen, gemessen, erlaubt, uebertreten);
        return me;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lbDatum = new javax.swing.JLabel();
        tfDatum = new javax.swing.JTextField();
        lbUhrzeit = new javax.swing.JLabel();
        tfUhrzeit = new javax.swing.JTextField();
        lbKennzeichen = new javax.swing.JLabel();
        tfKennzeichen = new javax.swing.JTextField();
        lbGemessen = new javax.swing.JLabel();
        tfGemessen = new javax.swing.JTextField();
        lbErlaubt = new javax.swing.JLabel();
        tfErlaubt = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(6, 2));

        lbDatum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbDatum.setText("Datum :");
        getContentPane().add(lbDatum);

        tfDatum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfDatum.setText("02.04.2016");
        getContentPane().add(tfDatum);

        lbUhrzeit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbUhrzeit.setText("Uhrzeit :");
        getContentPane().add(lbUhrzeit);

        tfUhrzeit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfUhrzeit.setText("18:05");
        getContentPane().add(tfUhrzeit);

        lbKennzeichen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbKennzeichen.setText("Kennzeichen :");
        getContentPane().add(lbKennzeichen);

        tfKennzeichen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfKennzeichen.setText("LB-291-W");
        getContentPane().add(tfKennzeichen);

        lbGemessen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbGemessen.setText("V-Gemessen :");
        getContentPane().add(lbGemessen);

        tfGemessen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfGemessen.setText("95");
        getContentPane().add(tfGemessen);

        lbErlaubt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbErlaubt.setText("V-Erlaubt :");
        getContentPane().add(lbErlaubt);

        tfErlaubt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfErlaubt.setText("70");
        getContentPane().add(tfErlaubt);

        btAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btAdd.setText("Übernehmen");
        btAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onOk(evt);
            }
        });
        getContentPane().add(btAdd);

        btCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btCancel.setText("Abbrechen");
        btCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onCancel(evt);
            }
        });
        getContentPane().add(btCancel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onOk(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onOk
    {//GEN-HEADEREND:event_onOk
        ok = true;
        dispose();
    }//GEN-LAST:event_onOk

    private void onCancel(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onCancel
    {//GEN-HEADEREND:event_onCancel
        ok = false;
        dispose();
    }//GEN-LAST:event_onCancel

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VelocityDLG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VelocityDLG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VelocityDLG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VelocityDLG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                VelocityDLG dialog = new VelocityDLG(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btCancel;
    private javax.swing.JLabel lbDatum;
    private javax.swing.JLabel lbErlaubt;
    private javax.swing.JLabel lbGemessen;
    private javax.swing.JLabel lbKennzeichen;
    private javax.swing.JLabel lbUhrzeit;
    private javax.swing.JTextField tfDatum;
    private javax.swing.JTextField tfErlaubt;
    private javax.swing.JTextField tfGemessen;
    private javax.swing.JTextField tfKennzeichen;
    private javax.swing.JTextField tfUhrzeit;
    // End of variables declaration//GEN-END:variables
}
