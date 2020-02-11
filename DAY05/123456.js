import React from 'react';
import Booklist from './containers/book-list'
import './App.css';
import BookDetail from './containers/book-detail';

function App() {
  return (
    <div className="App">
      <header className="App-header">
      <Booklist />
      <BookDetail />
      </header>
    </div>
  );
}

export default App;
