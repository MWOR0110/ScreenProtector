package classes;
import javax.swing.*;
import java.awt.*;

public class Image {
//Atributos
	private ImageIcon img;
	private int posX, posY, width, height;
	SoundEffect sound;
//Construtores
	public Image (String url, int posX,int posY) {
		this.img= new ImageIcon(this.getClass().getResource(url));
		this.posX = posX;
		this.posY = posY;
		this.width = img.getIconWidth();
		this.height = img.getIconHeight();
		this.sound = null;
	}
	
	public Image (String url, int posX, int posY, String sound, boolean loop) {
		this.img= new ImageIcon(this.getClass().getResource(url));
		this.posX = posX;
		this.posY = posY;
		this.width = img.getIconWidth();
		this.height = img.getIconHeight();
		this.sound = new SoundEffect(sound,loop);
		
	}
	
//Metodos especificos
	public void draw(Graphics g) {

		g.drawImage(img.getImage(), this.posX, this.posY, this.width, this.height, null);
	}
	
	public void scale(double scale) {
		this.width*=scale;
		this.height*=scale;
	}
	
	public void moveX(int inc) {
		this.posX+=inc;	
	}
	public void moveY(int inc) {
		this.posY+=inc;
	}
	
	public void getColision(int width,int height) {
		//Colisão Direita 
		if(this.posX+this.width>width) {
			this.posX=width-this.width;
			this.sound.play();
		}
		//Colisão Esquerda 
		if(this.posX<0) {
			this.posX=4;
			this.sound.play();
		}
		//Colisão Inferior
		if(this.posY+this.height>height) {
			this.posY=height-this.height;
			this.sound.play();
		}
		//Colisão Superior
		if(this.posY<0) {
			this.posY=4;
			this.sound.play();
		}
	}
	
//Metodos acessos


	public ImageIcon getImg() {
		return img;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	

	
}
