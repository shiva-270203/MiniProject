import axios from "axios";
import { useState } from "react";


function Search(){
  //  interface stud{
  //   id:String,name:String,math:Int8Array,social:Int8Array,science:Int8Array,mathRes:String,scienceRes:String,socialRes:String,res:String
  //   }
    const [student,setStudent]=useState({id:"",name:"",math:0,social:0,science:0,mathRes:"",scienceRes:"",socialRes:"",res:""
    });
    
    const handleSubmit=(event:any)=>{
        event.preventDefault();
        axios.get("http://localhost:8080/stu/"+student.id).
        then((response)=>setStudent(response.data)).
        catch((error)=>console.log(error));

        
    };
    

    return <div>
        <div className="d-flex flex-column justify-content-center align-items-center mt-5">
      <div>
        <h1>Search</h1>
      </div>
      <div className="rounded shadow p-4">
        <form className="mx-5" method="get">
          <label className="m-2 flex-column justify-content-center align-itmes-center">Roll No</label>
          <input type="text"onClick={(e)=>setStudent({...student,id:e.currentTarget.value})} placeholder="Enter Your Roll No" />
          <br />
          <br />
          
          <input type="submit" value="Submit" className="btn btn-success" onClick={handleSubmit} />
        </form>
      </div>

            <table className="w-75 rounded shadow m-5 pl-5 ">
                <thead >
                    <th className="p-3">Id</th>
                    <th>Name</th>
                    <th>Math</th>
                    <th>Science</th>
                    <th>Social</th>
                    <th>Result</th>
                </thead>
                <tbody className="m-5">
                    <td>{student.id}</td>
                    <td>{student.name}</td>
                    <td >{student.math} {student.mathRes}</td>
                    <td>{student.science} {student.scienceRes}</td>
                    <td>{student.social} {student.socialRes}</td>
                    <td>{student.res}</td>
                    
                </tbody>
            </table>
        

    </div>
    </div>
}
export default Search;