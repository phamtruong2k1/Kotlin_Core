class Per {
    private int tay;

    private int chan;

    public Per() {
        tay = 1;
        chan = 2;
    }

    public Per(int tay, int chan) {
        this.tay = tay;
        this.chan = chan;
    }

    public Per(int tay) {
        this.tay = tay;
    }

    public int getTay() {
        return tay;
    }

    public void setTay(int tay) {
        this.tay = tay;
    }

    public int getChan() {
        return chan;
    }

    public void setChan(int chan) {
        this.chan = chan;
    }
}
