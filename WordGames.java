import javax.swing.*; 
import java.awt.event.*;
import java.util.*;
import java.awt.Color;
import java.awt.Font;
class WordGames
{
		// main class
	public static void main(String args[])
	{
		// front frame with title
		JFrame frm1 = new JFrame("Word Shuffle"); 
		 		
		//Size settings for  main frame
		frm1.setSize(450,500);
			
		//Close settings for frame
		frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// visibility of frame
		frm1.setVisible(true);
				
		//layout settings for frame
		frm1.setLayout(null);

		// game Name on Front Jframe
		JLabel jlb = new JLabel("Words Play Games");
		jlb.setBounds(108,50,300,50);
		frm1.add(jlb);
		jlb.setFont(new Font("Courier New", Font.BOLD, 22));
    		jlb.setForeground(Color.RED);

		//button to start play on Main Frame
		JButton btn1_1 = new JButton ("Start Game");
		btn1_1.setBounds(175,145,100,70);
		frm1.add(btn1_1);
		btn1_1.addActionListener(new LevelOne(frm1));
		
		//help button
		JButton helpBtn = new JButton ("Help");
		helpBtn.setBounds(175,270,100,70);
		frm1.add(helpBtn);
		helpBtn.addActionListener(new Help(frm1));
		
	}
}
		// help class for help button
class Help implements ActionListener
{	
	JFrame frm1;
	Help(JFrame frm1)
	{
		this.frm1 = frm1;
	}
	public void actionPerformed(ActionEvent ae)
	{
			frm1.dispose();
		// help frame
		JFrame frmH = new JFrame("Word Shuffle"); 
		 		
		//Size settings for frame
		frmH.setSize(750,500);
			
		//Close settings for frame
		frmH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// visibility of frame
		frmH.setVisible(true);
				
		//layout settings for frame
		frmH.setLayout(null);

		// Jlabel
		JLabel jlb_1 = new JLabel("About Level One:");
		jlb_1.setBounds(20,50,200,50);
		frmH.add(jlb_1);
		jlb_1.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb_1.setForeground(Color.RED);
			
		JLabel jlb_2 = new JLabel("Make words from shuffled alphabets.");
		jlb_2.setBounds(70,70,580,50);
		frmH.add(jlb_2);
		jlb_2.setFont(new Font("Courier New", Font.BOLD, 15));
    		jlb_2.setForeground(Color.BLACK);

		JLabel jlb_3 = new JLabel("About Level Two");
		jlb_3.setBounds(20,100,200,50);
		frmH.add(jlb_3);
		jlb_3.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb_3.setForeground(Color.RED);

		JLabel jlb_4 = new JLabel("Use given number of Alphabets after each to make word.");
		jlb_4.setBounds(70,120,580,50);
		frmH.add(jlb_4);
		jlb_4.setFont(new Font("Courier New", Font.BOLD, 15));
    		jlb_4.setForeground(Color.BLACK);

		JLabel jlb_5 = new JLabel("About Level Three");
		jlb_5.setBounds(20,150,300,50);
		frmH.add(jlb_5);
		jlb_5.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb_5.setForeground(Color.RED);

		JLabel jlb_6 = new JLabel("Use 2 alphabets to guess the exact words hidden in the word search");
		jlb_6.setBounds(70,170,680,50);
		frmH.add(jlb_6);
		jlb_6.setFont(new Font("Courier New", Font.BOLD, 15));
    		jlb_6.setForeground(Color.BLACK);	

		//button for back to main frame
		JButton btn = new JButton ("Back");
		btn.setBounds(40,350,100,70);
		frmH.add(btn);
		btn.addActionListener(new Back(frm1,frmH));
		
	}


}
		//class for level one
