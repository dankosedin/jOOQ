/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources;

/**
 * This class is generated by jOOQ.
 */
public class HumanResources extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -2081613650;

	/**
	 * The singleton instance of HumanResources
	 */
	public static final HumanResources HumanResources = new HumanResources();

	/**
	 * No further instances allowed
	 */
	private HumanResources() {
		super("HumanResources");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.Department,
			org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee,
			org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeeAddress.EmployeeAddress,
			org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeeDepartmentHistory.EmployeeDepartmentHistory,
			org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory,
			org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate.JobCandidate,
			org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Shift.Shift,
			org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployee.vEmployee,
			org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment,
			org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartmentHistory.vEmployeeDepartmentHistory,
			org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidate.vJobCandidate,
			org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation,
			org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEmployment.vJobCandidateEmployment);
	}
}