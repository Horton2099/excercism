// @ts-check
//
// The line above enables type checking for this file. Various IDEs interpret
// the @ts-check directive. It will give you helpful autocompletion when
// implementing this exercise.

/**
 * Removes duplicate tracks from a playlist.
 *
 * @param {string[]} playlist
 * @returns {string[]} new playlist with unique entries
 */
export function removeDuplicates(playlist) {
  const set1 = new Set();
  if(playlist.length == 0) {
    return playlist;
  } else 
  playlist.forEach((song) => set1.add(song));
  const newArray = Array.from(set1);
  return newArray;
}

/**
 * Checks whether a playlist includes a track.
 *
 * @param {string[]} playlist
 * @param {string} track
 * @returns {boolean} whether the track is in the playlist
 */
export function hasTrack(playlist, track) {
  if(playlist.length == 0) {
    return false;
  } else {
    const set = new Set();
  playlist.forEach((song) => set.add(song));
  return set.has(track);
  }  
}

/**
 * Adds a track to a playlist.
 *
 * @param {string[]} playlist
 * @param {string} track
 * @returns {string[]} new playlist
 */
export function addTrack(playlist, track) {
  const set = new Set();
  playlist.forEach((song) => set.add(song));
  set.add(track);
  const newList = Array.from(set);
  return newList;
}

/**
 * Deletes a track from a playlist.
 *
 * @param {string[]} playlist
 * @param {string} track
 * @returns {string[]} new playlist
 */
export function deleteTrack(playlist, track) {
  const set = new Set();
  playlist.forEach((song) => set.add(song));
  set.delete(track);
  const newList = Array.from(set);
  return newList;
}

/**
 * Lists the unique artists in a playlist.
 *
 * @param {string[]} playlist
 * @returns {string[]} list of artists
 */
export function listArtists(playlist) {
  if(playlist.length == 0) {
    return playlist;
  } else {
    const artistSet = new Set();
    playlist.forEach((song) => artistSet.add(song.slice(song.indexOf("- ") + 2)))
    const newList = Array.from(artistSet);
    return newList;
  }
}
