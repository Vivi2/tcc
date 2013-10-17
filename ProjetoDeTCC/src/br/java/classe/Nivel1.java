package br.java.classe;



import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

public class Nivel1 extends View implements Runnable {
	
	private static final int INTERVAL = 10;
	private boolean running = true;
	private int y;
	private Paint notaDo;
	private Paint notaRe;
	private Paint notaMi;
	Bitmap bmp;
	Paint linha5 ;
	Paint linha4 ;
	Paint linha3 ;
	Paint linha2 ;
	Paint linha1 ;
	Paint pincel = new Paint();
	
	public Nivel1(Context context) {
		super(context);
		notaDo = new Paint();
		notaRe = new Paint();
		notaMi = new Paint();
		Thread minhaThread = new Thread(this);
		minhaThread.setPriority(Thread.MIN_PRIORITY);
		minhaThread.start();
		linha1 = new  Paint();
		linha2 = new Paint();
		linha3 = new Paint();
		linha4 = new Paint();
		linha5 = new Paint();

	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (running) {
			try {
			Thread.sleep(INTERVAL);
			} catch (InterruptedException e) {
			Log.e("Jogo", "GameLoop Finalizado!");
			}
			update();
			}
		
	}
	
	private void update() {
		if (y < getWidth()) {
		y += 3;
		} else {
		y = 0;
		}
		// Dispara o método draw
		postInvalidate();
	}
	
	public void draw(Canvas canvas) {
		super.draw(canvas);
		canvas.drawColor(Color.BLACK);
		//paint.setColor(Color.BLUE);
		//canvas.drawRect(getWidth()/2, y,(getWidth()/2)+50, 50+y, paint);
		//canvas.drawText(fps + " fps", 10, 10, paint);
		
		//desenha nota seminima
		  Bitmap myBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.seminima);
		  canvas.drawBitmap(myBitmap, 0, 0, null);
		
		//desenha a nota Do
		notaDo.setColor(Color.WHITE);
		canvas.drawCircle(getWidth() - y,45, this.getHeight()/40, notaDo);
		
		//desenha a nota Re
		notaRe.setColor(Color.WHITE);
		canvas.drawCircle(getWidth() - ( y - 250 ),40, this.getHeight()/40, notaRe);
		
		//desenha a nota Mi
		notaMi.setColor(Color.WHITE);
		canvas.drawCircle(getWidth() - ( y - 250 ),35, this.getHeight()/40, notaMi);

		//primeira linha da pauta
		
		linha5.setColor(Color.WHITE);
		linha5.setStrokeWidth(1);
		//1 comprimento da linha, 2distancia entre as linhas, 3 distancia da margem da tela
		canvas.drawLine((float)getWidth() - 10, 20, (float) 10, (float) ((float) 20) , linha5);
		
		
				linha4.setColor(Color.WHITE);
				linha4.setStrokeWidth(1);
				//1 comprimento da linha, 2distancia entre as linhas, 3 distancia da margem da tela
				canvas.drawLine((float)getWidth() - 10, 30, (float) 10, (float) ((float) 30) , linha4);
				
				//segunda linha da pauta
				//Paint linha3 = new Paint();
				linha3.setColor(Color.WHITE);
				linha3.setStrokeWidth(1);
				canvas.drawLine((float)getWidth() - 10, 40, (float) 10, (float) ((float) 40) , linha3);
				
				// terceira linha da pauta
				//Paint linha2 = new Paint();
				linha2.setColor(Color.WHITE);
				linha2.setStrokeWidth(1);
				canvas.drawLine((float)getWidth() - 10, 50, (float) 10, (float) ((float) 50) , linha2);
				
				// quarta linha da pauta
				//Paint linha1 = new Paint();
				linha1.setColor(Color.WHITE);
				linha1.setStrokeWidth(1);
				canvas.drawLine((float)getWidth() - 10, 60, (float) 10, (float) ((float) 60) , linha1);
		}

	public void release() {
		running = false;
	}
	

}
