import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.util.List;


public class imager {
	public static BufferedImage image(){
		int width = 512;
		int height = 512;
		List<Integer> inlist = encoder.inList("This is an image, but it's also words! I made this image using the RGB values of a pixel, assigning each to a single character in this input string. It's kinda cool! Each vertical strip represents three different letters. The longer the input string, the more vertical strips! Useless, in practice, but kinda fun to mess about with I guess. Making art with programming!");
		BufferedImage im = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		WritableRaster raster = im.getRaster();
		int rows = (inlist.size()/3);
		for(int h=0;h<height;h++){
			int i = 0;
			for(int wr=0;wr<rows;wr++){
				for(int w=0;w<(width/rows);w++){
					if(i<inlist.size()){
						int[] value = {inlist.get(i),inlist.get(i+1),inlist.get(i+2)};
						raster.setPixel(wr*(width/rows)+w, h, value);
					}
				}
				i+=3;
			}
		}
		int[] endval = {rows,rows,rows};
		raster.setPixel(width-1, height-1, endval);
		return im;
	}
}
