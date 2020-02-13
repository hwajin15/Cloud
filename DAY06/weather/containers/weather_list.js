import React, { Component } from 'react';
import { connect } from 'react-redux';
import Chart from '../components/chart';

class WeatherList extends Component {
renderweater(cityData){
   console.log(cityData);
  const name =cityData.city.name;
  const country =cityData.city.country;
  const temps =cityData.list.map(weather => weather.main.temp);
  const pressures =cityData.list.map(weather => weather.main.pressure);
  const humidity =cityData.list.map(weather => weather.main.humidity);
  return (
    <tr key ={name}>
      <td>{name},{country}</td>
      <td><Chart data={temps}color="orange"/></td>
      <td><Chart data={pressures}color="green"/></td>
      <td><Chart data={humidity}color="black"/></td>
  
    </tr>
  )
}

  render() {
    return (
    
      <table>
        <thead>
          <tr>
            <th>city</th>
            <th>Temperature</th>
            <th>presure</th>
            <th>humidty</th>
          </tr>
        </thead>
        <tbody>
          {this.props.weather.map(this.renderweater)}
        </tbody>
      </table>
    );
  }
}

// mapSrtateToProps funciton
function mapSrtateToProps(state){
  return{ weather: state.weather};
}

// connect mapping
export default connect(mapSrtateToProps)(WeatherList);