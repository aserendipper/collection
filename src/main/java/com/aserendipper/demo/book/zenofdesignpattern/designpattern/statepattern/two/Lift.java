package com.aserendipper.demo.book.zenofdesignpattern.designpattern.statepattern.two;

public class Lift implements ILift {
    private int state;
    @Override
    public void setState(int state) {
        this.state = state;
    }
    //电梯门开启
    @Override
    public void open() {
        //电梯在什么状态下才能开启
        switch (this.state) {
            case OPENING_STATE:
                //do nothing
                break;
            case CLOSING_STATE:
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                //do nothing
                break;
            case STOPPING_STATE:
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
            default:
                break;
        }
    }
    //电梯门关闭
    @Override
    public void close() {
        //电梯在什么状态下才能关闭
        switch (this.state) {
            case OPENING_STATE:
                this.closeWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                //do nothing
                break;
            case RUNNING_STATE:
                //do nothing
                break;
            case STOPPING_STATE:
                //do nothing
                break;
            default:
                break;
        }
    }
    //电梯开始运行起来
    @Override
    public void run() {
        //电梯在什么状态下才能运行
        switch (this.state) {
            case OPENING_STATE:
                //do nothing
                break;
            case CLOSING_STATE:
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                //do nothing
                break;
            case STOPPING_STATE:
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
            default:
                break;
        }
    }
    //电梯停止
    @Override
    public void stop() {
        //电梯在什么状态下才能停止
        switch (this.state) {
            case OPENING_STATE:
                //do nothing
                break;
            case CLOSING_STATE:
                this.stopWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case RUNNING_STATE:
                this.stopWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case STOPPING_STATE:
                //do nothing
                break;
            default:
                break;
        }
    }
    //纯粹的电梯关门，不考虑实际的逻辑
    private void closeWithoutLogic() {
        System.out.println("电梯门关闭...");
    }
    //纯粹的电梯开门，不考虑实际的逻辑
    private void openWithoutLogic() {
        System.out.println("电梯门开启...");
    }
    //纯粹的运行，不考虑实际的逻辑
    private void runWithoutLogic() {
        System.out.println("电梯上下运行起来...");
    }
    //纯粹的停止，不考虑实际的逻辑
    private void stopWithoutLogic() {
        System.out.println("电梯停止了...");
    }
}
