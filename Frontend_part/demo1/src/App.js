/*import './App.css';
import logo from './assets/images/image.png';
import lg from './logo.svg';
import React from 'react';
function App(){
  const styles = {
    color:"red", margin:"10px", padding:"10px"};
  const name = "Coders!"
  return(
    <div className='xyz' style={styles}>
      <div>Hey {name}</div>
      <label>Name:</label>
      <input type="text" placeholder="Enter your name"></input>
     < div><button type="submit">save</button></div>
     <img src="/logo192.png" alt="Logo" />
     <img src={logo} alt="Logo" />
     <img src={lg} alt="Logo" />
    </div>
  );
}
export default App;*/
// -------------------------------------------------------------------
/*import React from 'react';
function App() {

	// <---- javascript area ---->
  const fun1 = ()=>{
    alert("Hi, boss how are you!");
  }

  return (
  // <---- HTML/JSX area ---->
    <div
      style={{
        height: '100vh',
        display: ' flex',
        flexDirection: 'column',
        justifyContent: 'center',
        alignItems: 'center',
      }}
    >
   Hello Boss
   <button onClick={fun1}>click here😎</button>
    </div>
  );
}
export default App;*/
///////////////////////////////////////////////////////

// src/App.js
/*import React from "react";

function Child() {
  return <div>I am a child.</div>;
}

function App() {
  return <Child />;
}

export default App;*/
/*
// import [package name] from [path] Import it in this format.
import React from 'react';
// Not just js files, but images too!
import logo from './logo.svg';
import lg from './assets/images/mango.jpeg';
// CSS? Yes!
import './App.css';

function App() {
  return (
    <div className="App"> 
      <header className="App-header"> 
        <img src={lg} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="<https://reactjs.org>"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
*/
/*
function App(){
  const a = <div>
    <h1>Hello!</h1>
    <p>Here's the halfway point!</p>
  </div>;
const number = 5;
  return(
    <div>
      {a}
      <p>{number>10?number+' is greater than 10':number+' is less than 10'}</p>
    </div>
  );
}
export default App;
*/

// src/App.js
/*
import React from "react";

function App() {
  const c = 'My appp'
  return <GrandFather ap={c}/>;
}

function GrandFather(props) {
  const name='Grand pa'
  return <Mother gnm={name}{...props}/>;
}

function Mother(props) {
	const name = 'Mummy';
  return <Child nm={name}{...props}/>;
}

function Child(props) {
  return <div>Connection successful {props.nm}{props.gnm}{props.ap }</div>;
}
export default App;
*/

export default function App() {
  return (
    <div className="App">
      <FirstComponent content="Who needs me?" />
    </div>
  );
}

function FirstComponent({ content }) {
  return (
    <div>
      <h3>I am the first component</h3>;
      <SecondComponent content={content} />|
    </div>
  );
}

function SecondComponent({ content }) {
  return (
    <div>
      <h3>I am the second component</h3>;
      <ThirdComponent content={content} />
    </div>
  );
}

function ThirdComponent({ content }) {
  return (
    <div>
      <h3>I am the third component</h3>;
      <ComponentNeedingProps content={content} />
    </div>
  );
}

function ComponentNeedingProps({ content }) {
  return <h3>{content}</h3>;
}