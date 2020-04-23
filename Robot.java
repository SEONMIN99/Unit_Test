
/**
 * 로봇 보행속도를 변경하는 Robot클래스
 * 
 * @author (2017315038 이수정, 2018315040 김선민) 
 * @version (2020년 4월 23일)
 */
public class Robot
{
    private double speed;
    public void Robotwalk(String signal, double speed){
        if (signal == "녹색")
        {
            this.speed = speed;
        }
        else
        {
            if(signal == "노란색")
            {
                this.speed = speed * 1.2;
            }
            else        
            {
                this.speed = 0;
            }
        }
    }
    
    public double getSpeed(){
        return this.speed;   
    }
}
