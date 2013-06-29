import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ExemploFrameAWT extends Frame {
	
	public ExemploFrameAWT() {
		setTitle("Exemplo AWT");
		setSize(800, 600);
		setBackground(Color.WHITE);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				System.exit(1);
			}
		});

	}
	
	
	public static void main(String[] args) {
		ExemploFrameAWT frame = new ExemploFrameAWT();
	}

}
