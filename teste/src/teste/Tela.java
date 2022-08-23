package teste;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;

public class Tela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 49, 176, 204);
		contentPane.add(scrollPane);
		
		JList list_1 = new JList(new CheckListItem[] { 
				new CheckListItem("Queijo"),
		        new CheckListItem("Presunto"),
		        new CheckListItem("Azeitona"),
		        new CheckListItem("Oregano"),
				new CheckListItem("Queijo"),
		        new CheckListItem("Presunto"),
		        new CheckListItem("Azeitona"),
		        new CheckListItem("Oregano"),
				new CheckListItem("Queijo"),
		        new CheckListItem("Presunto"),
		        new CheckListItem("Azeitona"),
		        new CheckListItem("Oregano"),
				new CheckListItem("Queijo"),
		        new CheckListItem("Presunto"),
		        new CheckListItem("Azeitona"),
		        new CheckListItem("Oregano") });
		list_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		scrollPane.setViewportView(list_1);
		list_1.setCellRenderer(new CheckListRenderer());
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JLabel lblNewLabel = new JLabel("Coisas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 26, 69, 13);
		contentPane.add(lblNewLabel);
		list_1.addMouseListener(new MouseAdapter() {
		  @Override
		  public void mouseClicked(MouseEvent event) {
		    JList list = (JList) event.getSource();
		    int index = list.locationToIndex(event.getPoint());// Get index of item
		                                                       // clicked
		    CheckListItem item = (CheckListItem) list.getModel()
		        .getElementAt(index);
		    item.setSelected(!item.isSelected()); // Toggle selected state
		    list.repaint(list.getCellBounds(index, index));// Repaint cell
		  }
		});
	}
}
