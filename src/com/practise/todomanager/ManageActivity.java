package com.practise.todomanager;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class ManageActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.manage_activity);
		populateToDoList();
	}

	private void populateToDoList() {
		List<ToDo> todos = new ArrayList<>();
		ToDo t1 = new ToDo();
		t1.setActivityDate("test11");
		t1.setActivityName("test12");
		t1.setActivityPriority("test13");
		t1.setActivityStatus("test14");
		t1.setActivityTime("test15");
		ToDo t2 = new ToDo();
		t2.setActivityDate("test21");
		t2.setActivityName("test22");
		t2.setActivityPriority("test23");
		t2.setActivityStatus("test24");
		t2.setActivityTime("test25");
		ToDo t3 = new ToDo();
		t3.setActivityDate("test31");
		t3.setActivityName("test32");
		t3.setActivityPriority("test33");
		t3.setActivityStatus("test34");
		t3.setActivityTime("test35");
		ToDo t4 = new ToDo();
		t4.setActivityDate("test41");
		t4.setActivityName("test42");
		t4.setActivityPriority("test43");
		t4.setActivityStatus("test44");
		t4.setActivityTime("test45");
		ListView toDoList = (ListView) findViewById(R.id.mToDoList);
		ToDoListAdapter toDoAdapter = new ToDoListAdapter(todos, this);
		toDoList.setAdapter(toDoAdapter);
	}
	
	

	
	
}
