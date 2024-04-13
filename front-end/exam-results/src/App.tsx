import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "./components/Home";
import Login from "./components/Login/Login";
import Search from "./components/Search/Search";
import Signup from "./components/Signup/Signup";

function App(){
  return (
    <div>
    <BrowserRouter>
     <Routes>
      <Route path="/Home" element={<Home/>}/>
      <Route path="/" element={<Login/>}/>
      <Route path="/Signup" element={<Signup/>}/>
      <Route path="/Search" element={<Search/>}/>

  
     </Routes>
     </BrowserRouter>
     </div>
    )
}
export default App;