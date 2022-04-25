/**
* Test class for the JUnit tests that are testing different parts of  RPG game software.
*
* @author olipunov
*/

package test.java;


import main.java.baselasses.Hunter;
import main.java.baseunits.Player;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Class for JUnit testing page for RPG desktop application.
 * @author : Oleg Lipunov
 * @version : 4/24/2022, Sunday
 **/
public class test {

    // For Player class
    private Player current;
    private Hunter hunter;
//    private CalendarDate pastDate;
//    private CalendarDate futureDate;
//    private CalendarDate dateToday;
//    private CalendarDate startDate;
//    private CalendarDate endingDate;
//    private Project testProject;
//    private TableMap testTable1;
//    private LoginPage myPage;
//    private HashMap<String,String> nameAndPass;
//    IDandPasswords iDandPasswords;
//
    @org.junit.Before
    public void beforeMethod() throws Exception {
        current = new Hunter("Oleg");
    }
//
//
//        /**
//         * TEST CASE 1-4:  Checking CalendarDate class
//         * @author ahsu5
//         */
//        current = new CalendarDate();
//        pastDate = new CalendarDate(12,3,2000);
//        futureDate = new CalendarDate(12,3,2200);
//        dateToday = new CalendarDate();
//
//        /**
//         * TEST CASE 5-8:  Checking TableMap class
//         * @author tchapis
//         */
//        TableModel testModel = new AbstractTableModel() {
//            private static final long serialVersionUID = 1L;
//            public int getColumnCount() {
//                return 10;
//                }
//            public int getRowCount() {
//                return 10;
//                }
//            public Object getValueAt(int row, int col) {
//                return Integer.valueOf(row*col);
//                }
//        };
//        testTable1 = new TableMap();
//        testTable1.setModel(testModel);
//
//        /**
//         * TEST CASE 12-16:  Checking Login, add, register, contains, exists, custom assumtions.
//         * @author olipunov
//         */
//
//        iDandPasswords = new IDandPasswords("src/main/resources/util/passwords.txt");
//        nameAndPass = new HashMap<String,String>();
//        myPage = new LoginPage(nameAndPass);
//
//        /**
//         * TEST CASE 9-12:
//         * @author ncortesa
//         */
//        startDate = new CalendarDate(04,05,2022);
//        endingDate = new CalendarDate(04,10,2022);
//        Element root = new Element("PROJECTS");
//        Element el = new Element("project-list");
//        el.addAttribute(new Attribute("id", "123"));
//        el.addAttribute(new Attribute("title", "new title"));
//        el.addAttribute(new Attribute("description", "testing"));
//        el.addAttribute(new Attribute("startDate", "date"));
//        el.addAttribute(new Attribute("endDate", "date"));
//        root.appendChild(el);
//        testProject = new ProjectImpl(el);
//        testProject.setTitle("new title");
//        testProject.setDescription("testing");
//        testProject.setStartDate(startDate);
//        testProject.setEndDate(endingDate);
//    }
//
//
//
    /**
     * Tear down method to dispose of player object after each test
     * @author oleg
     * @throws java.lang.Exception  Throws general exception
     */
    @org.junit.After
    public void afterMethod() {
        // Date Tests
        current = null;
//        pastDate=null;
//        futureDate=null;
//        dateToday=null;
//        nameAndPass = null;
//        myPage = null;
//        //ProjectImpl tests
//        testProject = null;
//        // TableMap tests
//        testTable1 = null;
//
    }
//
    @Rule
    public ExpectedException thrown= ExpectedException.none();

