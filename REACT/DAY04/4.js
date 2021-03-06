import React from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import About from './routes/About'
import Home from './routes/Home'
import Header from './components/Header';
import Post from './routes/Post'
import Login from './routes/Login'
import MyProgile from './routes/MyProfile';
import Search from './routes/Search';
import NotFound from './routes/NotFound';
const App = ()=> {
  return (
    <Router>
      <Header />
      <Switch>
      <Route exact path="/" component={Home} /> 
      <Route path="/about/:userid" component={About} />
      <Route path="/post" component={Post} />
      <Route path="/search" component={Search} />
      <Route path="/login" component={Login} />
      <Route path="/myprofile" component={MyProgile} />
      <Route component={NotFound} />
      </Switch>
    </Router>
 
  );
}

export default App;
