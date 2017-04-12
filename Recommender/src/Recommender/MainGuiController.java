/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recommender;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultListModel;

/**
 *
 * @author louis
 */
public class MainGuiController extends javax.swing.JFrame {
    
    /**
     * Creates new form mainGuiController
     */
    private MainGuiController() {
        initComponents();
        UserListManager = UserDatabase.getInstance();
        MediaListManager = MediaDatabase.getInstance();
    }
    private DefaultListModel dlmLeft = new DefaultListModel();
    private DefaultListModel dlmRight = new DefaultListModel();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainView = new javax.swing.JPanel();
        PublicListView = new javax.swing.JPanel();
        BooksTB = new javax.swing.JToggleButton();
        MusicTB = new javax.swing.JToggleButton();
        MovieTB = new javax.swing.JToggleButton();
        VideoGameTB = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        MainDescriptionText = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        addToMainBTN = new javax.swing.JButton();
        addToWishListBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        createNewBTN = new javax.swing.JButton();
        MainSplitPane = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        MainRightList = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        LeftMainList = new javax.swing.JList<>();
        searchField = new javax.swing.JTextField();
        searchBTN = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        myListMenu = new javax.swing.JMenuItem();
        publicListMenu = new javax.swing.JMenuItem();
        wishListMenu = new javax.swing.JMenuItem();
        accountMenu = new javax.swing.JMenu();
        editAccountMenu = new javax.swing.JMenuItem();
        logoutMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recommender Main Screen");
        setResizable(false);

        PublicListView.setBackground(new java.awt.Color(204, 204, 255));

        BooksTB.setText("Books");

        MusicTB.setText("Music");

