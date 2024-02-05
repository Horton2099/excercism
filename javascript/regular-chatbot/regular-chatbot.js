// @ts-check

/**
 * Given a certain command, help the chatbot recognize whether the command is valid or not.
 *
 * @param {string} command
 * @returns {boolean} whether or not is the command valid
 */

export function isValidCommand(command) {
  const regex = /chatbot/i;
  const found = command.match(regex);
  if (found?.index === 0) {
    return true;
  } else 
  return false;
}

/**
 * Given a certain message, help the chatbot get rid of all the emoji's encryption through the message.
 *
 * @param {string} message
 * @returns {string} The message without the emojis encryption
 */
export function removeEmoji(message) {
  let regex = new RegExp(/emoji\d{4}/, 'gi');
  const newMessage = message.replace(regex, '');
  return newMessage;
}

/**
 * Given a certain phone number, help the chatbot recognize whether it is in the correct format.
 *
 * @param {string} number
 * @returns {string} the Chatbot response to the phone Validation
 */
export function checkPhoneNumber(number) {
  let trimNum = number.trim();
  let regex = new RegExp(/^\(\+[0-9]{2}\)\s[0-9]{3}-[0-9]{3}-[0-9]{3}$/);
  let result  = regex.test(trimNum);
  if (result === true) {
    return `Thanks! You can now download me to your phone.`;
  } else
  return `Oops, it seems like I can't reach out to ${number}`;
}

/**
 * Given a certain response from the user, help the chatbot get only the URL.
 *
 * @param {string} userInput
 * @returns {string[] | null} all the possible URL's that the user may have answered
 */
export function getURL(userInput) {
  const regex = /\b\w+\.(com|so)\b/g;
  const newArray = userInput.matchAll(regex);
  const urls = Array.from(newArray, match => match[0])
  return urls;
}

/**
 * Greet the user using the full name data from the profile.
 *
 * @param {string} fullName
 * @returns {string} Greeting from the chatbot
 */
export function niceToMeetYou(fullName) {
  const nameArr = (fullName.split(/,\s/)).reverse();
  console.log(nameArr);
  let greetings = "Nice to meet you, userName";
  let newGreetings = greetings.replace(/userName/i, nameArr[0] + " " + nameArr [1]);
  return newGreetings;
}
