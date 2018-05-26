package shyeang.mybatis.bean.enums;

public enum Sex {
    男("男", 0),
    女("女", 1);

    int Code;
    String sexName;

    public int getCode() {
        return Code;
    }

    public String getSexName() {
        return sexName;
    }

    public void setCode(int code) {
        Code = code;
    }

    public void setSexName(String name) {
        sexName = name;
    }

    Sex(String name, int code){
            Code = code;
        sexName = name;
        }

    @Override
    public String toString() {
        return sexName;
    }
    public static Sex getSex(String name){
        for(Sex s:Sex.values()){
            if(s.getSexName().equals(name)){
                return  s;
            }
        }
        return  null;
    }
}
