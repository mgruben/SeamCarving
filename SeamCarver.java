
import edu.princeton.cs.algs4.Picture;

/*
 * Copyright (C) 2017 Michael <GrubenM@GMail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Michael <GrubenM@GMail.com>
 */
public class SeamCarver {
    Picture pic;
    
    /**
     * Create a seam carver object based on the given picture.
     * 
     * @param picture 
     */
    public SeamCarver(Picture picture) {
        pic = picture;
    }
    
    /**
     * Current picture.
     * 
     * @return the current picture.
     */
    public Picture picture() {
        return pic;
    }
    
    /**
     * Width of current picture.
     * 
     * @return the width of the current picture.
     */
    public int width() {
        return pic.width();
    }
    
    /**
     * Height of current picture.
     * 
     * @return the height of the current picture.
     */
    public int height() {
        return pic.height();
    }
    
    /**
     * Energy of pixel at column x and row y.
     * 
     * Note that (0,0) is the pixel at the top-left corner of the image.
     * 
     * The dual-gradient energy function is used to compute the energy of a
     * pixel.
     * 
     * @param x
     * @param y
     * @return the energy of the pixel at column <em>x</em> and row <em>y</em>.
     * @throws IndexOutOfBoundsException if <em>x</em> is greater than
     *         or equal to the image width, if <em>y</em> is greater than or
     *         equal to the image height, or if <em>x</em> or <em>y</em> are
     *         negative.
     */
    public double energy(int x, int y) {
        if (x >= pic.width() || y >= pic.height() || x < 0 || y < 0)
            throw new java.lang.IndexOutOfBoundsException();
    }
    
    /**
     * Sequence of indices for horizontal seam.
     * 
     * @return 
     */
    public int[] findHorizontalSeam() {
        
    }
    
    /**
     * Sequence of indices for vertical seam.
     * 
     * @return 
     */
    public int[] findVerticalSeam() {
        
    }
    
    /**
     * Remove horizontal seam from current picture.
     * 
     * @param seam 
     */
    public void removeHorizontalSeam(int[] seam) {
        
    }
    
    /**
     * Remove vertical seam from current picture.
     * 
     * @param seam 
     */
    public void removeVerticalSeam(int[] seam) {
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
