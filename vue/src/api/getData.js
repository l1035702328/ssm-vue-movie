import axios from 'axios'
export const login = data => axios.post('http://localhost:8080/admin/login',data);
export const getMovies = () => axios.get('http://localhost:8080/movies');
