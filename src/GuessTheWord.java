//Assistance for this code was attained on
//http://docs.oracle.com/javase/8/docs/api/index.html
//& http://docs.oracle.com/javase/tutorial/essential/exceptions/definition.html
//& http://stackoverflow.com/questions/2788080/reading-a-text-file-in-java
//& http://www.javapractices.com/topic/TopicAction.do?Id=57

import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.util.logging.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Evan
 */
public class GuessTheWord extends javax.swing.JFrame {
    
//Classes declared publicly so they may be accessed
//within the program.
String FindWord;  
int wrong = 0;
int letterCounter = 0;
int wordLength;
int charPos;
String X = "X";
String[] randomString = {"decorum", "penchant", "arrant", "pragmatic",
    "marathon", "mettlesome", "parsnip", "quiche", "mushroom", "scout"};
Random random = new Random();
String[] wrongLetter = new String[10];    
int randomNumber = random.nextInt(10);
int randomTextWords;

//Text file String declared in a method and
//exception is thrown to be caught later.
String findFile(String textFile)throws IOException {   
String findTextFile = new String(Files.readAllBytes(Paths.get("Constitution.txt")));

//Returns a value for findTextFile.
return findTextFile;
}
    /**
     * Creates new form GuessTheWord
     */
    public GuessTheWord() {  
      initComponents();      
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Char0 = new javax.swing.JLabel();
        Char1 = new javax.swing.JLabel();
        Char2 = new javax.swing.JLabel();
        Char3 = new javax.swing.JLabel();
        Char4 = new javax.swing.JLabel();
        Char5 = new javax.swing.JLabel();
        aLetter = new javax.swing.JTextField();
        MyMessage = new javax.swing.JLabel();
        tryLetter = new javax.swing.JButton();
        inCorrect = new javax.swing.JLabel();
        hangManDisplay = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        Char6 = new javax.swing.JLabel();
        Char7 = new javax.swing.JLabel();
        Char8 = new javax.swing.JLabel();
        Char9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        wrongChar0 = new javax.swing.JLabel();
        wrongChar1 = new javax.swing.JLabel();
        wrongChar2 = new javax.swing.JLabel();
        wrongChar3 = new javax.swing.JLabel();
        wrongChar4 = new javax.swing.JLabel();
        wrongChar5 = new javax.swing.JLabel();
        wrongChar6 = new javax.swing.JLabel();
        wrongChar7 = new javax.swing.JLabel();
        wrongChar8 = new javax.swing.JLabel();
        wrongChar9 = new javax.swing.JLabel();
        HardVersion = new javax.swing.JButton();
        actualWord = new javax.swing.JLabel();
        warningMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Char0.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        Char0.setText("X");
        getContentPane().add(Char0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 15, 15));

