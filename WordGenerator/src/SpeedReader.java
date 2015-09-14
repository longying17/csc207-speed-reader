import java.awt.*;
import java.io.FileNotFoundException;

public class SpeedReader {
	
	public static void reader(String filename, int width, 
			int height, int fontSize, int wpm) throws FileNotFoundException, InterruptedException{
		WordGenerator w1 = new WordGenerator(filename);
		DrawingPanel panel = new DrawingPanel(width, height);
		Graphics g = panel.getGraphics();
		Font f = new Font("Courier", Font.BOLD, fontSize);
		g.setFont(f);
		while(w1.hasNext()){
			g.drawString(w1.next(), 100, 100);
			Thread.sleep(60000/wpm);			
			g.setColor(Color.white);
			g.fillRect(0, 0, width, height);
			g.setColor(Color.black);
		}
	}

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		if(args.length != 5){
			System.out.println("Please provide all five arguments: filename, width, height, font size, and words per minute");
			return;
		} else{
			reader(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]));
		}
	}
}
