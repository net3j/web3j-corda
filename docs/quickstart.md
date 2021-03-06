Quick start
===========

web3j-corda CLI
---------------

To install the latest vversion of the web3j-corda CLI on Mac OS or Linux, type the following in your terminal:

```bash
curl -L https://getcorda.web3j.io | bash
```

Then to create a new project, simply run:

```zsh
web3j-corda new -o ~/template/cordapp -n Sample -p <package-name>
```

Or, to generate client wrappers for an existing CorDapp, run:

```zsh
web3j-corda generate -d <path-existing-cordapp> -o <output-dir> -p <package-name>
```

Then to build your project run:

```zsh
./gradle build
```

For more information on using the web3j-corda CLI, head to the [CLI section](command_line_tools.md).

The generated Corda project demonstrate a number of core features of `web3j-corda`, including:

* Generate CorDapp client wrappers for deployed CorDapps.
* Interact with a CorDapp listing its nodes and starting flows.
* Generate integration tests using a Dockerized Corda network to verify the CorDapp. 
