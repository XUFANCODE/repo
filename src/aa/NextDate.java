package aa;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NextDate extends JFrame implements ActionListener {
	private JTextField year = null;
	private JTextField month = null;
	private JTextField day = null;
	private JTextField nextDate = null;
	private JButton comfir = null;
	private JButton clearn = null;

	public NextDate() {
		// TODO Auto-generated constructor stub
		add(new JLabel("年："));
		year = new JTextField(3);
		add(year);
		add(new JLabel("月："));
		month = new JTextField(2);
		add(month);
		add(new JLabel("日："));
		day = new JTextField(2);
		add(day);
		add(new JLabel("NextDate:"));
		nextDate = new JTextField(10);
		nextDate.setEditable(false);
		add(nextDate);
		comfir = new JButton("NEXTDATE");
		clearn = new JButton("CLEARN");
		add(comfir);
		add(clearn);
		comfir.addActionListener(this);
		clearn.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new FlowLayout());
		setBounds(0, 0, 250, 300);
		setVisible(true);
	}

	public boolean leap(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)

			return true;

		else
			return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NextDate();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method
		// stub
		if (e.getSource() == comfir) {
			int y = 0;
			int m = 0;
			int d = 0;
			try {
				y = Integer.parseInt(year.getText().trim());
				m = Integer.parseInt(month.getText().trim());
				System.out.println(month.getText() + "	" + m);
				d = Integer.parseInt(day.getText().trim());
				if ((y >= 1970 && y <= 3000) && (m >= 1 && m <= 12)
						&& (d >= 1 && d <= 31)) {
					/*
					 * 满足判断条件
					 */
					if ((m == 1) || (m == 3) || (m == 5) || (m == 7)
							|| (m == 8) || (m == 10) || (m == 12)) {
						/*
						 * 对1,3,5,7,8 , 10这几个月进行处理
						 */
						if (m == 12) {
							if (d < 31) {
								nextDate.setText(y + "-" + m + "-" + (d + 1));
							} else {
								nextDate.setText((y + 1) + "-" + 1 + "-" + 1);
							}

						}

						else {
							if (d < 31) {
								nextDate.setText(y + "-" + m + "-" + (d + 1));
							} else
								nextDate.setText(y + "-" + (m + 1) + "-" + 1);
						}
					} else {
						if (m == 2) {
							if (leap(y)) {
								/*
								 * 闰年
								 */
								if (d < 30) {
									if (d < 29) {
										nextDate.setText(y + "-" + m + "-"
												+ (d + 1));
									} else {
										nextDate.setText(y + "-" + (m + 1)
												+ "-" + 1);
									}
								} else {
									JOptionPane.showMessageDialog(this,
											"输入日期有误", "Error",
											JOptionPane.ERROR_MESSAGE);
									year.setText("");
									month.setText("");
									day.setText("");
								}
							} else {
								/*
								 * 
								 * 平年
								 */
								if (d < 29) {
									if (d < 28) {
										nextDate.setText(y + "-" + m + "-"
												+ (d + 1));
									} else {
										nextDate.setText(y + "-" + (m + 1)
												+ "-" + 1);
									}

								} else {
									JOptionPane.showMessageDialog(this,
											"输入日期有误", "Error",
											JOptionPane.ERROR_MESSAGE);
									year.setText("");
									month.setText("");
									day.setText("");
								}

							}
						} else {
							if (d < 31) {
								if (d < 30) {
									nextDate.setText(y + "-" + m + "-"
											+ (d + 1));
								} else {
									nextDate.setText(y + "-" + (m + 1) + "-"
											+ 1);
								}
							}

							else {
								JOptionPane.showMessageDialog(this, "输入日期有误",
										"Error", JOptionPane.ERROR_MESSAGE);
								year.setText("");
								month.setText("");
								day.setText("");
							}

						}
					}
				} else {
					/*
					 * 不满足输入条件
					 */
					JOptionPane.showMessageDialog(this, "输入日期有误", "Error",
							JOptionPane.ERROR_MESSAGE);
					year.setText("");
					month.setText("");
					day.setText("");
				}
			} catch (Exception ee) {
				JOptionPane.showMessageDialog(this, "输入日期有误", "Error",
						JOptionPane.ERROR_MESSAGE);
				year.setText("");
				month.setText("");
				day.setText("");
			}
		} else {
			year.setText("");
			month.setText("");
			day.setText("");
			nextDate.setText("");
		}
	}
}