package com.dp.memento;

/**
 * ����¼ģʽ:�ڲ��ƻ���װ�Ե�ǰ���£�����һ��������ڲ�״̬�����ڸö���֮�Ᵽ�����״̬�������Ժ�Ϳɽ��ö���ָ���֮ǰ�����״̬��
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game(new State("��Boss", "һ��ȥ��Boss"));
		
		Memento memento = game.createMemento();
		Caretaker ct = new Caretaker();
		ct.setMemento(memento);
		
		game.play();
		game.show();
		
		game.restore(ct.getMemento());
		game.show();
	}

}
