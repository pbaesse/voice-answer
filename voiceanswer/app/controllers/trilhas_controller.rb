class TrilhasController < ApplicationController
  before_action :set_trilha, only: [:show, :edit, :update, :destroy]

  # GET /trilhas
  # GET /trilhas.json
  def index
    @trilhas = Trilha.all
  end

  # GET /trilhas/1
  # GET /trilhas/1.json
  def show
  end

  # GET /trilhas/new
  def new
    @trilha = Trilha.new
  end

  # GET /trilhas/1/edit
  def edit
  end

  # POST /trilhas
  # POST /trilhas.json
  def create
    @trilha = Trilha.new(trilha_params)

    respond_to do |format|
      if @trilha.save
        format.html { redirect_to @trilha, notice: 'Trilha was successfully created.' }
        format.json { render :show, status: :created, location: @trilha }
      else
        format.html { render :new }
        format.json { render json: @trilha.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /trilhas/1
  # PATCH/PUT /trilhas/1.json
  def update
    respond_to do |format|
      if @trilha.update(trilha_params)
        format.html { redirect_to @trilha, notice: 'Trilha was successfully updated.' }
        format.json { render :show, status: :ok, location: @trilha }
      else
        format.html { render :edit }
        format.json { render json: @trilha.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /trilhas/1
  # DELETE /trilhas/1.json
  def destroy
    @trilha.destroy
    respond_to do |format|
      format.html { redirect_to trilhas_url, notice: 'Trilha was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_trilha
      @trilha = Trilha.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def trilha_params
      params.require(:trilha).permit(:nivel, :tagAssunto, :turma_id)
    end
end
