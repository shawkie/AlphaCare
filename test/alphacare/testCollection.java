/*
 * Remove unused code! Trust the process.
 */
package alphacare;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Jeffrey Oh
 */
//alphacare.your test name. class
@RunWith(Suite.class)
@Suite.SuiteClasses(
{alphacare.PatientModelTest.class,
alphacare.RecordListModelTest.class,
alphacare.StaffModelTest.class,
alphacare.PatientListModelTest.class,
alphacare.UserListModelTest.class}
)
public class testCollection {
    
}
