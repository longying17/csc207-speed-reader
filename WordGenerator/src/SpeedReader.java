import java.awt.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpeedReader {
	private String filename;
	private int width;
	private int height;
	private int fontSize;
	private int wpm;
	
	public SpeedReader(String filename, int width, 
			int height, int fontSize, int wpm) throws FileNotFoundException{
		this.filename = filename;
		this.width = width;
		this.height = height;
		this.fontSize = fontSize;
		this.wpm = wpm;
	}
	
	public static void reader(String filename, int width, 
			int height, int fontSize, int wpm) throws FileNotFoundException, InterruptedException{
		SpeedReader s1 = new SpeedReader(filename, width, 
			height, fontSize, wpm);
		WordGenerator w1 = new WordGenerator(s1.filename);
		DrawingPanel panel = new DrawingPanel(s1.width, s1.height);
		Graphics g = panel.getGraphics();
		Font f = new Font("Courier", Font.BOLD, s1.fontSize);
		g.setFont(f);
		while(w1.hasNext()){
			g.drawString(w1.next(), 100, 100);
			Thread.sleep(60000/wpm);
		}
	}

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		/*System.out.println("Enter the path to the file: ");
		Scanner filename = new Scanner(System.in);
		String fileName = filename.nextLine();
		
		System.out.println("Enter the width of the panel: ");
		Scanner width = new Scanner(System.in);
		int widthP = width.nextInt();
		
		System.out.println("Enter the height of the panel: ");
		Scanner height = new Scanner(System.in);
		int heightP = height.nextInt();
		
		System.out.println("Enter the width of the panel: ");
		Scanner fontsize = new Scanner(System.in);
		int fontsizeP = fontsize.nextInt();
		
		System.out.println("Enter the width of the panel: ");
		Scanner wpm = new Scanner(System.in);
		int wpmP = wpm.nextInt();
		wpm.close(); */

		reader("/home/longying17/Desktop/CSC207/homework/csc207-speed-reader/README.md", 400, 300, 50, 250);
	}

}
