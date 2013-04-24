package ControlStationGUI2;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.border.Border;

import org.jdesktop.application.SingleFrameApplication;

//import Classes.Controller;

import Classes.Controller;

import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;

public class NewSingleFrameApplication extends SingleFrameApplication {
	private JPanel topPanel;
	private JButton emergencyStop;
	private JProgressBar signalStrength;
	private JLabel commandLog;
	private JSlider reverseSpeed;
	private JSlider forwardSpeed;
	private JSlider leftSpeed;
	private JSlider rightSpeed;
	private JButton reverseButton;
	private JButton forwardButton;
	private JButton leftTurnButton;
	private JButton rightTurnButton;
	private JButton takePort4Reading;
	private JButton takePort3Reading;
	private JButton takePort2Reading;
	private JButton takePort1Reading;
	private JComboBox<String> port4assignment;
	private JComboBox<String> port3assignment;
	private JComboBox<String> port2assignment;
	private JComboBox<String> port1assignment;
	private JLabel port4;
	private JLabel port3;
	private JLabel port2;
	private JLabel port1;
	private JLabel reverse;
	private JLabel forward;
	private JLabel turnLeft;
	private JLabel turnRight;
	private JLabel port1reading;
	private JLabel port2reading;
	private JLabel port3reading;
	private JLabel port4reading;
	private Controller controller;

