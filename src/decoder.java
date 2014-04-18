import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class decoder {
	public decoder(String a) throws IOException {
		BufferedImage inpic = ImageIO.read(new File(a));
		Raster inraster = inpic.getRaster();
		int[] out = {0,0,0};
		int width = inpic.getWidth();
		int height = inraster.getHeight();
		int rows = inraster.getPixel(width-1, height-1, out)[0];
		int rowpix = width/rows;
		for(int wr=0;wr<rows;wr++){
			int[] samp = inraster.getPixel(rowpix*wr,0,out);
			System.out.print(((""+(char)samp[0]+(char)samp[1]+(char)samp[2])));
		}
	}
}
