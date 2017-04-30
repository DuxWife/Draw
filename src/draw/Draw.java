package draw;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
public class Draw extends javax.swing.JFrame {
    public Draw() {
        super ("Самое длинное ребро");
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("Выделить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentResized(evt);
            }
        });
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton2.setText("Очистить поле");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("левая кнопка: добавить точку");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("правая кнопка+alt: удалить точку");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("правая кнопка+ctrl: добавить точку к ближайшей линии");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("правая кнопка+shift: переместить точку");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 152, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private Graphics g;
private int [][] p;
private int a,b,x,y,j;

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
   x=evt.getX(); y=evt.getY();
    if (evt.getButton()==MouseEvent.BUTTON1) {
        reDimArray();        
     //   point();    
       int n=p.length-1;
        p[n][0]=evt.getX();
        p[n][1]=evt.getY();
   }
    else {
        if (evt.getButton()==MouseEvent.BUTTON3) {
           /* if (evt.isAltDown()==true) {
                reDim();
            }
            if (evt.isControlDown()==true) {
                reDimArray();
                point();
            }*/
            if (evt.isShiftDown()==true) {
                 jPanel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        }
    }
    draw();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
      if (p!=null) { 
         for (int i=0;i<p.length;i++) {
            if (Math.sqrt((p[i][0]-evt.getX())*(p[i][0]-evt.getX())+(p[i][1]-evt.getY())*(p[i][1]-evt.getY()))<2) {
                jPanel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                j=i;
                break;
            }
            else {
                jPanel1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        }
      }    
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        g.setColor(Color.RED);
        g.drawLine(p[a][0], p[a][1], p[b][0], p[b][1]);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentResized
        if (p!=null) draw();
    }//GEN-LAST:event_jPanel1ComponentResized

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        p=null;
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        if (evt.getButton()==MouseEvent.BUTTON3) {
            if (evt.isShiftDown()==true) {
                p[j][0]=evt.getX();
                p[j][1]=evt.getY();
                 jPanel1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                draw();
            }
            if (evt.isAltDown()==true) {
                reDim();
                draw();
            }
            if (evt.isControlDown()==true) {
                reDimArray();
                point();
                draw();
            }
        }
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        p[j][0]=evt.getX();
        p[j][1]=evt.getY();
        draw();
    }//GEN-LAST:event_jPanel1MouseDragged
   
    private void draw() {
        g=jPanel1.getGraphics();
        double max;        
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        int n=p.length-1;
        g.setColor(Color.BLACK);
        g.fillOval(p[0][0]-2, p[0][1]-2, 4, 4);
        for (int i=1;i<=n;i++){
            g.drawLine(p[i][0], p[i][1], p[i-1][0], p[i-1][1]); 
            g.fillOval(p[i][0]-2, p[i][1]-2, 4, 4);
        }
        g.drawLine(p[n][0], p[n][1], p[0][0], p[0][1]);
        //нахождение длинного ребра
      if (n>0) { 
          max=Math.sqrt((p[0][0]-p[n][0])*(p[0][0]-p[n][0])+(p[0][1]-p[n][1])*(p[0][1]-p[n][1]));
          a=0;b=n;
          for (int i=0;i<n;i++){
              if (Math.sqrt((p[i][0]-p[i+1][0])*(p[i][0]-p[i+1][0])+(p[i][1]-p[i+1][1])*(p[i][1]-p[i+1][1]))>max){
                  max=Math.sqrt((p[i][0]-p[i+1][0])*(p[i][0]-p[i+1][0])+(p[i][1]-p[i+1][1])*(p[i][1]-p[i+1][1]));
                  a=i;b=i+1;
              }
          }
      }
    }
    
    private void point() {
        int n=p.length-1;
        double min;
        int v,w;
      if (p.length>1) {
          if (p[0][0]<p[n-1][0]) v=p[0][0];
          else v=p[n-1][0];
          if (p[0][1]<p[n-1][1]) w=p[0][1];
          else w=p[n-1][1];
        min=Math.sqrt((v+Math.abs(p[0][0]-p[n-1][0])/2-x)*(v+Math.abs(p[0][0]-p[n-1][0])/2-x)+(w+Math.abs(p[0][1]-p[n-1][1])/2-y)*(w+Math.abs(p[0][1]-p[n-1][1])/2-y));
        int c=n;
        for (int i=0;i<n-1;i++){
            if (p[i][0]<p[i+1][0]) v=p[i][0];
           else v=p[i+1][0];
           if (p[i][1]<p[i+1][1]) w=p[i][1];
           else w=p[i+1][1];
            if (Math.sqrt((v+Math.abs(p[i][0]-p[i+1][0])/2-x)*(v+Math.abs(p[i][0]-p[i+1][0])/2-x)+(w+Math.abs(p[i][1]-p[i+1][1])/2-y)*(w+Math.abs(p[i][1]-p[i+1][1])/2-y))<min){
                min=Math.sqrt((v+Math.abs(p[i][0]-p[i+1][0])/2-x)*(v+Math.abs(p[i][0]-p[i+1][0])/2-x)+(w+Math.abs(p[i][1]-p[i+1][1])/2-y)*(w+Math.abs(p[i][1]-p[i+1][1])/2-y));
                c=i+1;
            }
        }
        for (int i=n;i>c;i--) {
            p[i][0]=p[i-1][0];
            p[i][1]=p[i-1][1];
        }
            p[c][0]=x;
            p[c][1]=y;
    } 
      else {
          p[n][0]=x;
          p[n][1]=y;
      }
    }
    
    private void reDimArray() {
        int [][] p0;
        int i,n;
        if (p==null){
            p=new int[1][2];
        }
        else {
            n=p.length;
            p0=new int [n][2];
            for (i=0;i<n;i++){
                p0[i][0]=p[i][0];
                p0[i][1]=p[i][1];
            }
            p=new int [n+1][2];
            for (i=0;i<n;i++){
                p[i][0]=p0[i][0];
                p[i][1]=p0[i][1];
            }
        }
    }
    
    private void reDim() {
         int [][] p0;
        int i,n;
        if (p!=null) {
            n=p.length;
            p0=new int [n-1][2];
            for (i=0;i<j;i++){
                p0[i][0]=p[i][0];
                p0[i][1]=p[i][1];
            }
            for (i=j;i<n-1;i++){
                p0[i][0]=p[i+1][0];
                p0[i][1]=p[i+1][1];
            }
            p=new int [n-1][2];
            for (i=0;i<n-1;i++){
                p[i][0]=p0[i][0];
                p[i][1]=p0[i][1];
            }
        }
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
            java.util.logging.Logger.getLogger(Draw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Draw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Draw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Draw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Draw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}