

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
/**
* 
* @author alumno
*/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Categoria extends javax.swing.JFrame {

    ArrayList arrCategoria;
    ArrayList arrBuscar;
    
    /**
     * Creates new form Categoria
     */
    public Categoria() {
         initComponents();
         
         lbBusquedas.setVisible(false);
        lbBusquedas.setText("-1");
        
        arrCategoria = new ArrayList();
        arrBuscar = new ArrayList();
     
        
         this.setLocationRelativeTo (null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Categoria = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        SelecCate = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        cbLista = new javax.swing.JComboBox<>();
        BusPro = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        lbBusquedas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Categoria.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Categoria.setText("Categoría");
        getContentPane().add(Categoria);
        Categoria.setBounds(63, 21, 115, 29);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo);
        btnNuevo.setBounds(90, 70, 63, 23);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 128, 473, 10);

        SelecCate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SelecCate.setText("Seleccione una Categoría ");
        getContentPane().add(SelecCate);
        SelecCate.setBounds(50, 200, 157, 15);

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscar);
        txtBuscar.setBounds(170, 270, 170, 30);

        cbLista.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipos de Categoria", "Celulares ", "Laptops", "Computadoras de Escritorio", "Consolas ", "Videojuegos", "Audifonos ", "Microfonos ", "Camaras", "Electrodomesticos " }));
        getContentPane().add(cbLista);
        cbLista.setBounds(220, 200, 197, 21);

        BusPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BusPro.setText("Buscar Producto");
        getContentPane().add(BusPro);
        BusPro.setBounds(50, 270, 101, 15);

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(220, 310, 73, 23);
        getContentPane().add(imagen);
        imagen.setBounds(317, 21, 0, 0);

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar Busqueda");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(50, 390, 145, 23);

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(260, 390, 160, 23);

        btnregresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregresar);
        btnregresar.setBounds(140, 450, 180, 23);
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 470, 130);

        lbBusquedas.setText("0");
        getContentPane().add(lbBusquedas);
        lbBusquedas.setBounds(400, 290, 6, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.Limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void Limpiar (){
        txtBuscar.setText(null);
        cbLista.setSelectedIndex(0);
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        boolean existeBusqueda = arrBuscar.contains(txtBuscar.getText());
        if (existeBusqueda) {
            JOptionPane.showMessageDialog(rootPane, "Este producto esta disponible");
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Este producto no esta disponible");
        }
        
        lbBusquedas.setText("-1");
       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(lbBusquedas.getText().equals("-1")){
            JOptionPane.showMessageDialog(rootPane, "No hay ninguna busqueda");
           return;
        }
        int estaBusqueda = Integer.parseInt(lbBusquedas.getText());
        arrCategoria.remove(estaBusqueda);
        arrBuscar.remove(estaBusqueda);
        lbBusquedas.setText("-1");
        JOptionPane.showMessageDialog(rootPane, "Busqueda Eliminada");
        this.Limpiar();
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        String vCategoria = (String) cbLista.getSelectedItem();
        String vBuscar = txtBuscar.getText();
        
        int opcion = JOptionPane.showConfirmDialog(null,"Guardar esta busqueda"+"?");
        if (opcion == JOptionPane.NO_OPTION || opcion == JOptionPane.CANCEL_OPTION);{
    }//GEN-LAST:event_btnGuardarActionPerformed
       arrCategoria.add(vCategoria);
    arrBuscar.add(vBuscar);
    
    
   JOptionPane.showMessageDialog(null, "Busqueda Guardada");
   this.Limpiar();
   
   
   try{
           Connection con = Conexion.getConexion();
           PreparedStatement ps = con.prepareStatement("INSERT INTO Categoria (codCate, Categoria, Buscar)VALUES (?,?,?)");
           ps.setString(1, vCategoria);
           ps.setString(2, vBuscar);
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Categoria Guardado...");
           
        }catch (SQLException ex){
            
        JOptionPane.showMessageDialog(null, ex.toString());    
        }  
   
    }
        
    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
         frmMenu regresar = new frmMenu();
        regresar.setVisible(true);
        this.dispose ();
    }//GEN-LAST:event_btnregresarActionPerformed
 

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
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Categoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel BusPro;
    public static javax.swing.JLabel Categoria;
    public static javax.swing.JLabel Fondo;
    public static javax.swing.JLabel SelecCate;
    public static javax.swing.JButton btnBuscar;
    public static javax.swing.JButton btnEliminar;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnregresar;
    public static javax.swing.JComboBox<String> cbLista;
    public static javax.swing.JLabel imagen;
    public static javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel lbBusquedas;
    public static javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
