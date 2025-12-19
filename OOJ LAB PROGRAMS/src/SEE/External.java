package SEE;
/* */
import CIE.Personal;
public class External extends Personal{
    public int externals[]=new int[5];
    public External(int USN, int sem, String name,int sARR[]) 
    {
        super(USN, sem, name);
        for(int i=0;i<5;i++)
            {
                this.externals[i]=sARR[i];
            }
    }

}
