public class LandLine implements Phone{
    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public LandLine(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.isRinging = false;
        this.isPowerOn = true;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerON() {
        this.isPowerOn=true;
    }

    @Override
    public void callNumber(String phoneNo) {
        if(isPowerOn){
            System.out.println("You are dialing the no:"+phoneNo);
        }
        else {
            System.out.println("Your LandLine is off");
        }
    }

    @Override
    public void receiveCall(String phoneNo) {
        if(isPowerOn && myPhoneNo.equals(phoneNo)){
            System.out.println("your phone "+myPhoneNo+" is ringing");
            isRinging=true;
        }
        else{
            System.out.println("Switched off");
        }
    }

    @Override
    public boolean answerCall() {
        if(isRinging){
            System.out.println("call answered");
            isRinging=false;
            return  true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
