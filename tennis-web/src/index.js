import React from "react";
import ReactDOM from "react-dom";
import App from "./App";
import  "./assets/css/app.css";
import About from './containers/About/About'
import 'bootstrap/dist/css/bootstrap.min.css';
// const myApp = () => <p>Componente funcional</p>;


// ReactDOM.render(myApp(),document.getElementById("app"));
//                 //qué , dónde
// class App extends Component {
//     render(){
//         return (
//             <p>Será pei</p>
//         )
//     }
// }
ReactDOM.render(<App/>,document.getElementById("app"));