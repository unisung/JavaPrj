package ch08;

//Generic을 사용한 코드
public class Box2<T> {
	private T value;

	public T getValue() {
		return value;
	}

  public void setValue(T value) {
		this.value = value;
	}
}
