// Create a interface named  CSE with two method named
// public void fWrite(String name,int marks,double cgpa);--It will write one student in a txt file
// public void fRead();--it read that txt file and print in the console.


interface CSE {
    public void fWrite(String name, int marks, double cgpa) throws Exception;
    public void fRead() throws Exception;
}
