import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    // Student matriculado

    @Test
    public void naoDeveMatricularStudentMatriculado() {
        assertFalse(student.matricular());
    }

    @Test
    public void deveFormarStudentMatriculado() {
        student.setState(new StudentStateMatriculado());
        assertTrue(student.formar());

    }

    @Test
    public void deveTrancarStudentMatriculado() {
        student.setState(new StudentStateMatriculado());
        assertTrue(student.trancar());

    }

    @Test
    public void deveJubilarStudentMatriculado() {
        student.setState(new StudentStateMatriculado());
        assertTrue(student.jubilar());
    }

    @Test
    public void deveEvadirStudentMatriculado() {
        student.setState(new StudentStateMatriculado());
        assertTrue(student.evadir());
    }

    @Test
    public void deveTransferirStudentMatriculado() {
        student.setState(new StudentStateMatriculado());
        assertTrue(student.transferir());
    }

    // Student trancado

    @Test
    public void deveMatricularStudentTrancado() {
        student.setState(new StudentStateTrancado());
        assertTrue(student.matricular());
    }

    @Test
    public void naoDeveFormarStudentTrancado() {
        student.setState(new StudentStateTrancado());
        assertFalse(student.formar());
    }

    @Test
    public void naoDeveTrancarStudentTrancado() {
        student.setState(new StudentStateTrancado());
        assertFalse(student.trancar());
    }

    @Test
    public void naoDeveJubilarStudentTrancado() {
        student.setState(new StudentStateTrancado());
        assertFalse(student.jubilar());
    }

    @Test
    public void deveEvadirStudentTrancado() {
        student.setState(new StudentStateTrancado());
        assertTrue(student.evadir());
    }

    @Test
    public void deveTransferirStudentTrancado() {
        student.setState(new StudentStateTrancado());
        assertTrue(student.transferir());
    }

    // Student formado

    @Test
    public void naoDeveMatricularStudentFormado() {
        student.setState(new StudentStateFormado());
        assertFalse(student.matricular());
    }

    @Test
    public void naoDeveFormarStudentFormado() {
        student.setState(new StudentStateFormado());
        assertFalse(student.formar());
    }

    @Test
    public void naoDeveTrancarStudentFormado() {
        student.setState(new StudentStateFormado());
        assertFalse(student.trancar());
    }

    @Test
    public void naoDeveJubilarStudentFormado() {
        student.setState(new StudentStateFormado());
        assertFalse(student.jubilar());
    }

    @Test
    public void naoDeveEvadirStudentFormado() {
        student.setState(new StudentStateFormado());
        assertFalse(student.evadir());
    }

    @Test
    public void naoDeveTransferirStudentFormado() {
        student.setState(new StudentStateFormado());
        assertFalse(student.transferir());
    }

    // Student jubilado

    @Test
    public void naoDeveMatricularStudentJubilado() {
        student.setState(new StudentStateJubilado());
        assertFalse(student.matricular());
    }

    @Test
    public void naoDeveFormarStudentJubilado() {
        student.setState(new StudentStateJubilado());
        assertFalse(student.formar());
    }

    @Test
    public void naoDeveTrancarStudentJubilado() {
        student.setState(new StudentStateJubilado());
        assertFalse(student.trancar());
    }

    @Test
    public void naoDeveJubilarStudentJubilado() {
        student.setState(new StudentStateJubilado());
        assertFalse(student.jubilar());
    }

    @Test
    public void naoDeveEvadirStudentJubilado() {
        student.setState(new StudentStateJubilado());
        assertFalse(student.evadir());
    }

    @Test
    public void naoDeveTransferirStudentJubilado() {
        student.setState(new StudentStateJubilado());
        assertFalse(student.transferir());
    }

    // Student evadido

    @Test
    public void naoDeveMatricularStudentEvadido() {
        student.setState(new StudentStateEvadido());
        assertFalse(student.matricular());
    }

    @Test
    public void naoDeveFormarStudentEvadido() {
        student.setState(new StudentStateEvadido());
        assertFalse(student.formar());
    }

    @Test
    public void naoDeveTrancarStudentEvadido() {
        student.setState(new StudentStateEvadido());
        assertFalse(student.trancar());
    }

    @Test
    public void naoDeveJubilarStudentEvadido() {
        student.setState(new StudentStateEvadido());
        assertFalse(student.jubilar());
    }

    @Test
    public void naoDeveEvadirStudentEvadido() {
        student.setState(new StudentStateEvadido());
        assertFalse(student.evadir());
    }

    @Test
    public void naoDeveTransferirStudentEvadido() {
        student.setState(new StudentStateEvadido());
        assertFalse(student.transferir());
    }

    // Student transferido

    @Test
    public void naoDeveMatricularStudentTransferido() {
        student.setState(new StudentStateTransferido());
        assertFalse(student.matricular());
    }

    @Test
    public void naoDeveFormarStudentTransferido() {
        student.setState(new StudentStateTransferido());
        assertFalse(student.formar());
    }

    @Test
    public void naoDeveTrancarStudentTransferido() {
        student.setState(new StudentStateTransferido());
        assertFalse(student.trancar());
    }

    @Test
    public void naoDeveJubilarStudentTransferido() {
        student.setState(new StudentStateTransferido());
        assertFalse(student.jubilar());
    }

    @Test
    public void naoDeveEvadirStudentTransferido() {
        student.setState(new StudentStateTransferido());
        assertFalse(student.evadir());
    }

    @Test
    public void naoDeveTransferirStudentTransferido() {
        student.setState(new StudentStateTransferido());
        assertFalse(student.transferir());
    }


}