class LevelOne implements ActionListener
{
	JFrame frm1;
	JFrame frm;
	LevelOne(JFrame frm1)
	{
		this.frm1 = frm1;
		this.frm = frm1;
	}
	public void actionPerformed(ActionEvent ae)
	{
		// dispoing main frame
		frm1.dispose();
		//string for Jlables
		String arrWords [] = {"PLEPA","PSERAG","LUBRYEBRE"};

		// level one frame
		JFrame frm2 = new JFrame("WordShuffleGame:Level One"); 
		 		
		//Size settings for frame
		frm2.setSize(550,500);
			
		//Close settings for frame
		frm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// visibility of frame
		frm2.setVisible(true);
				
		//layout settings for frame
		frm2.setLayout(null);

		// Jlabels
		JLabel jlb_1 = new JLabel("Level One");
		jlb_1.setBounds(150,50,200,50);
		frm2.add(jlb_1);
		jlb_1.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb_1.setForeground(Color.RED);
			
		JLabel jlb_2 = new JLabel("GUESS THE JUMBLED FRUIT NAMES(Capital letters only)");
		jlb_2.setBounds(30,100,450,50);
		frm2.add(jlb_2);
		jlb_2.setFont(new Font("Courier New", Font.BOLD, 15));
    		jlb_2.setForeground(Color.BLUE);

		JLabel jlb_3 = new JLabel(arrWords [0]);
		jlb_3.setBounds(50,150,200,50);
		frm2.add(jlb_3);
		jlb_3.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb_3.setForeground(Color.BLACK);
	
		JLabel jlb_4 = new JLabel(arrWords [1]);
		jlb_4.setBounds(50,200,200,50);
		frm2.add(jlb_4);
		jlb_4.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb_4.setForeground(Color.BLACK);

		JLabel jlb_5 = new JLabel(arrWords [2]);
		jlb_5.setBounds(50,250,200,50);
		frm2.add(jlb_5);
		jlb_5.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb_5.setForeground(Color.BLACK);
	
		// TextFields for inputs
		JTextField txt1 = new JTextField();
		txt1.setBounds(200,150,150,50);
		frm2.add(txt1);

		JTextField txt2 = new JTextField();
		txt2.setBounds(200,200,150,50);
		frm2.add(txt2);

		JTextField txt3 = new JTextField();
		txt3.setBounds(200,250,150,50);
		frm2.add(txt3);
	
		//button for back to main menu
		JButton btn2_1 = new JButton ("Back");
		btn2_1.setBounds(40,350,100,70);
		frm2.add(btn2_1);
		btn2_1.addActionListener(new Back(frm,frm2));
		
		//button for showing current score
		JButton btn2_2 = new JButton ("Score");
		btn2_2.setBounds(170,350,100,70);
		frm2.add(btn2_2);

		// to  score Jlabel
		JLabel Score = new JLabel("Score :");
		Score.setBounds(20,420,200,50);
		Score.setFont(new Font("Courier New", Font.BOLD, 15));
    		Score.setForeground(Color.GREEN);
		frm2.add(Score);
	
		// on clicking score button going to scoreClass1
		btn2_2.addActionListener(new ScoreClass1(frm,frm2,txt1,txt2,txt3,Score));
		
	}
}

