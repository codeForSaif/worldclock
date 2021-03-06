/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FindCityDialog.java
 *
 * Created on 7 juin 2009, 19:47:38
 */
package lh.worldclock.editor;

import lh.worldclock.config.schema.City;

/**
 *
 * @author Ludovic
 */
public class FindCityDialog extends javax.swing.JDialog
{
  private boolean isOk = false;

  /** Creates new form FindCityDialog */
  public FindCityDialog(java.awt.Frame parent, boolean modal)
  {
    super(parent, modal);
    initComponents();
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btnOk = new javax.swing.JButton();
    btnCancel = new javax.swing.JButton();
    findCityPanelGeoname1 = new lh.worldclock.editor.FindCityPanelGeoname();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setName("Form"); // NOI18N

    org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(lh.worldclock.editor.EditorApp.class).getContext().getResourceMap(FindCityDialog.class);
    btnOk.setText(resourceMap.getString("btnOk.text")); // NOI18N
    btnOk.setName("btnOk"); // NOI18N
    btnOk.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnOkActionPerformed(evt);
      }
    });

    btnCancel.setText(resourceMap.getString("btnCancel.text")); // NOI18N
    btnCancel.setName("btnCancel"); // NOI18N
    btnCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCancelActionPerformed(evt);
      }
    });

    findCityPanelGeoname1.setName("findCityPanelGeoname1"); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(405, Short.MAX_VALUE)
        .addComponent(btnOk)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnCancel)
        .addContainerGap())
      .addComponent(findCityPanelGeoname1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addComponent(findCityPanelGeoname1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnCancel)
          .addComponent(btnOk))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOkActionPerformed
    {//GEN-HEADEREND:event_btnOkActionPerformed
      // TODO add your handling code here:
      isOk = true;
      dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelActionPerformed
    {//GEN-HEADEREND:event_btnCancelActionPerformed
      // TODO add your handling code here:
      isOk = false;
      dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

  public City getCity()
  {
    return findCityPanelGeoname1.getSelectedCity();
  }
  
  public void resetWith(City city)
  {
    isOk = false;
    findCityPanelGeoname1.resetWith(city);
  }
  
  public boolean isOk()
  {
    return isOk;
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCancel;
  private javax.swing.JButton btnOk;
  private lh.worldclock.editor.FindCityPanelGeoname findCityPanelGeoname1;
  // End of variables declaration//GEN-END:variables
}
