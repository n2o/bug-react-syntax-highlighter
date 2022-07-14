# react-syntax-highlighter + ClojureScript

Here is how to use the [react-syntax-highlighter](https://github.com/react-syntax-highlighter/react-syntax-highlighter)
with ClojureScript, reagent and shadow-cljs. Check the [core.cljs](src/main/playground/core.cljs) on how to use it in your code.

## Production

Run a production build in one command:

    yarn build

This generates all minified and optimized files in `public` ready to get deployed.

## Development

Create a copy of this project. Then, run the following commands:

```bash
# install dependencies
yarn

# start development server and tailwindcss
yarn dev
```

Open your browser at http://localhost:8000/. You now have a REPL running,
hot-reloading of CSS and your ClojureScript files.

`yarn dev` runs both, shadow-cljs and tailwindcss in a watch-mode so that you
have an interactive development experience. You can, of course, start those jobs
individually or connect to your REPL from your editor.

### Editor

I recommend using VS Code with the Calva plugin. Here is a demo on how to start and connect a REPL with it.

https://user-images.githubusercontent.com/1507474/177212625-af7c0ce5-5c52-48ef-8919-8eadfb3b60d7.mp4

## License

This project is [MIT licensed](./LICENSE).
