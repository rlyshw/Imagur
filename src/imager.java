import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.util.List;


public class imager {
	public static BufferedImage image(){
		int width = 512;
		int height = 512;
		List<Integer> inlist = encoder.inList("asdfghj");
		BufferedImage im = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		WritableRaster raster = im.getRaster();
		int rows = width/(inlist.size()/3);
		for(int h=0;h<height;h++){
			int i = 0;
			for(int w=0;w<width;w++)
			{
				if(i<inlist.size()){
					int[] value = {inlist.get(i),inlist.get(i+1),inlist.get(i+2)};
					for(int wr=0;wr<rows;wr++){
						raster.setPixel(wr+(rows*w), h, value);
					}
					i+=3;
				}
			}
		}
		int[] endval = {rows,rows,rows};
		raster.setPixel(width-1, height-1, endval);
		return im;
	}
}
