import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;


public class TextEditor extends JFrame{

	public static void main(String[] args) {
		new TextEditor();
	

	}
	public TextEditor(){
		super("text editor");
		setSize(500,500);
		 intialize();
		 setVisible(true);
		
	}
	private void intialize() {
		JTextArea area = new JTextArea();
		area.setLineWrap(true);
		JMenu fileMenu = new JMenu("File");
		JMenuBar bar = new JMenuBar();
		JMenuItem newFileItem = new JMenuItem("New");
		bar.add(fileMenu);
		fileMenu.add(newFileItem);
		JMenuItem saveFileItem = new JMenuItem("Save");
		fileMenu
		setJMenuBar(bar);
	}

}