//class for ScoreClass1 button of level one
class ScoreClass1 implements ActionListener
{	int score = 0;
	JTextField txt1,txt2,txt3;
	JFrame frm,frm2;
	JLabel Score;
	ScoreClass1(JFrame frm,JFrame frm2,JTextField txt1,JTextField txt2,JTextField txt3,JLabel Score)
	{
		this.txt1 =  txt1;
		this.txt2 =  txt2;
		this.txt3 =  txt3;
		this.frm = frm;			
		this.frm2 = frm2;
		this.Score = Score;
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		// code for first level score evaluation
		if(txt1.getText().equals("APPLE"))
		{
			score+=10;
		}
		if(txt2.getText().equals("GRAPES"))
		{
			score+=10;
		}
		if(txt3.getText().equals("BLUEBERRY"))
		{
			score+=10;
		}
		if(score == 30)
		{
			// if score is full then showing next level button
			Score.setText ("Score :"+score+" > Next Level");
			JButton btn2_3 = new JButton ("Next Level");
			btn2_3.setBounds(300,350,100,70);
			frm2.add(btn2_3);
			btn2_3.addActionListener(new LevelTwo(frm,frm2));	
		}
		else
			Score.setText ("Score :"+score);
		score =0;
	}
}
//class for level Two 
class LevelTwo implements ActionListener
{
	JFrame frm, frm2;
	LevelTwo(JFrame frm,JFrame frm2)
	{
		this.frm = frm;
		this.frm2 = frm2;
	}
	public void actionPerformed(ActionEvent ae)
	{
		//disposing the frame fror level one
		frm2.dispose();
		
		//string array to show Jlabel on level two frame
		String arrWords [] = {"YEYSIEND","BQGENIJQI","ARHYLIDPE"};

		// level two frame
		JFrame frm3 = new JFrame("WordShuffleGame:Level Two"); 
		 		
		//Size settings for frame
		frm3.setSize(600,500);
			
		//Close settings for frame
		frm3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// visibility of frame
		frm3.setVisible(true);
				
		//layout settings for frame
		frm3.setLayout(null);

		// Jlabels for level two
		JLabel jlb2_1 = new JLabel("Level Two");
		jlb2_1.setBounds(250,50,200,50);
		frm3.add(jlb2_1);
		jlb2_1.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb2_1.setForeground(Color.RED);
			
		JLabel jlb2_2 = new JLabel("EXTRACT THE CAPITALS OF COUNTRIES(Capital letters only)");
		jlb2_2.setBounds(60,100,550,50);
		frm3.add(jlb2_2);
		jlb2_2.setFont(new Font("Courier New", Font.BOLD, 15));
    		jlb2_2.setForeground(Color.BLUE);

		JLabel jlb2_3 = new JLabel(arrWords [0]);
		jlb2_3.setBounds(10,150,200,50);
		frm3.add(jlb2_3);
		jlb2_3.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb2_3.setForeground(Color.BLACK);
	
		JLabel jlb2_4 = new JLabel(arrWords [1]);
		jlb2_4.setBounds(10,200,200,50);
		frm3.add(jlb2_4);
		jlb2_4.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb2_4.setForeground(Color.BLACK);

		JLabel jlb2_5 = new JLabel(arrWords [2]);
		jlb2_5.setBounds(10,250,200,50);
		frm3.add(jlb2_5);
		jlb2_5.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb2_5.setForeground(Color.BLACK);

		///Jlabels for showing no of alphabets as hint
		JLabel jlb2_6 = new JLabel("6 alphabets");
		jlb2_6.setBounds(300,150,200,50);
		frm3.add(jlb2_6);
		jlb2_6.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb2_6.setForeground(Color.BLACK);
	
		JLabel jlb2_7 = new JLabel("7 alphabets");
		jlb2_7.setBounds(300,200,200,50);
		frm3.add(jlb2_7);
		jlb2_7.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb2_7.setForeground(Color.BLACK);

		JLabel jlb2_8 = new JLabel("6 alphabets");
		jlb2_8.setBounds(300,250,200,50);
		frm3.add(jlb2_8);
		jlb2_8.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb2_8.setForeground(Color.BLACK);		




		//Textfield for input
		JTextField txt1 = new JTextField();
		txt1.setBounds(150,150,150,50);
		frm3.add(txt1);

		JTextField txt2 = new JTextField();
		txt2.setBounds(150,200,150,50);
		frm3.add(txt2);

		JTextField txt3 = new JTextField();
		txt3.setBounds(150,250,150,50);
		frm3.add(txt3);
	
		//button for back to level one
		JButton btn2_1 = new JButton ("Back");
		btn2_1.setBounds(40,350,100,70);
		frm3.add(btn2_1);
		btn2_1.addActionListener(new Back(frm2,frm3));
		
		//button for score of level two
		JButton btn2_2 = new JButton ("Score");
		btn2_2.setBounds(170,350,100,70);
		frm3.add(btn2_2);

		// label to show scores
		JLabel Score = new JLabel("Score :");
		Score.setBounds(20,420,300,50);
		Score.setFont(new Font("Courier New", Font.BOLD, 15));
    		Score.setForeground(Color.GREEN);
		frm3.add(Score);

		// on clicking score button going to score class
		btn2_2.addActionListener(new ScoreClass2(frm,frm3,txt1,txt2,txt3,Score));
		
	}
}

