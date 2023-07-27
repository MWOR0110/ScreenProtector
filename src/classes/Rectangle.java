package classes;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape{
	
	// Atributos
	
	private int width;
	private int height;

	// Construtores
	public Rectangle(Color color, int posX, int posY, int width, int height) {
		super(color, posX, posY);
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
	}
	
	//Métodos especificos
	@Override
	public void draw(Graphics g) {
		g.setColor(super.getColor());
		g.fillRect(super.getPosX(), super.getPosY(), this.width, this.height);
		
	}
	public void changeDir(int limXmin,int limXmax,int limYmin,int limYmax) {
		if(super.getPosX()+this.width+10>=limXmax || super.getPosX()-10<=limXmin) {
			super.setSpeedX(super.getSpeedX()*-1);
			super.setColor(super.colorGenerate());
			
		}
		if(super.getPosY()+this.height+10>=limYmax || super.getPosY()-10<=limYmin) {
			super.setSpeedY(super.getSpeedY()*-1);
			super.setColor(super.colorGenerate());
			
		}
		
	}

	
	//Métodos de acessos

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
