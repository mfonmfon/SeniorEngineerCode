package ObjectInputStreamExample;

import java.io.Serializable;

public class Cat  implements Serializable {

    private String mew;
    private String age;

    public Cat(String mew, String age){
        this.mew = mew;
        this.age = age;

    }

    public String getMew() {
        return mew;
    }

    public void setMew(String mew) {
        this.mew = mew;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