//class for ScoreClass2 button of level 2
class ScoreClass2 implements ActionListener
{	int score = 0;
	JTextField txt1,txt2,txt3;
	JFrame frm,frm3;
	JLabel Score;
	ScoreClass2(JFrame frm,JFrame frm3,JTextField txt1,JTextField txt2,JTextField txt3,JLabel Score)
	{
		this.txt1 =  txt1;
		this.txt2 =  txt2;
		this.txt3 =  txt3;
		this.frm = frm;
		this.frm3 = frm3;
		this.Score = Score;
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		//code for calculating score for levelTwo
		if(txt1.getText().equals("SYDNEY"))
		{
			score+=10;
		}
		if(txt2.getText().equals("BEIJING"))
		{
			score+=10;
		}
		if(txt3.getText().equals("RIYADH"))
		{
			score+=10;
		}
		if(score == 30)
		{	//Showing next level button at clearing this level
			Score.setText ("Score :"+score+" > Next Level");
			JButton btn2_3 = new JButton ("Next Level");
			btn2_3.setBounds(300,350,100,70);
			frm3.add(btn2_3);
			btn2_3.addActionListener(new LevelThree(frm,frm3));	
		}
		else
			Score.setText ("Score :"+score);
		score =0;
	}
}
//class for levelThree
class LevelThree implements ActionListener
{
	JFrame frm,frm3;
	LevelThree(JFrame frm,JFrame frm3)
	{
		this.frm = frm;
		this.frm3= frm3;
	}
	public void actionPerformed(ActionEvent ae)
	{
		//disposing the frame for level two
		frm3.dispose();
		String arrWords [] = {"K  M  E  T  S  Y  S  N ","E  E  M  O  H  U  P  E","Y  A  Y  W  S  N  E  T","E  O  X  B  M  T  A  W","L  A  P  T  O  P  K  O", "B  T  I  N  U  A  E  R","A  E  Z  C  S  U  R  K","C  S  C  R  E  E  N  D" };

		// third level  frame 
		JFrame frm4 = new JFrame("WordShuffleGame:Level Third"); 
		 		
		//Size settings for frame
		frm4.setSize(550,600);
			
		//Close settings for frame
		frm4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// visibility of frame
		frm4.setVisible(true);
				
		//layout settings for frame
		frm4.setLayout(null);

		// Jlabel to show on third level frame
		JLabel jlb4_1 = new JLabel("Last Level");
		jlb4_1.setBounds(175,50,200,50);
		frm4.add(jlb4_1);
		jlb4_1.setFont(new Font("Courier New", Font.BOLD, 30));
    		jlb4_1.setForeground(Color.RED);
			
		JLabel jlb4_2 = new JLabel("WORD SEARCH(Capital letters only) ");
		jlb4_2.setBounds(105,100,450,50);
		frm4.add(jlb4_2);
		jlb4_2.setFont(new Font("Courier New", Font.BOLD, 15));
    		jlb4_2.setForeground(Color.BLUE);

		JLabel jlb4_3 = new JLabel(arrWords [0]);
		jlb4_3.setBounds(10,150,300,50);
		frm4.add(jlb4_3);
		jlb4_3.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb4_3.setForeground(Color.BLACK);
	
		JLabel jlb4_4 = new JLabel(arrWords [1]);
		jlb4_4.setBounds(10,175,300,50);
		frm4.add(jlb4_4);
		jlb4_4.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb4_4.setForeground(Color.BLACK);

		JLabel jlb4_5 = new JLabel(arrWords [2]);
		jlb4_5.setBounds(10,200,300,50);
		frm4.add(jlb4_5);
		jlb4_5.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb4_5.setForeground(Color.BLACK);


		JLabel jlb4_6 = new JLabel(arrWords [3]);
		jlb4_6.setBounds(10,225,300,50);
		frm4.add(jlb4_6);
		jlb4_6.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb4_6.setForeground(Color.BLACK);
	
		JLabel jlb4_7 = new JLabel(arrWords [4]);
		jlb4_7.setBounds(10,250,300,50);
		frm4.add(jlb4_7);
		jlb4_7.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb4_7.setForeground(Color.BLACK);

		JLabel jlb4_8 = new JLabel(arrWords [5]);
		jlb4_8.setBounds(10,275,300,50);
		frm4.add(jlb4_8);
		jlb4_8.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb4_8.setForeground(Color.BLACK); 

		JLabel jlb4_9 = new JLabel(arrWords [6]);
		jlb4_9.setBounds(10,300,300,50);
		frm4.add(jlb4_9);
		jlb4_9.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb4_9.setForeground(Color.BLACK);

		JLabel jlb4_10 = new JLabel(arrWords [7]);
		jlb4_10.setBounds(10,325,300,50);
		frm4.add(jlb4_10);
		jlb4_10.setFont(new Font("Courier New", Font.BOLD, 20));
    		jlb4_10.setForeground(Color.BLACK); 	



		//button for back to 2nd level
		JButton btn2_1 = new JButton ("Back");
		btn2_1.setBounds(40,380,100,70);
		frm4.add(btn2_1);
		btn2_1.addActionListener(new Back(frm3,frm4));
		
		//button for watching score
		JButton btn2_2 = new JButton ("Score");
		btn2_2.setBounds(380,380,100,70);
		frm4.add(btn2_2);
		
		// label to show scores for level three
		JLabel Score = new JLabel("Score :");
		Score.setBounds(20,470,530,50);
		Score.setFont(new Font("Courier New", Font.BOLD, 15));
    		Score.setForeground(Color.GREEN);
		frm4.add(Score);
	
		//TEXTFIELDS for input
		int y = 150;
		int x = 150;
		JTextField txt []= new JTextField[11];
		for(int i=0;i<11;i++)
		{
			txt[i] = new JTextField();
			frm4.add(txt[i]);
			txt[i].setBounds(320,y,100,20);
			y+=20;
		}
		JLabel lbl []= new JLabel[11];
		for(int k=0;k<11;k++)
		{
			lbl[k] = new JLabel();
			frm4.add(lbl[k]);
			lbl[k].setBounds(430,x,100,20);
			x+=20;
		}
		lbl[0].setText("YR");
		lbl[1].setText("YM");
		lbl[2].setText("IN");
		lbl[3].setText("MS");
		lbl[4].setText("EW");
		lbl[5].setText("SB");
		lbl[6].setText("AO");
		lbl[7].setText("CR");
		lbl[8].setText("HO");
		lbl[9].setText("KY");
		lbl[10].setText("AL");
		// showing score on clicking score button
		btn2_2.addActionListener(new ScoreClass3(frm,frm4,txt,Score));
	}
}

