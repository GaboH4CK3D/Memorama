/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import auxiliar.LogicaJuego;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Dark
 */
public class PlayGame extends javax.swing.JFrame {

    private VFondo fondo;
    private LogicaJuego log = new LogicaJuego();
    private boolean caraUp = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn = new JButton[2];
    private boolean primerc = false;
    private int puntaje = 0;
    
    public PlayGame() {
        initComponents();
        
        fondo = new VFondo(getWidth(), getHeight());
        add(fondo, BorderLayout.CENTER);
        setCards();
    }       
    
    private void setCards() {
        int[] numbers = log.getCardNumbers();
        
        btnC1.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[0]+".jpg")));
        btnC2.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[1]+".jpg")));
        btnC3.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[2]+".jpg")));
        btnC4.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[3]+".jpg")));
        btnC5.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[4]+".jpg")));
        btnC6.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[5]+".jpg")));
        btnC7.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[6]+".jpg")));
        btnC8.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[7]+".jpg")));
        btnC9.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[8]+".jpg")));
        btnC10.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[9]+".jpg")));
        btnC11.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[10]+".jpg")));
        btnC12.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[11]+".jpg")));
        btnC13.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[12]+".jpg")));
        btnC14.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[13]+".jpg")));
        btnC15.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[14]+".jpg")));
        btnC16.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[15]+".jpg")));
        btnC17.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[16]+".jpg")));
        btnC18.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[17]+".jpg")));
        btnC19.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[18]+".jpg")));
        btnC20.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[19]+".jpg")));
        btnC21.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[20]+".jpg")));
        btnC22.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[21]+".jpg")));
        btnC23.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[22]+".jpg")));
        btnC24.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[23]+".jpg")));
        btnC25.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[24]+".jpg")));
        btnC26.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[25]+".jpg")));
        btnC27.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[26]+".jpg")));
        btnC28.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[27]+".jpg")));
        btnC29.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[28]+".jpg")));
        btnC30.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[29]+".jpg")));
    }    
    
    private void btnEnabled(JButton btn) {
        
        if(!caraUp) {
            btn.setEnabled(false);
            im1 = (ImageIcon) btn.getDisabledIcon();
            pbtn[0] = btn;
            caraUp = true;
            primerc = false;
        }
        else {
            btn.setEnabled(false);
            im2 = (ImageIcon) btn.getDisabledIcon();
            pbtn[1] = btn;
            primerc = true;
            puntaje += 20;
            pregwin();
        }
    }
    
    private void compare() {
        if(caraUp && primerc) {
            
            if(im1.getDescription().compareTo(im2.getDescription()) != 0) {
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
                if(puntaje > 10 ) puntaje -= 10;
            }
            caraUp = false;
        }
    }
    
    private void reiniciar() {
        
        btnC1.setEnabled(true);
        btnC2.setEnabled(true);
        btnC3.setEnabled(true);
        btnC4.setEnabled(true);
        btnC5.setEnabled(true);
        btnC6.setEnabled(true);
        btnC7.setEnabled(true);
        btnC8.setEnabled(true);
        btnC9.setEnabled(true);
        btnC10.setEnabled(true);
        btnC11.setEnabled(true);
        btnC12.setEnabled(true);
        btnC13.setEnabled(true);
        btnC14.setEnabled(true);
        btnC15.setEnabled(true);
        btnC16.setEnabled(true);
        btnC17.setEnabled(true);
        btnC18.setEnabled(true);
        btnC19.setEnabled(true);
        btnC20.setEnabled(true);
        btnC21.setEnabled(true);
        btnC22.setEnabled(true);
        btnC23.setEnabled(true);
        btnC24.setEnabled(true);
        btnC25.setEnabled(true);
        btnC26.setEnabled(true);
        btnC27.setEnabled(true);
        btnC28.setEnabled(true);
        btnC29.setEnabled(true);
        btnC30.setEnabled(true);
        
        primerc = false;
        caraUp = false;
        puntaje = 0;
    }
    
    private void pregwin() {
        if(!btnC1.isEnabled() && !btnC2.isEnabled() && !btnC3.isEnabled() && !btnC4.isEnabled() && !btnC5.isEnabled() && !btnC6.isEnabled() && 
                !btnC7.isEnabled() && !btnC8.isEnabled() && !btnC9.isEnabled() && !btnC10.isEnabled() && !btnC11.isEnabled() && 
                !btnC12.isEnabled() && !btnC13.isEnabled() && !btnC14.isEnabled() && !btnC15.isEnabled() && !btnC16.isEnabled() && btnC17.isEnabled() && 
                !btnC18.isEnabled() && !btnC19.isEnabled() && !btnC20.isEnabled() && !btnC21.isEnabled() && !btnC22.isEnabled() && 
                !btnC23.isEnabled() && !btnC24.isEnabled() && !btnC25.isEnabled() && !btnC26.isEnabled() && !btnC27.isEnabled() && 
                !btnC28.isEnabled() && !btnC29.isEnabled() && !btnC30.isEnabled()) {
            JOptionPane.showMessageDialog(this, "Felicidades, usted ha ganado. Su puntaje es: "+puntaje, "Win!!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC8 = new javax.swing.JButton();
        btnC7 = new javax.swing.JButton();
        btnC6 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        btnC12 = new javax.swing.JButton();
        btnC11 = new javax.swing.JButton();
        btnC10 = new javax.swing.JButton();
        btnC9 = new javax.swing.JButton();
        btnC16 = new javax.swing.JButton();
        btnC15 = new javax.swing.JButton();
        btnC14 = new javax.swing.JButton();
        btnC13 = new javax.swing.JButton();
        btnC17 = new javax.swing.JButton();
        btnC18 = new javax.swing.JButton();
        btnC19 = new javax.swing.JButton();
        btnC20 = new javax.swing.JButton();
        btnC21 = new javax.swing.JButton();
        btnC22 = new javax.swing.JButton();
        btnC23 = new javax.swing.JButton();
        btnC24 = new javax.swing.JButton();
        btnC25 = new javax.swing.JButton();
        btnC26 = new javax.swing.JButton();
        btnC27 = new javax.swing.JButton();
        btnC28 = new javax.swing.JButton();
        btnC29 = new javax.swing.JButton();
        btnC30 = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego Dos Caras");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("BIENVENIDO");

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC1.setBorder(null);
        btnC1.setBorderPainted(false);
        btnC1.setContentAreaFilled(false);
        btnC1.setFocusable(false);
        btnC1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC1MouseExited(evt);
            }
        });
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });

        btnC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC2.setBorder(null);
        btnC2.setBorderPainted(false);
        btnC2.setContentAreaFilled(false);
        btnC2.setFocusable(false);
        btnC2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC2MouseExited(evt);
            }
        });
        btnC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC2ActionPerformed(evt);
            }
        });

        btnC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC3.setBorder(null);
        btnC3.setBorderPainted(false);
        btnC3.setContentAreaFilled(false);
        btnC3.setFocusable(false);
        btnC3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC3MouseExited(evt);
            }
        });
        btnC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC3ActionPerformed(evt);
            }
        });

        btnC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC4.setBorder(null);
        btnC4.setBorderPainted(false);
        btnC4.setContentAreaFilled(false);
        btnC4.setFocusable(false);
        btnC4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC4MouseExited(evt);
            }
        });
        btnC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC4ActionPerformed(evt);
            }
        });

        btnC8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC8.setBorder(null);
        btnC8.setBorderPainted(false);
        btnC8.setContentAreaFilled(false);
        btnC8.setFocusable(false);
        btnC8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC8MouseExited(evt);
            }
        });
        btnC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC8ActionPerformed(evt);
            }
        });

        btnC7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC7.setBorder(null);
        btnC7.setBorderPainted(false);
        btnC7.setContentAreaFilled(false);
        btnC7.setFocusable(false);
        btnC7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC7MouseExited(evt);
            }
        });
        btnC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC7ActionPerformed(evt);
            }
        });

        btnC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC6.setBorder(null);
        btnC6.setBorderPainted(false);
        btnC6.setContentAreaFilled(false);
        btnC6.setFocusable(false);
        btnC6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC6MouseExited(evt);
            }
        });
        btnC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC6ActionPerformed(evt);
            }
        });

        btnC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC5.setBorder(null);
        btnC5.setBorderPainted(false);
        btnC5.setContentAreaFilled(false);
        btnC5.setFocusable(false);
        btnC5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC5MouseExited(evt);
            }
        });
        btnC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC5ActionPerformed(evt);
            }
        });

        btnC12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC12.setBorder(null);
        btnC12.setBorderPainted(false);
        btnC12.setContentAreaFilled(false);
        btnC12.setFocusable(false);
        btnC12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC12MouseExited(evt);
            }
        });
        btnC12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC12ActionPerformed(evt);
            }
        });

        btnC11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC11.setBorder(null);
        btnC11.setBorderPainted(false);
        btnC11.setContentAreaFilled(false);
        btnC11.setFocusable(false);
        btnC11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC11MouseExited(evt);
            }
        });
        btnC11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC11ActionPerformed(evt);
            }
        });

        btnC10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC10.setBorder(null);
        btnC10.setBorderPainted(false);
        btnC10.setContentAreaFilled(false);
        btnC10.setFocusable(false);
        btnC10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC10MouseExited(evt);
            }
        });
        btnC10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC10ActionPerformed(evt);
            }
        });

        btnC9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC9.setBorder(null);
        btnC9.setBorderPainted(false);
        btnC9.setContentAreaFilled(false);
        btnC9.setFocusable(false);
        btnC9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC9MouseExited(evt);
            }
        });
        btnC9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC9ActionPerformed(evt);
            }
        });

        btnC16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC16.setBorder(null);
        btnC16.setBorderPainted(false);
        btnC16.setContentAreaFilled(false);
        btnC16.setFocusable(false);
        btnC16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC16MouseExited(evt);
            }
        });
        btnC16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC16ActionPerformed(evt);
            }
        });

        btnC15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC15.setBorder(null);
        btnC15.setBorderPainted(false);
        btnC15.setContentAreaFilled(false);
        btnC15.setFocusable(false);
        btnC15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC15MouseExited(evt);
            }
        });
        btnC15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC15ActionPerformed(evt);
            }
        });

        btnC14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC14.setBorder(null);
        btnC14.setBorderPainted(false);
        btnC14.setContentAreaFilled(false);
        btnC14.setFocusable(false);
        btnC14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC14MouseExited(evt);
            }
        });
        btnC14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC14ActionPerformed(evt);
            }
        });

        btnC13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC13.setBorder(null);
        btnC13.setBorderPainted(false);
        btnC13.setContentAreaFilled(false);
        btnC13.setFocusable(false);
        btnC13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC13MouseExited(evt);
            }
        });
        btnC13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC13ActionPerformed(evt);
            }
        });

        btnC17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC17.setBorder(null);
        btnC17.setBorderPainted(false);
        btnC17.setContentAreaFilled(false);
        btnC17.setFocusable(false);
        btnC17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC17MouseExited(evt);
            }
        });
        btnC17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC17ActionPerformed(evt);
            }
        });

        btnC18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC18.setBorder(null);
        btnC18.setBorderPainted(false);
        btnC18.setContentAreaFilled(false);
        btnC18.setFocusable(false);
        btnC18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC18MouseExited(evt);
            }
        });
        btnC18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC18ActionPerformed(evt);
            }
        });

        btnC19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC19.setBorder(null);
        btnC19.setBorderPainted(false);
        btnC19.setContentAreaFilled(false);
        btnC19.setFocusable(false);
        btnC19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC19MouseExited(evt);
            }
        });
        btnC19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC19ActionPerformed(evt);
            }
        });

        btnC20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC20.setBorder(null);
        btnC20.setBorderPainted(false);
        btnC20.setContentAreaFilled(false);
        btnC20.setFocusable(false);
        btnC20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC20MouseExited(evt);
            }
        });
        btnC20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC20ActionPerformed(evt);
            }
        });

        btnC21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC21.setBorder(null);
        btnC21.setBorderPainted(false);
        btnC21.setContentAreaFilled(false);
        btnC21.setFocusable(false);
        btnC21.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC21MouseExited(evt);
            }
        });
        btnC21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC21ActionPerformed(evt);
            }
        });

        btnC22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC22.setBorder(null);
        btnC22.setBorderPainted(false);
        btnC22.setContentAreaFilled(false);
        btnC22.setFocusable(false);
        btnC22.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC22MouseExited(evt);
            }
        });
        btnC22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC22ActionPerformed(evt);
            }
        });

        btnC23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC23.setBorder(null);
        btnC23.setBorderPainted(false);
        btnC23.setContentAreaFilled(false);
        btnC23.setFocusable(false);
        btnC23.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC23MouseExited(evt);
            }
        });
        btnC23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC23ActionPerformed(evt);
            }
        });

        btnC24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC24.setBorder(null);
        btnC24.setBorderPainted(false);
        btnC24.setContentAreaFilled(false);
        btnC24.setFocusable(false);
        btnC24.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC24MouseExited(evt);
            }
        });
        btnC24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC24ActionPerformed(evt);
            }
        });

        btnC25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC25.setBorder(null);
        btnC25.setBorderPainted(false);
        btnC25.setContentAreaFilled(false);
        btnC25.setFocusable(false);
        btnC25.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC25MouseExited(evt);
            }
        });
        btnC25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC25ActionPerformed(evt);
            }
        });

        btnC26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC26.setBorder(null);
        btnC26.setBorderPainted(false);
        btnC26.setContentAreaFilled(false);
        btnC26.setFocusable(false);
        btnC26.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC26MouseExited(evt);
            }
        });
        btnC26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC26ActionPerformed(evt);
            }
        });

        btnC27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC27.setBorder(null);
        btnC27.setBorderPainted(false);
        btnC27.setContentAreaFilled(false);
        btnC27.setFocusable(false);
        btnC27.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC27MouseExited(evt);
            }
        });
        btnC27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC27ActionPerformed(evt);
            }
        });

        btnC28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC28.setBorder(null);
        btnC28.setBorderPainted(false);
        btnC28.setContentAreaFilled(false);
        btnC28.setFocusable(false);
        btnC28.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC28MouseExited(evt);
            }
        });
        btnC28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC28ActionPerformed(evt);
            }
        });

        btnC29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC29.setBorder(null);
        btnC29.setBorderPainted(false);
        btnC29.setContentAreaFilled(false);
        btnC29.setFocusable(false);
        btnC29.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC29MouseExited(evt);
            }
        });
        btnC29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC29ActionPerformed(evt);
            }
        });

        btnC30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.jpg"))); // NOI18N
        btnC30.setBorder(null);
        btnC30.setBorderPainted(false);
        btnC30.setContentAreaFilled(false);
        btnC30.setFocusable(false);
        btnC30.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atraseleccion.jpg"))); // NOI18N
        btnC30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC30MouseExited(evt);
            }
        });
        btnC30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC30)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnC2)
                            .addComponent(btnC1)
                            .addComponent(btnC3)
                            .addComponent(btnC4)
                            .addComponent(btnC5)
                            .addComponent(btnC6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnC7)
                            .addComponent(btnC8)
                            .addComponent(btnC9)
                            .addComponent(btnC10)
                            .addComponent(btnC11)
                            .addComponent(btnC12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnC13)
                                .addComponent(btnC15, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(btnC16)
                            .addComponent(btnC17)
                            .addComponent(btnC18)))
                    .addComponent(btnC14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnC19)
                    .addComponent(btnC20)
                    .addComponent(btnC21)
                    .addComponent(btnC22)
                    .addComponent(btnC23)
                    .addComponent(btnC24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC28)
                    .addComponent(btnC25)
                    .addComponent(btnC26)
                    .addComponent(btnC27)
                    .addComponent(btnC29)
                    .addComponent(btnC30))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnReiniciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(0, 204, 0));
        btnReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Reiniciar.png"))); // NOI18N
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReiniciar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReiniciar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(784, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        btnEnabled(btnC1);
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        btnEnabled(btnC2);
    }//GEN-LAST:event_btnC2ActionPerformed

    private void btnC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC3ActionPerformed
        btnEnabled(btnC3);
    }//GEN-LAST:event_btnC3ActionPerformed

    private void btnC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC4ActionPerformed
        btnEnabled(btnC4);
    }//GEN-LAST:event_btnC4ActionPerformed

    private void btnC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC5ActionPerformed
        btnEnabled(btnC5);
    }//GEN-LAST:event_btnC5ActionPerformed

    private void btnC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC6ActionPerformed
        btnEnabled(btnC6);
    }//GEN-LAST:event_btnC6ActionPerformed

    private void btnC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC7ActionPerformed
        btnEnabled(btnC7);
    }//GEN-LAST:event_btnC7ActionPerformed

    private void btnC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC8ActionPerformed
        btnEnabled(btnC8);
    }//GEN-LAST:event_btnC8ActionPerformed

    private void btnC9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC9ActionPerformed
        btnEnabled(btnC9);
    }//GEN-LAST:event_btnC9ActionPerformed

    private void btnC10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC10ActionPerformed
        btnEnabled(btnC10);
    }//GEN-LAST:event_btnC10ActionPerformed

    private void btnC11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC11ActionPerformed
        btnEnabled(btnC11);
    }//GEN-LAST:event_btnC11ActionPerformed

    private void btnC12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC12ActionPerformed
        btnEnabled(btnC12);
    }//GEN-LAST:event_btnC12ActionPerformed

    private void btnC13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC13ActionPerformed
        btnEnabled(btnC13);
    }//GEN-LAST:event_btnC13ActionPerformed

    private void btnC14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC14ActionPerformed
        btnEnabled(btnC14);
    }//GEN-LAST:event_btnC14ActionPerformed

    private void btnC15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC15ActionPerformed
        btnEnabled(btnC15);
    }//GEN-LAST:event_btnC15ActionPerformed

    private void btnC16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC16ActionPerformed
        btnEnabled(btnC16);
    }//GEN-LAST:event_btnC16ActionPerformed

    private void btnC1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC1MouseExited

    private void btnC2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC2MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC2MouseExited

    private void btnC3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC3MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC3MouseExited

    private void btnC4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC4MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC4MouseExited

    private void btnC5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC5MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC5MouseExited

    private void btnC6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC6MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC6MouseExited

    private void btnC7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC7MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC7MouseExited

    private void btnC8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC8MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC8MouseExited

    private void btnC9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC9MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC9MouseExited

    private void btnC10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC10MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC10MouseExited

    private void btnC11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC11MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC11MouseExited

    private void btnC12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC12MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC12MouseExited

    private void btnC13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC13MouseExited
        // TODO add your handling code here:        
        compare();
    }//GEN-LAST:event_btnC13MouseExited

    private void btnC14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC14MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC14MouseExited

    private void btnC15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC15MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC15MouseExited

    private void btnC16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC16MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC16MouseExited

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        reiniciar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnC17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC17MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC17MouseExited

    private void btnC17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC17ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC17);
    }//GEN-LAST:event_btnC17ActionPerformed

    private void btnC18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC18MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC18MouseExited

    private void btnC18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC18ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC18);
    }//GEN-LAST:event_btnC18ActionPerformed

    private void btnC19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC19MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC19MouseExited

    private void btnC19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC19ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC19);
    }//GEN-LAST:event_btnC19ActionPerformed

    private void btnC20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC20MouseExited

        compare();
    }//GEN-LAST:event_btnC20MouseExited

    private void btnC20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC20ActionPerformed
        btnEnabled(btnC20);
    }//GEN-LAST:event_btnC20ActionPerformed

    private void btnC21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC21MouseExited
        compare();
    }//GEN-LAST:event_btnC21MouseExited

    private void btnC21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC21ActionPerformed
        btnEnabled(btnC21);
    }//GEN-LAST:event_btnC21ActionPerformed

    private void btnC22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC22MouseExited
        compare();
    }//GEN-LAST:event_btnC22MouseExited

    private void btnC22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC22ActionPerformed
        btnEnabled(btnC22);
    }//GEN-LAST:event_btnC22ActionPerformed

    private void btnC23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC23MouseExited
        compare();
    }//GEN-LAST:event_btnC23MouseExited

    private void btnC23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC23ActionPerformed
        btnEnabled(btnC23);
    }//GEN-LAST:event_btnC23ActionPerformed

    private void btnC24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC24MouseExited
        compare();
    }//GEN-LAST:event_btnC24MouseExited

    private void btnC24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC24ActionPerformed
        btnEnabled(btnC24);
    }//GEN-LAST:event_btnC24ActionPerformed

    private void btnC25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC25MouseExited
        compare();
    }//GEN-LAST:event_btnC25MouseExited

    private void btnC25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC25ActionPerformed
       btnEnabled(btnC25);
    }//GEN-LAST:event_btnC25ActionPerformed

    private void btnC26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC26MouseExited
        compare();
    }//GEN-LAST:event_btnC26MouseExited

    private void btnC26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC26ActionPerformed
        btnEnabled(btnC26);
    }//GEN-LAST:event_btnC26ActionPerformed

    private void btnC27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC27MouseExited
        compare();
    }//GEN-LAST:event_btnC27MouseExited

    private void btnC27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC27ActionPerformed
        btnEnabled(btnC27);
    }//GEN-LAST:event_btnC27ActionPerformed

    private void btnC28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC28MouseExited
        compare();
    }//GEN-LAST:event_btnC28MouseExited

    private void btnC28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC28ActionPerformed
        btnEnabled(btnC28);
    }//GEN-LAST:event_btnC28ActionPerformed

    private void btnC29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC29MouseExited
        compare();
    }//GEN-LAST:event_btnC29MouseExited

    private void btnC29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC29ActionPerformed
        btnEnabled(btnC29);
    }//GEN-LAST:event_btnC29ActionPerformed

    private void btnC30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC30MouseExited
        compare();
    }//GEN-LAST:event_btnC30MouseExited

    private void btnC30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC30ActionPerformed
        btnEnabled(btnC30);
    }//GEN-LAST:event_btnC30ActionPerformed

    
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
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayGame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnC10;
    private javax.swing.JButton btnC11;
    private javax.swing.JButton btnC12;
    private javax.swing.JButton btnC13;
    private javax.swing.JButton btnC14;
    private javax.swing.JButton btnC15;
    private javax.swing.JButton btnC16;
    private javax.swing.JButton btnC17;
    private javax.swing.JButton btnC18;
    private javax.swing.JButton btnC19;
    private javax.swing.JButton btnC2;
    private javax.swing.JButton btnC20;
    private javax.swing.JButton btnC21;
    private javax.swing.JButton btnC22;
    private javax.swing.JButton btnC23;
    private javax.swing.JButton btnC24;
    private javax.swing.JButton btnC25;
    private javax.swing.JButton btnC26;
    private javax.swing.JButton btnC27;
    private javax.swing.JButton btnC28;
    private javax.swing.JButton btnC29;
    private javax.swing.JButton btnC3;
    private javax.swing.JButton btnC30;
    private javax.swing.JButton btnC4;
    private javax.swing.JButton btnC5;
    private javax.swing.JButton btnC6;
    private javax.swing.JButton btnC7;
    private javax.swing.JButton btnC8;
    private javax.swing.JButton btnC9;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
