class TrilhasController < ApplicationController
  before_action :set_trilha, only: [:show, :edit, :update, :destroy]

  respond_to :html

  def index
    @trilhas = Trilha.all
    respond_with(@trilhas)
  end

  def show
    respond_with(@trilha)
  end

  def new
    @trilha = Trilha.new
    respond_with(@trilha)
  end

  def edit
  end

  def create
    @trilha = Trilha.new(trilha_params)
    @trilha.save
    respond_with(@trilha)
  end

  def update
    @trilha.update(trilha_params)
    respond_with(@trilha)
  end

  def destroy
    @trilha.destroy
    respond_with(@trilha)
  end

  private
    def set_trilha
      @trilha = Trilha.find(params[:id])
    end

    def trilha_params
      params.require(:trilha).permit(:nivel, :tagAssunto, :codigoTurma)
    end
end