//class for ScoreClass3 button of level 3
class ScoreClass3 implements ActionListener
{	int score = 0;
	JTextField txt[]= new JTextField[11];
	JFrame frm,frm4;
	JLabel Score;
	ScoreClass3(JFrame frm,JFrame frm4,JTextField txt[],JLabel Score)
	{
		this.txt = txt;
		this.Score = Score;	
		this.frm = frm;
		this.frm4 = frm4;
	}
	public void actionPerformed(ActionEvent ae)
	{
		//code for evaluating score
		if(txt[0].getText().equals("KEYBOARD"))
			score+=10;
		if(txt[1].getText().equals("SYSTEM"))
			score+=10;
		if(txt[2].getText().equals("UNIT"))
			score+=10;
		if(txt[3].getText().equals("MOUSE"))
			score+=10;
		if(txt[4].getText().equals("NETWORK"))
			score+=10;
		if(txt[5].getText().equals("USB"))
			score+=10;
		if(txt[6].getText().equals("LAPTOP"))
			score+=10;
		if(txt[7].getText().equals("SCREEN"))
			score+=10;
		if(txt[8].getText().equals("HOME"))
			score+=10;
		if(txt[9].getText().equals("KEY")||(txt[9].getText().equals("KEYBOARD")))
			score+=10;
		if(txt[10].getText().equals("CABLE"))
			score+=10;
		if(score == 110)
		{
			// showing the end of the game and play again button
			Score.setText ("Score:"+score+" > CONGRATULATIONS HURRAYYYY!!!!!! ;)");
			JButton playAgain = new JButton("Play Again");
			playAgain.setBounds(215,380,100,70);
			frm4.add(playAgain);
			playAgain.addActionListener(new Back(frm,frm4) );
		}
		else
			Score.setText ("Score :"+score);
		score =0;
	}
}

// class for back button and  palyAgain button to go back to the previous frame
class Back implements ActionListener
{
	JFrame f1;
	JFrame f2; 
	Back(JFrame f1,JFrame f2)
	{
		this.f1 = f1;
		this.f2 = f2;		
	}
	public void actionPerformed(ActionEvent ae)
	{
		f1.setVisible(true);
		f2.dispose();
	}

}

