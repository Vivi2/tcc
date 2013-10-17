package br.java.classe;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Notas {

	private int x;
	private int y;
	private int altura;
	private int largura;
	private Bitmap bmp;
	
	
	public Notas(int x, int y, int altura, int largura) {
		super();
		this.x = x;
		this.y = y;
		this.altura = altura;
		this.largura = largura;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public int getLargura() {
		return largura;
	}


	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	public void criaSeminima(int x, int y, Resources res){
		bmp = BitmapFactory.decodeResource(res, R.drawable.seminima);
		bmp = Bitmap.createScaledBitmap(bmp, 25, 25, true);
	}
	
	public void move(){
		
	}
	
	public void draw(Canvas canvas, Paint paint){
		canvas.drawBitmap(bmp, getX(), getY(), paint);
	}
	
	
}
