package ru.lmd.activitylife;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

	public static final String TAG = "StartActivity";

	private Integer count = 5;

	// Вызывается при создании Активности
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Инициализация Активности
		setContentView(R.layout.activity_main);
		Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onCreate");
	}

	// Вызывается после завершения метода onCreate
	// Используется для восстановления состояния UI
	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		// Восстановление состояние UI из объекта savedInstanceState.
		// Данный объект также был передан методу onCreate.
		setContentView(R.layout.activity_main);
		Toast.makeText(this, "onRestoreInstanceState()", Toast.LENGTH_LONG).show();
		if (savedInstanceState != null &&
				savedInstanceState.containsKey("count")) {
			count = savedInstanceState.getInt("count");
		}
		Log.d(TAG, "onRestoreInstanceState");
	}

	// Вызывается перед тем, как Активность снова становится видимой
	@Override
	public void onRestart() {
		super.onRestart();
		// Восстановить состояние UI с учетом того,
		// что данная Активность уже была видимой.
		setContentView(R.layout.activity_main);
		Toast.makeText(this, "onRestart()", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onRestart");
	}

	// Вызывается, когда Активность стала видимой
	@Override
	public void onStart() {
		super.onStart();
		// Проделать необходимые действия для
		// Активности, видимой на экране
		setContentView(R.layout.activity_main);
		Toast.makeText(this, "onStart()", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onStart");
	}

	// Должен вызываться в начале видимого состояния.
	// На самом деле Android вызывает данный обработчик только
	// для Активностей, восстановленных из неактивного состояния
	@Override
	public void onResume() {
		super.onResume();
		// Восстановить приостановленные обновления UI,
		// потоки и процессы, замороженные, когда
		// Активность была в неактивном состоянии
		setContentView(R.layout.activity_main);
		Toast.makeText(this, "onResume()", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onResume");

	}

	// Вызывается перед выходом из активного состояния,
	// позволяя сохранить состояние в объекте savedInstanceState
	@Override
	public void onSaveInstanceState(Bundle outState) {
		// Объект savedInstanceState будет в последующем
		// передан методам onCreate и onRestoreInstanceState
		super.onSaveInstanceState(outState);
		setContentView(R.layout.activity_main);
		Toast.makeText(this, "onSaveInstanceState()", Toast.LENGTH_LONG).show();
		outState.putInt("count", count);
		Log.d(TAG, "onSaveInstanceState");
	}

	// Вызывается перед выходом из активного состояния
	@Override
	public void onPause() {
		// «Заморозить» обновления UI, потоки или
		// «трудоемкие» процессы, не нужные, когда Активность
		// не на переднем плане
		super.onPause();
		setContentView(R.layout.activity_main);
		Toast.makeText(this, "onPause()", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onPause");
	}

	// Вызывается перед выходом из видимого состояния
	@Override
	public void onStop() {
		// «Заморозить» обновления UI, потоки или
		// «трудоемкие» процессы, ненужные, когда Активность
		// не на переднем плане.
		// Сохранить все данные и изменения в UI, так как
		// процесс может быть в любой момент убит системой
		super.onStop();
		setContentView(R.layout.activity_main);
		Toast.makeText(this, "onStop()", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onStop");
	}

	// Вызывается перед уничтожением активности
	@Override
	public void onDestroy() {
		// Освободить все ресурсы, включая работающие потоки,
		// соединения с БД и т. д.
		super.onDestroy();
		setContentView(R.layout.activity_main);
		Toast.makeText(this, "onDestroy()", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onDestroy");
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        setContentView(R.layout.main);
        Toast.makeText(this, "onCreateOptionsMenu", Toast.LENGTH_LONG).show();
        return true;
    }
}