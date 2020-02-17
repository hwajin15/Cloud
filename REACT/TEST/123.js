import React, { Component } from 'react';
import Form from './components/form';
import List from './components/todoitemlist';

class App extends Component {
  id =1;
  state = {
    contacts : [
      {
        id : 0,
        todo : '리액트 소개'
      }
    ],
  }
  handleCreate = (data) => {
    const { contacts } = this.state;
    this.setState({
      contacts: contacts.concat({id: this.id++, ...data})
    })
  } 
  handleRemove = (id) => {
    const { contacts } = this.state;

    this.setState({
      contacts: contacts.filter(
        info => info.id !== id
      )
    });
  }
  render() {
    
    return ( 
      <div className="App-header">
        오늘의 할일
        <Form 
          onCreate = {this.handleCreate}
        />

        <List
          data = {this.state.contacts}
          onRemove = {this.handleRemove}  
        />
      </div>
    );
  }
}

export default App;