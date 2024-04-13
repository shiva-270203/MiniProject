import axios, { AxiosResponse } from "axios";
import { useState } from "react";
import { Link, useNavigate } from "react-router-dom";

function Login(){

    const [login, setLogin] = useState({username:'',password:''});
      const navigate=useNavigate();
    const handleSubmit=(event:any)=>{
        event.preventDefault();
        axios.post("http://localhost:8080/login",login).then((response)=>onLogin(response)).catch((error)=>console.log(error));
    };
    const [text,setText]=useState();
    function onLogin(response: AxiosResponse<any, any>){
      console.log(response.data);
       setText(response.data);
      navigate("/Search");
    }
return (
<div>
<div className="d-flex flex-column justify-content-center align-items-center mt-5">
      <div>
        <h1>Login</h1>
      </div>
      <div className="rounded shadow p-4">
        <form className="mx-5">
          <label className="m-2 flex-column justify-content-center align-itmes-center">Username</label>
          <input type="text"onChange={(e)=>setLogin({...login,username:e.target.value})} placeholder="Enter name" />
          <br />
          <br />
          <label className="m-2">Password</label>
          <input type="password"onChange={(e)=>setLogin({...login,password:e.target.value})} placeholder="Enter password" />
          <br />
          <br />
          
          <input type="submit" value="Submit" className="btn btn-success" onClick={handleSubmit} />
        <div className="">{text}</div>
          <div ><Link to="/Signup">Sign Up?</Link></div>
        </form>
      </div>
    </div>
    
</div>
);
}
export default Login;