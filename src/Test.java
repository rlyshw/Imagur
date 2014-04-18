import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Test {

	public static void main(String[] args) throws IOException {
//		System.out.println(encoder.inList("This is something completely different."));
		ImageIO.write(imager.image(),"PNG",new File("glpatter.png"));
		new decoder("glpatter.png");
	}

}
