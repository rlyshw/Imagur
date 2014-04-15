import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class decoder {
	public decoder(String a) throws IOException {
		BufferedImage inpic = ImageIO.read(new File(a));
//		Raster inraster = inpic.getRaster();
		int width = inpic.getWidth();
//		int height = inraster.getHeight();
		for(int w=0;w<width;w++) {
//			System.out.println(h);
			System.out.println(w);
			int sample = inpic.getRGB(w, 0);
			System.out.println(sample);
			}
	}
}
