import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class DnDAbilityScoreGUI {

	private JFrame frame;
	private JTextField txtStrScore;
	private JTextField txtDexScore;
	private JTextField txtConScore;
	private JTextField txtIntScore;
	private JTextField txtWisScore;
	private JTextField txtChaScore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DnDAbilityScoreGUI window = new DnDAbilityScoreGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DnDAbilityScoreGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		AbilityScoreRoller Roll = new AbilityScoreRoller();
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtStrScore = new JTextField();
		txtStrScore.setEditable(false);
		txtStrScore.setText("0");
		txtStrScore.setBounds(85, 33, 25, 20);
		frame.getContentPane().add(txtStrScore);
		txtStrScore.setColumns(10);
		
		txtDexScore = new JTextField();
		txtDexScore.setEditable(false);
		txtDexScore.setText("0");
		txtDexScore.setColumns(10);
		txtDexScore.setBounds(85, 58, 25, 20);
		frame.getContentPane().add(txtDexScore);
		
		txtConScore = new JTextField();
		txtConScore.setEditable(false);
		txtConScore.setText("0");
		txtConScore.setColumns(10);
		txtConScore.setBounds(85, 83, 25, 20);
		frame.getContentPane().add(txtConScore);
		
		txtIntScore = new JTextField();
		txtIntScore.setEditable(false);
		txtIntScore.setText("0");
		txtIntScore.setColumns(10);
		txtIntScore.setBounds(85, 108, 25, 20);
		frame.getContentPane().add(txtIntScore);
		
		txtWisScore = new JTextField();
		txtWisScore.setEditable(false);
		txtWisScore.setText("0");
		txtWisScore.setColumns(10);
		txtWisScore.setBounds(85, 133, 25, 20);
		frame.getContentPane().add(txtWisScore);
		
		txtChaScore = new JTextField();
		txtChaScore.setEditable(false);
		txtChaScore.setText("0");
		txtChaScore.setColumns(10);
		txtChaScore.setBounds(85, 158, 25, 20);
		frame.getContentPane().add(txtChaScore);
		
		JLabel lblStrScore = new JLabel("Strength");
		lblStrScore.setBounds(10, 36, 100, 14);
		frame.getContentPane().add(lblStrScore);
		
		JLabel lblDexScore = new JLabel("Dexterity");
		lblDexScore.setBounds(10, 61, 100, 14);
		frame.getContentPane().add(lblDexScore);
		
		JLabel lblConScore = new JLabel("Constitution");
		lblConScore.setBounds(10, 86, 100, 14);
		frame.getContentPane().add(lblConScore);
		
		JLabel lblIntScore = new JLabel("Intelligence");
		lblIntScore.setBounds(10, 111, 100, 14);
		frame.getContentPane().add(lblIntScore);
		
		JLabel lblWisScore = new JLabel("Wisdom");
		lblWisScore.setBounds(10, 136, 100, 14);
		frame.getContentPane().add(lblWisScore);
		
		JLabel lblChaScore = new JLabel("Charisma");
		lblChaScore.setBounds(10, 161, 100, 14);
		frame.getContentPane().add(lblChaScore);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Roll List"}));
		comboBox.setBounds(210, 32, 80, 22);
		frame.getContentPane().add(comboBox);
		
		JToggleButton tglbtnAddStr = new JToggleButton("Add");
		tglbtnAddStr.setEnabled(false);
		tglbtnAddStr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnAddStr.isSelected()) {
					int me = comboBox.getSelectedIndex();
					txtStrScore.setText((String) comboBox.getSelectedItem());
					comboBox.removeItemAt(me);
					tglbtnAddStr.setText("Remove");
				} else {
					comboBox.addItem(txtStrScore.getText());
					txtStrScore.setText("0");
					tglbtnAddStr.setText("Add");
				}
			}
		});
		tglbtnAddStr.setBounds(120, 32, 80, 23);
		frame.getContentPane().add(tglbtnAddStr);
		
		JToggleButton tglbtnAddDex = new JToggleButton("Add");
		tglbtnAddDex.setEnabled(false);
		tglbtnAddDex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnAddDex.isSelected()) {
					int me = comboBox.getSelectedIndex();
					txtDexScore.setText((String) comboBox.getSelectedItem());
					comboBox.removeItemAt(me);
					tglbtnAddDex.setText("Remove");
				} else {
					comboBox.addItem(txtDexScore.getText());
					txtDexScore.setText("0");
					tglbtnAddDex.setText("Add");
				}
			}
		});
		tglbtnAddDex.setBounds(120, 57, 80, 23);
		frame.getContentPane().add(tglbtnAddDex);
		
		JToggleButton tglbtnAddCon = new JToggleButton("Add");
		tglbtnAddCon.setEnabled(false);
		tglbtnAddCon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnAddCon.isSelected()) {
					int me = comboBox.getSelectedIndex();
					txtConScore.setText((String) comboBox.getSelectedItem());
					comboBox.removeItemAt(me);
					tglbtnAddCon.setText("Remove");
				} else {
					comboBox.addItem(txtConScore.getText());
					txtConScore.setText("0");
					tglbtnAddCon.setText("Add");
				}
			}
		});
		tglbtnAddCon.setBounds(120, 82, 80, 23);
		frame.getContentPane().add(tglbtnAddCon);
		
		JToggleButton tglbtnAddInt = new JToggleButton("Add");
		tglbtnAddInt.setEnabled(false);
		tglbtnAddInt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnAddInt.isSelected()) {
					int me = comboBox.getSelectedIndex();
					txtIntScore.setText((String) comboBox.getSelectedItem());
					comboBox.removeItemAt(me);
					tglbtnAddInt.setText("Remove");
				} else {
					comboBox.addItem(txtIntScore.getText());
					txtIntScore.setText("0");
					tglbtnAddInt.setText("Add");
				}
			}
		});
		tglbtnAddInt.setBounds(120, 107, 80, 23);
		frame.getContentPane().add(tglbtnAddInt);
		
		JToggleButton tglbtnAddWis = new JToggleButton("Add");
		tglbtnAddWis.setEnabled(false);
		tglbtnAddWis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnAddWis.isSelected()) {
					int me = comboBox.getSelectedIndex();
					txtWisScore.setText((String) comboBox.getSelectedItem());
					comboBox.removeItemAt(me);
					tglbtnAddWis.setText("Remove");
				} else {
					comboBox.addItem(txtWisScore.getText());
					txtWisScore.setText("0");
					tglbtnAddWis.setText("Add");
				}
			}
		});
		tglbtnAddWis.setBounds(120, 132, 80, 23);
		frame.getContentPane().add(tglbtnAddWis);
		
		JToggleButton tglbtnAddCha = new JToggleButton("Add");
		tglbtnAddCha.setEnabled(false);
		tglbtnAddCha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnAddCha.isSelected()) {
					int me = comboBox.getSelectedIndex();
					txtChaScore.setText((String) comboBox.getSelectedItem());
					comboBox.removeItemAt(me);
					tglbtnAddCha.setText("Remove");
				} else {
					comboBox.addItem(txtChaScore.getText());
					txtChaScore.setText("0");
					tglbtnAddCha.setText("Add");
				}
			}
		});
		tglbtnAddCha.setBounds(120, 157, 80, 23);
		frame.getContentPane().add(tglbtnAddCha);
		
		JButton btnAblRoll = new JButton("Roll Ability Scores");
		btnAblRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int roll[] = Roll.ScoreRolls();
				comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {""+roll[0], ""+roll[1], ""+roll[2], ""+roll[3], ""+roll[4], ""+roll[5]}));
				txtStrScore.setText("0");
				txtDexScore.setText("0");
				txtConScore.setText("0");
				txtIntScore.setText("0");
				txtWisScore.setText("0");
				txtChaScore.setText("0");
				tglbtnAddStr.setEnabled(true);
				tglbtnAddDex.setEnabled(true);
				tglbtnAddCon.setEnabled(true);
				tglbtnAddInt.setEnabled(true);
				tglbtnAddWis.setEnabled(true);
				tglbtnAddCha.setEnabled(true);
				tglbtnAddStr.setSelected(false);
				tglbtnAddDex.setSelected(false);
				tglbtnAddCon.setSelected(false);
				tglbtnAddInt.setSelected(false);
				tglbtnAddWis.setSelected(false);
				tglbtnAddCha.setSelected(false);
				tglbtnAddStr.setText("Add");
				tglbtnAddDex.setText("Add");
				tglbtnAddCon.setText("Add");
				tglbtnAddInt.setText("Add");
				tglbtnAddWis.setText("Add");
				tglbtnAddCha.setText("Add");
			}
		});
		btnAblRoll.setBounds(210, 157, 117, 23);
		frame.getContentPane().add(btnAblRoll);
		btnAblRoll.setActionCommand("disable");
	}
}
