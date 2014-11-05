package com.practise.todomanager;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ToDoListAdapter extends BaseAdapter{
	
	private List<ToDo> toDoList;
	private Context context;
	private LayoutInflater inflater;
	
	public ToDoListAdapter(List<ToDo> toDoList, Context context) {
		this.toDoList = toDoList;
		this.context = context;
		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		return toDoList.size();
	}

	@Override
	public Object getItem(int position) {
		return toDoList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		if(view == null)
			view = inflater.inflate(R.layout.todolistview, parent);
		ToDo todo = toDoList.get(position);
		TextView todoItemName = (TextView) view.findViewById(R.id.todoitemname);
		TextView todoStatus = (TextView) view.findViewById(R.id.todoitemstatus);
		TextView todoDate = (TextView) view.findViewById(R.id.tododate);
		TextView todoTime = (TextView) view.findViewById(R.id.todotime);
		TextView todoPriority = (TextView) view.findViewById(R.id.todoitempriority);
		todoItemName.setText(todo.getActivityName());
		todoStatus.setText(todo.getActivityStatus());
		todoDate.setText(todo.getActivityDate());
		todoTime.setText(todo.getActivityTime());
		todoPriority.setText(todo.getActivityPriority());
		
		return view;
	}

	
}
