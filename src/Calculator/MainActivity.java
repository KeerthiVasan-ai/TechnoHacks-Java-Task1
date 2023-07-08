package Calculator;

import java.awt.event.KeyEvent;

public class MainActivity extends javax.swing.JFrame {
    
    float value1;
    float value2;
    String operator;

    public MainActivity() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        resultText = new javax.swing.JTextField();
        finalText = new javax.swing.JTextField();
        button6 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        div = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        allClearButton = new javax.swing.JButton();
        add = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        dot = new javax.swing.JButton();

        jButton13.setText("jButton1");

        jButton14.setText("jButton2");

        jButton15.setText("jButton3");

        jButton16.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        resultText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        resultText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addKeyListener(evt);
            }
        });

        finalText.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        finalText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        finalText.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultText, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(finalText))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(resultText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finalText)
                .addContainerGap())
        );

        button6.setText("6");
        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button6MouseClicked(evt);
            }
        });

        button3.setText("3");
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
        });

        button9.setText("9");
        button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button9MouseClicked(evt);
            }
        });

        button2.setText("2");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });

        button8.setText("8");
        button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button8MouseClicked(evt);
            }
        });

        button5.setText("5");
        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button5MouseClicked(evt);
            }
        });

        button4.setText("4");
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4MouseClicked(evt);
            }
        });

        button7.setText("7");
        button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button7MouseClicked(evt);
            }
        });

        button1.setText("1");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });

        equal.setText("=");
        equal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equalMouseClicked(evt);
            }
        });

        div.setText("/");
        div.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divMouseClicked(evt);
            }
        });

        mul.setText("*");
        mul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mulMouseClicked(evt);
            }
        });

        sub.setText("-");
        sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subMouseClicked(evt);
            }
        });

        allClearButton.setText("AC");
        allClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allClearButtonMouseClicked(evt);
            }
        });

        add.setText("+");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        button0.setText("0");
        button0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button0MouseClicked(evt);
            }
        });

        clearButton.setText("C");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        dot.setText(".");
        dot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dotMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(allClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(button0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(allClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        String res = resultText.getText();
        if(resultText.getText().isEmpty())
            resultText.setText("1");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            resultText.setText(resultText.getText() + "1");
        }
        else
            resultText.setText(resultText.getText()+ "1");
    }//GEN-LAST:event_button1MouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        String res = resultText.getText();
        if(resultText.getText().isEmpty())
            resultText.setText("2");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            resultText.setText(resultText.getText() + "2");
        }
        else
            resultText.setText(resultText.getText()+ "2");
    }//GEN-LAST:event_button2MouseClicked

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
        String res = resultText.getText();
        if(resultText.getText().isEmpty())
            resultText.setText("3");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            resultText.setText(resultText.getText() + "3");
        }
        else
            resultText.setText(resultText.getText()+ "3");
    }//GEN-LAST:event_button3MouseClicked

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
        String res = resultText.getText();
        if(resultText.getText().isEmpty())
            resultText.setText("4");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            resultText.setText(resultText.getText() + "4");
        }
        else
            resultText.setText(resultText.getText()+ "4");
    }//GEN-LAST:event_button4MouseClicked

    private void button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseClicked
        String res = resultText.getText();
        if(resultText.getText().isEmpty())
            resultText.setText("5");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            resultText.setText(resultText.getText() + "5");
        }
        else
            resultText.setText(resultText.getText()+ "5");
    }//GEN-LAST:event_button5MouseClicked

    private void button6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseClicked
        String res = resultText.getText();
        if(resultText.getText().isEmpty())
            resultText.setText("6");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            resultText.setText(resultText.getText() + "6");
        }
        else
            resultText.setText(resultText.getText()+ "6");
    }//GEN-LAST:event_button6MouseClicked

    private void button7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseClicked
        String res = resultText.getText();
        if(resultText.getText().isEmpty())
            resultText.setText("7");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            resultText.setText(resultText.getText() + "7");
        }
        else
            resultText.setText(resultText.getText()+ "7");
    }//GEN-LAST:event_button7MouseClicked

    private void button8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseClicked
        String res = resultText.getText();
        if(resultText.getText().isEmpty())
            resultText.setText("8");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            resultText.setText(resultText.getText() + "8");
        }
        else
            resultText.setText(resultText.getText()+ "8");
    }//GEN-LAST:event_button8MouseClicked

    private void button9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MouseClicked
        String res = resultText.getText();
        if(resultText.getText().isEmpty())
            resultText.setText("9");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            resultText.setText(resultText.getText() + "9");
        }
        else
            resultText.setText(resultText.getText()+ "9");
    }//GEN-LAST:event_button9MouseClicked

    private void button0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button0MouseClicked
        String res = resultText.getText();
        if(resultText.getText().isEmpty())
            resultText.setText("0");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            resultText.setText(resultText.getText() + "0");
        }
        else
            resultText.setText(resultText.getText()+ "0");
    }//GEN-LAST:event_button0MouseClicked

    private void allClearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allClearButtonMouseClicked
        value1 = 0;
        value2 = 0;
        resultText.setText("");
        finalText.setText("");
    }//GEN-LAST:event_allClearButtonMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
         if(resultText.getText().isEmpty()){
           return;
         }
         else{
            value1 = Float.parseFloat(resultText.getText());
            resultText.setText(resultText.getText() + "" + add.getText() );
            operator = "plus";
         }
    }//GEN-LAST:event_addMouseClicked

    private void subMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseClicked
       if(resultText.getText().isEmpty()){
           return;
         }
         else{
            value1 = Float.parseFloat(resultText.getText());
            resultText.setText(resultText.getText() + "" + sub.getText() );
            operator = "minus";
         }
    }//GEN-LAST:event_subMouseClicked

    private void mulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mulMouseClicked
        if(resultText.getText().isEmpty()){
           return;
         }
         else{
            value1 = Float.parseFloat(resultText.getText());
            resultText.setText(resultText.getText() + "" + mul.getText() );
            operator = "mul";
         }
    }//GEN-LAST:event_mulMouseClicked

    private void divMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divMouseClicked
        if(resultText.getText().isEmpty()){
           return;
         }
         else{
            value1 = Float.parseFloat(resultText.getText());
            resultText.setText(resultText.getText() + "" + div.getText() );
            operator = "div";
         }
    }//GEN-LAST:event_divMouseClicked

    private void equalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalMouseClicked
 
        finalText.setText("");
        float answer = 0;
         if("plus".equals(operator)) {
             String check = resultText.getText().toString();
             String[] split = check.split("\\+");
             value2 = Float.parseFloat(split[1]);
             System.out.println(value1);
             System.out.println(value2);
             answer = value1 + value2;
         }
         else if("minus".equals(operator)) {
             String check = resultText.getText().toString();
             String[] split = check.split("\\-");
             value2 = Float.parseFloat(split[1]);
             System.out.println(value1);
             System.out.println(value2);
             answer = value1 - value2;
         }
         else if ("mul".equals(operator)) {
             String check = resultText.getText().toString();
             String[] split = check.split("\\*");
             value2 = Float.parseFloat(split[1]);
             System.out.println(value1);
             System.out.println(value2);
             answer = value1 * value2;
         }
         else if("div".equals(operator)) {
             String check = resultText.getText().toString();
             String[] split = check.split("\\/");
             value2 = Float.parseFloat(split[1]);
             System.out.println(value1);
             System.out.println(value2);
             answer = value1/value2;
         }
        
         String Result = String.format("%.1f",answer);
         finalText.setText(Result);
    }//GEN-LAST:event_equalMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
      String res = resultText.getText();
      if(resultText.getText().isEmpty()){
          return;
      } else {
          StringBuffer sb = new StringBuffer(res);
          sb.deleteCharAt(sb.length()-1);
          resultText.setText(sb.toString());
                  
      }
    }//GEN-LAST:event_clearButtonMouseClicked

    private void dotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotMouseClicked
         String res = resultText.getText();
        if(resultText.getText().isEmpty())
            resultText.setText("0.");
        else if(res.contains("+") || res.contains("-") || res.contains("*") || res.contains("/"))
        {
            resultText.setText(resultText.getText() + ".");
        }
        else
            resultText.setText(resultText.getText()+ ".");
    }//GEN-LAST:event_dotMouseClicked

    private void addKeyListener(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addKeyListener
      char c = evt.getKeyChar();
      if ( ((c < '0') || (c > '9') || Character.isDigit(c)) && (c != KeyEvent.VK_BACK_SPACE)) {
         evt.consume(); 
      }
    }//GEN-LAST:event_addKeyListener

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainActivity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton allClearButton;
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton div;
    private javax.swing.JButton dot;
    private javax.swing.JButton equal;
    private javax.swing.JTextField finalText;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mul;
    private javax.swing.JTextField resultText;
    private javax.swing.JButton sub;
    // End of variables declaration//GEN-END:variables
}
