import React, {useEffect, useState} from 'react';
import axios from 'axios';
import './App.css';

function App() {

  const [connect, setConnect] = useState("")
  useEffect(() => {
    axios.get("/index")
        .then((res)=>{
          setConnect(res.data);
        })
        .catch(err=>{
          console.log("err :", err)
        })
  }, []);

  return (
    <div className="test">
      백데이터 :: {connect}
    </div>
  );
}

export default App;
