CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department     IN VARCHAR2,
    p_bonus_percent  IN NUMBER
) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_percent / 100)
    WHERE UPPER(Department) = UPPER(p_department);

    COMMIT;
END;
/