	@Override
	protected void startup() {
		{
			getMainFrame().setSize(602, 382);
		}
		controller = new Controller();
		topPanel = new JPanel();
		topPanel.addKeyListener(new KeyListenerMovement());
		AnchorLayout topPanelLayout = new AnchorLayout();
		topPanel.setLayout(topPanelLayout);
		topPanel.setFocusable(true);
		topPanel.setPreferredSize(new java.awt.Dimension(602, 300));
		topPanel.setBackground(Color.gray);
		{
			reverseButton = new JButton();
			topPanel.add(reverseButton, new AnchorConstraint(754, 482, 912,
					366, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL));
			reverseButton.setPreferredSize(new java.awt.Dimension(70, 57));
			reverseButton.setName("reverseButton");
			reverseButton.setFocusable(false);
		}
		{
			forwardButton = new JButton();
			topPanel.add(forwardButton, new AnchorConstraint(754, 362, 912,
					246, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL));
			forwardButton.setPreferredSize(new java.awt.Dimension(70, 57));
			forwardButton.setName("forwardButton");
			forwardButton.setFocusable(false);
		}
		{
			leftTurnButton = new JButton();
			topPanel.add(leftTurnButton, new AnchorConstraint(754, 243, 912,
					127, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL));
			leftTurnButton.setPreferredSize(new java.awt.Dimension(70, 57));
			leftTurnButton.setName("leftTurnButton");
			leftTurnButton.setFocusable(false);
		}
		{
			rightTurnButton = new JButton();
			topPanel.add(rightTurnButton, new AnchorConstraint(754, 125, 912,
					9, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL));
			rightTurnButton.setPreferredSize(new java.awt.Dimension(70, 57));
			rightTurnButton.setName("rightTurnButton");
			rightTurnButton.setFocusable(false);
		}
		{
			takePort4Reading = new JButton();
			topPanel.add(takePort4Reading, new AnchorConstraint(309, 984, 395,
					869, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL));
			takePort4Reading.setPreferredSize(new java.awt.Dimension(69, 31));
			takePort4Reading.setName("takePort4Reading");
			takePort4Reading.setText("Sample");
			takePort4Reading.setFocusable(false);
		}
		{
			takePort3Reading = new JButton();
			topPanel.add(takePort3Reading, new AnchorConstraint(212, 984, 298,
					869, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL));
			takePort3Reading.setPreferredSize(new java.awt.Dimension(69, 31));
			takePort3Reading.setName("takePort3Reading");
			takePort3Reading.setText("Sample");
			takePort3Reading.setFocusable(false);
		}
		{
			takePort2Reading = new JButton();
			topPanel.add(takePort2Reading, new AnchorConstraint(115, 984, 201,
					869, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL));
			takePort2Reading.setPreferredSize(new java.awt.Dimension(69, 31));
			takePort2Reading.setName("takePort2Reading");
			takePort2Reading.setText("Sample");
			takePort2Reading.setFocusable(false);
		}
		{
			takePort1Reading = new JButton();
			topPanel.add(takePort1Reading, new AnchorConstraint(18, 984, 104,
					869, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL));
			takePort1Reading.setPreferredSize(new java.awt.Dimension(69, 31));
			takePort1Reading.setName("takePort1Reading");
			takePort1Reading.setText("Sample");
			takePort1Reading.setFocusable(false);
		}
		{
			ComboBoxModel<String> port4assignmentModel = new DefaultComboBoxModel<String>(
					new String[] { "Disconnected", "Light Sensor",
							"Sound Sensor", "Touch Sensor", "Ultrasonic Sensor" });
			port4assignment = new JComboBox<String>();
			topPanel.add(port4assignment, new AnchorConstraint(309, 871, 395,
					557, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL));
			port4assignment.setModel(port4assignmentModel);
			port4assignment.setPreferredSize(new java.awt.Dimension(189, 31));
			port4assignment.setFocusable(false);
		}
		{
			ComboBoxModel<String> port3assignmentModel = new DefaultComboBoxModel<String>(
					new String[] { "Disconnected", "Light Sensor",
							"Sound Sensor", "Touch Sensor", "Ultrasonic Sensor" });
			port3assignment = new JComboBox<String>();
			topPanel.add(port3assignment, new AnchorConstraint(212, 871, 298,
					557, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL));
			port3assignment.setModel(port3assignmentModel);
			port3assignment.setPreferredSize(new java.awt.Dimension(189, 31));
			port3assignment.setFocusable(false);
		}
		{
			ComboBoxModel<String> port2assignmentModel = new DefaultComboBoxModel<String>(
					new String[] { "Disconnected", "Light Sensor",
							"Sound Sensor", "Touch Sensor", "Ultrasonic Sensor" });
			port2assignment = new JComboBox<String>();
			topPanel.add(port2assignment, new AnchorConstraint(115, 871, 201,
					557, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL));
			port2assignment.setModel(port2assignmentModel);
			port2assignment.setPreferredSize(new java.awt.Dimension(189, 31));
			port2assignment.setFocusable(false);
		}
		{
			ComboBoxModel<String> port1assignmentModel = new DefaultComboBoxModel<String>(
					new String[] { "Disconnected", "Light Sensor",
							"Sound Sensor", "Touch Sensor", "Ultrasonic Sensor" });
			port1assignment = new JComboBox<String>();
			topPanel.add(port1assignment, new AnchorConstraint(18, 871, 104,
					557, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL));
			port1assignment.setModel(port1assignmentModel);
			port1assignment.setPreferredSize(new java.awt.Dimension(189, 31));
			port1assignment.setFocusable(false);
		}
		{
			port4 = new JLabel();
			topPanel.add(port4, new AnchorConstraint(334, 552, 379, 489,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
			port4.setPreferredSize(new java.awt.Dimension(38, 16));
			port4.setName("port4");
			port4.setText("Port 4");
		}
		{
			port3 = new JLabel();
			topPanel.add(port3, new AnchorConstraint(234, 550, 279, 489,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
			port3.setPreferredSize(new java.awt.Dimension(37, 16));
			port3.setName("port3");
			port3.setText("Port 3");
		}
		{
			port2 = new JLabel();
			topPanel.add(port2, new AnchorConstraint(134, 550, 179, 489,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
			port2.setPreferredSize(new java.awt.Dimension(37, 16));
			port2.setName("port2");
			port2.setText("Port 2");
		}
		{
			port1 = new JLabel();
			topPanel.add(port1, new AnchorConstraint(34, 550, 79, 489,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
			port1.setPreferredSize(new java.awt.Dimension(37, 16));
			port1.setName("port1");
			port1.setText("Port 1");
		}
		{
			commandLog = new JLabel();
			topPanel.add(commandLog, new AnchorConstraint(473, 984, 970, 489,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
			commandLog.setPreferredSize(new java.awt.Dimension(298, 179));
			commandLog.setBackground(Color.gray.brighter());

		}
		{
			reverseSpeed = new JSlider();
			topPanel.add(reverseSpeed, new AnchorConstraint(918, 482, 970, 366,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
			reverseSpeed.setPreferredSize(new java.awt.Dimension(70, 19));
			reverseSpeed.setFocusable(false);
		}
		{
			forwardSpeed = new JSlider();
			topPanel.add(forwardSpeed, new AnchorConstraint(918, 362, 970, 246,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
			forwardSpeed.setPreferredSize(new java.awt.Dimension(70, 19));
			forwardSpeed.setFocusable(false);
		}
		{
			leftSpeed = new JSlider();
			topPanel.add(leftSpeed, new AnchorConstraint(918, 243, 970, 127,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
			leftSpeed.setPreferredSize(new java.awt.Dimension(70, 19));
			leftSpeed.setFocusable(false);
		}
		{
			rightSpeed = new JSlider();
			topPanel.add(rightSpeed, new AnchorConstraint(918, 125, 970, 9,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
			rightSpeed.setPreferredSize(new java.awt.Dimension(70, 19));
			rightSpeed.setFocusable(false);
		}
		{
			reverse = new JLabel();
			topPanel.add(reverse, new AnchorConstraint(684, 462, 737, 384,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
			reverse.setPreferredSize(new java.awt.Dimension(47, 19));
			reverse.setName("reverse");
			reverse.setText("Reverse");
		}
		{
			forward = new JLabel();
			topPanel.add(forward, new AnchorConstraint(684, 344, 737, 261,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
			forward.setPreferredSize(new java.awt.Dimension(50, 19));
			forward.setName("forward");
			forward.setText("Forward");
		}
		{
			turnLeft = new JLabel();
			topPanel.add(turnLeft, new AnchorConstraint(684, 231, 737, 137,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
			turnLeft.setPreferredSize(new java.awt.Dimension(57, 19));
			turnLeft.setName("turnLeft");
			turnLeft.setText("Turn Left");
		}
		{
			turnRight = new JLabel();
			topPanel.add(turnRight, new AnchorConstraint(684, 120, 737, 14,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
			turnRight.setPreferredSize(new java.awt.Dimension(64, 19));
			turnRight.setName("turnRight");
			turnRight.setText("Turn Right");
		}
		{
			signalStrength = new JProgressBar();
			topPanel.add(signalStrength, new AnchorConstraint(420, 984, 440,
					489, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL));
			signalStrength.setPreferredSize(new java.awt.Dimension(298, 7));
			signalStrength.setFocusable(false);
		}
		{
			emergencyStop = new JButton();
			topPanel.add(emergencyStop, new AnchorConstraint(73, 364, 601, 52,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL,
					AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
			emergencyStop.setName("emergencyStop");
			emergencyStop.setPreferredSize(new java.awt.Dimension(188, 190));
			emergencyStop.setBackground(Color.red);
			emergencyStop.setOpaque(true);
			emergencyStop.setBorderPainted(false);
			Border raisedBorder = BorderFactory.createRaisedBevelBorder();
			emergencyStop.setBorder(raisedBorder);
			emergencyStop.setText("EMERGENCY STOP");
			emergencyStop.setFocusable(false);
		}
		if (controller.establishConnection() == true)
			commandLog.setText("Connection successful.");
		else
			commandLog.setText("Connection failed");
		show(topPanel);

		this.emergencyStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if (controller.EmergencyStop() == false) {
					commandLog.setText("Could not send message.");
				} else {
					commandLog.setText("Emergency Stop Enacted");
				}
			}
		});

		this.leftTurnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if (controller.turnLeft() == false) {
					commandLog.setText("Could not send message.");
				} else {
					commandLog.setText("Turned Left.");
				}
			}
		});

		this.rightTurnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (controller.turnRight() == false) {
					commandLog.setText("Could not send message.");
				} else {
					commandLog.setText("Turned Right.");
				}
			}

		});

		this.forwardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if (controller.moveForward() == false) {
					commandLog.setText("Could not send message.");
				} else {
					commandLog.setText("Moved Forward");
				}
			}
		});

		this.reverseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if (controller.moveBackward() == false) {
					commandLog.setText("Could not send message.");
				} else {
					commandLog.setText("Moved backward.");
				}
			}
		});

		this.takePort1Reading.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String Sensor = (String) port1assignment.getSelectedItem();
				if (Sensor != "Disconnected") {
					float reading = controller.getReading('1');
					if (!Sensor.equals("Touch Sensor") && reading >= 0) {
						port1reading.setText(reading + "");
					} else if (reading == 0 && Sensor.equals("Touch Sensor")) {
						port1reading.setText("false");
					} else if (reading > 0 && Sensor.equals("Touch Sensor")) {
						port1reading.setText("true");
					} else {
						commandLog.setText("Could not send message.");
					}
				}

			}
		});

		this.takePort2Reading.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String Sensor = (String) port2assignment.getSelectedItem();
				if (Sensor != "Disconnected") {
					float reading = controller.getReading('2');
					if (!Sensor.equals("Touch Sensor") && reading >= 0) {
						port2reading.setText(reading + "");
					} else if (reading == 0 && Sensor.equals("Touch Sensor")) {
						port2reading.setText("false");
					} else if (reading > 0 && Sensor.equals("Touch Sensor")) {
						port2reading.setText("true");
					} else {
						commandLog.setText("Could not send message.");
					}
				}

			}
		});

		this.takePort3Reading.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String Sensor = (String) port3assignment.getSelectedItem();
				if (Sensor != "Disconnected") {
					float reading = controller.getReading('3');
					if (!Sensor.equals("Touch Sensor") && reading >= 0) {
						port3reading.setText(reading + "");
					} else if (reading == 0 && Sensor.equals("Touch Sensor")) {
						port3reading.setText("false");
					} else if (reading > 0 && Sensor.equals("Touch Sensor")) {
						port3reading.setText("true");
					} else {
						commandLog.setText("Could not send message.");
					}
				}

			}
		});

		this.takePort4Reading.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String Sensor = (String) port4assignment.getSelectedItem();
				if (Sensor != "Disconnected") {
					float reading = controller.getReading('4');
					if (!Sensor.equals("Touch Sensor") && reading >= 0) {
						port4reading.setText(reading + "");
					} else if (reading == 0 && Sensor.equals("Touch Sensor")) {
						port4reading.setText("false");
					} else if (reading > 0 && Sensor.equals("Touch Sensor")) {
						port4reading.setText("true");
					} else {
						commandLog.setText("Could not send message.");
					}
				}

			}
		});

	}
	private void printMessage(String message) {
		String alreadyInCommandLog = commandLog.getText();
		System.out.println(alreadyInCommandLog);
		commandLog.setText(alreadyInCommandLog + "\n" + message);
		
	}

	public static void main(String[] args) {
		launch(NewSingleFrameApplication.class, args);

	}
	private class KeyListenerMovement implements KeyListener {
		private boolean pressed = false;

		@Override
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			while (pressed == false) {
				if (key == KeyEvent.VK_UP) {
					if (controller.moveForward() == false) {
						commandLog.setText("Could not send message.");
					} else {
						commandLog.setText("Moved forward.");
					}
				} else if (key == KeyEvent.VK_DOWN) {
					if (controller.moveBackward() == false) {
						commandLog.setText("Could not send message.");
					} else {
						commandLog.setText("Moved backward.");
					}
				}

				else if (key == KeyEvent.VK_LEFT) {
					if (controller.turnLeft() == false) {
						commandLog.setText("Could not send message.");
					} else {
						commandLog.setText("Turned left.");
					}
				} else if (key == KeyEvent.VK_RIGHT) {
					if (controller.turnRight() == false) {
						commandLog.setText("Could not send message.");
					} else {
						commandLog.setText("Turned Right.");
					}
				}
				pressed = true;
			}
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			if (controller.stop() == false) {
				commandLog.setText("Could not send message.");
			}
			pressed = false;

		}

		@Override
		public void keyTyped(KeyEvent e) {
		}
	}
}