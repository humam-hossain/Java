public abstract class Cricket{
    String cricketerName, seriesName;
    int totalRun, totalMatch;

    Cricket(String cricketerName, int totalRun, String seriesName, int totalMatch){
        this.cricketerName = cricketerName;
        this.totalRun = totalRun;
        this.seriesName = seriesName;
        this.totalMatch = totalMatch;
    }

    abstract Cricketer highestODI(Cricketer[] data) throws Exception;
    abstract void t20Series(Cricketer[] data) throws Exception;
}


