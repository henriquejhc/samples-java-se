package innerclasses;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class OuterClass {

	int x = 1;
	static int y = 2;
	
	//Inner i = new Inner();
	
	void method(Inner i) {
		i.method();
	}
	
	
	public class Inner {
		
		public void method() {
			x++;
			y++;
		}
	}
	
	
	public static class InnerStatic {
		
		public void method() {
			//x++; //(n�o static)
			y++;
		}
		
	}

	
	void method() {

		MouseListener listener = new MouseListener() /*? anonima ?*/ {
			public void mouseClicked(MouseEvent e) {
				System.out.println("clicou no mouse");
			}
			public void mouseEntered(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseReleased(MouseEvent e) {
			}
		};
		
		OuterClass o = new OuterClass() {
			// Sobrescrevendo o metodo 
			void method() {
				System.out.println(x);
			}
		};
		
		o.method();
		o = null;
		
		OuterClass o2 = new OuterClass();
		o2.method();
		
	}
	
	
}
