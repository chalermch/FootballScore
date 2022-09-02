/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballscore;

/**
 *
 * @author Admin
 */
public class FootBallScore implements MyObserver {

    @Override
    public void update(Source o) {
        System.out.println(
                "live result : "
                + ((ReportScore) o).getSomeData());
    }

}
