package exp03;

public class SimpleCalcuator {
	private float first;
	private float second;
	private String operator;
	private float result;
	
	public SimpleCalcuator() {
	}

	public float getFirst() {
		return first;
	}

	public void setFirst(float first) {
		this.first = first;
	}

	public float getSecond() {
		return second;
	}

	public void setSecond(float second) {
		this.second = second;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}
	
	public float calculate(float first,float second,String operator) {
		switch(operator) {
			case "+": result=first+second;break;
			case "-": result=first-second;break;
			case "*": result=first*second;break;
			case "/": result=first/second;break;
			default: ;break;
		}
		return result;
	}
	
	public SimpleCalcuator(float first,float second,String operator,float result) {
		this.first = first;
		this.second = second;
		this.operator = operator;
		this.result = result;
	}
	
}
