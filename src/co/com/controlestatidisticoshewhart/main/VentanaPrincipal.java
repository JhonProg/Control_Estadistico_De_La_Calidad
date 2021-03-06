/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.controlestatidisticoshewhart.main;

import co.com.controlestatidisticoshewhart.constante.Constante;
import co.com.controlestatidisticoshewhart.logica.Calculo;
import co.com.controlestatidisticoshewhart.objetos.Dato;
import co.com.controlestatidisticoshewhart.objetos.DatosExcelSingleton;
import co.com.controlestatidisticoshewhart.util.Util;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author Jhon
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    
    private DefaultTableModel modeloTabla;
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        cargarValidadores();
        modeloTabla = new DefaultTableModel(null, configurarColumnasTabla());
        jButton_guardarResultadosEnExcel.setEnabled(false);
    }

    private String[] configurarColumnasTabla(){
        String columnas[] = new String[]{Constante.INDICE,
                                         Constante.DATO_ALEATORIO,
                                         Constante.SUPERA_LIMITE_INFERIOR,
                                         Constante.SUPERA_LIMITE_SUPERIOR};
        return columnas;
    }
    
    private void cargarValidadores(){
        /** numeroDatosSimular */
         jTextField_numeroDatosSimular.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                getToolkit().beep();
                e.consume();
                  mensaje(Constante.DEBE_DIGITAR_SOLO_NUMEROS);
              }
            }
          });
        
         /** media */
         jTextField_media.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') ||
                 (c == KeyEvent.VK_BACK_SPACE) ||
                 (c == KeyEvent.VK_DELETE) || (c=='-'))) {
                getToolkit().beep();
                e.consume();
                mensaje(Constante.DEBE_DIGITAR_SOLO_NUMEROS);
              }
            }
          });
         
        /** desviacion estandar */
         jTextField_desviacionEstandar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') ||
                 (c == KeyEvent.VK_BACK_SPACE) ||
                 (c == KeyEvent.VK_DELETE) || (c=='-'))) {
                getToolkit().beep();
                e.consume();
                mensaje(Constante.DEBE_DIGITAR_SOLO_NUMEROS);
              }
            }
          });
         
         /** limite De Control Inferior */
         jTextField_limiteDeControlInferior.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') ||
                 (c == KeyEvent.VK_BACK_SPACE) ||
                 (c == KeyEvent.VK_DELETE) || (c=='-'))) {
                getToolkit().beep();
                e.consume();
                mensaje(Constante.DEBE_DIGITAR_SOLO_NUMEROS);
              }
            }
          });
         
         /** limite De Control Superior */
         jTextField_limiteDeControlSuperior.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') ||
                 (c == KeyEvent.VK_BACK_SPACE) ||
                 (c == KeyEvent.VK_DELETE) || (c=='-'))) {
                getToolkit().beep();
                e.consume();
                mensaje(Constante.DEBE_DIGITAR_SOLO_NUMEROS);
              }
            }
          });
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_numeroDatosSimular = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_media = new javax.swing.JTextField();
        jTextField_desviacionEstandar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_limiteDeControlInferior = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_limiteDeControlSuperior = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_arl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_media = new javax.swing.JLabel();
        jLabel_cantidadDatosFueraDeLimite = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel_limites = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel_tiempoEjecucionGeneracionNumeros = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel_tiempoEjecucionCalculoArl = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton_ejecutarSimulacion = new javax.swing.JButton();
        jButton_guardarResultadosEnExcel = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_tablaDeDatos = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jProgressBar_progreso = new javax.swing.JProgressBar();
        jLabel_barraDeEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control Estadistico Shewhart v.1.0.0");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Control Estatidistico de la Calidad");
        jLabel1.setToolTipText("Control Estatidistico de la Calidad");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Generación números", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel2.setText("Número de datos a simular * :");

        jTextField_numeroDatosSimular.setToolTipText("Cantidad de numeros a generar aleatoriamente");
        jTextField_numeroDatosSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_numeroDatosSimularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_numeroDatosSimular, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_numeroDatosSimular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parámetros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 255))); // NOI18N

        jLabel3.setText("Media * :");

        jLabel4.setText("Desviación estandar * :");

        jTextField_media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_mediaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_media, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_desviacionEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_desviacionEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "variables de control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 255))); // NOI18N

        jLabel5.setText("Limite de control inferior * :");

        jLabel6.setText("Limite de control superior * :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_limiteDeControlInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_limiteDeControlSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_limiteDeControlInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_limiteDeControlSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 255))); // NOI18N

        jLabel7.setText("ARL :");
        jLabel7.setToolTipText("Average Run Length - Longitud Promedio de Corrida");

        jLabel_arl.setText("0");

        jLabel8.setText("Media :");

        jLabel9.setText("Cantidad datos fuera de limite :");

        jLabel_media.setText("0");

        jLabel_cantidadDatosFueraDeLimite.setText("0");

        jLabel12.setText("Limites :");

        jLabel_limites.setText("( , )");

        jLabel13.setText("Tiempo Gen. Numeros :");

        jLabel_tiempoEjecucionGeneracionNumeros.setText("0 segundos");

        jLabel15.setText("Tiempo Calculos ARL :");

        jLabel_tiempoEjecucionCalculoArl.setText("0 segundos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_arl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_cantidadDatosFueraDeLimite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_media, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_limites, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_tiempoEjecucionGeneracionNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_tiempoEjecucionCalculoArl, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel_limites))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel_media))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel_cantidadDatosFueraDeLimite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel_arl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel_tiempoEjecucionGeneracionNumeros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel_tiempoEjecucionCalculoArl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 255))); // NOI18N

        jButton_ejecutarSimulacion.setText("Ejecutar Simulación");
        jButton_ejecutarSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ejecutarSimulacionActionPerformed(evt);
            }
        });

        jButton_guardarResultadosEnExcel.setText("Guardar Datos (Excel)");
        jButton_guardarResultadosEnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarResultadosEnExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_ejecutarSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_guardarResultadosEnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ejecutarSimulacion)
                    .addComponent(jButton_guardarResultadosEnExcel))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de simulación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 255))); // NOI18N

        jTable_tablaDeDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable_tablaDeDatos);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Información"));

        jLabel_barraDeEstado.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_barraDeEstado.setText("Sin mensajes...");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_barraDeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar_progreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar_progreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_barraDeEstado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(817, 817, 817)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Generación datos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_numeroDatosSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_numeroDatosSimularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_numeroDatosSimularActionPerformed

    private void jTextField_mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_mediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_mediaActionPerformed

    public void ejecutar(){
                        
            jButton_ejecutarSimulacion.setEnabled(false);
            jButton_guardarResultadosEnExcel.setEnabled(false);
            
            Map parametrosGeneracionDatos = new HashMap();
            parametrosGeneracionDatos.put(Constante.NUMERO_DE_DATOS_GENERAR,jTextField_numeroDatosSimular.getText());
            parametrosGeneracionDatos.put(Constante.MEDIA, jTextField_media.getText());
            parametrosGeneracionDatos.put(Constante.DESVIACION_ESTANDAR, jTextField_desviacionEstandar.getText());
            parametrosGeneracionDatos.put(Constante.LIMITE_CONTROL_INFERIOR, Integer.parseInt(jTextField_limiteDeControlInferior.getText()));
            parametrosGeneracionDatos.put(Constante.LIMITE_CONTROL_SUPERIOR, Integer.parseInt(jTextField_limiteDeControlSuperior.getText()));
            
            mensaje(Constante.GENERANDO_NUMEROS_ALEATORIOS);
            Map resultadoGeneracionDeDatos = Calculo.generarDatosAleatoriosConDistribucionNormal(parametrosGeneracionDatos);
            
            Boolean generacionNumerosEjecutado = Boolean.valueOf(resultadoGeneracionDeDatos.get(Constante.GENERACION_DATOS_CON_DISTRIBUACION_NORMAL_EJECUTADO).toString());
            
            if(generacionNumerosEjecutado){
                String mensaje = resultadoGeneracionDeDatos.get(Constante.MENSAJE_GENERACION_DATOS_CON_DISTRIBUACION_NORMAL).toString();
                mensaje(mensaje);
                
                List<Dato> datosGenerados = (List<Dato>)resultadoGeneracionDeDatos.get(Constante.LISTA_DATOS_GENERADOS);
                
                /** Seteo los datos [Datos generados] en el Singleton para tenerlos en memoria con el objetivo de generar el excel.
                 */
                DatosExcelSingleton.getInstance().setListaDatosExcel(datosGenerados);
                
                mensaje(Constante.REALIZANDO_CALCULOS_DE_RESULTADOS);
                Map resultadoCalculoARL = Calculo.calcularLongitudPromedioDeCorrida(datosGenerados);
                
                /** Agrego datos de limites de control. */
                resultadoCalculoARL.put(Constante.LIMITE_CONTROL_INFERIOR, Integer.parseInt(jTextField_limiteDeControlInferior.getText()));
                resultadoCalculoARL.put(Constante.LIMITE_CONTROL_SUPERIOR, Integer.parseInt(jTextField_limiteDeControlSuperior.getText()));
                
                /** Seteo los datos [Resultados] en el Singleton para tenerlos en memoria con el objetivo de generar el excel.
                 */
                DatosExcelSingleton.getInstance().setResultadosDeCalculo(resultadoCalculoARL);
                
                Boolean calculoArlEjecutado = Boolean.valueOf(resultadoCalculoARL.get(Constante.CALCULO_ARL_EJECUTADO).toString());
                
                if(calculoArlEjecutado){
                    String mensaje2 = resultadoCalculoARL.get(Constante.MENSAJE_CALCULO_ARL).toString();
                    mensaje(mensaje2);
                    
                    /** Obtener resultados */
                    double mediaDatosQueSuperanLimites   = Double.parseDouble(resultadoCalculoARL.get(Constante.MEDIA_DATOS_EXTREMOS).toString());
                    double cantidaDatosQueSuperanLimites = Double.parseDouble(resultadoCalculoARL.get(Constante.CANTIDAD_DATOS_EXTREMOS).toString());
                    double arlFinal                      = Double.parseDouble(resultadoCalculoARL.get(Constante.AVERAGE_RUN_LENGTH).toString());
                    long tiempoEjecucionGenNumeros       = Long.parseLong(resultadoGeneracionDeDatos.get(Constante.TIEMPO_DE_EJECUCION).toString());
                    long tiempoEjecucionCalculoArl       = Long.parseLong(resultadoCalculoARL.get(Constante.TIEMPO_DE_EJECUCION).toString());
                    
                    /** Mostrar datos generados */
                    Object[] unaFila = new Object[4];
                    for(int i=0;i<datosGenerados.size();i++){
                        unaFila[0]=datosGenerados.get(i).getSecuencial();
                        unaFila[1]=datosGenerados.get(i).getNumero();
                        unaFila[2]=datosGenerados.get(i).isSobrePasaLimiteInferior();
                        unaFila[3]=datosGenerados.get(i).isSobrePasaLimiteSuperior();
                        modeloTabla.addRow(unaFila);
                    }
                    jTable_tablaDeDatos.setModel(modeloTabla);
                    
                    jLabel_media.setText(""+mediaDatosQueSuperanLimites);
                    jLabel_cantidadDatosFueraDeLimite.setText(""+cantidaDatosQueSuperanLimites);
                    jLabel_arl.setText(""+arlFinal);
                    jLabel_tiempoEjecucionGeneracionNumeros.setText(""+TimeUnit.MILLISECONDS.toSeconds(tiempoEjecucionGenNumeros)+" Seg. "+tiempoEjecucionGenNumeros+" Mili.");
                    jLabel_tiempoEjecucionCalculoArl.setText(""+TimeUnit.MILLISECONDS.toSeconds(tiempoEjecucionCalculoArl)+" Seg. "+tiempoEjecucionCalculoArl+" Mili.");
                    
                    jButton_ejecutarSimulacion.setEnabled(true);
                                        
                }else{
                    String mensaje2 = resultadoCalculoARL.get(Constante.MENSAJE_CALCULO_ARL).toString();
                    mensaje(mensaje2);
                }
                
            }else{
                String mensaje = resultadoGeneracionDeDatos.get(Constante.MENSAJE_GENERACION_DATOS_CON_DISTRIBUACION_NORMAL).toString();
                mensaje(mensaje);
            }
          
    }
    
   class Progreso extends  SwingWorker<Void, Void>{

        @Override
        protected Void doInBackground() throws Exception {
           jProgressBar_progreso.setIndeterminate(true);
            ejecutar();
            return null;
        }
        
        @Override
        public void done(){
           jProgressBar_progreso.setIndeterminate(false);
           jButton_ejecutarSimulacion.setEnabled(true);
           jButton_guardarResultadosEnExcel.setEnabled(true);
           mensaje(Constante.TERMINADO);
        }
       
   }
    
    /**
     * Iniciar ejecuacion de la simulacion.
     */
    private void jButton_ejecutarSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ejecutarSimulacionActionPerformed
         if(camposValidos()){
            
             jLabel_limites.setText("( "+jTextField_limiteDeControlInferior.getText()+" , "+jTextField_limiteDeControlSuperior.getText()+" )");
            jLabel_media.setText("0");
            jLabel_cantidadDatosFueraDeLimite.setText("0");
            jLabel_arl.setText("0");
            jLabel_tiempoEjecucionCalculoArl.setText("0 seg. 0 mili.");
            jLabel_tiempoEjecucionGeneracionNumeros.setText("0 seg. 0 mili.");
            
            jTable_tablaDeDatos.setModel(modeloTabla);
            
            try {
               progreso = new Progreso();
               progreso.execute();
           } catch (Exception ex) {
               Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
           }
        }else{
            jButton_ejecutarSimulacion.setEnabled(true);
        }
        
    }//GEN-LAST:event_jButton_ejecutarSimulacionActionPerformed

    private void jButton_guardarResultadosEnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarResultadosEnExcelActionPerformed
        // TODO add your handling code here:
        jButton_ejecutarSimulacion.setEnabled(false);
        jButton_guardarResultadosEnExcel.setEnabled(false);
        mensaje(Constante.GENERANDO_ARCHIVO_EXCEL_CON_RESULTADOS_ESPERE);
        obtenerRutaGuardarArchivo();
        jButton_ejecutarSimulacion.setEnabled(true);
        jButton_guardarResultadosEnExcel.setEnabled(true);
    }//GEN-LAST:event_jButton_guardarResultadosEnExcelActionPerformed

    private void obtenerRutaGuardarArchivo() {
        try {
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(this);
            File guarda = file.getSelectedFile();

            if (guarda != null) {
                
                String nombreArchivo = guarda.getAbsolutePath()+Constante.XLS;
                
                HSSFWorkbook workbook            = new HSSFWorkbook();
                HSSFSheet hojaUnoDatosGenerados  = workbook.createSheet(Constante.TITULO_HOJA_DATOS); 
                HSSFSheet hojaDosDatosResultados = workbook.createSheet(Constante.TITULO_HOJA_RESULTADOS); 
                
                List<Dato> datosGenerados = DatosExcelSingleton.getInstance().getListaDatosExcel();
                Map resultadosCalculo     = DatosExcelSingleton.getInstance().getResultadosDeCalculo();
                
                HSSFRow rowhead = hojaUnoDatosGenerados.createRow((short)0);
                /** Encabezado hoja uno. */
                rowhead.createCell(0).setCellValue(Constante.INDICE);
                rowhead.createCell(1).setCellValue(Constante.DATO_ALEATORIO);
                rowhead.createCell(2).setCellValue(Constante.SUPERA_LIMITE_INFERIOR);
                rowhead.createCell(3).setCellValue(Constante.SUPERA_LIMITE_SUPERIOR);
                
                HSSFRow rowheadHojaDos = hojaDosDatosResultados.createRow((short)0);
                /** Encabezado hoja dos. */
                rowheadHojaDos.createCell(0).setCellValue(Constante.COLUMNA_LIMITE_INFERIOR);
                rowheadHojaDos.createCell(1).setCellValue(Constante.COLUMNA_LIMITE_SUPERIOR);
                rowheadHojaDos.createCell(2).setCellValue(Constante.COLUMNA_MEDIA);
                rowheadHojaDos.createCell(3).setCellValue(Constante.COLUMNA_DATOS_FUERA_LIMITE);
                rowheadHojaDos.createCell(4).setCellValue(Constante.COLUMNA_ARL);
                
                /**
                 * Escribir en hoja uno.
                 */
                HSSFRow row = null;
                int fila = 1;
                for(int i=0;i<datosGenerados.size();i++){
                    row = hojaUnoDatosGenerados.createRow(fila++);
                    row.createCell(0).setCellValue(datosGenerados.get(i).getSecuencial());
                    row.createCell(1).setCellValue(datosGenerados.get(i).getNumero());
                    row.createCell(2).setCellValue(datosGenerados.get(i).isSobrePasaLimiteInferior());
                    row.createCell(3).setCellValue(datosGenerados.get(i).isSobrePasaLimiteSuperior());
                }
                
                /** 
                 * Escribir en hoja dos.
                 */
                HSSFRow filaResultados = null;
                filaResultados = hojaDosDatosResultados.createRow(1);
                filaResultados.createCell(0).setCellValue(resultadosCalculo.get(Constante.LIMITE_CONTROL_INFERIOR).toString());
                filaResultados.createCell(1).setCellValue(resultadosCalculo.get(Constante.LIMITE_CONTROL_SUPERIOR).toString());
                filaResultados.createCell(2).setCellValue(resultadosCalculo.get(Constante.MEDIA_DATOS_EXTREMOS).toString());
                filaResultados.createCell(3).setCellValue(resultadosCalculo.get(Constante.CANTIDAD_DATOS_EXTREMOS).toString());
                filaResultados.createCell(4).setCellValue(resultadosCalculo.get(Constante.AVERAGE_RUN_LENGTH).toString());
                
                /**
                 * Ajustar columnas hoja uno.
                 */
                hojaUnoDatosGenerados.autoSizeColumn(0);
                hojaUnoDatosGenerados.autoSizeColumn(1);
                hojaUnoDatosGenerados.autoSizeColumn(2);
                hojaUnoDatosGenerados.autoSizeColumn(3);
                
                /**
                 * Ajustar columnas hoja dos.
                 */
                hojaDosDatosResultados.autoSizeColumn(0);
                hojaDosDatosResultados.autoSizeColumn(1);
                hojaDosDatosResultados.autoSizeColumn(2);
                hojaDosDatosResultados.autoSizeColumn(3);
                hojaDosDatosResultados.autoSizeColumn(4);
                
                try (FileOutputStream fileOut = new FileOutputStream(nombreArchivo)) {
                    workbook.write(fileOut);
                }catch(Exception e){
                    throw new Exception("Error al escribir el archivo. Intente de nuevo.");
                }
                mensaje(Constante.ARCHIVO_EXCEL_CON_RESULTADOS_GENERADO);
                JOptionPane.showMessageDialog(null,"El archivo se ha guardado Exitosamente.",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            }else{
                mensaje("Debe seleccionar una ruta valida e ingresar el nombre del archivo.");
                JOptionPane.showMessageDialog(null,
                    "Debe seleccionar una ruta valida e ingresar el nombre del archivo.",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
             mensaje("Error al generar el archivo.Intentelo de nuevo.");
            JOptionPane.showMessageDialog(null,
                    "Su archivo no se ha guardado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    /**
     * Validar campos y parametros obligatorios.
     */
    private boolean camposValidos(){
        mensaje(Constante.VALIDANDO_CAMPOS);
        boolean resultadoValidacion  = false;
        String numeroDatosSimular    = jTextField_numeroDatosSimular.getText();
        String media                 = null;
        String desviacionEstandar    = null;
        String limiteControlInferior = null;
        String limiteControlSuperior = null;        
        
        if(Util.esNuloOVacio(numeroDatosSimular)){
            mensaje(Constante.FALTA_NUMERO_DE_DATOS_POR_COMPLETAR);
        }else{
            media = jTextField_media.getText();
            if(Util.esNuloOVacio(media)){
                mensaje(Constante.FALTA_MEDIA_POR_COMPLETAR);
            }else{
                desviacionEstandar = jTextField_desviacionEstandar.getText();
                if(Util.esNuloOVacio(desviacionEstandar)){
                    mensaje(Constante.FALTA_DESVIACION_ESTANDAR_POR_COMPLETAR);
                }else{
                    limiteControlInferior = jTextField_limiteDeControlInferior.getText();
                    if(Util.esNuloOVacio(limiteControlInferior)){
                       mensaje(Constante.FALTA_LIMITE_CONTROL_INFERIOR_POR_COMPLETAR); 
                    }else{
                        limiteControlSuperior = jTextField_limiteDeControlSuperior.getText();
                        if(Util.esNuloOVacio(limiteControlSuperior)){
                            mensaje(Constante.FALTA_LIMITE_CONTROL_SUPERIOR_POR_COMPLETAR); 
                        }else{
                            try{
                                int inLimiteControlInferior = Integer.parseInt(limiteControlInferior);
                                int inLimiteControlSuperior = Integer.parseInt(limiteControlSuperior);
                                
                                if(inLimiteControlInferior>=inLimiteControlSuperior){
                                    mensaje(Constante.LIMITE_INFERIOR_MAYOR_A_LIMITE_INFERIOR);
                                }else{
                                    resultadoValidacion = true;
                                }  
                            }catch(Exception e){
                                mensaje(Constante.ERROR_AL_CONVERTIR_LOS_LIMITES);
                            }                         
                        }
                    }
                }
            }
        }
        
        return resultadoValidacion;
    }
    
    private void mensaje(String mensaje){
        jLabel_barraDeEstado.setText(mensaje);
    }
    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                    VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
                    ventanaPrincipal.setLocationRelativeTo(null);
                    ventanaPrincipal.setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private Progreso progreso;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ejecutarSimulacion;
    private javax.swing.JButton jButton_guardarResultadosEnExcel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_arl;
    private javax.swing.JLabel jLabel_barraDeEstado;
    private javax.swing.JLabel jLabel_cantidadDatosFueraDeLimite;
    private javax.swing.JLabel jLabel_limites;
    private javax.swing.JLabel jLabel_media;
    private javax.swing.JLabel jLabel_tiempoEjecucionCalculoArl;
    private javax.swing.JLabel jLabel_tiempoEjecucionGeneracionNumeros;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar_progreso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_tablaDeDatos;
    private javax.swing.JTextField jTextField_desviacionEstandar;
    private javax.swing.JTextField jTextField_limiteDeControlInferior;
    private javax.swing.JTextField jTextField_limiteDeControlSuperior;
    private javax.swing.JTextField jTextField_media;
    private javax.swing.JTextField jTextField_numeroDatosSimular;
    // End of variables declaration//GEN-END:variables
}
