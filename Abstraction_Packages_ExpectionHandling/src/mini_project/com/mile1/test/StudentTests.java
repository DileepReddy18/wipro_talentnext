package mini_project.com.mile1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import mini_project.com.mile1.bean.Student;
import mini_project.com.mile1.exception.NullMarksArrayException;
import mini_project.com.mile1.exception.NullNameException;
import mini_project.com.mile1.exception.NullStudentObjectException;
import mini_project.com.mile1.service.StudentReport;
import mini_project.com.mile1.service.StudentService;


public class StudentTests {

    Student data[] = new Student[4];

    StudentReport sr = new StudentReport();
    StudentService ss = new StudentService();

    {
        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = null;
        data[3] = new Student("John", null);
    }

    // TC1: Valid - A grade
    @Test
    public void testGradeA() throws Exception {
        assertEquals("A", sr.findGrades(data[0]));
    }

    // TC2: Valid - D grade
    @Test
    public void testGradeD() throws Exception {
        Student s = new Student("Tom", new int[] {35, 40, 45});
        assertEquals("D", sr.findGrades(s));
    }

    // TC3: Valid - F grade
    @Test
    public void testGradeF() throws Exception {
        Student s = new Student("Bob", new int[] {10, 20, 30});
        assertEquals("F", sr.findGrades(s));
    }

    // TC4: Null student object
    @Test
    public void testNullStudentObjectException() {
        assertThrows(NullStudentObjectException.class, () -> {
            sr.findGrades(data[2]);
        });
    }

    // TC5: Null student name
    @Test
    public void testNullNameException() {
        assertThrows(NullNameException.class, () -> {
            sr.findGrades(data[1]);
        });
    }

    // TC6: Null marks array
    @Test
    public void testNullMarksArrayException() {
        assertThrows(NullMarksArrayException.class, () -> {
            sr.findGrades(data[3]);
        });
    }

    // TC7: Count of null names
    @Test
    public void testFindNumberOfNullNames() {
        assertEquals(1, ss.findNumberOfNullName(data));
    }

    // TC8: Count of null student objects
    @Test
    public void testFindNumberOfNullObjects() {
        assertEquals(1, ss.findNumberOfNullObjects(data));
    }

    // TC9: Count of null marks arrays
    @Test
    public void testFindNumberOfNullMarks() {
        assertEquals(1, ss.findNumberOfNullMarksArray(data));
    }
}