    /**
     * TEST CASE 1:  Checking CalendarDate class if the current date before,after or equal to
     * the future date return correctly outcome
     * @author ahsu5
     */
    @Test
    public void testBefore() {
        Assert.assertTrue(current.getName().equals("Oleg"));
//        Assert.assertFalse(current.after(futureDate));
//        Assert.assertFalse(current.equals(futureDate));
    }
//
//    /**
//     * TEST CASE 2:  Checking CalendarDate class if the current date before,after or equal to
//     * the past date return correctly outcome
//     * @author ahsu5
//     */
//    @Test
//    public void testAfter() {
//        Assert.assertFalse(current.before(pastDate));
//        Assert.assertTrue(current.after(pastDate));
//        Assert.assertFalse(current.equals(pastDate));
//    }
//
//    /**
//     * TEST CASE 3:  Checking CalendarDate class if the current date before,after or equal to
//     * the past date return correctly outcome
//     * @author ahsu5
//     */
//
//    @Test
//    public void testCurrentDay() {
//        Assert.assertFalse(current.before(dateToday));
//        Assert.assertFalse(current.after(dateToday));
//        Assert.assertTrue(current.equals(dateToday));
//    }
//
//    /**
//     * TEST CASE 4:  Checking CalendarDate class if the current date is inside the period of the target date
//     * return correctly outcome
//     * @author ahsu5
//     */
//
//    @Test
//    public void testInPeriod() {
//        Assert.assertTrue(current.inPeriod(pastDate,futureDate));
//        Assert.assertFalse(current.inPeriod(futureDate,pastDate));
//        Assert.assertTrue(current.inPeriod(dateToday,futureDate));
//    }
//
//    /**
//     * TEST CASE 5:  Checking empty table testTable2 for Col 4 and Row 3 value, should be 4*3 = 12
//     * @author tchapis
//     */
//    @Test
//    public void testTableMapGetValueAt() {
//        int expected = 12;
//        Assert.assertEquals(expected, testTable1.getValueAt(4,3));
//    }
//
//
//    /**
//     * TEST CASE 6:  Testing TableMap getColumnName() on testTable1, should be "E" at column 4.
//     * @author tchapis
//     */
//    @Test
//    public void testTableMapGetColumnName() {
//        String expected = "E";
//        Assert.assertEquals(expected, testTable1.getColumnName(4));
//    }
//
//    /**
//     * TEST CASE 7:  Testing TableMap getRowCount() on testTable2, should be 10.
//     * @author tchapis
//     */
//    @Test
//    public void testTableMapGetRowCount() {
//        int expected = 10;
//        Assert.assertEquals(expected, testTable1.getRowCount());
//    }
//
//    /**
//     * TEST CASE 8: Testing the getColumnCount() on a null table testTable3, should be 10.
//     * @author tchapis
//     */
//    @Test
//    public void testTableMapGetColumnCount() {
//        int expected = 10;
//        Assert.assertEquals(expected, testTable1.getColumnCount());
//    }
//
//    /**
//     * TEST CASE 9: Testing getStartDate(), should return true
//     * @author ncortesa
//     */
//    @Test
//    public void testGettingStartDateOfProject() {
//        CalendarDate expected = endingDate;
//        Assert.assertTrue(expected.after(testProject.getStartDate()));
//    }
//
//    /**
//     * TEST CASE 10: Testing getEndDate(), should return true
//     * @author ncortesa
//     */
//    @Test
//    public void testGettingEndDateOfProject() {
//        CalendarDate expected = startDate;
//        Assert.assertTrue(expected.before(testProject.getEndDate()));
//    }
//
//    /**
//     * TEST CASE 11: Testing the getDescription(), should return string "testing"
//     * @author ncortesa
//     */
//    @Test
//    public void testGettingDescriptionOfProject() {
//        String expected = "testing";
//        Assert.assertEquals(expected, testProject.getDescription());
//    }
//
//    /**
//     * TEST CASE 12: Testing the getTitle(), should return "new title"
//     * @author ncortesa
//     */
//    @Test
//    public void testGettingTitleOfProject() {
//        String expected = "new title";
//        Assert.assertEquals(expected, testProject.getTitle());
//    }
//
//        /**
//     * Test Case 13: Checking the hardcoded default constructor for LoginPage.java class
//     * @author olipunov
//     */
//    @Test
//    public void testImage(){
//        Assert.assertTrue(myPage.loadImages());
//        Assert.assertFalse(!myPage.loadImages());
//        thrown.expect(NullPointerException.class);
//        throw new NullPointerException();
//    }
//
//    /**
//     * Test Case 14: Checking the dynamic parametrized constructor for LoginPage.java class
//     * @author olipunov
//     */
//    @Test
//    public void testDynamicImage() throws Exception{
//        myPage = new LoginPage(nameAndPass);
//        String i = "src/main/resources/ui/gt1.png";
//        String i2 = "src/main/resources/ui/gt2.png";
//        String i3 = "src/main/resources/ui/gt4.png";
//        String i4 = "src/main/resources/ui/splash.png";
//        try {
//            Assert.assertTrue(myPage.loadImages(i, i2, i3, i4));
//        }
//        catch (Exception e){
//            Assert.assertTrue(true);
//        }
//    }
//
//    /**
//     * Test Case 15: Checking the validity of exception handling for incorrect file path
//     * @author olipunov
//     */
//    @Test
//    public void testDynamicImageWithFail() throws Exception{
//        myPage = new LoginPage(nameAndPass);
//        String i = "what.png";
//        String i2 = "doesNotExist.png";
//        String i3 = "shouldNotHappen.png";
//        String i4 = "fileNotFound";
//
//        try {
//            myPage.loadImages(i, i2, i3, i4);
//        }
//        catch (IIOException e){
//            Assert.fail();
//        }
//    }
//
//    /**
//     * Test Case 16: Checking functionality of IDandPassword Class.
//     * making sure user register works, and updates .txt and hash map accordingly
//     * Load this file and test methods
//     * Load the Hash Map
//     * check the Map to contain proper fields
//     * update map
//     * @author olipunov
//     */
////    @Test
////    public void testIDandPassword() throws IOException {
////        nameAndPass = iDandPasswords.getLoginInfo();
////        Assert.assertTrue(nameAndPass.containsKey("oleg"));
////        Assert.assertTrue(iDandPasswords.register("bob", "123"));
////        nameAndPass = iDandPasswords.getLoginInfo();
////        Assert.assertTrue(nameAndPass.containsKey("bob"));
////        Assert.assertFalse(iDandPasswords.userExist("frank"));
////        Assert.assertTrue(iDandPasswords.addUser("frank","123abc"));
////        Assert.assertFalse(iDandPasswords.userExist("frank"));
////    }
}