        MovieTB.setText("Movies");
        MovieTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovieTBActionPerformed(evt);
            }
        });

        VideoGameTB.setText("Video Games");
        VideoGameTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VideoGameTBActionPerformed(evt);
            }
        });

        MainDescriptionText.setEditable(false);
        MainDescriptionText.setColumns(20);
        MainDescriptionText.setLineWrap(true);
        MainDescriptionText.setRows(5);
        MainDescriptionText.setToolTipText("");
        MainDescriptionText.setWrapStyleWord(true);
        MainDescriptionText.setOpaque(false);
        jScrollPane3.setViewportView(MainDescriptionText);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Click to Toggle:");

        addToMainBTN.setText("Add to Main list");
        addToMainBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToMainBTNActionPerformed(evt);
            }
        });

        addToWishListBTN.setText("Add to Wish list");

        jLabel2.setText("Recommendations");

        jLabel3.setText("Public List");

        jLabel4.setText("Details:");

        createNewBTN.setText("Create new Media");
        createNewBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewBTNActionPerformed(evt);
            }
        });

        MainSplitPane.setDividerLocation(150);

        jScrollPane2.setViewportView(MainRightList);

        MainSplitPane.setRightComponent(jScrollPane2);

        LeftMainList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LeftMainList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                LeftMainListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(LeftMainList);

        MainSplitPane.setLeftComponent(jScrollPane1);

        searchBTN.setText("Search");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PublicListViewLayout = new javax.swing.GroupLayout(PublicListView);
        PublicListView.setLayout(PublicListViewLayout);
        PublicListViewLayout.setHorizontalGroup(
            PublicListViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PublicListViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PublicListViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PublicListViewLayout.createSequentialGroup()
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 430, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(PublicListViewLayout.createSequentialGroup()
                        .addGroup(PublicListViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(createNewBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addToWishListBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addToMainBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PublicListViewLayout.createSequentialGroup()
                        .addGroup(PublicListViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MusicTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MovieTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VideoGameTB, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(BooksTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchBTN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PublicListViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MainSplitPane)
                            .addGroup(PublicListViewLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        PublicListViewLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BooksTB, MovieTB, MusicTB, VideoGameTB, jLabel1});

        PublicListViewLayout.setVerticalGroup(
            PublicListViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PublicListViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PublicListViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PublicListViewLayout.createSequentialGroup()
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBTN)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VideoGameTB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MovieTB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MusicTB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BooksTB))
                    .addGroup(PublicListViewLayout.createSequentialGroup()
                        .addGroup(PublicListViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24)
                        .addComponent(MainSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(PublicListViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PublicListViewLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(addToMainBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addToWishListBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createNewBTN)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PublicListViewLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout MainViewLayout = new javax.swing.GroupLayout(MainView);
        MainView.setLayout(MainViewLayout);
        MainViewLayout.setHorizontalGroup(
            MainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PublicListView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainViewLayout.setVerticalGroup(
            MainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PublicListView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuBar.setForeground(new java.awt.Color(255, 255, 255));

        fileMenu.setText("File");
        fileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuActionPerformed(evt);
            }
        });

        myListMenu.setText("My List");
        myListMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myListMenuActionPerformed(evt);
            }
        });
        fileMenu.add(myListMenu);

        publicListMenu.setText("Public List");
        publicListMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicListMenuActionPerformed(evt);
            }
        });
        fileMenu.add(publicListMenu);

        wishListMenu.setText("Wish List");
        wishListMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wishListMenuActionPerformed(evt);
            }
        });
        fileMenu.add(wishListMenu);

        menuBar.add(fileMenu);

        accountMenu.setText("Account");
        accountMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountMenuActionPerformed(evt);
            }
        });

        editAccountMenu.setText("Edit Account");
        editAccountMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAccountMenuActionPerformed(evt);
            }
        });
        accountMenu.add(editAccountMenu);

        logoutMenu.setText("Logout");
        logoutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuActionPerformed(evt);
            }
        });
        accountMenu.add(logoutMenu);

        menuBar.add(accountMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 961, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MainView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MainView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuActionPerformed
        LoginGuiController loginGui;
        loginGui = new LoginGuiController();
        loginGui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutMenuActionPerformed

    private void editAccountMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAccountMenuActionPerformed
        this.getContentPane().removeAll();
        this.getContentPane().add(PublicListView);
        this.pack();
        this.repaint();
    }//GEN-LAST:event_editAccountMenuActionPerformed

    private void accountMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountMenuActionPerformed

    private void fileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileMenuActionPerformed

    private void publicListMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicListMenuActionPerformed
        this.getContentPane().removeAll();
        this.getContentPane().add(PublicListView);
        this.pack();
        this.repaint();
    }//GEN-LAST:event_publicListMenuActionPerformed

    private void MovieTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovieTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MovieTBActionPerformed

    
    /*
    * Button to change to myList view in the main frame.
    */
    private void myListMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myListMenuActionPerformed

        this.getContentPane().removeAll();
        this.getContentPane().add(PublicListView);
        this.pack();
        this.repaint();
    }//GEN-LAST:event_myListMenuActionPerformed

    private void wishListMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wishListMenuActionPerformed

        this.getContentPane().removeAll();
        this.getContentPane().add(PublicListView);
        this.pack();
        this.repaint();
    }//GEN-LAST:event_wishListMenuActionPerformed

    private void VideoGameTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VideoGameTBActionPerformed
       int i= 1;
       dlmLeft.removeAllElements();
       LeftMainList.setModel(dlmLeft);
        for(Media media: MediaListManager.getMediaList()){
            dlmLeft.addElement(i + ": " +media.getTitle());
            i++;
        }   
        LeftMainList.setModel(dlmLeft);
    }//GEN-LAST:event_VideoGameTBActionPerformed

    private void createNewBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewBTNActionPerformed
        MainDescriptionText.setText("Use the popup window to create a new media");
        MediaFactoryGui mediaFactoryGui = new MediaFactoryGui();
        mediaFactoryGui.setVisible(true);
        newMedia = mediaFactoryGui.createNewMedia();
    }//GEN-LAST:event_createNewBTNActionPerformed

    private void LeftMainListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_LeftMainListValueChanged
       int i = LeftMainList.getSelectedIndex();
       selectedMedia = MediaListManager.getMediaAtIndex(i);
       createDescription(selectedMedia);
        MainDescriptionText.setText(mediaDescription);
    }//GEN-LAST:event_LeftMainListValueChanged

    private void addToMainBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToMainBTNActionPerformed
        UserListManager.addMedia(selectedMedia);
    }//GEN-LAST:event_addToMainBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        int i = 0;
        for (Media media : MediaListManager.getMediaList()){
            searchTitle = searchField.getText();
            if(searchTitle.equals( media.getTitle())){
                LeftMainList.setSelectedIndex(i);
            }
            i++;
        }
       
    }//GEN-LAST:event_searchBTNActionPerformed

    /**
     * This opens the main frame to the main view.  used by other functions to make this frame active
     */
    public void openMyList() {
        this.setVisible(true);
        MainView.removeAll();
        MainView.add(PublicListView);
        MainView.repaint();
        MainView.revalidate();
    }
    
    /**
     *
     * @return
     */
    public static MainGuiController getInstance(){
        if (mainGuiController == null){
            mainGuiController = new MainGuiController();
        }
        return mainGuiController;
    }
    
    private void createDescription(Media media){
        
        mediaDescription = "Title: " + media.getTitle() + "\n" + 
                           "Author: " + media.getAuthor() + "\n" +
                           "Published in: " + media.getYearPublished() + "\n" +
                           "Published by: " + media.getPublisher() + "\n" +
                           "Genre: " + media.getGenre() + "\n" +
                           "Stars out of 5" + 4 + "\n";
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
            java.util.logging.Logger.getLogger(MainGuiController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGuiController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGuiController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGuiController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGuiController().setVisible(true);
            }
        });
    }
    
    String searchTitle;
    String mediaDescription;
    private Media newMedia;
    private Media selectedMedia;
    private LoginGuiController loginGuiController;
    private static MainGuiController mainGuiController;
    ArrayList<Media> publicMediaList;
    private static MediaDatabase myDatabase;
    private ArrayList<Media> recommendationList;
    private ArrayList<String> userPreferenceList;
    private final MediaDatabase MediaListManager;
    private final UserDatabase UserListManager;
    private final Scanner scanner = new Scanner(System.in);
    private int menuControlInt;
    private User user;    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BooksTB;
    private javax.swing.JList<String> LeftMainList;
    private javax.swing.JTextArea MainDescriptionText;
    private javax.swing.JList<String> MainRightList;
    private javax.swing.JSplitPane MainSplitPane;
    private javax.swing.JPanel MainView;
    private javax.swing.JToggleButton MovieTB;
    private javax.swing.JToggleButton MusicTB;
    private javax.swing.JPanel PublicListView;
    private javax.swing.JToggleButton VideoGameTB;
    private javax.swing.JMenu accountMenu;
    private javax.swing.JButton addToMainBTN;
    private javax.swing.JButton addToWishListBTN;
    private javax.swing.JButton createNewBTN;
    private javax.swing.JMenuItem editAccountMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem logoutMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem myListMenu;
    private javax.swing.JMenuItem publicListMenu;
    private javax.swing.JButton searchBTN;
    private javax.swing.JTextField searchField;
    private javax.swing.JMenuItem wishListMenu;
    // End of variables declaration//GEN-END:variables


}
