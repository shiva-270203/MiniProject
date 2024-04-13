import axios from "axios";
import { useEffect, useState } from "react";

export function Home() {
  type student ={
    id: String;
    name: String;
    clg: String;
    branch: String;
    math: Int8Array;
    science: Int8Array;
    social: Int8Array;

  };
  const [errorMsg, setErrorMsg] = useState<string>("");
  const [studentData, setStudentData] = useState<student[]>([]);
  useEffect(() => {
    axios
      .get("http://localhost:8080/stus")
      .then((res) => {
        console.log(res);
        setStudentData(res.data);
      })
      .catch((error) => {
        console.log(error);

        setErrorMsg(error.message);
      });
  }, []);

  return (

    <div>
      {errorMsg}

      <div className="d-flex flex-column align-items-center">
        <h1>Student Details</h1>

        <div className="w-75 rounded shadow p-4">
          <table className="table ">
            <thead>
              <tr>
                <th scope="col">Id</th>
                <th scope="col">Name</th>
                <th scope="col">Branch</th>
                <th scope="col">Clg</th>
                <th>Math Marks</th>
                <th>science Marks</th>
                <th>social Marks</th>
              </tr>
            </thead>
            <tbody>
              {studentData.map((studen) => (
                <tr>
                  <th scope="row">{studen.id}</th>
                  <td>{studen.name}</td>
                  <td>
                    {studen.branch}
                  </td>
                  <td>{studen.clg}</td>
                  <td>{studen.math}</td>
                  <td>{studen.science}</td>
                  <td>{studen.social}</td>

                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
    </div>

  );
}
export default Home;