/*
* Class Duration
*
* 03/04/17
*/
package DirectionModel;

public class Duration {

    public String getText() {

        return text;
    }

    public void setText(String text) {

        this.text = text;
    }

    public int getValue() {

        return value;
    }

    public void setValue(int value) {

        this.value = value;
    }

    private String text;
    private int value;

    public Duration(String text, int value) {

        this.text = text;
        this.value = value;
    }
}
