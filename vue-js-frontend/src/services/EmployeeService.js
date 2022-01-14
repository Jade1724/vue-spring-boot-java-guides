import axios from 'axios'

const EMPLOYEE_API_BASE_URL = 'http://localhost:8080/api/employees'

class EmployeesService {
    getEmployees() {
        return axios.get(EMPLOYEE_API_BASE_URL);
    }
}

export default new EmployeesService()