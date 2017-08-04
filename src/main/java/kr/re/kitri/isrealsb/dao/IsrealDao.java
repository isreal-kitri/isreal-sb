/**
 * Created by danawacomputer on 2017-08-04.
 */

package kr.re.kitri.isrealsb.dao;

import kr.re.kitri.isrealsb.model.SampleUser;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class IsrealDao {

    public SampleUser selectUserByUsername(String username) {

        List<SampleUser> sampleUserList = new ArrayList<>();
        SampleUser returnUser = new ;

        sampleUserList.add(new SampleUser("cusonar", "1234", "YCU", true, true, true, true));
        sampleUserList.add(new SampleUser("abc", "abcd", "ABC", true, true, true, true));

        for (SampleUser e : sampleUserList) {
           if (e.getUsername().equals(username)) {

           }
        }

        return null;
    }
}
