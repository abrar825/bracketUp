import logo from "./resources/logo.svg";
import "./App.css";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

import Home from "./views/Home";
import EnterContest from "./views/EnterContest";

function App() {
  return (
    <Router>
      <Routes>
        <Route exact path="/" Component={Home}></Route>
        <Route path="/enterContest" Component={EnterContest}></Route>
      </Routes>
    </Router>
  );
}

export default App;