        Char1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        Char1.setText("X");
        getContentPane().add(Char1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 15, 15));

        Char2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        Char2.setText("X");
        getContentPane().add(Char2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 15, 15));

        Char3.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        Char3.setText("X");
        getContentPane().add(Char3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 15, 15));

        Char4.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        Char4.setText("X");
        getContentPane().add(Char4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 15, 15));

        Char5.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        Char5.setText("X");
        getContentPane().add(Char5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 15, 15));

        aLetter.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        aLetter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aLetterActionPerformed(evt);
            }
        });
        getContentPane().add(aLetter, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 104, 60, 40));

        MyMessage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MyMessage.setText("Look here");
        getContentPane().add(MyMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        tryLetter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tryLetter.setText("Try Letter");
        tryLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryLetterActionPerformed(evt);
            }
        });
        getContentPane().add(tryLetter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, 40));

        inCorrect.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        inCorrect.setText("0");
        getContentPane().add(inCorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 230, 40));

        hangManDisplay.setText("jButton1");
        getContentPane().add(hangManDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 50, 770, 469));

        reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        Char6.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        Char6.setText("X");
        getContentPane().add(Char6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 15, 15));

        Char7.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        Char7.setText("X");
        getContentPane().add(Char7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 15, 15));

        Char8.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        Char8.setText("X");
        getContentPane().add(Char8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 15, 15));

        Char9.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        Char9.setText("X");
        getContentPane().add(Char9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 15, 15));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Incorrect Letters Guessed");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        wrongChar0.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        getContentPane().add(wrongChar0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 20, 30));

        wrongChar1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        getContentPane().add(wrongChar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 20, 30));

        wrongChar2.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        getContentPane().add(wrongChar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 20, 30));

        wrongChar3.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        getContentPane().add(wrongChar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 20, 30));

        wrongChar4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        getContentPane().add(wrongChar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 20, 30));

        wrongChar5.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        getContentPane().add(wrongChar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 20, 30));

        wrongChar6.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        getContentPane().add(wrongChar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 20, 30));

        wrongChar7.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        getContentPane().add(wrongChar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 20, 30));

        wrongChar8.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        getContentPane().add(wrongChar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 20, 30));

        wrongChar9.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        getContentPane().add(wrongChar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 20, 30));

        HardVersion.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        HardVersion.setText("Hard Version");
        HardVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HardVersionActionPerformed(evt);
            }
        });
        getContentPane().add(HardVersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        actualWord.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        getContentPane().add(actualWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 180, 40));

        warningMessage.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        getContentPane().add(warningMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 330, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tryLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryLetterActionPerformed
        // TODO add your handling code here:
       
        wordLength = FindWord.length(); 
        
        //Character read in from jTextField and indexed with number value
        //of letter being assigned to charPos.
        String letter = aLetter.getText();                   
        charPos = FindWord.indexOf(letter);
        
        //If statement adding to lettercounter is letter is present
        //in current word and acocunting for no repetition of letters
        //already guessed.
        if(((charPos == 0 ) || (charPos == 1)|| (charPos == 2) || (charPos == 3)
            || (charPos == 4) || (charPos == 5) || (charPos == 6) || (charPos == 7) ||
            (charPos == 8)|| (charPos == 9))  && (!letter.equals(wrongLetter[0])
             && !letter.equals(wrongLetter[1]) && !letter.equals(wrongLetter[2])
             && !letter.equals(wrongLetter[3]) && !letter.equals(wrongLetter[4])
             && !letter.equals(wrongLetter[5]) && !letter.equals(wrongLetter[6])
             && !letter.equals(wrongLetter[7]) && !letter.equals(wrongLetter[8])
             && !letter.equals(wrongLetter[9])))
           letterCounter++;
                        
        //Entered letter assigned to a label if in current word.
        if (charPos == 0) Char0.setText(letter);        
        if (charPos == 1) Char1.setText(letter);        
        if (charPos == 2) Char2.setText(letter); 
        if (charPos == 3) Char3.setText(letter);      
        if (charPos == 4) Char4.setText(letter);       
        if (charPos == 5) Char5.setText(letter);
        if (charPos == 6) Char6.setText(letter);
        if (charPos == 7) Char7.setText(letter);
        if (charPos == 8) Char8.setText(letter);
        if (charPos == 9) Char9.setText(letter);
                        
        MyMessage.setText("position is " + charPos);
       
        //"if" statments for if letter entered is not in current word an image is displayed 
        //and progressively altered with continued incorrect guesses.
        if (charPos == -1)
        {                  
        wrong++;
         
        if (wrong == 1){
            hangManDisplay.setIcon(new javax.swing.ImageIcon("landscape.2.png"));
            wrongChar0.setText(letter);
        }
        if (wrong == 2){
            hangManDisplay.setIcon(new javax.swing.ImageIcon("landscape.3.png"));
            wrongChar1.setText(letter);
        }
        if (wrong == 3){
            hangManDisplay.setIcon(new javax.swing.ImageIcon("landscape.4.png"));
            wrongChar2.setText(letter);
        }
        if (wrong == 4){
            hangManDisplay.setIcon(new javax.swing.ImageIcon("landscape.5.png"));
            wrongChar3.setText(letter);
        }
        if (wrong == 5){
            hangManDisplay.setIcon(new javax.swing.ImageIcon("landscape.6.png"));
            wrongChar4.setText(letter);
        }
        if (wrong == 6){
            hangManDisplay.setIcon(new javax.swing.ImageIcon("landscape.7.png"));
            wrongChar5.setText(letter);
        }
        if (wrong == 7){
            hangManDisplay.setIcon(new javax.swing.ImageIcon("landscape.8.png"));
            wrongChar6.setText(letter);
        }
        if (wrong == 8){
            hangManDisplay.setIcon(new javax.swing.ImageIcon("landscape.9.png"));
            wrongChar7.setText(letter);
        }
        if (wrong == 9){
            hangManDisplay.setIcon(new javax.swing.ImageIcon("landscape.10.png"));
            wrongChar8.setText(letter);
        }
        if (wrong == 10){
            hangManDisplay.setIcon(new javax.swing.ImageIcon("landscape.11.png"));
            wrongChar9.setText(letter);
            warningMessage.setText("Quick! One more chance before it is too late!");
        }
        if (wrong == 11){hangManDisplay.setIcon
        (new javax.swing.ImageIcon("landscape.12.png"));
        actualWord.setText("The word is " + FindWord);
        warningMessage.setText("         ");
        }
        String wrongString = Integer.toString(wrong);
        inCorrect.setText("Wrong attempt " + wrongString + " of 11");
        }
         
        //"if" statment checking for second recurrence of a letter guessed.
        if(charPos >=0 && charPos < 10)
        {                  
            charPos = FindWord.indexOf(letter, charPos+1);
         
             if((charPos == 0 || charPos == 1 || charPos == 2 || charPos == 3
               || charPos == 4 || charPos == 5 || charPos == 6 || charPos == 7
               || charPos == 8 || charPos == 9) && (!letter.equals(wrongLetter[0])
             && !letter.equals(wrongLetter[1]) && !letter.equals(wrongLetter[2])
             && !letter.equals(wrongLetter[3]) && !letter.equals(wrongLetter[4])
             && !letter.equals(wrongLetter[5]) && !letter.equals(wrongLetter[6])
             && !letter.equals(wrongLetter[7]) && !letter.equals(wrongLetter[8])
             && !letter.equals(wrongLetter[9])))
               letterCounter++;
            
            if (charPos == 0) Char0.setText(letter);       
            if (charPos == 1) Char1.setText(letter);      
            if (charPos == 2) Char2.setText(letter);      
            if (charPos == 3) Char3.setText(letter);      
            if (charPos == 4) Char4.setText(letter);       
            if (charPos == 5) Char5.setText(letter);
            if (charPos == 6) Char6.setText(letter);
            if (charPos == 7) Char7.setText(letter);
            if (charPos == 8) Char8.setText(letter);
            if (charPos == 9) Char9.setText(letter);
        }
         
        //'if" statmenet searching for third recurrence of a letter in the word.
         if(charPos >=0 && charPos < 10)
        {                  
            charPos = FindWord.indexOf(letter, charPos+1);
         
             if((charPos == 0 || charPos == 1 || charPos == 2 || charPos == 3
               || charPos == 4 || charPos == 5 || charPos == 6 || charPos == 7
               || charPos == 8 || charPos == 9) && (!letter.equals(wrongLetter[0])
             && !letter.equals(wrongLetter[1]) && !letter.equals(wrongLetter[2])
             && !letter.equals(wrongLetter[3]) && !letter.equals(wrongLetter[4])
             && !letter.equals(wrongLetter[5]) && !letter.equals(wrongLetter[6])
             && !letter.equals(wrongLetter[7]) && !letter.equals(wrongLetter[8])
             && !letter.equals(wrongLetter[9])))
               letterCounter++;
            
            if (charPos == 0) Char0.setText(letter);       
            if (charPos == 1) Char1.setText(letter);      
            if (charPos == 2) Char2.setText(letter);      
            if (charPos == 3) Char3.setText(letter);      
            if (charPos == 4) Char4.setText(letter);       
            if (charPos == 5) Char5.setText(letter);
            if (charPos == 6) Char6.setText(letter);
            if (charPos == 7) Char7.setText(letter);
            if (charPos == 8) Char8.setText(letter);
            if (charPos == 9) Char9.setText(letter);
        }
                  
        //"if-else" statments assigning wrongly guessed letters to jLabels 
         if(!letter.equals(wrongLetter[0]) && !letter.equals(wrongLetter[1]) &&
           !letter.equals(wrongLetter[2]) && !letter.equals(wrongLetter[3]) &&
           !letter.equals(wrongLetter[4]) && !letter.equals(wrongLetter[5]) &&
           !letter.equals(wrongLetter[6]) && !letter.equals(wrongLetter[7]) &&
           !letter.equals(wrongLetter[8]) && !letter.equals(wrongLetter[9]))
            wrongLetter[0] = letter;
        else if (!letter.equals(wrongLetter[1]) &&
           !letter.equals(wrongLetter[2]) && !letter.equals(wrongLetter[3]) &&
           !letter.equals(wrongLetter[4]) && !letter.equals(wrongLetter[5]) &&
           !letter.equals(wrongLetter[6]) && !letter.equals(wrongLetter[7]) &&
           !letter.equals(wrongLetter[8]) && !letter.equals(wrongLetter[9]))
            wrongLetter[1] = letter;
        else if(!letter.equals(wrongLetter[2]) && !letter.equals(wrongLetter[3]) &&
           !letter.equals(wrongLetter[4]) && !letter.equals(wrongLetter[5]) &&
           !letter.equals(wrongLetter[6]) && !letter.equals(wrongLetter[7]) &&
           !letter.equals(wrongLetter[8]) && !letter.equals(wrongLetter[9]))
            wrongLetter[2] = letter;
        else if (!letter.equals(wrongLetter[3]) &&
           !letter.equals(wrongLetter[4]) && !letter.equals(wrongLetter[5]) &&
           !letter.equals(wrongLetter[6]) && !letter.equals(wrongLetter[7]) &&
           !letter.equals(wrongLetter[8]) && !letter.equals(wrongLetter[9]))
            wrongLetter[3] = letter;
        else if (!letter.equals(wrongLetter[4]) && !letter.equals(wrongLetter[5]) &&
           !letter.equals(wrongLetter[6]) && !letter.equals(wrongLetter[7]) &&
           !letter.equals(wrongLetter[8]) && !letter.equals(wrongLetter[9]))
            wrongLetter[4] = letter;
        else if( !letter.equals(wrongLetter[5]) &&
           !letter.equals(wrongLetter[6]) && !letter.equals(wrongLetter[7]) &&
           !letter.equals(wrongLetter[8]) && !letter.equals(wrongLetter[9]))
            wrongLetter[5] = letter;
        else if(!letter.equals(wrongLetter[6]) && !letter.equals(wrongLetter[7]) &&
           !letter.equals(wrongLetter[8]) && !letter.equals(wrongLetter[9]))
            wrongLetter[6] = letter;
        else if(!letter.equals(wrongLetter[7]) &&
           !letter.equals(wrongLetter[8]) && !letter.equals(wrongLetter[9]))
            wrongLetter[7] = letter;
        else if(!letter.equals(wrongLetter[8]) && !letter.equals(wrongLetter[9]))
            wrongLetter[8] = letter;
        else if(!letter.equals(wrongLetter[9]))
            wrongLetter[9] = letter; 
                
         //Win screen displays when counter equals word length.
       if (letterCounter == wordLength){
           hangManDisplay.setIcon(new javax.swing.ImageIcon("LandscapeWIN." + wrong + ".png"));  
           letterCounter = 0;
       }
        
    }//GEN-LAST:event_tryLetterActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        //Code in the formWindowActivated displays
        //everything when the program is opened.
        hangManDisplay.setIcon(new javax.swing.ImageIcon("landscape.1.png"));
        
        if(randomNumber == 1)
             FindWord = randomString[0];
         if(randomNumber == 2)
             FindWord = randomString[2];
         if(randomNumber == 3)
             FindWord = randomString[5];
         if(randomNumber == 4)
             FindWord = randomString[3];
         if(randomNumber == 5)
             FindWord = randomString[4];
         if(randomNumber == 6)
             FindWord = randomString[1];
         if(randomNumber == 7)
             FindWord = randomString[6];
         if(randomNumber == 8)
             FindWord = randomString[7];
         if(randomNumber == 9)
             FindWord = randomString[8];
         if(randomNumber == 0)
             FindWord = randomString[9];
         
        wordLength = FindWord.length();
               
         if (wordLength == 3){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(false);
            Char4.setVisible(false);
            Char5.setVisible(false);
            Char6.setVisible(false);
            Char7.setVisible(false);
            Char8.setVisible(false);
            Char9.setVisible(false);
        }
         if (wordLength == 4){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(false);
            Char5.setVisible(false);
            Char6.setVisible(false);
            Char7.setVisible(false);
            Char8.setVisible(false);
            Char9.setVisible(false);
        }
          if (wordLength == 5){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(true);
            Char5.setVisible(false);
            Char6.setVisible(false);
            Char7.setVisible(false);
            Char8.setVisible(false);
            Char9.setVisible(false);
        }
           if (wordLength == 6){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(true);
            Char5.setVisible(true);
            Char6.setVisible(false);
            Char7.setVisible(false);
            Char8.setVisible(false);
            Char9.setVisible(false);
        }
           if (wordLength == 7){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(true);
            Char5.setVisible(true);
            Char6.setVisible(true);
            Char7.setVisible(false);
            Char8.setVisible(false);
            Char9.setVisible(false);
        }
           if (wordLength == 8){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(true);
            Char5.setVisible(true);
            Char6.setVisible(true);
            Char7.setVisible(true);
            Char8.setVisible(false);
            Char9.setVisible(false);
        }
           if (wordLength == 9){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(true);
            Char5.setVisible(true);
            Char6.setVisible(true);
            Char7.setVisible(true);
            Char8.setVisible(true);
            Char9.setVisible(false);
        }
           if (wordLength == 10){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(true);
            Char5.setVisible(true);
            Char6.setVisible(true);
            Char7.setVisible(true);
            Char8.setVisible(true);
            Char9.setVisible(true);
        }
    }//GEN-LAST:event_formWindowActivated

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        
        hangManDisplay.setIcon(new javax.swing.ImageIcon("landscape.1.png"));
        actualWord.setText("     ");
        warningMessage.setText("       ");
        int reset = 0;
               
        randomNumber = random.nextInt(10);
        
        //Random number generator equates the number with a word
        //to produce a random word every time the reset button is pressed. 
         if(randomNumber == 1)
             FindWord = randomString[0];
         if(randomNumber == 2)
             FindWord = randomString[2];
         if(randomNumber == 3)
             FindWord = randomString[5];
         if(randomNumber == 4)
             FindWord = randomString[3];
         if(randomNumber == 5)
             FindWord = randomString[4];
         if(randomNumber == 6)
             FindWord = randomString[1];
         if(randomNumber == 7)
             FindWord = randomString[6];
         if(randomNumber == 8)
             FindWord = randomString[7];
         if(randomNumber == 9)
             FindWord = randomString[8];
         if(randomNumber == 0)
             FindWord = randomString[9];
         
        wordLength = FindWord.length();
        
        //The following code resets jLabel inCorrect to 0.
        String resetString = Integer.toString(reset);
        inCorrect.setText(resetString);
        
        //Resets jLabels to x's
         Char0.setText(X);        
         Char1.setText(X);        
         Char2.setText(X); 
         Char3.setText(X);      
         Char4.setText(X);       
         Char5.setText(X);
         Char6.setText(X);
         Char7.setText(X);
         Char8.setText(X);
         Char9.setText(X);
         
         //resets Wrongly guessed letters to blanks.
         wrongChar0.setText(" ");
         wrongChar1.setText(" ");
         wrongChar2.setText(" ");
         wrongChar3.setText(" ");
         wrongChar4.setText(" ");
         wrongChar5.setText(" ");
         wrongChar6.setText(" ");
         wrongChar7.setText(" ");
         wrongChar8.setText(" ");
         wrongChar9.setText(" "); 
         
         wrong = 0;
         
        //'if' statements allocate the appropriate number of X's
        //for the appropriate word length.
         if (wordLength == 3){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(false);
            Char4.setVisible(false);
            Char5.setVisible(false);
            Char6.setVisible(false);
            Char7.setVisible(false);
            Char8.setVisible(false);
            Char9.setVisible(false);
        }
         if (wordLength == 4){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(false);
            Char5.setVisible(false);
            Char6.setVisible(false);
            Char7.setVisible(false);
            Char8.setVisible(false);
            Char9.setVisible(false);
        }
          if (wordLength == 5){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(true);
            Char5.setVisible(false);
            Char6.setVisible(false);
            Char7.setVisible(false);
            Char8.setVisible(false);
            Char9.setVisible(false);
        }
           if (wordLength == 6){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(true);
            Char5.setVisible(true);
            Char6.setVisible(false);
            Char7.setVisible(false);
            Char8.setVisible(false);
            Char9.setVisible(false);
        }
           if (wordLength == 7){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(true);
            Char5.setVisible(true);
            Char6.setVisible(true);
            Char7.setVisible(false);
            Char8.setVisible(false);
            Char9.setVisible(false);
        }
           if (wordLength == 8){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(true);
            Char5.setVisible(true);
            Char6.setVisible(true);
            Char7.setVisible(true);
            Char8.setVisible(false);
            Char9.setVisible(false);
        }
           if (wordLength == 9){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(true);
            Char5.setVisible(true);
            Char6.setVisible(true);
            Char7.setVisible(true);
            Char8.setVisible(true);
            Char9.setVisible(false);
        }
           if (wordLength == 10){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(true);
            Char5.setVisible(true);
            Char6.setVisible(true);
            Char7.setVisible(true);
            Char8.setVisible(true);
            Char9.setVisible(true);
        }
           wrongLetter[0] = " ";
           wrongLetter[1] = " ";
           wrongLetter[2] = " ";
           wrongLetter[3] = " ";
           wrongLetter[4] = " ";
           wrongLetter[5] = " ";
           wrongLetter[6] = " ";
           wrongLetter[7] = " ";
           wrongLetter[8] = " ";
           wrongLetter[9] = " ";           
    }//GEN-LAST:event_resetActionPerformed

    private void aLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aLetterActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_aLetterActionPerformed

    private void HardVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HardVersionActionPerformed
    
    //Stirng declared before text file is stored within.
    String textWords;
    textWords = "String"; 
    
    //Code within try block that will try to throw an exception.
    try {
       textWords = findFile("Constitution.txt");
    }
    //catch is the exception handler allowing for the Input/Output exception.
    catch (IOException theException) {
       Logger.getLogger(GuessTheWord.class.getName()).log(Level.SEVERE, null, theException);
    }
    //randomTextWords is assigned ten integers which will be decided at random.
    randomTextWords = random.nextInt(10);
    
    //FindWord is assigned the text file. "split" seperates
    //the spaces between the words and assigns the numbers with the words.
    FindWord = textWords.split(" ")[randomTextWords];
   
    wordLength = FindWord.length();
             
         if (wordLength == 3){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(false);
            Char4.setVisible(false);
            Char5.setVisible(false);
            Char6.setVisible(false);
            Char7.setVisible(false);
            Char8.setVisible(false);
            Char9.setVisible(false);
        }
         if (wordLength == 4){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(false);
            Char5.setVisible(false);
            Char6.setVisible(false);
            Char7.setVisible(false);
            Char8.setVisible(false);
            Char9.setVisible(false);
        }
          if (wordLength == 5){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(true);
            Char5.setVisible(false);
            Char6.setVisible(false);
            Char7.setVisible(false);
            Char8.setVisible(false);
            Char9.setVisible(false);
        }
           if (wordLength == 6){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(true);
            Char5.setVisible(true);
            Char6.setVisible(false);
            Char7.setVisible(false);
            Char8.setVisible(false);
            Char9.setVisible(false);
        }
           if (wordLength == 7){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(true);
            Char5.setVisible(true);
            Char6.setVisible(true);
            Char7.setVisible(false);
            Char8.setVisible(false);
            Char9.setVisible(false);
        }
           if (wordLength == 8){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(true);
            Char5.setVisible(true);
            Char6.setVisible(true);
            Char7.setVisible(true);
            Char8.setVisible(false);
            Char9.setVisible(false);
        }
           if (wordLength == 9){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(true);
            Char5.setVisible(true);
            Char6.setVisible(true);
            Char7.setVisible(true);
            Char8.setVisible(true);
            Char9.setVisible(false);
        }
           if (wordLength == 10){
            Char0.setVisible(true);
            Char1.setVisible(true);
            Char2.setVisible(true);
            Char3.setVisible(true);
            Char4.setVisible(true);
            Char5.setVisible(true);
            Char6.setVisible(true);
            Char7.setVisible(true);
            Char8.setVisible(true);
            Char9.setVisible(true);
        }
    
         wrongChar0.setText(" ");
         wrongChar1.setText(" ");
         wrongChar2.setText(" ");
         wrongChar3.setText(" ");
         wrongChar4.setText(" ");
         wrongChar5.setText(" ");
         wrongChar6.setText(" ");
         wrongChar7.setText(" ");
         wrongChar8.setText(" ");
         wrongChar9.setText(" ");         
    }//GEN-LAST:event_HardVersionActionPerformed
   
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
            java.util.logging.Logger.getLogger(GuessTheWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuessTheWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuessTheWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuessTheWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuessTheWord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Char0;
    private javax.swing.JLabel Char1;
    private javax.swing.JLabel Char2;
    private javax.swing.JLabel Char3;
    private javax.swing.JLabel Char4;
    private javax.swing.JLabel Char5;
    private javax.swing.JLabel Char6;
    private javax.swing.JLabel Char7;
    private javax.swing.JLabel Char8;
    private javax.swing.JLabel Char9;
    private javax.swing.JButton HardVersion;
    private javax.swing.JLabel MyMessage;
    private javax.swing.JTextField aLetter;
    private javax.swing.JLabel actualWord;
    private javax.swing.JButton hangManDisplay;
    private javax.swing.JLabel inCorrect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton reset;
    private javax.swing.JButton tryLetter;
    private javax.swing.JLabel warningMessage;
    private javax.swing.JLabel wrongChar0;
    private javax.swing.JLabel wrongChar1;
    private javax.swing.JLabel wrongChar2;
    private javax.swing.JLabel wrongChar3;
    private javax.swing.JLabel wrongChar4;
    private javax.swing.JLabel wrongChar5;
    private javax.swing.JLabel wrongChar6;
    private javax.swing.JLabel wrongChar7;
    private javax.swing.JLabel wrongChar8;
    private javax.swing.JLabel wrongChar9;
    // End of variables declaration//GEN-END:variables
}
