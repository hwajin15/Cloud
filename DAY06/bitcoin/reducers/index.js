import { combineReducers } from 'redux';
import CoinReducer from './reducer_coin';

const rootReducer = combineReducers({
    bitcoin : CoinReducer
});

export default rootReducer;
