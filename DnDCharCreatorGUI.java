/**
 * D&D Character Creation Program
 * Designed and Coded by Lakota Demers
 * Last Updated 6/23/2018 11:31 AM
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class DnDCharCreatorGUI {

	private JFrame frmDdCharacterCreator;
	private JTextField txtMaxHP;
	private JTextField txtHitDie;
	private JTextField txtProfBonus;
	private JTextField txtRace;
	private JTextField txtClass;
	private JTextField txtLevel;
	private JTextField txtHDRollCount;
	private JTextField txtStrScore;
	private JTextField txtDexScore;
	private JTextField txtConScore;
	private JTextField txtIntScore;
	private JTextField txtWisScore;
	private JTextField txtChaScore;
	private JTextField txtStrMod;
	private JTextField txtDexMod;
	private JTextField txtConMod;
	private JTextField txtIntMod;
	private JTextField txtWisMod;
	private JTextField txtChaMod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DnDCharCreatorGUI window = new DnDCharCreatorGUI();
					window.frmDdCharacterCreator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DnDCharCreatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frmDdCharacterCreator = new JFrame();
		frmDdCharacterCreator.setTitle("D&D Character Creator");
		frmDdCharacterCreator.setBounds(100, 100, 450, 600);
		frmDdCharacterCreator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		AbilityScoreRoller rollme = new AbilityScoreRoller();
		CharGuide guideme = new CharGuide();
		StatCalculation statme = new StatCalculation();
		
		/**
		 * Declares the GUI Components used
		 */
		
		JMenu mnNewMenu = new JMenu("File");
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		
		JPanel outerPanel1 = new JPanel();
		JPanel outerPanel2 = new JPanel();
		JPanel outerPanel3 = new JPanel();
		JPanel innerPanel1 = new JPanel();
		JPanel innerPanel2 = new JPanel();
		
		JMenuBar menuBar = new JMenuBar();
		
		JButton btnConfirm1 = new JButton("Next Step");
		JButton btnHDRollMax = new JButton("Roll Hit Die");
		JButton btnHPFixedInc = new JButton("Take Fixed Increase");
		
		JToggleButton tglbtnAddStr = new JToggleButton("Add");
		JToggleButton tglbtnAddDex = new JToggleButton("Add");
		JToggleButton tglbtnAddCon = new JToggleButton("Add");
		JToggleButton tglbtnAddInt = new JToggleButton("Add");
		JToggleButton tglbtnAddWis = new JToggleButton("Add");
		JToggleButton tglbtnAddCha = new JToggleButton("Add");
		
		JTextArea txtrRaceDetails = new JTextArea();
		JTextArea txtrClassDetails = new JTextArea();
		
		JComboBox<String> cobxRace = new JComboBox<String>();
		JComboBox<String> cobxSubrace = new JComboBox<String>();
		JComboBox<String> cobxClass = new JComboBox<String>();
		JComboBox<String> cobxLevel = new JComboBox<String>();
		
		JLabel lblRace = new JLabel("Race");
		JLabel lblSubrace = new JLabel("Subrace");
		JLabel lblClass = new JLabel("Class");
		JLabel lblMaxHP = new JLabel("Max HP");
		JLabel lblHitDie = new JLabel("Hit Die");
		JLabel lblLevel = new JLabel("Level");
		JLabel lblProfBonus = new JLabel("Prof. Bonus");
		JLabel lblRaceDetails = new JLabel("Race Details");
		JLabel lblClassDetails = new JLabel("Class Details");
		JLabel lblHDRollCount = new JLabel("Rolls Left:");
		JLabel lblDesc = new JLabel("");
		JLabel lblStrScore = new JLabel("Strength");
		JLabel lblDexScore = new JLabel("Dexterity");
		JLabel lblConScore = new JLabel("Constitution");
		JLabel lblIntScore = new JLabel("Intelligence");
		JLabel lblWisScore = new JLabel("Wisdom");
		JLabel lblChaScore = new JLabel("Charisma");
		JLabel lblStrMod = new JLabel("Str Mod");
		JLabel lblDexMod = new JLabel("Dex Mod");
		JLabel lblConMod = new JLabel("Con Mod");
		JLabel lblIntMod = new JLabel("Int Mod");
		JLabel lblWisMod = new JLabel("Wis Mod");
		JLabel lblChaMod = new JLabel("Cha Mod");
		
		txtMaxHP = new JTextField();
		txtHitDie = new JTextField();
		txtProfBonus = new JTextField();
		txtRace = new JTextField();
		txtClass = new JTextField();
		txtLevel = new JTextField();
		txtHDRollCount = new JTextField();
		txtStrScore = new JTextField();
		txtDexScore = new JTextField();
		txtConScore = new JTextField();
		txtIntScore = new JTextField();
		txtWisScore = new JTextField();
		txtChaScore = new JTextField();
		txtStrMod = new JTextField();
		txtDexMod = new JTextField();
		txtConMod = new JTextField();
		txtIntMod = new JTextField();
		txtWisMod = new JTextField();
		txtChaMod = new JTextField();
		
		/**
		 * Set defaults for all GUI Components
		 */
		
		frmDdCharacterCreator.getContentPane().setLayout(null);
		frmDdCharacterCreator.getContentPane().add(outerPanel1);
		frmDdCharacterCreator.getContentPane().add(outerPanel2);
		frmDdCharacterCreator.getContentPane().add(outerPanel3);
		frmDdCharacterCreator.setJMenuBar(menuBar);
		
		menuBar.add(mnNewMenu);
		
		mnNewMenu.add(mntmNewMenuItem);
		
		outerPanel1.setBounds(10, 11, 414, 167);
		outerPanel1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		outerPanel1.setLayout(null);
		outerPanel1.add(innerPanel1);
		outerPanel1.add(innerPanel2);
		outerPanel1.add(btnConfirm1);
		outerPanel1.add(txtRace);
		outerPanel1.add(txtClass);
		outerPanel1.add(txtLevel);
		
		outerPanel2.setBounds(10, 189, 414, 162);
		outerPanel2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		outerPanel2.setLayout(null);
		outerPanel2.add(lblRaceDetails);
		outerPanel2.add(txtrRaceDetails);
		
		outerPanel3.setBounds(10, 362, 414, 167);
		outerPanel3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		outerPanel3.setLayout(null);
		outerPanel3.add(lblClassDetails);
		outerPanel3.add(txtrClassDetails);
		
		innerPanel1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		innerPanel1.setBounds(10, 11, 190, 114);
		innerPanel1.setLayout(null);
		innerPanel1.add(lblRace);
		innerPanel1.add(lblSubrace);
		innerPanel1.add(lblClass);
		innerPanel1.add(lblHDRollCount);
		innerPanel1.add(lblDesc);
		innerPanel1.add(cobxRace);
		innerPanel1.add(cobxSubrace);
		innerPanel1.add(cobxClass);
		innerPanel1.add(txtHDRollCount);
		innerPanel1.add(btnHDRollMax);
		innerPanel1.add(btnHPFixedInc);
		
		innerPanel2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		innerPanel2.setBounds(210, 11, 194, 114);
		innerPanel2.setLayout(null);
		innerPanel2.add(lblLevel);
		innerPanel2.add(lblProfBonus);
		innerPanel2.add(lblMaxHP);
		innerPanel2.add(lblHitDie);
		innerPanel2.add(cobxLevel);
		innerPanel2.add(lblStrScore);
		innerPanel2.add(lblDexScore);
		innerPanel2.add(lblConScore);
		innerPanel2.add(lblIntScore);
		innerPanel2.add(lblWisScore);
		innerPanel2.add(lblChaScore);
		innerPanel2.add(lblStrMod);
		innerPanel2.add(lblDexMod);
		innerPanel2.add(lblConMod);
		innerPanel2.add(lblIntMod);
		innerPanel2.add(lblWisMod);
		innerPanel2.add(lblChaMod);
		innerPanel2.add(txtProfBonus);
		innerPanel2.add(txtMaxHP);
		innerPanel2.add(txtHitDie);
		innerPanel2.add(txtStrScore);
		innerPanel2.add(txtDexScore);
		innerPanel2.add(txtConScore);
		innerPanel2.add(txtIntScore);
		innerPanel2.add(txtWisScore);
		innerPanel2.add(txtChaScore);
		innerPanel2.add(txtStrMod);
		innerPanel2.add(txtDexMod);
		innerPanel2.add(txtConMod);
		innerPanel2.add(txtIntMod);
		innerPanel2.add(txtWisMod);
		innerPanel2.add(txtChaMod);
		innerPanel2.add(tglbtnAddStr);
		innerPanel2.add(tglbtnAddDex);
		innerPanel2.add(tglbtnAddCon);
		innerPanel2.add(tglbtnAddInt);
		innerPanel2.add(tglbtnAddWis);
		innerPanel2.add(tglbtnAddCha);
		
		btnConfirm1.setBounds(314, 133, 89, 23);
		btnConfirm1.setEnabled(false);
		
		btnHDRollMax.setEnabled(false);
		btnHDRollMax.setVisible(false);
		
		btnHPFixedInc.setEnabled(false);
		btnHPFixedInc.setVisible(false);
		
		tglbtnAddStr.setEnabled(false);
		tglbtnAddStr.setVisible(false);
		
		tglbtnAddDex.setEnabled(false);
		tglbtnAddDex.setVisible(false);
		
		tglbtnAddCon.setEnabled(false);
		tglbtnAddCon.setVisible(false);
		
		tglbtnAddInt.setEnabled(false);
		tglbtnAddInt.setVisible(false);
		
		tglbtnAddWis.setEnabled(false);
		tglbtnAddWis.setVisible(false);
		
		tglbtnAddCha.setEnabled(false);
		tglbtnAddCha.setVisible(false);
		
		//Setting up the Text Areas for various details
		
		txtrRaceDetails.setBounds(10, 36, 394, 115);
		txtrRaceDetails.setWrapStyleWord(true);
		txtrRaceDetails.setLineWrap(true);
		txtrRaceDetails.setEditable(false);
		txtrRaceDetails.setText("Please select a Race.");
		
		txtrClassDetails.setBounds(10, 36, 394, 120);
		txtrClassDetails.setWrapStyleWord(true);
		txtrClassDetails.setLineWrap(true);
		txtrClassDetails.setEditable(false);
		
		//Setting up the Combo Box for User Selections
		
		cobxRace.setBounds(60, 11, 120, 20);
		cobxRace.setModel(new DefaultComboBoxModel<String>(guideme.setRaceBox()));
		cobxRace.setSelectedIndex(0);

		cobxSubrace.setBounds(60, 42, 120, 22);
		cobxSubrace.setEnabled(false);
		cobxSubrace.setVisible(false);
		cobxSubrace.setSelectedIndex(-1);
		
		cobxClass.setBounds(60, 75, 120, 20);
		cobxClass.setEnabled(false);
		cobxClass.setVisible(false);
		cobxClass.setModel(new DefaultComboBoxModel<String>(guideme.setClassBox()));
		cobxClass.setSelectedIndex(0);
		
		cobxLevel.setBounds(49, 11, 40, 20);
		cobxLevel.setModel(new DefaultComboBoxModel<String>(guideme.setLevelBox()));
		cobxLevel.setSelectedIndex(0);
		
		//Setting up the Labels for the GUI
		
		lblRace.setBounds(11, 14, 30, 14);
		
		lblSubrace.setBounds(11, 46, 48, 14);
		lblSubrace.setEnabled(false);
		lblSubrace.setVisible(false);
		
		lblClass.setBounds(11, 78, 32, 14);
		lblClass.setEnabled(false);
		lblClass.setVisible(false);
		
		lblLevel.setBounds(5, 14, 30, 14);
		
		lblProfBonus.setBounds(92, 14, 66, 14);
		
		lblMaxHP.setBounds(5, 45, 45, 14);
		lblMaxHP.setEnabled(false);
		lblMaxHP.setVisible(false);
		
		lblHitDie.setBounds(92, 45, 40, 14);
		lblHitDie.setEnabled(false);
		lblHitDie.setVisible(false);
		
		lblRaceDetails.setBounds(172, 11, 79, 14);
		
		lblClassDetails.setBounds(171, 11, 80, 14);
		
		lblHDRollCount.setBounds(1, 1, 80, 14);
		lblHDRollCount.setEnabled(false);
		lblHDRollCount.setVisible(false);
		
		lblDesc.setBounds(1, 1, 250, 14);
		lblDesc.setEnabled(false);
		lblDesc.setVisible(false);

		lblStrScore.setBounds(1, 1, 40, 20);
		lblStrScore.setEnabled(false);
		lblStrScore.setVisible(false);

		lblDexScore.setBounds(1, 1, 40, 20);
		lblDexScore.setEnabled(false);
		lblDexScore.setVisible(false);

		lblConScore.setBounds(1, 1, 40, 20);
		lblConScore.setEnabled(false);
		lblConScore.setVisible(false);

		lblIntScore.setBounds(1, 1, 40, 20);
		lblIntScore.setEnabled(false);
		lblIntScore.setVisible(false);

		lblWisScore.setBounds(1, 1, 40, 20);
		lblWisScore.setEnabled(false);
		lblWisScore.setVisible(false);

		lblChaScore.setBounds(1, 1, 40, 20);
		lblChaScore.setEnabled(false);
		lblChaScore.setVisible(false);

		lblStrMod.setBounds(1, 1, 40, 20);
		lblStrMod.setEnabled(false);
		lblStrMod.setVisible(false);

		lblDexMod.setBounds(1, 1, 40, 20);
		lblDexMod.setEnabled(false);
		lblDexMod.setVisible(false);

		lblConMod.setBounds(1, 1, 40, 20);
		lblConMod.setEnabled(false);
		lblConMod.setVisible(false);

		lblIntMod.setBounds(1, 1, 40, 20);
		lblIntMod.setEnabled(false);
		lblIntMod.setVisible(false);

		lblWisMod.setBounds(1, 1, 40, 20);
		lblWisMod.setEnabled(false);
		lblWisMod.setVisible(false);

		lblChaMod.setBounds(1, 1, 40, 20);
		lblChaMod.setEnabled(false);
		lblChaMod.setVisible(false);
		
		/*
		Setting up Text Fields to show Stat Information
		*/
		
		txtProfBonus.setBounds(160, 11, 24, 20);
		txtProfBonus.setEditable(false);
		txtProfBonus.setText("+2");
		txtProfBonus.setColumns(10);
		
		txtMaxHP.setBounds(49, 42, 40, 20);
		txtMaxHP.setEditable(false);
		txtMaxHP.setEnabled(false);
		txtMaxHP.setVisible(false);
		txtMaxHP.setColumns(10);
		
		txtHitDie.setBounds(144, 42, 40, 20);
		txtHitDie.setEditable(false);
		txtHitDie.setEnabled(false);
		txtHitDie.setVisible(false);
		txtHitDie.setColumns(10);
		
		txtRace.setEditable(false);
		txtRace.setEnabled(false);
		txtRace.setVisible(false);
		
		txtClass.setEditable(false);
		txtClass.setEnabled(false);
		txtClass.setVisible(false);
		
		txtLevel.setEditable(false);
		txtLevel.setEnabled(false);
		txtLevel.setVisible(false);
		
		txtHDRollCount.setEditable(false);
		txtHDRollCount.setEnabled(false);
		txtHDRollCount.setVisible(false);

		txtStrScore.setBounds(1, 1, 40, 20);
		txtStrScore.setEditable(false);
		txtStrScore.setEnabled(false);
		txtStrScore.setVisible(false);

		txtDexScore.setBounds(1, 1, 40, 20);
		txtDexScore.setEditable(false);
		txtDexScore.setEnabled(false);
		txtDexScore.setVisible(false);

		txtConScore.setBounds(1, 1, 40, 20);
		txtConScore.setEditable(false);
		txtConScore.setEnabled(false);
		txtConScore.setVisible(false);

		txtIntScore.setBounds(1, 1, 40, 20);
		txtIntScore.setEditable(false);
		txtIntScore.setEnabled(false);
		txtIntScore.setVisible(false);

		txtWisScore.setBounds(1, 1, 40, 20);
		txtWisScore.setEditable(false);
		txtWisScore.setEnabled(false);
		txtWisScore.setVisible(false);

		txtChaScore.setBounds(1, 1, 40, 20);
		txtChaScore.setEditable(false);
		txtChaScore.setEnabled(false);
		txtChaScore.setVisible(false);

		txtStrMod.setBounds(1, 1, 40, 20);
		txtStrMod.setEditable(false);
		txtStrMod.setEnabled(false);
		txtStrMod.setVisible(false);

		txtDexMod.setBounds(1, 1, 40, 20);
		txtDexMod.setEditable(false);
		txtDexMod.setEnabled(false);
		txtDexMod.setVisible(false);

		txtConMod.setBounds(1, 1, 40, 20);
		txtConMod.setEditable(false);
		txtConMod.setEnabled(false);
		txtConMod.setVisible(false);

		txtIntMod.setBounds(1, 1, 40, 20);
		txtIntMod.setEditable(false);
		txtIntMod.setEnabled(false);
		txtIntMod.setVisible(false);

		txtWisMod.setBounds(1, 1, 40, 20);
		txtWisMod.setEditable(false);
		txtWisMod.setEnabled(false);
		txtWisMod.setVisible(false);

		txtChaMod.setBounds(1, 1, 40, 20);
		txtChaMod.setEditable(false);
		txtChaMod.setEnabled(false);
		txtChaMod.setVisible(false);
		
		/**
		 * Add ActionListeners to deal with User Input
		 */
		
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		cobxRace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int raceindex = cobxRace.getSelectedIndex();
				String racename = (String) cobxRace.getSelectedItem();
				boolean subracecheck = guideme.checkSubraceIndex(raceindex);
				int hitdiemax = rollme.setHitDie(racename);
				int lvl = cobxLevel.getSelectedIndex() + 1;
				int maxhp = statme.setHPMax(hitdiemax, 0, lvl, 0);
				txtMaxHP.setText(""+maxhp);
				if (subracecheck == false) {
					lblSubrace.setEnabled(false);
					lblSubrace.setVisible(false);
					cobxSubrace.setEnabled(false);
					cobxSubrace.setVisible(false);
					cobxSubrace.setSelectedIndex(-1);
					if(raceindex > 0) {
						lblClass.setEnabled(true);
						lblClass.setVisible(true);
						cobxClass.setEnabled(true);
						cobxClass.setVisible(true);
					}else {
						txtrRaceDetails.setText("Please select a Race.");
					}
				}else {
					String subracemodel[] = guideme.setSubraceBox(racename);
					cobxSubrace.setModel(new DefaultComboBoxModel<String>(subracemodel));
					lblSubrace.setEnabled(true);
					lblSubrace.setVisible(true);
					cobxSubrace.setEnabled(true);
					cobxSubrace.setVisible(true);
					cobxSubrace.setSelectedIndex(0);
				}
				if(raceindex > 0) {
					if(cobxSubrace.getSelectedIndex()==0) {
						btnConfirm1.setEnabled(false);
					}else if(cobxClass.getSelectedIndex()>0) {
						btnConfirm1.setEnabled(true);
					}else btnConfirm1.setEnabled(false);
				}else btnConfirm1.setEnabled(false);
				txtrRaceDetails.setText(guideme.raceDescriptor(racename));
			}
		});
		
		cobxSubrace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int subraceindex = cobxSubrace.getSelectedIndex();
				String subracename = (String) cobxSubrace.getSelectedItem();
				int hitdiemax = rollme.setHitDie((String) cobxClass.getSelectedItem());
				int racebonus = guideme.checkRaceHPBonus(subracename);
				int lvl = cobxLevel.getSelectedIndex() + 1;
				int maxhp = statme.setHPMax(hitdiemax, racebonus, lvl, 0);
				txtMaxHP.setText(""+maxhp);
				txtrRaceDetails.setText(guideme.raceDescriptor(subracename));
				if(subraceindex>0) {
					lblClass.setEnabled(true);
					lblClass.setVisible(true);
					cobxClass.setEnabled(true);
					cobxClass.setVisible(true);
					if(cobxClass.getSelectedIndex()>0) {
						btnConfirm1.setEnabled(true);
					}else btnConfirm1.setEnabled(false);
				}else btnConfirm1.setEnabled(false);
			}
		});
		
		cobxClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int classindex = cobxClass.getSelectedIndex();
				String classname = (String) cobxClass.getSelectedItem();
				int hitdiemax = rollme.setHitDie((String) cobxClass.getSelectedItem());
				int racebonus = guideme.checkRaceHPBonus((String) cobxSubrace.getSelectedItem());
				int lvl = cobxLevel.getSelectedIndex() + 1;
				int maxhp = statme.setHPMax(hitdiemax, racebonus, lvl, 0);
				txtMaxHP.setText(""+maxhp);
				txtHitDie.setText("1d"+hitdiemax);
				txtrClassDetails.setText(guideme.classDescriptor(classname));
				if(classindex>0) {
					lblMaxHP.setEnabled(true);
					lblMaxHP.setVisible(true);
					lblHitDie.setEnabled(true);
					lblHitDie.setVisible(true);
					txtMaxHP.setEnabled(true);
					txtMaxHP.setVisible(true);
					txtHitDie.setEnabled(true);
					txtHitDie.setVisible(true);
				}
				if(cobxRace.getSelectedIndex() > 0) {
					if(cobxSubrace.getSelectedIndex()==0) {
						btnConfirm1.setEnabled(false);
					}else if(classindex>0) {
						btnConfirm1.setEnabled(true);
					}else btnConfirm1.setEnabled(false);
				}else btnConfirm1.setEnabled(false);
			}
		});
		
		cobxLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int hitdiemax = rollme.setHitDie((String)cobxClass.getSelectedItem());
				int racebonus = guideme.checkRaceHPBonus((String) cobxSubrace.getSelectedItem());
				int lvl = cobxLevel.getSelectedIndex()+1;
				int maxhp = statme.setHPMax(hitdiemax, racebonus, lvl, 0);
				txtMaxHP.setText(""+maxhp);
				lblProfBonus.setEnabled(true);
				lblProfBonus.setVisible(true);
				txtProfBonus.setEnabled(true);
				txtProfBonus.setVisible(true);
				txtProfBonus.setText("+"+statme.setProfBonus(lvl));
			}
		});
		
		btnConfirm1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				outerPanel1.add(lblRace);
				outerPanel1.add(lblClass);
				outerPanel1.add(lblLevel);
				outerPanel1.add(lblProfBonus);
				outerPanel1.add(txtProfBonus);
				outerPanel2.add(innerPanel2);
				innerPanel1.add(lblHitDie);
				innerPanel1.add(txtHitDie);
				innerPanel1.add(lblMaxHP);
				innerPanel1.add(txtMaxHP);
				innerPanel1.setBounds(10, 33, 394, 105);
				outerPanel1.setBounds(10, 11, 414, innerPanel1.getY()+innerPanel1.getHeight()+10);
				innerPanel2.setBounds(10, 33, 394, 145);
				outerPanel2.setBounds(10, outerPanel1.getY()+outerPanel1.getHeight()+11, 414, innerPanel2.getY()+innerPanel2.getHeight()+10);
				
				// Remove unnecessary fields
				
				btnConfirm1.setEnabled(false);
				btnConfirm1.setVisible(false);
				cobxRace.setEnabled(false);
				cobxRace.setVisible(false);
				cobxSubrace.setEnabled(false);
				cobxSubrace.setVisible(false);
				cobxClass.setEnabled(false);
				cobxClass.setVisible(false);
				cobxLevel.setEnabled(false);
				cobxLevel.setVisible(false);
				lblSubrace.setEnabled(false);
				lblSubrace.setVisible(false);
				lblRaceDetails.setEnabled(false);
				lblRaceDetails.setVisible(false);
				txtrRaceDetails.setEnabled(false);
				txtrRaceDetails.setVisible(false);
				
				// Add needed fields

				txtRace.setEnabled(true);
				txtRace.setVisible(true);
				txtClass.setEnabled(true);
				txtClass.setVisible(true);
				txtLevel.setEnabled(true);
				txtLevel.setVisible(true);
				lblHDRollCount.setEnabled(true);
				lblHDRollCount.setVisible(true);
				txtHDRollCount.setEnabled(true);
				txtHDRollCount.setVisible(true);
				lblDesc.setEnabled(true);
				lblDesc.setVisible(true);
				btnHDRollMax.setVisible(true);
				btnHPFixedInc.setVisible(true);
				lblStrScore.setEnabled(true);
				lblStrScore.setVisible(true);
				txtStrScore.setEnabled(true);
				txtStrScore.setVisible(true);
				lblDexScore.setEnabled(true);
				lblDexScore.setVisible(true);
				txtDexScore.setEnabled(true);
				txtDexScore.setVisible(true);
				lblConScore.setEnabled(true);
				lblConScore.setVisible(true);
				txtConScore.setEnabled(true);
				txtConScore.setVisible(true);
				lblIntScore.setEnabled(true);
				lblIntScore.setVisible(true);
				txtIntScore.setEnabled(true);
				txtIntScore.setVisible(true);
				lblWisScore.setEnabled(true);
				lblWisScore.setVisible(true);
				txtWisScore.setEnabled(true);
				txtWisScore.setVisible(true);
				lblChaScore.setEnabled(true);
				lblChaScore.setVisible(true);
				txtChaScore.setEnabled(true);
				txtChaScore.setVisible(true);
				lblStrMod.setEnabled(true);
				lblStrMod.setVisible(true);
				txtStrMod.setEnabled(true);
				txtStrMod.setVisible(true);
				lblDexMod.setEnabled(true);
				lblDexMod.setVisible(true);
				txtDexMod.setEnabled(true);
				txtDexMod.setVisible(true);
				lblConMod.setEnabled(true);
				lblConMod.setVisible(true);
				txtConMod.setEnabled(true);
				txtConMod.setVisible(true);
				lblIntMod.setEnabled(true);
				lblIntMod.setVisible(true);
				txtIntMod.setEnabled(true);
				txtIntMod.setVisible(true);
				lblWisMod.setEnabled(true);
				lblWisMod.setVisible(true);
				txtWisMod.setEnabled(true);
				txtWisMod.setVisible(true);
				lblChaMod.setEnabled(true);
				lblChaMod.setVisible(true);
				txtChaMod.setEnabled(true);
				txtChaMod.setVisible(true);
				btnHDRollMax.setEnabled(true);
				btnHDRollMax.setVisible(true);
				btnHPFixedInc.setEnabled(true);
				btnHPFixedInc.setVisible(true);
				tglbtnAddStr.setEnabled(true);
				tglbtnAddStr.setVisible(true);
				tglbtnAddDex.setEnabled(true);
				tglbtnAddDex.setVisible(true);
				tglbtnAddCon.setEnabled(true);
				tglbtnAddCon.setVisible(true);
				tglbtnAddInt.setEnabled(true);
				tglbtnAddInt.setVisible(true);
				tglbtnAddWis.setEnabled(true);
				tglbtnAddWis.setVisible(true);
				tglbtnAddCha.setEnabled(true);
				tglbtnAddCha.setVisible(true);
				
				if (cobxLevel.getSelectedIndex()>0) {
				btnHDRollMax.setEnabled(true);
				btnHPFixedInc.setEnabled(true);
				lblDesc.setText("Please Select Roll of Fixed Increase.");
				}else {
					
					lblDesc.setText("Please make your Ability Score rolls.");
				}
				
				if (cobxSubrace.getSelectedIndex()>0) {
					txtRace.setText((String) cobxSubrace.getSelectedItem());
				}else txtRace.setText((String) cobxRace.getSelectedItem());
				txtClass.setText((String) cobxClass.getSelectedItem());
				txtLevel.setText((String) cobxLevel.getSelectedItem());
				int rollsleft = cobxLevel.getSelectedIndex();
				txtHDRollCount.setText(""+rollsleft);
				
				lblRace.setBounds(10, 10, 30, 14);
				txtRace.setBounds(lblRace.getX()+lblRace.getWidth()+4, 7, 90, 20);
				lblClass.setBounds(txtRace.getX()+txtRace.getWidth()+4, 10, 32, 14);
				txtClass.setBounds(lblClass.getX()+lblClass.getWidth()+4, 7, 60, 20);
				lblLevel.setBounds(txtClass.getX()+txtClass.getWidth()+4, 10, 30, 14);
				txtLevel.setBounds(lblLevel.getX()+lblLevel.getWidth()+4, 7, 20, 20);
				lblProfBonus.setBounds(txtLevel.getX()+txtLevel.getWidth()+4, 10, 66, 14);
				txtProfBonus.setBounds(lblProfBonus.getX()+lblProfBonus.getWidth()+4, 7, 24, 20);
				lblHitDie.setBounds(10, 10, 40, 14);
				txtHitDie.setBounds(lblHitDie.getX()+lblHitDie.getWidth()+4, 7, 40, 20);
				lblMaxHP.setBounds(innerPanel1.getWidth()/2, 10, 45, 14);
				txtMaxHP.setBounds(lblMaxHP.getX()+lblMaxHP.getWidth()+4, 7, 40, 20);
				lblHDRollCount.setBounds(10, lblHitDie.getY()+lblHitDie.getHeight()+18, 60, 14);
				txtHDRollCount.setBounds(lblHDRollCount.getX()+lblHDRollCount.getWidth()+4,lblHDRollCount.getY()-3, 20, 20);
				lblDesc.setBounds(txtHDRollCount.getX()+txtHDRollCount.getWidth()+20, lblHDRollCount.getY(), 250, 14);
				btnHDRollMax.setBounds(10, lblHDRollCount.getY()+lblHDRollCount.getHeight()+15, 120, 23);
				btnHPFixedInc.setBounds(btnHDRollMax.getX()+btnHDRollMax.getWidth()+4, lblHDRollCount.getY()+lblHDRollCount.getHeight()+15, 160, 23);

				lblStrScore.setBounds(10, 10, 70, 14);
				lblDexScore.setBounds(10, lblStrScore.getY()+lblStrScore.getHeight()+8, 70, 14);
				lblConScore.setBounds(10, lblDexScore.getY()+lblDexScore.getHeight()+8, 70, 14);
				lblIntScore.setBounds(10, lblConScore.getY()+lblConScore.getHeight()+8, 70, 14);
				lblWisScore.setBounds(10, lblIntScore.getY()+lblIntScore.getHeight()+8, 70, 14);
				lblChaScore.setBounds(10, lblWisScore.getY()+lblWisScore.getHeight()+8, 70, 14);
				txtStrScore.setBounds(lblStrScore.getX()+lblStrScore.getWidth()+4, lblStrScore.getY()-3, 20, 20);
				txtDexScore.setBounds(lblStrScore.getX()+lblStrScore.getWidth()+4, lblDexScore.getY()-3, 20, 20);
				txtConScore.setBounds(lblStrScore.getX()+lblStrScore.getWidth()+4, lblConScore.getY()-3, 20, 20);
				txtIntScore.setBounds(lblStrScore.getX()+lblStrScore.getWidth()+4, lblIntScore.getY()-3, 20, 20);
				txtWisScore.setBounds(lblStrScore.getX()+lblStrScore.getWidth()+4, lblWisScore.getY()-3, 20, 20);
				txtChaScore.setBounds(lblStrScore.getX()+lblStrScore.getWidth()+4, lblChaScore.getY()-3, 20, 20);
				lblStrMod.setBounds(txtStrScore.getX()+txtStrScore.getWidth()+4, lblStrScore.getY(), 50, 14);
				lblDexMod.setBounds(txtDexScore.getX()+txtDexScore.getWidth()+4, lblDexScore.getY(), 50, 14);
				lblConMod.setBounds(txtConScore.getX()+txtConScore.getWidth()+4, lblConScore.getY(), 50, 14);
				lblIntMod.setBounds(txtIntScore.getX()+txtIntScore.getWidth()+4, lblIntScore.getY(), 50, 14);
				lblWisMod.setBounds(txtWisScore.getX()+txtWisScore.getWidth()+4, lblWisScore.getY(), 50, 14);
				lblChaMod.setBounds(txtChaScore.getX()+txtChaScore.getWidth()+4, lblChaScore.getY(), 50, 14);
				txtStrMod.setBounds(lblStrMod.getX()+lblStrMod.getWidth()+4, txtStrScore.getY(), 20, 20);
				txtDexMod.setBounds(lblStrMod.getX()+lblStrMod.getWidth()+4, txtDexScore.getY(), 20, 20);
				txtConMod.setBounds(lblStrMod.getX()+lblStrMod.getWidth()+4, txtConScore.getY(), 20, 20);
				txtIntMod.setBounds(lblStrMod.getX()+lblStrMod.getWidth()+4, txtIntScore.getY(), 20, 20);
				txtWisMod.setBounds(lblStrMod.getX()+lblStrMod.getWidth()+4, txtWisScore.getY(), 20, 20);
				txtChaMod.setBounds(lblStrMod.getX()+lblStrMod.getWidth()+4, txtChaScore.getY(), 20, 20);
				tglbtnAddStr.setBounds(txtStrMod.getX()+txtStrMod.getWidth()+4, lblStrScore.getY()-3, 80, 20);
				tglbtnAddDex.setBounds(txtDexMod.getX()+txtDexMod.getWidth()+4, lblDexScore.getY()-3, 80, 20);
				tglbtnAddCon.setBounds(txtConMod.getX()+txtConMod.getWidth()+4, lblConScore.getY()-3, 80, 20);
				tglbtnAddInt.setBounds(txtIntMod.getX()+txtIntMod.getWidth()+4, lblIntScore.getY()-3, 80, 20);
				tglbtnAddWis.setBounds(txtWisMod.getX()+txtWisMod.getWidth()+4, lblWisScore.getY()-3, 80, 20);
				tglbtnAddCha.setBounds(txtChaMod.getX()+txtChaMod.getWidth()+4, lblChaScore.getY()-3, 80, 20);
			}
		});
		
		btnHDRollMax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int HP = Integer.parseInt(txtMaxHP.getText());
				int hitdie = rollme.setHitDie((String) cobxClass.getSelectedItem());
				int hitdieresult = statme.addHitDie(hitdie);
				HP = HP + hitdieresult;
				txtMaxHP.setText(""+HP);
				if (hitdieresult == 8 || hitdieresult == 11) {
					lblDesc.setText("You rolled an " + hitdieresult + "!");
				}else lblDesc.setText("You rolled a " + hitdieresult + "!");
				int rollsleft = Integer.parseInt(txtHDRollCount.getText()) - 1;
				txtHDRollCount.setText(""+rollsleft);
				if (rollsleft<1) {
					btnHDRollMax.setEnabled(false);
					btnHPFixedInc.setEnabled(false);
				}
			}
		});
		
		btnHPFixedInc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int HP = Integer.parseInt(txtMaxHP.getText());
				int flatinc = (rollme.setHitDie((String) cobxClass.getSelectedItem())/2)+1;
				HP = HP + flatinc;
				txtMaxHP.setText(""+HP);
				lblDesc.setText("You increased your HP by " + flatinc + ".");
				int rollsleft = Integer.parseInt(txtHDRollCount.getText()) - 1;
				txtHDRollCount.setText(""+rollsleft);
				if (rollsleft<1) {
					btnHDRollMax.setEnabled(false);
					btnHPFixedInc.setEnabled(false);
				}
			}
		});
	}
}